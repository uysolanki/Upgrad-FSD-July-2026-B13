package day44;

import java.util.ArrayList;
import java.util.List;

public class PlayerDemo {

	public static void main(String[] args) {
		List<Player> players = new ArrayList<>();

        players.add(new Player(1, "Virat Kohli", 275, 13800, 160, 4, 25, "India"));
        players.add(new Player(2, "Rohit Sharma", 265, 11200, 95, 10, 18, "India"));
        players.add(new Player(3, "Babar Azam", 220, 10500, 85, 2, 12, "Pakistan"));
        players.add(new Player(4, "Kane Williamson", 210, 9800, 110, 8, 15, "New Zealand"));
        players.add(new Player(5, "Joe Root", 250, 11500, 150, 20, 22, "England"));
        players.add(new Player(6, "Steve Smith", 230, 10200, 125, 5, 14, "Australia"));
        players.add(new Player(7, "Ben Stokes", 180, 6200, 100, 190, 12, "England"));
        players.add(new Player(8, "Ravindra Jadeja", 300, 5600, 210, 550, 16, "India"));
        players.add(new Player(9, "Jasprit Bumrah", 180, 350, 55, 400, 8, "India"));
        players.add(new Player(10, "Shakib Al Hasan", 250, 7500, 130, 650, 20, "Bangladesh"));

        System.out.println(players);
        
        for(Player player : players)
        	System.out.println(player);

	}

}
