class Caaa1
{
   private int num;

   public void display()
   {
      System.out.println("printed from Caaa class");
   }
}
class Cbbb2 extends Caaa1
{
   public void display()
   {
      System.out.println("printed from Cbbb class");
   }
}
public class class09
{
   public static void main(String args[])
   {
      Caaa1 bb=new Cbbb2();
      bb.display();
   }
}
