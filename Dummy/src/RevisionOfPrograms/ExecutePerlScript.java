package RevisionOfPrograms;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ayushsi
 * 
 * This class executes the perl script which is kept in classpath and is responsible for XML transformations
 * which eventually generates CustomerUDTrequest.xsd
 * 
 */

//TODO writting a maven script to add this program in pom.xml as a separate phase/profile

public class ExecutePerlScript {

	public static void main(String[] args) throws Exception {

		// finding OS name from System properties
		String osName = System.getProperty("os.name");
		// getting the runtime instance
		Runtime runTime = Runtime.getRuntime();
		// starting the process by calling the exec function of runtime class
		// and passing filepath(or relative classpath) where perl script is kept
		Process process = runTime.exec("FilePath of Perl.. better to keep it in classpath");
		// waiting till the process gets over
		process.waitFor();
		// if OS name=Windows, then execute the perl script but dont stop
		// further processing if it fails
		if (osName.contains("Windows")) {
			// process.exitValue() generally gives 0 as result if the process
			// executed successfully
			if (process.exitValue() == 0) {
				Logger.getAnonymousLogger().log(Level.INFO, "CustomerUDT Perl Command executed successfully");
			} else {
				Logger.getAnonymousLogger().log(Level.INFO, "CustomerUDT Perl Command failed");
			}
		}
		// if OS name=Linux, then execute the perl script but stop further
		// processing if it fails, by throwing an error
		else if (osName.contains("Linux")) {
			// process.exitValue() generally gives 0 as result if the process
			// executed successfully
			if (process.exitValue() == 0) {
				Logger.getAnonymousLogger().log(Level.INFO, "CustomerUDT Perl Command executed successfully");
			} else {
				throw new Exception(
						"CustomerUDT Request XSD generation perl script failed, Aborting the further process");
			}
		}
	}

}
