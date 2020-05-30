package RevisionOfPrograms;

public class Program49 extends C implements A,B{

	@Override
	public void run() {
		System.out.println("Inside P49");
	}
	
	public static void main(String[] args) {
		C p = new Program49();
		p.run();
		//Program49  p = new C();
	}

}

interface A{
	public void run();
}

interface B{
	public void run();
}

class C{
	public void run() {
		System.out.println("Inside C");
	}
}