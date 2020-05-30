package RevisionOfPrograms;

//Factory Design Pattern
//Creates a factory to decide the instance creation
public class Program39 {

	public static void main(String[] args) {
		Samsung s = (Samsung) Factory.getInstance("Samsung");
		s.fakeMessage();
	}
}

interface Mobile{
	public void fakeMessage();
}
class Samsung implements Mobile{

	@Override
	public void fakeMessage() {
		System.out.println("Samsung");		
	}
	
}
class Apple implements Mobile{

	@Override
	public void fakeMessage() {
		System.out.println("Apple");		
	}
	
	
}
class Factory{
	static Mobile m;
	public static Mobile getInstance(String name) {

		if(name.equals("Samsung")) {
			m=new Samsung();
		}
		if(name.equals("Apple")) {
			m=new Apple();
		}
		return m;
	}
}