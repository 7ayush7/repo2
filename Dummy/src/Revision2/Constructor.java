package Revision2;

class Constructor
{
   static String str;
   public void Constructor() 
   {
      System.out.println("In constructor");
      str = "Hello World";
   }
   public static void main(String [] args)
   {
      Constructor c = new Constructor();
      System.out.println(str);
   }
}