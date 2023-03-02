import java.util.*;
class Elseiflat{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter your passward");
int a= input.nextInt();
int b= 123;
if(a==b){
System.out.println("Condition 1 satisfied");
if(a!=1234){
System.out.println("Nested if Satisfied");
}
}
else if(a==1234)
{
System.out.println("Condition 2 satisfied");
}
else{
System.out.println("both the Condition are not satisfied");
}
}
}