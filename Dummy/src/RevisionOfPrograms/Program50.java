package RevisionOfPrograms;

//Program to print factorial using recursion

public class Program50 {  
    static int factorial(int n){
    	if(n==1) {
    		return 1;
    	}
    	else {
    		return n*factorial(n-1);
    	}
    }      
  
public static void main(String[] args) {  
System.out.println("Factorial of 5 is: "+factorial(5));  
}  
}  