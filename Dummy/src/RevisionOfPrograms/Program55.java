package RevisionOfPrograms;

import java.math.BigInteger;

public class Program55 {

	void call3() {
		throw new CustomException1("santa");
	}
	void call2() {
		call3();
	}
	void call1() {
		call2();
	}
	public static void main(String[] args) {
		Program55 obj = new Program55();
		BigInteger b = BigInteger.valueOf(10);
		System.out.println(b);
		System.out.println();
		obj.call1();
	}
}

class CustomException1 extends RuntimeException{
	
	String s;
	
	CustomException1(String s){
		super(s);
	}
}

class CustomException2 extends Throwable{
	
	String s;
	
	CustomException2(String s){
		super(s);	
}
}

class CustomException3 extends Exception{
	
	String s;
	
	CustomException3(String s){
		super(s);
}
}