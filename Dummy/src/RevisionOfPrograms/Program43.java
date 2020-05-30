package RevisionOfPrograms;

//Different ways to create a functional interface
public class Program43 {

}

interface interface1{
	public void method1();
}

interface interface2 extends interface1{
}

@FunctionalInterface
interface interface3{
	public void method1();
}