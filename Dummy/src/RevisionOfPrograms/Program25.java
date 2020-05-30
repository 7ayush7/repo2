package RevisionOfPrograms;

import java.util.ArrayList;
import java.util.List;

//Duplicate words in a string
public class Program25 {
	public static void main(String[] args) {
		String s="This string follows contains duplicate words as follows follows : Hello Hello Hello Hello !!!!!";
		String[] split=s.split(" ");
		int[] countArray=new int[split.length];
		for(int i=0;i<split.length;i++) {
			int count=1;
			for(int j=i+1;j<split.length;j++) {
				if(split[i].equalsIgnoreCase(split[j])) {
					count++;
					countArray[j]=-1;
				}
			}
			if(countArray[i]!=-1) {
				countArray[i]=count;
			}
		}
		
		for(int i=0;i<split.length;i++) {
			if(countArray[i]>1) {
				System.out.println(split[i]+" --- "+countArray[i]);
			}
		}
		
		//Code to remove duplicates from String
		String str="This string contains duplicate words as follows : Hello Hello Hello Hello !!!!!";
		String[] sp = str.split(" ");
		StringBuilder st = new StringBuilder();
		for(int i=0;i<sp.length;i++) {
			if(!String.valueOf(st).contains(sp[i])) {
				st.append(String.valueOf(sp[i])+" ");
			}
		}
		System.out.println(st.toString());	
	}
}
