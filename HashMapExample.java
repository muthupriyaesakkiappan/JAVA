import java.util.*;
class HashMapExample{
public static void main(String[] args)
{
Map<Integer,String> map = new HashMap<Integer,String>();
map.put(100,"Amit");
map.put(101,"Priya");
map.put(103,"raju");
map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

}
}