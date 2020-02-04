import java.io.*;
import java.util.Random;
class Easynim
{
public static void main(String[]args)throws IOException
{
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(in);
Random rand=new Random();
int n,t=0,p=0,x=0;
boolean b=true;
System.out.println("Enter number of pen:");
n=Integer.parseInt(br.readLine());
while(n!=0)
{ t++;
  if(t%2==0)
   {
     while(p==0)
      p=rand.nextInt(3);
      n=n-p;
      System.out.println("Comp picked "+p+"pens");
      System.out.println("Pens left: "+n);
      if(n==0)
       {System.out.println("Comp Wins");
         break;}
      }
     else
      {while(b)
        {System.out.println("Your turn: ");
         x=Integer.parseInt(br.readLine());
         if(x==1||x==2||x==3) break; 
         }
         n=n-x;
         System.out.println("Pens left: "+n);
          if(n==0)
          {System.out.println("YOU Win");
            break;} 
        }
}
}
}