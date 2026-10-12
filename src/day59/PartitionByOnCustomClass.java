package day59;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PartitionByOnCustomClass {

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

        
       players.stream()
       .forEach(System.out::println);
       
       Map<Boolean, List<Player>> hashmap=
    		   players.stream()
    		   .collect(Collectors.partitioningBy(p->p.getCountry().equalsIgnoreCase("India")));
       
       System.out.println(hashmap);
       /*
        * {
        * true : [{},{},{},{}]    -> Virat Rohit Jassi Ravi   -> [Virat Rohit Jassi Ravi]
        * false : [{},{},{},{},{},{}]  ->[] Babar Smith Kane Shakib Steyn Boult  ->[Babar Smith Kane Shakib Steyn Boult]
        * }
        */
       
       Map<Boolean, Long> hashmap1=
    		   players.stream()
    		   .collect(Collectors.partitioningBy(p->p.getCountry().equalsIgnoreCase("India"),Collectors.counting()));
       
       System.out.println(hashmap1);
       
       
       Map<Boolean, List<String>> hashmap2=
    		   players.stream()
    		   .collect(Collectors.partitioningBy(p->p.getCountry().equalsIgnoreCase("India"),Collectors.mapping(p->p.getPlayerName(), Collectors.toList())));
       System.out.println(hashmap2);
	}

}
