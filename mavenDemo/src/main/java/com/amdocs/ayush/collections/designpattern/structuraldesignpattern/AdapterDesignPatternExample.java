package com.amdocs.ayush.collections.designpattern.structuraldesignpattern;

interface USBCharger{
	void ChargeUSB();
}

interface TypeCCharger{
	void ChargeTypeC();
}

class Xiomi implements USBCharger{

	@Override
	public void ChargeUSB() {
		System.out.println("Charging Xiomi Phone");
	}
	
}

class OnePlus implements TypeCCharger{

	@Override
	public void ChargeTypeC() {
		System.out.println("Charging OnePlus Phone");
	}
	
}

class TypeCtoUSBAdapter implements TypeCCharger{

	Xiomi mi;
	
	TypeCtoUSBAdapter(Xiomi mi){
		this.mi=mi;
	}
	@Override
	public void ChargeTypeC() {
		mi.ChargeUSB();
	}
	
}
public class AdapterDesignPatternExample {

	public static void main(String[] args){
		Xiomi m = new Xiomi();
		m.ChargeUSB();
		
		OnePlus o = new OnePlus();
		o.ChargeTypeC();
		
		TypeCtoUSBAdapter adapter = new TypeCtoUSBAdapter(m);
		adapter.ChargeTypeC();
	}
}
