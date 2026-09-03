package day44;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ReadJSON {

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

        for(Player player:players)
        System.out.println(player);

	}

}
