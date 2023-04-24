
package S04;
public interface MyInterface{
   void doSomething();
}

public class MyClass{
   public void execute(){
      doSomething();
   }
}

public class MyClass2 implements MyInterface{
   public void execute(){
      doSomething();
   }
}