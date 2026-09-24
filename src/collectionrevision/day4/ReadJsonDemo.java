package collectionrevision.day4;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ReadJsonDemo {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		List<Player> players=null;
        try {
            players = mapper.readValue(
            	//new File("D:\\EclipseJavaprogs2\\Test\\json\\employee.json"),	      //absolute path
                new File("myfolder/crics.json"),									  //relative path
                new TypeReference< List<Player>>() {}
            );
       
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(players);
        
        
	}

}
