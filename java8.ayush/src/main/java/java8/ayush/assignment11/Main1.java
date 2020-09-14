package java8.ayush.assignment11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.itextpdf.text.DocumentException;

/**
 * @author ayush.singh
 * */
public class Main1 {

	public static void main(String[] args) throws IOException, DocumentException {
		createMainParentFile();
		splitMainFileBasedOnSize();
		mergeFilesToRecreateParent();
	}

	private static void mergeFilesToRecreateParent() throws IOException {
		String basePath="test/splitFiles";
		File f = new File("test/splitFiles");
		String[] files = f.list();
		FileInputStream tempFin = new FileInputStream(basePath+"/"+files[0]);
		FileChannel tempFc = tempFin.getChannel();
		int bufferSize = ((int) (tempFc.size())*(files.length));
		tempFc.close();
		tempFin.close();
		Files.createDirectories(Paths.get("test/mergedFile"));
		FileOutputStream fout = new FileOutputStream("test/mergedFile/mergedParent.txt");
		FileChannel fcout = fout.getChannel();
		for(int i=1;i<=files.length;i++) {
			FileInputStream fin = new FileInputStream(basePath+"/"+i+".txt");
			FileChannel fc = fin.getChannel();
			ByteBuffer bf = ByteBuffer.allocate(bufferSize);
			fc.read(bf);
			System.out.println(bf.toString());
			bf.flip();
			fcout.write(bf);
			fc.close();
			fin.close();
		}

		fcout.close();
		fout.close();
		
	}

	private static void splitMainFileBasedOnSize() throws IOException {
		FileInputStream fin = new FileInputStream(new File("test/parent/parent.txt"));
		FileChannel fc = fin.getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(20*1024);
		fc.read(buffer);
		buffer.flip();
		int i=1;
		int offset=0;
		long size=fc.size();
		while(size>0) {
			FileOutputStream fout = new FileOutputStream(new File("test/splitFiles/"+i+".txt"));
			FileChannel fc2 = fout.getChannel();
			ByteBuffer bf = ByteBuffer.allocate(2*1024);
			bf.put(buffer.array(), offset, 2*1024);
			offset=offset+(2*1024);
			i=i+1;
			bf.flip();
			fc2.write(bf);
			size=size-fc2.size();
			fc2.close();
			fin.close();
		}
		
		fc.close();
		fin.close();
	}

	private static void createMainParentFile() throws IOException {
		Files.createDirectories(Paths.get("test/parent"));Files.createDirectories(Paths.get("test/splitFiles"));
		FileOutputStream fout = new FileOutputStream(new File("test/parent/parent.txt"));
		FileChannel fc = fout.getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(20*1024);
		StringBuilder s = new StringBuilder();
		for(int i=0;i<100000;i++) {
			s.append(i);
			s.append("-");
		}
		buffer.put(s.toString().getBytes(),0,(20*1024));
		buffer.flip();
		fc.write(buffer);
		fc.close();
		fout.close();
	}
}
