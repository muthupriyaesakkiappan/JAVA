class Data{
void show(){
System.out.println("Data 1");
}
}
class Data1 extends Data{
void show1(){
System.out.println("In everthing in java is string");
}
}
interface Data2 {
void show2()
}
interface Data3 {
void show3()

}
class Data4 extends Human implements Data2 {
void show1(){
System.out.println("In everthing in java is string");
}
}
class Multilevel{
public static void main(String[] args)
{
Data3 obj = new Data3();
obj.show1();
obj.show2();
obj.show3();
}
}
