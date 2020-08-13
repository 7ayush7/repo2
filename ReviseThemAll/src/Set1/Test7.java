package Set1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Test7 {

	public static void main(String... args){
//		Locale s = Locale.getDefault();
//		System.out.println(s);
//		System.out.println(System.getProperties());
//		Character c = new Character('c');
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
        ((DecimalFormat)nf).setParseBigDecimal(true);
        
        System.out.println(nf.format(1000));
	}
}
