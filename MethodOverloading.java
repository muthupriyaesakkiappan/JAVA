class MethodOverloading{
 public void m1(int a, int b)
{
  System.out.println(a+b);
 }
 public void m1(int c,String d)
{
 System.out.println(c +" "+d);
}
 public void m1(int a,int b, String e)
{
 System.out.println(a,b,e);
}
public static void main(String args[])
{
MethodOverloding obj = new MethodOverloading();
Scanner input= new Scanner(System.in);
System.out.println("Enter String:");
int a = input.nextInt();
System.out.println("Enter value:");
int b = input.nextInt();
System.out.println("Enter value:");
int c = input.nextInt();
System.out.println("Enter String:");
int d = input.nextInt();
System.out.println("Enter Value:");
int e = input.nextInt();
obj.m1(a,b);
obj.m1(d,c);
obj.m1(d,e,a);
}
}




 