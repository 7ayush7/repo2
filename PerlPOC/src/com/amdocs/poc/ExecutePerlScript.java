
package com.amdocs.poc;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ayushsi
 * 
 *         This class executes the perl script which is kept in classpath and is
 *         responsible for XML transformations which eventually generates
 *         CustomerUDTrequest.xsd
 * 
 */
public class ExecutePerlScript {

	public static void main(String[] args) throws Exception {

		String osName = System.getProperty("os.name");
		osName = "Linux";
		String path = "src/com/amdocs/poc/genXsd.pl";
		Runtime runTime = Runtime.getRuntime();
		try {
			Process process = runTime.exec("perl " + path + " CustomerUdtRequest.xsd CustomerUdtRequest src/com/amdocs/poc/gen");
			process.waitFor();
			int len;
			if ((len = process.getErrorStream().available()) > 0) {
			  byte[] buf = new byte[len]; 
			  process.getErrorStream().read(buf); 
			  System.err.println("Command error:\t\""+new String(buf)+"\""); 
			}
			if (process.exitValue() == 0) {
				Logger.getAnonymousLogger().log(Level.INFO, "CustomerUDT Perl Command executed successfully");
			} else {
				if (osName.contains("Windows")) {
					Logger.getAnonymousLogger().log(Level.INFO, "CustomerUDT Perl Command failed with errors");
				} else {
					throw new Exception("CustomerUDT Request XSD generation perl script failed");
				}
			}
		} catch (Exception e) {
			if (osName.contains("Windows")) {
				Logger.getAnonymousLogger().log(Level.INFO,
						"CustomerUDT Perl Command failed with errors : " + e.getMessage());
			} else {
				throw new Exception("CustomerUDT Request XSD generation perl script failed with error : " + e);
			}
		} finally {
			File generatedFile = new File("CustomerUdtRequest.xsd");
			if (generatedFile.exists()) {
				Path temp = Files.move(Paths.get("CustomerUdtRequest.xsd"),
						Paths.get("JavaIF/docs/AYUSH/CustomerUdtRequest.xsd"), StandardCopyOption.REPLACE_EXISTING);
				if (temp != null) {
					Logger.getAnonymousLogger().log(Level.INFO, "File moved to new location");
				} else {
					throw new Exception("Error swapping the location of generated CustomerUDTRequest.xsd");
				}
			}

		}
	}
}
