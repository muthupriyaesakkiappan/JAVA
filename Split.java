import java.util.Scanner;
class Split{
public static void main(String[] args){
   Scanner input= new Scanner(System.in);
   System.out.println("ether the value");
   String a =input.nextLine();
    String [] arr= a.split("@",2);
    for( String b:arr)
{
    System.out.println("Pattern : " + b);
    }  
  }
}