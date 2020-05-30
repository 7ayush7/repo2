package RevisionOfPrograms;

import java.io.Serializable;

public class Child extends Parent implements Serializable{

	int id;
	String name;
	
	Child(){}
	Child(int pId,String pName,int id, String name){
		super(pId,pName);
		this.id=id;
		this.name=name;
	}
	public String toString(){
		return this.pId+" "+this.pName+" "+this.id+" "+this.name;
	}
}
