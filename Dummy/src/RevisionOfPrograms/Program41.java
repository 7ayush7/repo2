package RevisionOfPrograms;

//Adapter Design Pattern
public class Program41 {

	public static void main(String[] args) {
		Xiomi mi = new Xiomi();
		TypeCToUsbAdapter adapter = new TypeCToUsbAdapter(mi);
		adapter.chargeTypeC();
	}
}

interface USBCharger{
	public void chargeUSB();
}
interface TypeCCharger{
	public void chargeTypeC();
}
class Xiomi implements USBCharger{

	@Override
	public void chargeUSB() {
		System.out.println("Charging Xiomi Device");
	}
	
}
class OnePlus implements TypeCCharger{

	@Override
	public void chargeTypeC() {
		System.out.println("Charging OnePlus Device");
	}
	
}

class TypeCToUsbAdapter implements TypeCCharger{
	Xiomi mi;

	TypeCToUsbAdapter(Xiomi mi){
		this.mi=mi;
	}
	@Override
	public void chargeTypeC() {
	mi.chargeUSB();
	}
	
}