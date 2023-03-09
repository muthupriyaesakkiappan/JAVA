class Anonymous{
int a= 5;
int b= 6;
public void addition(){
System.out.println(a+b);
System.out.println(a*b);

}
public static void main(String args[]){
Anonymous cal= new Anonymous();
//new Anonymous().addition();
cal.addition();
}
}