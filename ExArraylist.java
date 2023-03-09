import java.util.*;
class ExArraylist{
public static void main(String args[])
{
ArrayList<String>list = new ArrayList<String>();
list.add("Ravi");
list.add("Suriya");
list.add("Renu");
list.add("Priya");
Iterator itr=list.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}

















