package Revision2;

import java.util.Scanner;
public class FirstOccurence{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String name=sc.nextLine();
        String[] arr=name.split(" ");
        int n=arr.length;
        System.out.println("Enter the character to be searched:");
        char search=sc.next().charAt(0);
        System.out.println("Enter the character to replace:");
        String ret = new String();
        char replace=sc.next().charAt(0);
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[i].length();j++){
            	char[] test = arr[i].toCharArray();
            	for(int k=0;k<test.length;k++){
            		if(test[k]==search){
            			test[k]=replace;
            			break;
            		}
            	}
            	ret = String.valueOf(test);
            }
        }
        System.out.println(ret);
        
    }
}