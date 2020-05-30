package RevisionOfPrograms;

//Sort an array without Arrays.sort
public class Program3 {

	public static void main(String[] args) {
		
		int[] array=new int[] {1,2,0,-1,32,-323,0,323};
		int min = array[0];
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					min=array[i];
					array[i]=array[j];
					array[j]=min;
				}
			}
		}
		System.out.println(array);
		
	}
}
