package RevisionOfPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDeserialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Child c = new Child(1, "Parent", 2, "Child");
		File f=new File("C:/Users/ayushsi/Desktop/New folder/abc.txt");
		FileOutputStream fOut = new FileOutputStream(f);
		ObjectOutputStream bOut = new ObjectOutputStream(fOut);
		bOut.writeObject(c);	
		System.out.println("Done");
		bOut.close();
		fOut.close();
		
		FileInputStream fIn = new FileInputStream(new File("C:/Users/ayushsi/Desktop/New folder/abc.txt"));
		ObjectInputStream oIn=new ObjectInputStream(fIn);
		Child readC=(Child)oIn.readObject();
		System.out.println(readC.toString());
		oIn.close();
		fIn.close();
	}
}
