package java8.ayush.assignment13;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeSubscriber implements Subscriber<Employee>{

	Subscription s;
	static int counter;
	static StringBuilder str;
	static JSONObject childObj;
	static JSONObject parentObj;
	static JSONArray arr;
	static ObjectMapper mapper;
	@Override
	public void onSubscribe(Subscription subscription) {
		// TODO Auto-generated method stub
		this.s=subscription;
		counter=0;
		str = new StringBuilder("[");
		childObj=new JSONObject();
		parentObj=new JSONObject();
		arr=new JSONArray();
		mapper = new ObjectMapper();

		s.request(1);
		
	}

	@Override
	public void onNext(Employee item) {
		// TODO Auto-generated method stub
		System.out.println("New Message Received");
		System.out.println("Received : " + item);
		try {
			str.append(mapper.writeValueAsString(item));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		str.append(",");		
		counter++;
		s.request(1);

	}

	@Override
	public void onError(Throwable throwable) {
		// TODO Auto-generated method stub
		System.out.println(throwable.getMessage());
	}

	@Override
	public void onComplete() {
		// TODO Auto-generated method stub
		System.out.println(str.toString());

		System.out.println("Total messages recieved : "+counter);
		System.out.println("Done");
		
	}

	public void printDataInFile() {
		
		FileWriter fw;
		try {
			Files.createDirectories(Paths.get("13-09-2020"));
			fw = new FileWriter("13-09-2020/Employee.txt");
			fw.write(str.replace(str.lastIndexOf(","), str.lastIndexOf(",")+1, "]").toString());
			fw.close();
		} catch (IOException e) {
		}
	}

}
