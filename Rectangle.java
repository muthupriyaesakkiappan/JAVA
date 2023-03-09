class Rectangle{
int length;
int width;
void insert(int l,int w)
{
length= l;
width= w;
}
void area(){
System.out.println(length*width);
}
public static void main(String[] args)
{
Rectangle r1= new Rectangle(),r2= new Rectangle();
r1.insert(12,34);
r2.insert(12,49);
r1.area();
r2.area();
}
}