package com.ayush.coding.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Player{
	int score;
	String name;
	
	public Player(int score,String name) {
		this.score=score;
		this.name=name;
	}
	public String toString(){
		return this.score+" "+this.name;
	}
}
public class SortListOfPlayersOnBasisOfScoreAndIfSameScoreThenByName {

	public static void main(String[] arfs){
		List<Player> list = new LinkedList<Player>(Arrays.asList(new Player(1, "A"),new Player(4, "C"),
				new Player(2, "A"),new Player(2, "B")));
		System.out.println(list);
		list.sort((a,b)->{
			return a.score>b.score?1:a.score<b.score?-1:a.name.compareTo(b.name);
		});
		System.out.println(list);
	}
}
