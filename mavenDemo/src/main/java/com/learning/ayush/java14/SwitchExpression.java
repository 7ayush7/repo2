package com.learning.ayush.java14;

enum Days{
	Sun,Mon,Tue,Wed,Thu,Fri,Sat;
}
public class SwitchExpression {
public static void main(String[] args) {
	Days day = Days.Mon;
	checkOldSwitchExpression(day);
	switch(day) {
	case Mon,Wed,Fri->System.out.println("Odd Day");
	case Tue,Thu,Sun->System.out.println("Even Day");
	}
	;
}

private static void checkOldSwitchExpression(Days day) {
	switch(day.toString()) {
	case "Mon":System.out.println("Odd Day"+" "+day.toString());
	break;
	case "Tue":System.out.println("Even Day"+" "+day.toString());
	break;
	case "Wed":System.out.println("Odd Day"+" "+day.toString());
	break;
	case "Thu":System.out.println("Even Day"+" "+day.toString());
	break;
	case "Fri":System.out.println("Odd Day"+" "+day.toString());
	break;
	case "Sat":System.out.println("Even Day"+" "+day.toString());
	break;
	case "Sun":System.out.println("Odd Day"+" "+day.toString());
	break;
	default :
		System.out.println("default statement");
	}	
}
}
