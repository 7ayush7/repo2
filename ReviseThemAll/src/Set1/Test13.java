package Set1;

public class Test13 {
	public static void main(String... args){
		B b = new B();
	}
}

class A{
	static{
		System.out.println("Inside Parent static");
	}
	A(){
		System.out.println("Inside Parent Constructor");
	}
	{
		System.out.println("Inside Parent Normal Block");
	}
}
class B extends A{
	static{
		System.out.println("Inside Child static");
	}
	B(){
		System.out.println("Inside Child Constructor");
	}
	{
		System.out.println("Inside Child Normal Block");
	}
}