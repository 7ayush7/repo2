package RevisionOfPrograms;

//Lambda Expression
public class Program44 {

	public static void main(String[] args) {
		interface4 i =(int num1, int num2)->{
			return num1+num2;
		};
		System.out.println(i.sum(1, 2));
		
		interface4 i2 = new interface4() {
			
			@Override
			public int sum(int num1, int num2) {
				// TODO Auto-generated method stub
				return 2;
			}
		};
		System.out.println(i2.sum(1, 2));
	}
}

interface interface4{
	public int sum(int num1, int num2);
}
