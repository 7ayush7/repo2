package test;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Test implements Serializable{

	int id;
	
	public Test(int id){
		this.id=id;
	}
	public static void main(String[] args){
		
		String s="aaaaaac";
		char c[] = s.toCharArray();
		List<String> remDup = new ArrayList<>();
		for(int i=0;i<c.length;i++){
			if(!remDup.contains(String.valueOf(c[i]))){
				remDup.add(String.valueOf(c[i]));
			}
		}
		System.out.println(remDup);
	}
}

