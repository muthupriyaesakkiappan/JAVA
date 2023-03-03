import java.util.*;
class Accessmodifier{

    Scanner input = new Scanner(System.in);

private int addition(){
  

   System.out.println("Enter a value");
   int a = input.nextInt();
   System.out.println("Enter b value");
   int b = input.nextInt();
   int c=a+b;
   
   System.out.println("Addition of a & b is:" +c);
    return c;
   }
  
public String emailcheck(){
  String email, result;
  System.out.println("Enter a Email ID");
  email = input.nextLine();
  if(email.contains("@gmail.com"))
  {
   result=("The given mail " + email + " "+"is  valid");
   System.out.println(result);
  }
  else{
   result=("The given mail " + email +"is  valid");
   System.out.println(result);}
  return result;
  

}
public static void main(String[] args)
{
Accessmodifier ac = new Accessmodifier();
ac.emailcheck();
 ac.addition();
 
}
} 



   
  



  
  


   
   


