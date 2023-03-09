interface printable
{
  void print();
}
  class Abtraction implements printable{
  public void print()
{
  System.out.println("Using interface program is archieve");
}
  public static void main(String args[])
{
  Abtraction obj = new Abtraction();
  obj.print();
 }
}