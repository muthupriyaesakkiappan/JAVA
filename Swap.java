import java.util.*;
class Swap{
public static void main(String[] args){
Scanner input= new Scanner(System.in);
System.out.println("Enter a and b value:");
int t,a,b;
a = input.nextInt();
b = input.nextInt();
System.out.println("Before swapping  a and b value is:" + a +" " + b);
t = a;
a = b;
b = t;
System.out.println("After Swapping a and b value is:" +a +" "+b);
System.out.println();

}
}

