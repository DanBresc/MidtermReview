
package midtermreview;
public class StatClassEx{
   static class Nested_Demo {
      public void my_method() {
         System.out.println("This is my nested class");
      }
   }
   public static void main(String args[]) {
      StatClassEx.Nested_Demo nested = new StatClassEx.Nested_Demo();
      nested.my_method();
   }
}


