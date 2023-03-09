interface Train{
public void method1(float a);
public void method2(float b);
public void method3(float c);
public void method4(float d);
}

class Data implements Train{
public void method1(float a)
{
System.out.println("Fovour is chocolate" +a);
}
public void method2(float b)
{
System.out.println("Fovour is icecream" +b);
}
public void method3(float c)
{
System.out.println("Fovour is biscate" +c);
}
public void method4(float d)
{
System.out.println("Fovour is sprite" +d);
}
class Interexample
{
public static void main(String[] args)
{
Data obj = new Data();
obj.method1(15.00f);
obj.method2(45.00f);
obj.method3(15.00f);
obj.method4(45.00f);
}
}
}


