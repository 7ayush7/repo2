package Set1;

import java.io.IOException;

public class Test8 {

	void q() throws IOException{
		throw new IOException("qq");
	}
	void p() throws IOException{
		try{q();}catch(IOException e){throw e;}
	}
	public static void main(String... args) throws IOException{
		
		new Test8().p();
	}
}
