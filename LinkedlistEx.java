import java.util.*;
class LinkedlistEx{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter 10 value:");
LinkedList<Integer> list = new LinkedList<Integer>();
list.add(sc.nextInt());
list.add(sc.nextInt());
list.add(sc.nextInt());
list.add(sc.nextInt());
list.add(sc.nextInt());
list.add(sc.nextInt());
list.add(sc.nextInt());
list.add(sc.nextInt());
list.add(sc.nextInt());
list.add(sc.nextInt());
System.out.println(list);
Collections.sort(list);
System.out.println("values are:");
Collection.sort(

Iterator itr = list.iterator();
System.out.println("values are:");
while(itr.hasNext())
System.out.println(itr.next());

}
}




