package Set1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Program to run commands using exec method of Runtime class
public class Test14 {
	public static void main(String... args) throws IOException {
		ProcessBuilder builder = new ProcessBuilder();
		builder.command("C:\\Program Files (x86)\\Microsoft Office\\root\\Office16\\Outlook.exe");
		builder.start();
	}
}
