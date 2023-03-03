class A {
void m(){
System.out.println("hello");
}
void n(){
System.out.println("welcome");
this.m();
}}
class ThisTest2{
public static void main(String[] args)
{
A a= new A();
a.n();
}
}

