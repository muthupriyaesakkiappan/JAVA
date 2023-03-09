class data1{
  void show(){
     System.out.println("Monday");
   }
}
class data2 extends data1{
    void display(){
        System.out.println("tues day");
     }
}

class Inheritance {
    public static void main(String[] args)
 {
       	data2 obj= new data2();
       	obj.display();
	obj.show();
	}
}