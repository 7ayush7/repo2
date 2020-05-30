package RevisionOfPrograms;

//A Java program to demonstrate that simply swapping 
//object references doesn't work 

//A car with number and name 
class Car 
{ 
	int model, no; 

	// Constructor 
	Car(int model, int no) 
	{ 
		this.model = model; 
		this.no = no; 
	} 

	// Utility method to print Car 
	void print() 
	{ 
		System.out.println("no = " + no + 
						", model = " + model); 
	} 
} 

//A class that uses Car 
class Main 
{ 
	// swap() doesn't swap c1 and c2 
	public static void swap(Car c1, Car c2) 
	{ 
		Car temp = c1; 
		c1 = c2; 
		c2 = temp; 
	} 

	// Driver method 
	public static void main(String[] args) 
	{ 
		Car c1 = new Car(101, 1); 
		Car c2 = new Car(202, 2);
		Integer i=10;
		swap(c1, c2); 
		c1.print(); 
		c2.print(); 
		//This can be done by creating a wrapper class that holds Objects C1 and
		//other wrapper that holds objects C2
		//Then instead of passing Car objects we will be passing CarWrapper Objects
		//then this will do the job
		//as the above changes will merely change the Car objects locally
		//Hence, it also shows that Java is Call by value where memory reference 
		//is passed as value.
	} 
} 
