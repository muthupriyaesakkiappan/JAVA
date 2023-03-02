import java.util.*;
class Grade{
public static void main(String[] args){
Scanner input= new Scanner(System.in);
System.out.println("Enter your mark");
int a = input.nextInt();
if(a<35){
System.out.println("Grade d");
}
else if(a>35 && a<=60)
{
System.out.println("Grade c");
}
else if(a>60 && a<=75){
System.out.println("Grade b");
}
else if(a>85 && a<=99){
System.out.println("Grade a");
}
else{
System.out.println("invalid");
}
}}




