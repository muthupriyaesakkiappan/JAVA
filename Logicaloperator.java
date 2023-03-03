class Logicaloperator{
public static void main(String[] args){
int a=5;
int b=6;
System.out.println(a>b&&a==b);
System.out.println(a<b||a==b);
System.out.println(a>b&a==b);
System.out.println(a>b|a==b);
String value=(a==b)?"equal":"not equal";
System.out.println(value);
System.out.println(a>b);
}
}
