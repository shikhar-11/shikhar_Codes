import java.io.*;
import java.util.Random;

class Guess
{

 public static void main(String[]args)throws IOException
 {
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(in);
   int num=-1,i=0;
   Random rand=new Random();
   int r=rand.nextInt(10);
   while(true)
    {
      System.out.println("Enter no.:");
       num=Integer.parseInt(br.readLine());
       if(num>r)
       System.out.println("Think Smaller");
       else if(num<r)
        System.out.println("Think Bigger"); 
     if(num==r){
    System.out.println("Gotcha!");
    break;     
}i++;
}
System.out.println("Attempts taken:"+i);
  }
}

