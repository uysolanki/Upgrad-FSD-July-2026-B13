package day58;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StreamOnCustomClass {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		List<Player> players=null;
        try {
            players = mapper.readValue(
            	//new File("D:\\EclipseJavaprogs2\\Test\\json\\employee.json"),	      //absolute path
                new File("myfolder/players.json"),									  //relative path
                new TypeReference< List<Player>>() {}
            );
            
      
       
        } catch (Exception e) {
            e.printStackTrace();
        }

//        for(Player player:players)
//        System.out.println(player);
        
        //display all players from india
        players.stream()
        .filter(player->player.getCountry().equalsIgnoreCase("india"))
        .forEach(System.out::println);
        
//        //display all players names from india
//        players.stream()
//        .filter(player->player.getCountry().equalsIgnoreCase("india"))
//        .map(player->player.getPlayerName())
//        .forEach(System.out::println);
        
        //display all players names from india
//        players.stream()
//        .filter(player->player.getCountry().equalsIgnoreCase("india"))
//        .map(Player::getPlayerName)
//        .forEach(System.out::println);
        
        
        //sum of runs scored by Indian players
       int totalRunsByIndianPlayers= 
    		   players.stream()											//[[{},{},{},{},{},{},{},{},{},{}]
        .filter(player->player.getCountry().equalsIgnoreCase("india"))  //[{},{},{},{}]
        .map(player->player.getRunScored())								//[{3800},{11200},{5600},{350}]
        .reduce(0, (acc,runs)->acc+runs);
       
        System.out.println(totalRunsByIndianPlayers);
        
        int totalRunsByIndianPlayers1= 
     		   players.stream()											 //[{},{},{},{},{},{},{},{},{},{}]
         .filter(player->player.getCountry().equalsIgnoreCase("india"))  //[{},{},{},{}]
         .mapToInt(player->player.getRunScored())						 //[13800,11200,5600,350]
         .sum();
        
         System.out.println(totalRunsByIndianPlayers1);
        
        
        //average catches takeb by Indian players
         double averageCatchesTakenByIndianPlayers=								//[{},{},{},{},{},{},{},{},{},{}]
        		 players.stream()												//[{},{},{},{}]  //non primitive stream
        		 .filter(player->player.getCountry().equalsIgnoreCase("india")) //[160,95,210,55]// primitive stream
        		 .mapToInt(Player::getCathesTaken)												 //min,max,sum,avg
        		 .average().orElse(0.0);
         
         System.out.println(averageCatchesTakenByIndianPlayers);
        		 

         //display me the highest average among Indian Players
         double highestBattingaverageByIndianPlayer=								//[{},{},{},{},{},{},{},{},{},{}]
        		 players.stream()												//[{},{},{},{}]  //non primitive stream
        		 .filter(player->player.getCountry().equalsIgnoreCase("india")) //[160,95,210,55]// primitive stream
        		 .mapToDouble(Player::calculateBattingAverage)												 //min,max,sum,avg
        		 .max().orElse(0.0);
         
         System.out.println(highestBattingaverageByIndianPlayer);
	}

}
