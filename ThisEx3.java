class A{
A()
{
System.out.println("Hello");
}
A(int x){
this();
System.out.println(x);
}}
class ThisEx3{
public static void main(String[]  args)
{
 A a= new A(10);
}
}