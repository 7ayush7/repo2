package RevisionOfPrograms;

//Max and Min of an array
public class Program18 {

	public static void main(String[] args) {
		int[] array=new int[] {1,2,-21,0,99,8,887};
		int min=array[0],max=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		System.out.println("Minimum : "+min);
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("Maximum : "+max);
	}
}
