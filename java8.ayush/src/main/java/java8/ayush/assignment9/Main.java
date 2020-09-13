package java8.ayush.assignment9;

/**
 * @author ayush.singh
 * JDK 8 : Assignment  – Search Criteria using Lambda Expression
1.      Create an array 1000 Person Object with 3 attributes as Id, Name, Age, Sex
2.      Outcome should return the people whose age is in the range with in the range specified from command prompt.
 * */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

abstract class CheckPerson{
	int min;
	int max;
	
	public abstract List<Employee> search(List<Employee> l);
}
public class Main {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		int min = Integer.valueOf(args[0]);
		int max = Integer.valueOf(args[1]);

		for(int i=0;i<100;i++) {
			list.add(new Employee(i, i, "A"+i, i%2==0?"M":"F"));
		}
		
		CheckPerson c = new CheckPerson () {
			
			@Override
			public List search(List<Employee> l) {
				// TODO Auto-generated method stub
				return l.stream().filter(a->a.getAge()>min&&a.getAge()<max).collect(Collectors.toList());
			}
		};
		c.min=7;
		c.max=67;
		
		Predicate<Employee> p = new Predicate<Employee>() {
			
			@Override
			public boolean test(Employee t) {
				// TODO Auto-generated method stub
				return t.getAge()>8&&t.getAge()<88;
			}
		}; 
		System.out.println(approach1(list,min,max));
		System.out.println(approach2(list,c));
		System.out.println(approach3(list));
		//approach4 and approach1 are done the same way so we can refer either of them
		System.out.println(approach5(list,p));
		
	}

	private static List<Employee> approach5(List<Employee> list, Predicate<Employee> p) {
		// TODO Auto-generated method stub
		return list.stream().filter(p).collect(Collectors.toList());
	}

	private static List<Employee> approach3(List<Employee> list) {
		// TODO Auto-generated method stub
		CheckPerson c = new CheckPerson() {
			
			@Override
			public List<Employee> search(List<Employee> l) {
				// TODO Auto-generated method stub
				return l.stream().filter(a->a.getAge()>min&&a.getAge()<max).collect(Collectors.toList());
			}
		};
		c.min=9;
		c.max=79;
		return c.search(list);
	}

	private static List approach2(List<Employee> list, CheckPerson c) {
		// TODO Auto-generated method stub
		return c.search(list);
	}

	private static List approach1(List<Employee> list, int min, int max) {

		return list.stream().filter(a->a.getAge()<=max && a.getAge()>=min).collect(Collectors.toList());
		
		
	}
}
