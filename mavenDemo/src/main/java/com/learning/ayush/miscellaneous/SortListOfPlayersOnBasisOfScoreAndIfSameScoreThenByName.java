package com.learning.ayush.miscellaneous;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

public class SortListOfPlayersOnBasisOfScoreAndIfSameScoreThenByName {

	public static void main(String[] args) {
		List<Player> list = Arrays.asList(new Player("test1", 1), new Player("test1", 100), new Player("test2", 97),
				new Player("test3", 97), new Player("test4", 98), new Player("test5", 99));
		Collections.sort(list,
				(o1, o2) -> o1.score < o2.score ? 1 : o1.score > o2.score ? -1 : o1.name.compareTo(o2.name));
		for (Player p : list) {
			System.out.println(p.name + " " + p.score);
		}
	}
}
