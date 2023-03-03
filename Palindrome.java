import java.util.Scanner;
 class Palindrome{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the value");
     int n = input.nextInt();
     int sum=0, temp,r;

     temp=n;
     while(n>0){
     r=n%10;
     sum=(sum*10)+r;
     n=n/10;
    }
     if(temp==sum)
 {
     System.out.println("The number is palindrome");
   }
   else
 {
     System.out.println("The number is palindrome");
    }
  }
}

