package Set1;

public class Test16 {

	public static void main(String[] args){
//		SecurityManager secManager = new SecurityManager();
//		secManager.checkPackageAccess("java.lang");
//		secManager.getClass();
//		Runtime runTime = Runtime.getRuntime();
//		Package pack = Package.getPackage("java.lang");
//		Exception e= new Exception();
//		Class<? extends Exception> c = e.getClass();
//		System.out.println(c.getClasses());
//		Reflection.getCallerClass()
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		loader.setPackageAssertionStatus("java.lang", true);
		loader.getClass();
	}
}
