package RevisionOfPrograms;

public class AmdocsExec {

	public static void user(AmdocsEmployee amd){
		AmdocsEmployee test = amd;
		System.out.println(test.getName());
	}
	public static void main(String[] args){
		AmdocsEmployee emp = new AmdocsEmployee("Ayush", "164300");
		user(emp);
	}
}
