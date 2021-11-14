class AA
{
   public int num1;
   public int num2;

   public AA()
   {
     num1=1;
     num2=1;
   }
   public AA(int a,int b)
   {
      num1=a;
      num2=b;
   }
   
}

class AB extends AA
{
   public AB()
   {}
   public AB(int a,int b)
   {
      super(a,b);
   }
   public void show()
   {
      System.out.println("num1="+num1+", num2="+num2);
   }
}

public class class03
{
   public static void main(String args[])
   {
      AB b1=new AB();
      AB b2=new AB(3,9);

      b1.show();
      b2.show();
   }
}