package RevisionOfPrograms;

//Left and Right Shift elements in an array by 1 place
public class Program17 {

	public static void main(String[] args) {
		
		int[] array1=new int[] {1,2,3,4,5};
		int[] leftShift=new int[array1.length];
		for(int i=0;i<array1.length-1;i++) {
			leftShift[i]=array1[i+1];
		}
		leftShift[leftShift.length-1]=array1[0];
		//Left Shift logic ends here
		
		int[] array2=new int[] {1,2,3,4,5};
		int[] rightShift=new int[array2.length];
		for(int i=0;i<array2.length-1;i++) {
			rightShift[i+1]=array2[i];
		}
		rightShift[0]=array2[array2.length-1];
	}
}
