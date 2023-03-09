import java.util.*;
public class TreeSetEx1{
public static void main(String[] args)
{
TreeSet<String> set= new TreeSet<String>();
set.add("ravi");
set.add("priya");
set.add("Renu");
set.add("Raju");

//Collections.sort(set, Collections.reverseOrder());
System.out.println(set);

Iterator<String> itr=set.iterator();
System.out.println("Names Are :");
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}
