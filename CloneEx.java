class CloneEx implements Cloneable{
int rollno;
String name;
Student18 (int rollno,String name){
this.rollno= rollno;
this.name=name;
}
public Object clone()throws CloneNotSupportedException{
return super.clone();
}
public static void main(String args[])
{
try{
CloneEx s1= new Student18(100,"priya");
CloneEx s2= new Studnt18(102,"amir");

System.out.println(s1.rollno+" "+s1.name);
System.out.println(s2.rollno+" "+s2.name);
}catch(Clone NotSupportedException c){}
}
}
