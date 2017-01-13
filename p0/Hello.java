public class Hello {

   public static void main(String []args) {
      System.out.println("Hello World"); // prints Hello World
      greet("Env", 1);
      Hello h = new Hello();
      h.slack();
   }

   public static void greet(String s, Integer i){
       System.out.println("Java "+ s ,", version " +i);
   }

   public void slack(){
       System.out.println("Slack me");
   }
}