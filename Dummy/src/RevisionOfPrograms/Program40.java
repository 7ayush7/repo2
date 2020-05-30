package RevisionOfPrograms;

//Facade design pattern
//creates a facade class that provides a simplified accumulation of methods of system classes
public class Program40 {

	public static void main(String[] args) {
		Facade.FakeMessage("America");
	}
}

interface Country{
	public void fakeMessage();
}

class India implements Country{

	@Override
	public void fakeMessage() {
		System.out.println("India");		
	}
	
}

class America implements Country{

	@Override
	public void fakeMessage() {
		System.out.println("America");		
	}
	
}

class Facade{
	
	public static void FakeMessage(String country) {
		if(country.equals("India")){
			new India().fakeMessage();
		}
		else if(country.equals("America")){
			new America().fakeMessage();
		}
	}
}
