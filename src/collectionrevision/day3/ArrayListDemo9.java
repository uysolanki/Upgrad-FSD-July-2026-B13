package collectionrevision.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo9 {

	public static void main(String[] args) {
	
		Player rohit = new Player(
                45,
                "Rohit Sharma",
                250,
                11000,
                105,
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
        
        List<Player> csk=new ArrayList();
        csk.add(rohit);
        csk.add(surya);
        csk.add(pandya);
        csk.add(bumrah);
        csk.add(sachin);
        csk.add(ghazanfar);
        csk.add(nabi);
        
        List<Player> rcb=new ArrayList();
        rcb.add(boult);
        rcb.add(quinton);
        rcb.add(williamson);
        rcb.add(steyn);
        
        
        List<List<Player>> ipl = new ArrayList();
        
        ipl.add(csk);
        ipl.add(rcb);
        
        System.out.println(ipl.size());
        
        //display person with maximum catches from each team in the IPL
        for( List<Player> team  : ipl)
        {
        	CatchesTakenComparatorDESCOrder o1=new CatchesTakenComparatorDESCOrder();
        	Collections.sort(team,o1);
        }
        System.out.println("Player name with max catches in CSK team is "+ ipl.get(0).get(0).getPlayerName());
        System.out.println("Player name with max catches in RCB team is "+ ipl.get(1).get(0).getPlayerName());
   }

}
