package Set1;

/**
 * @author ayushsi
 * */

//Checking that why for being immutable, we need to make class and methods as final.
public class Test {
public static void main(String[] args){

	//Creating a child class object
	NonFinalChild child2 = new NonFinalChild(1);
	//Creating a parent class reference but pointing it to the child class object
	NonFinalParent parent2 = child2;
	
	System.out.println(parent2.getId());
	System.out.println(parent2.hashCode());
	child2.setId(10);
	System.out.println(parent2.getId());
	System.out.println(parent2.hashCode());

	
}
}

//Child class extending Parent class
class NonFinalChild extends  NonFinalParent{

	NonFinalChild(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	//here as we don't have id as member variable for child class, it will use the parents member variable and thus will be updating the same.
	public void setId(int id){
		this.id=id;
	}
}

//Parent class which is Non Final and is also not properly encapsulated
class NonFinalParent{
	int id; //If it would have been a properly encapsulated class, this would have been private and thus not available to the Child class
	
	NonFinalParent(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
}
