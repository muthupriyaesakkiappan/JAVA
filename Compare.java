import java.util.*;
class Compare{
public static void main(String[] args)
{
Scanner input= new Scanner(System.in);
System.out.println("Enter a value:");
int a = input.nextInt();
System.out.println("Enter b value:");
int b = input.nextInt();
int value=(a==b)? "True": "False";
System.out.println("A  is equals to B:"+value);
int value1=(a>b)? "True": "False";
System.out.println("A  is Greater than B:"+value1);
int value2=(a<b)? "True": "False";
System.out.println("A  is Less than B:"+value2);
}
}


