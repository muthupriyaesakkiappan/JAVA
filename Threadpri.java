class A extends Thread{
public void run(){
int a= 6,b=9;
System.out.println("Thread A Addition - " (a+b));
}
}
class B extends Thread{
public void run(){
int a= 6,b=9;
System.out.println("Thread B Subtraction - " (a-b));
}
}
class C extends Thread{
public void run(){
int a= 6,b=9;
System.out.println("Thread A Multiplication - " (a*b));
}
}
Class Threadpri{
public static void main(String[] args)
{
A a1 = new A();
B b1 = new B();
C c1 = new C();

c1.setpriority(Thread.MAX_PRIORITY);
a1.setpriority(Thread.MIN_PRIORITY);
b1.setpriority(a1.getPriority()+1);

c1.start();
a1.start();
b1.start();

}
}
