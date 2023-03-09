class Human
  {
   void showHuman()
   {
      System.out.println("invoking show human method");
   }
}
  interface father
  {
       void show();
    }
  interface mother
  {
   void show();
    }

class Child extends Human implements father, mother
     {
     public void show(){
         System.out.println("invoking showchid");
     }
     public void show1(){
          System.out.println("show the child");
      }
 }
 
class HybirdExample extends Child{
    
   public static void main(String[] args)
  {

     Child c= new Child();
     c.show();
     c.showHuman();
     c.show1();
    }
 }

 
 
 
