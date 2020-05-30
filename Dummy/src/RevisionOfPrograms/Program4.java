package RevisionOfPrograms;

//Sort an binary array with minimum complexity
public class Program4 {

	public static void main(String[] args) {
		
		int[] array=new int[] {0,0,0,1,1,1,0,1,0,1,1,0};
		int[] dupArray=new int[array.length];
		int count=0;
		for(int i=0;i<dupArray.length;i++) {
			if(array[i]==0) {
				count++;
			}
		}
		for(int i=0;i<count;i++) {
			dupArray[i]=0;
		}
		for(int i=count;i<array.length;i++) {
			dupArray[i]=1;
		}
		for(int i:dupArray) {
			System.out.println(i);
		}
	}
}
