package RevisionOfPrograms;

//Singleton design pattern
public class Program38 {

	private static Program38 program38=null;
	
	private Program38() {
		
	}
	
	public static Program38 getInstance() {
		synchronized (Program38.class) {
			if(program38==null) {
				program38 = new Program38();
			}
		}
		return program38;
	}
}
