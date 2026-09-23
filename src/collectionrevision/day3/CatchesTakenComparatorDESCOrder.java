package collectionrevision.day3;

import java.util.Comparator;

public class CatchesTakenComparatorDESCOrder implements Comparator<Player> {

	@Override
	public int compare(Player p1, Player p2) {
		if(p1.getCatchesTaken()>p2.getCatchesTaken())
			return -1;
		else if(p1.getCatchesTaken()<p2.getCatchesTaken())
			return 1;
		else return 0;
	}

}
