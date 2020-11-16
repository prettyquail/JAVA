import myPackage.MyClassOne;
import myPackage.MyClassTwo;

public class PrintName 
{
   public static void main(String args[]) 
   {       
      // Initializing the String variable 
      // with a value 
      String name = "GeeksforGeeks";
      String n = "Manisha";
      
      // Creating an instance of class MyClass in 
      // the package.
      MyClassOne obj = new MyClassOne();
      
      obj.getNames(name);


      MyClassTwo obj1 = new MyClassTwo();
      
      obj1.getNames(n);
   }
}
