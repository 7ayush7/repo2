package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Task : 
 * 
 *String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"}; Remove duplicates
 * */
public class Test4 {

	public static void main(String[] args){
		
        String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};

        List<String> list = new ArrayList<>();
        List<String> dup = new ArrayList<>();

        for(int i=0;i<strArray.length;i++){
        	if(!list.contains(strArray[i])){
        		list.add(strArray[i]);
        	}
        	else{dup.add(strArray[i]);}
        }
        System.out.println("Removed Duplicates "+list);
        System.out.println("Duplicates "+dup);

	}
}
