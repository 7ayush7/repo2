package java8.ayush.assignment10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ayush.singh
 * 
1.	Get student with exact match name "jayesh"
2.	Get student with matching address "1235"
3.	Get all student having mobile numbers 3333.
4.	Get all student having mobile number 1233 and 1234
5.	Create a List<Student> from the List<TempStudent>
6.	Convert List<Student> to List<String> of student name
7.	Convert List<students> to String
8.	Change the case of List<String>
9.	Sort List<String>

 * */
public class Main {

	public static void main(String[] args) {
		
		List<MobileNumber> mobList = new LinkedList<MobileNumber>(Arrays.asList(new MobileNumber("1233"),new MobileNumber("1122"),
				new MobileNumber("2233"),new MobileNumber("4444"),new MobileNumber("5678"),new MobileNumber("1111")));
		
		List<Address> addList = new LinkedList<Address>(Arrays.asList(new Address("1235"),new Address("1235"),new Address("2234"),
				new Address("4456"),new Address("6689"),new Address("7765"),new Address("2345")));
		
		List<Student> stList = new LinkedList<Student>(Arrays.asList(new Student("ayush", 1, new Address("1235"), Arrays.asList(new MobileNumber("1233"),
				new MobileNumber("1234"),new MobileNumber("1235"))),
				new Student("test1", 2, new Address("222"), Arrays.asList(new MobileNumber("3333"))),new Student("test2", 3, new Address("444"), Arrays.asList(new MobileNumber("1233"),new MobileNumber("1234"))),
				new Student("jayesh", 4, new Address("666"), Arrays.asList(new MobileNumber("1233"),new MobileNumber("1234"))),new Student("jayesh", 6, new Address("888"), mobList)));
		
		List<TempStudent> tempStList = new LinkedList<TempStudent>(Arrays.asList(new TempStudent("tA", 11, new Address("23422"), mobList),
				new TempStudent("tB", 12, new Address("88722"), mobList),new TempStudent("tC", 13, new Address("67822"), mobList),
				new TempStudent("tD", 14, new Address("55922"), mobList),new TempStudent("tE", 15, new Address("99822"), mobList)));
		
		//condition 1
		
		System.out.println("condition 1");
		stList.stream().filter(a->a.getName().equals("jayesh")).forEach(System.out::println);
		System.out.println();
		
		//condition 2
		
		System.out.println("condition 2");
		stList.stream().filter(a->a.getAddress().getZipcode().equals("1235")).forEach(a->System.out.println(a));
		System.out.println();
		
		//condition 3
		
		System.out.println("condition 3");
		stList.stream().filter((a)->{
			boolean flag = false;
			for(int i=0;i<a.getMobileNumbers().size();i++) {
				if(a.getMobileNumbers().get(i).getNumber().equals("3333")) {
					flag = true;
					break;
				}
				else {
					flag = false;
				}
			}
			return flag;
		}).forEach(a->System.out.println(a));
		System.out.println();

		//condition 4
		
		System.out.println("condition 4");
		stList.stream().filter((a)->{
			boolean flag = false;
			int counter=0;
			for(int i=0;i<a.getMobileNumbers().size();i++) {
				if(a.getMobileNumbers().size()==2 && (a.getMobileNumbers().get(i).getNumber().equals("1233") || a.getMobileNumbers().get(i).getNumber().equals("1234"))) {
					counter++;
				}
			}
			if(counter==2) {
				flag = true;
			}
			return flag;
		}).forEach(a->System.out.println(a));
		System.out.println();
		
		//condition 5
		
		System.out.println("condition 5");
		List<Student> tempList = new LinkedList<Student>();
		tempStList.stream().forEach((a)->{
			tempList.add(new Student(a.getName(), a.getAge(), a.getAddress(), a.getMobileNumbers()));
		});
		System.out.println(tempList);
		System.out.println();
		
		//condition 6
		
		System.out.println("condition 6");
		List<String> stNameList = stList.stream().map(a->a.getName()).collect(Collectors.toList());
		System.out.println(stNameList);
		System.out.println();
		
		//condition 7

		System.out.println("condition 7");
		StringBuilder str = new StringBuilder();
		stList.stream().forEach(a->{
			str.append(a);
			str.append(" ");
		});
		System.out.println(str.toString());
		System.out.println();
		
		//condition 8
		
		System.out.println("condition 8");
		stNameList.stream().map(a->a.toUpperCase()).forEach(a->System.out.println(a));
		System.out.println();
		
		//condition 9
		
		System.out.println("condition 9");
		stNameList.stream().sorted((a,b)->{
			return a.compareTo(b);
		}).forEach(a->System.out.println(a));

	}
}

