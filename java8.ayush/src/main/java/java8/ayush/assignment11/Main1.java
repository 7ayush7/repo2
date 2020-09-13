package java8.ayush.assignment11;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.ElementListener;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfWriter;

public class Main1 {

	public static void main(String[] args) throws IOException, DocumentException {
		Files.createDirectories(Paths.get("test"));
		FileOutputStream fout = new FileOutputStream(new File("test/1.txt"));
		FileChannel fc = fout.getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(11*1024);
		StringBuilder s = new StringBuilder();
		for(int i=0;i<10000;i++) {
			s.append("This is test data");
			s.append(" ");
		}
		buffer.put(s.toString().getBytes(),0,(11*1024));
		byte[] temp = buffer.array();
		buffer.flip();
		fc.write(buffer);
		fc.close();
		fout.close();
	}
}
