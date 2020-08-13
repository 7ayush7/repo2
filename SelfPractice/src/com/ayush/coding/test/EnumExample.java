package com.ayush.coding.test;

public class EnumExample {

	enum Test{
		test1(7),test2(8);
		private int t1;
		private Test(int t1){
			this.t1=t1;
		}
		public int getData(){
			return this.t1;
		}
	}
	
	public static void main(String[] args){
		Test[] t = Test.values();
		for(Test a:t){
			System.out.println(a+" "+a.getData());
		}
	}
}
