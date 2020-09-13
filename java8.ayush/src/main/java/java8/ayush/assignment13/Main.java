package java8.ayush.assignment13;

import java.util.concurrent.SubmissionPublisher;

/**
 * @author ayush.singh
 * 
 * Java 9 Reactive Stream Use Case
 * 
1) Create employee class with 2 properties id and name 
2) Create Utility or helper class to create List of Employee Objects 
3) Create a subscriber to subscribe to Employee Object whenever it is published using publisher. 
4) Whenever new EMployee object is published      
Print SYSOut  "NEW Message Received"     
Print the total count of messages published till yet     create a folder with name as <yyyyMMddHHmmss>     Persist the object on file system in json format     

 * */
public class Main {

	public static void main(String[] args) throws InterruptedException {
		SubmissionPublisher<Employee> publisher = new SubmissionPublisher<Employee>();
		EmployeeSubscriber subscriber = new EmployeeSubscriber();
		publisher.subscribe(subscriber);
		EmployeeList list = new EmployeeList();
		
		for(Employee e:list.getEmplList()) {
			publisher.submit(e);
		}
		Thread.sleep(1000);
		publisher.close();
		subscriber.printDataInFile();
	}
}
