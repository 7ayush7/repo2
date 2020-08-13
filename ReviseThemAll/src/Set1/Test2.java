package Set1;

public class Test2 {

	public static void main(String... args){
		NonFinalParent1 parent = new NonFinalParent1(1);
		System.out.println(parent.hashCode());
		System.out.println(parent.id);
		
		NonFinalChild1 child = new NonFinalChild1();
		child.setId(parent, 23);
		System.out.println(parent.hashCode());
		System.out.println(parent.id);

	}
}

//to show why instance variables should be final as a mandatory requirement for immutability to achieve.
class NonFinalParent1{
	int id;
	public NonFinalParent1(int id) {
	this.id=id;
	}
	final int getId(){
		return id;
	}
}
class NonFinalChild1{
	final void setId(NonFinalParent1 parent,int id){
		parent.id=id;
	}
}