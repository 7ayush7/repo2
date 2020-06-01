package Revision2;

public class Test4 {

	public static void main(String[] args){
		
		String s = "Ayush Kumar Singh Richard Disuza";
		s=s.toLowerCase();
//		char c1 = 'z';
//		char c2 = 'Z';
//		char c3 = Character.valueOf((char) 65);
//		System.out.println(Integer.valueOf(c1)-Integer.valueOf(c2)+"   "+c3);
		
		String[] arr = s.split(" ");
		String ret = new String();
		for(int i=0;i<arr.length;i++){
			char ch[] = arr[i].toCharArray();
			for(int j=0;j<ch.length;j++){
				if(j<=i){
					char temp = Character.valueOf((char) (Integer.valueOf(ch[j])-32));
					ch[j]=temp;
				}
			}
			ret=ret.concat(String.valueOf(ch));
			ret=ret+" ";
		}
		System.out.println(ret);
	}
}
