package collectionrevision.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo7 {

	public static void main(String[] args) {
	
		Player rohit = new Player(
                45,
                "Rohit Sharma",
                250,
                11000,
                100,
                0,
                1000,
                300,
                30,
                "Batsman",
                List.of("World Cup", "Champions Trophy", "IPL")
        );

        Player surya = new Player(
                63,
                "Suryakumar Yadav",
                150,
                5000,
                80,
                0,
                500,
                250,
                5,
                "Batsman",
                List.of("T20 World Cup", "IPL")
        );

        Player pandya = new Player(
                33,
                "Hardik Pandya",
                180,
                4500,
                90,
                150,
                350,
                200,
                0,
                "All Rounder",
                List.of()
        );

        Player bumrah = new Player(
                93,
                "Jasprit Bumrah",
                180,
                500,
                70,
                350,
                30,
                5,
                0,
                "Bowler",
                List.of("World Cup", "Champions Trophy")
        );

        Player boult = new Player(
                18,
                "Trent Boult",
                150,
                400,
                60,
                300,
                20,
                2,
                0,
                "Bowler",
                List.of("World Cup", "IPL")
        );

        Player williamson = new Player(
                22,
                "Kane Williamson",
                200,
                9000,
                100,
                0,
                800,
                100,
                25,
                "Batsman",
                List.of("World Test Championship")
        );

        Player ghazanfar = new Player(
                21,
                "Allah Ghazanfar",
                20,
                100,
                5,
                25,
                5,
                2,
                0,
                "Bowler",
                List.of()
        );

        Player nabi = new Player(
                7,
                "Mohammad Nabi",
                200,
                3500,
                100,
                200,
                300,
                100,
                0,
                "All Rounder",
                List.of("Asia Cup", "IPL")
        );

        Player quinton = new Player(
                12,
                "Quinton de Kock",
                180,
                8000,
                150,
                0,
                750,
                150,
                25,
                "Wicket Keeper Batsman",
                List.of("World Cup", "IPL")
        );

        Player steyn = new Player(
                8,
                "Dale Steyn",
                100,
                400,
                50,
                400,
                30,
                2,
                0,
                "Bowler",
                List.of("IPL")
        );
        
        Player sachin = new Player(
                8,
                "Sachin Tendulkar",
                200,
                800,
                100,
                800,
                30,
                2,
                0,
                "Batsmen",
                List.of("IPL","World Cup", "Champions Trophy")
        );
        
        
        List<Player> IndianPlayers=new ArrayList();
        IndianPlayers.add(rohit);
        IndianPlayers.add(surya);
        IndianPlayers.add(bumrah);
        IndianPlayers.add(pandya);
        IndianPlayers.add(sachin);
        
        
        List<Player> newZealandPlayers=new ArrayList();
        newZealandPlayers.add(boult);
        newZealandPlayers.add(williamson);
        
        List<Player> southAfricaPlayers=new ArrayList();
        southAfricaPlayers.add(quinton);
        southAfricaPlayers.add(steyn);
		
        List<Player> afghanistanPlayers=new ArrayList();
        afghanistanPlayers.add(ghazanfar);
        afghanistanPlayers.add(nabi);
        
        List<Player> mumbaiIndians=new ArrayList();
        mumbaiIndians.addAll(IndianPlayers);
        mumbaiIndians.addAll(newZealandPlayers);
        mumbaiIndians.addAll(southAfricaPlayers);
        mumbaiIndians.addAll(afghanistanPlayers);
        
        System.out.println(mumbaiIndians.size()); //11
        for(Player player:mumbaiIndians)
        {
        	player.calculateBattingAverage();
        }
        
        Collections.sort(mumbaiIndians);
        System.out.println("*** MI Averages in ASC Order ****");
        for(Player player:mumbaiIndians)
        {
        	System.out.println(player.getPlayerName());
        }
	}

}
