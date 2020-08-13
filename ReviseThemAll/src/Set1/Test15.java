package Set1;

//Program to test the run GC and check effected free memory
public class Test15 {

	public static void main(String[] args){
		System.out.println("Total available memory right now :"+Runtime.getRuntime().totalMemory());
		System.out.println("Total free memory right now :"+Runtime.getRuntime().freeMemory());
		for(int i=0;i<100000;i++){
			new Test15();
		}
		System.out.println("Free memory after creating 100000 instances of Test15 :"+Runtime.getRuntime().freeMemory());
		System.gc();
		System.out.println("Free memory after running GC :"+Runtime.getRuntime().freeMemory());
	}
	public void finalize(){
//		System.out.println("GC Running");
//		System.out.println();
	}
}
