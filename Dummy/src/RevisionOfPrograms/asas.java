package RevisionOfPrograms;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class asas {

	public static ParentNew setPname(ParentNew p){
		ParentNew p2 = new ParentNew("AAA",11);
		return p2;
	}
	public static void main(String[] args){
	
		ParentNew p = new ParentNew();
		p.setpId(1);
		p=setPname(p);
		System.out.println(p);
		
	}
}

class Imp{
	public ParentNew calculate(){
		return new ParentNew("A",2);
	}
}

class ParentNew{
	String pName;
	int pId;
	
	ParentNew(){
		
	}
	ParentNew(String pName, int pId){
		this.pId=pId;
		this.pName=pName;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}
	
	public String toString(){
		return this.pId+" "+this.pName;
	}
	
}


class ChildNew extends ParentNew{
	String cName;
	int cId;
	
	ChildNew(){
		super();
	}

	public String getcName() {
		return cName;
	}

	public void setpName(String cName) {
		this.cName = cName;
	}

	public int getcId() {
		return cId;
	}

	public void setpId(int cId) {
		this.cId = cId;
	}
	
}
