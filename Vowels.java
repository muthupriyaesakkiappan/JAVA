import java.util.Scanner;
public class Vowels{
public static void main(String[] args){
Scanner input= new Scanner(System.in);
System.out.println("Enter the value:");
String letter= input.next();
if(letter =="a" ||letter =="e" ||letter =="i" ||letter =="o" ||letter =="u")
{
System.out.println("The given number is vowels");
}
else
{
System.out.println("The given number is consonant");
}
}
}

