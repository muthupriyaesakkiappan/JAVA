public class ExampleThrow{
 public static void validate(int age){
  if (age<=18)
{
System.out.println("Thambi nee innum valaranum!!");
throw new ArithmeticException("Thambi nee innum valaranum!!");
}
else{
System.out.println("Alright !! mark your presence to change the world on 12-10-2023");
}
}
public static void main(String args[])
{
 validate(13);
System.out.println("Main Method");
//Class1 object1= new Class1();
//object1.method1();
}
}
