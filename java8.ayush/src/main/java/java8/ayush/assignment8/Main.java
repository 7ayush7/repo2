package java8.ayush.assignment8;

/**
 * @author ayush.singh
 * 
 * JDK 8 : Assignment 
 * public class Hello {
    String firstname;
    String lastname;
    public Hello() {}
    public Hello(String firstname, String lastname) {
       this.firstname = firstname;
       this.lastname = lastname;}
    public void hello() {
       System.out.println("Hello " + firstname + " " + lastname);}
    public static void main(String[] args) {
       Hello hello = new Hello(args[0], args[1]);
       hello.hello();
    }
 }
 Please rewrite above method hello using lambda

 * */

@FunctionalInterface
interface Test{
	void print();
}
public class Main {
	 String firstname;
	    String lastname;
	    public Main() {}
	    public Main(String firstname, String lastname) {
	       this.firstname = firstname;
	       this.lastname = lastname;}
	    public void hello() {
	       System.out.println("Hello " + firstname + " " + lastname);}
	    public static void main(String[] args) {
	       Main main = new Main(args[0], args[1]);
	       Test t = ()->main.hello();
	       t.print();
	    }
}
