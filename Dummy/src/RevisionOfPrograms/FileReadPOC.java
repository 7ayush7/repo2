package RevisionOfPrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileReadPOC {

	public static void main(String[] args) throws IOException, ParseException{
		
		File readFrom = new File("C:\\Users\\ayushsi\\Documents\\19Aug\\File.txt");
		BufferedReader reader = new BufferedReader(new FileReader(readFrom));
		Map<String,String> map = new HashMap<>();
		List<String> dateList = new ArrayList<>();
		List<LocalDate> dateListLocal = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		while(true){
			if(reader.ready()==false){
				break;
			}
			String dataRead = reader.readLine();
			String key=dataRead.substring(0, (dataRead.indexOf(":")));
			String value=dataRead.substring(dataRead.indexOf(":")+1);
			map.put(key,value);
			//gettingDate
			DateTimeFormatter dT = DateTimeFormatter.ofPattern("yyyy/MM/dd");
			LocalDate ld = LocalDate.parse(value, dT);
			dateListLocal.add(ld);
			System.out.println(dateListLocal);
		}
		reader.close();
		LocalDate temp=dateListLocal.get(0);
		for(int i=0;i<dateListLocal.size();i++){
			for(int j=i+1;j<dateListLocal.size();j++){
				if(dateListLocal.get(i).isAfter(dateListLocal.get(j))){
					temp =dateListLocal.get(i);
					dateListLocal.set(i, dateListLocal.get(j));
					dateListLocal.set(j, temp);
				}
			}
		}
		for(int i=0;i<dateListLocal.size();i++){
			String convertedFormat = dateListLocal.get(i).toString();
			String convertedDate = convertedFormat.replace("-", "/");
			dateList.add(convertedDate);
		}
		System.out.println(map);
		System.out.println();
		System.out.println(dateListLocal);
		System.out.println();
		System.out.println(dateList);
		
		for(String key:map.keySet()){
			for(String date:dateList){
			if(map.get(key).equalsIgnoreCase(date)){
				list2.add(key+":"+date);
			}
		}
		}
		System.out.println(list2);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\ayushsi\\Documents\\19Aug\\File2.txt"));
		for(String date:list2){
			bw.write(date);
			bw.write("\n");
		}
		bw.close();
	}
}
