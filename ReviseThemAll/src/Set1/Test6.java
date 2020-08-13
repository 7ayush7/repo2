package Set1;

public class Test6 extends Test11 {
	
	int id;
	
	Test6(){
		//implicitly from java compiler super constructor is called here as the first statement
		System.out.println("Inside default Constructor");
	}
	Test6(int id){
		this();//If this() is used then that constructor will be called if not then the 1st execution will go to default constructor of parent class
		System.out.println("Inside Parameterised Constructor");
	}
	public static void main(String... args){
		Test6 t = new Test6(1);
	}
}