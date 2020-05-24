package com.amdocs.ayush.miscellaneous;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReadAndWriteExample {
	public static void main(String[] args) throws IOException{
		FileReader reader = new FileReader
				("C:\\Users\\ayushsi\\Kenan_SW\\jboss-eap-7.1.0\\jboss-eap-7.1\\standalone\\deployments\\FXConfiguration.properties");
		Properties p = new Properties();
		Properties p1 = new Properties();
		p.load(reader);
		Set<Entry<Object, Object>> set = p.entrySet();
		FileWriter writer = new FileWriter("test.properties");
		for(Entry<Object, Object> o : set){
			System.out.print(o.getKey());
			System.out.print(" : : ");
			System.out.print(o.getValue());		
			System.out.println();
			
			p1.setProperty(o.getKey().toString(), o.getValue().toString());
			
		}
		p1.store(writer, "");

		
	}
}  