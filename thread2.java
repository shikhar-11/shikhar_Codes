import java.io.IOException;
import java.util.*;
public class thread2 extends Thread
{
    int flag,x,y,b,a=0;
    public void run()
    {
       //System.out.println("a:"+a);
       //System.out.println("b:"+b);
        for(x=a+1;x<=b;x++)
        {
            flag=0;
            for(y=2;y<x;y++)
            if(x%y==0)
            flag=1;
            if(flag==0)
            System.out.println(x);
        }
        
    
    }
    public static void main(String[] args)throws IOException,InterruptedException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N:");
        int n=sc.nextInt();
        System.out.println("Enter the value of delta:");
        int d=sc.nextInt();
        int i=1;
        long start=System.currentTimeMillis();
        while(i<=n)
        {
            thread2 t=new thread2();
            if(i!=1)
            {t.a=(i-1)*d;
            t.b=i*d;}
            if(i==1)
            t.b=d;
            t.start();
            t.join();
            
            i++;
            
        }
        long tt=System.currentTimeMillis()-start;
        thread2 t1=new thread2();
        long ts=t1.serial(n,d);
        double r=(tt/ts);
        System.out.println(tt);
        System.out.println(ts);
        System.out.println(r);

    }
    public long serial(int n,int d)
    {
        long start=System.currentTimeMillis();
        int x,y,flag=0;
        for(x=1;x<n*d;x++)
        {
            flag=0;
            for(y=2;y<x;y++)
            if(x%y==0)
            flag=1;
            if(flag==0)
            System.out.println("Serial code:"+x);
        }
        long runtime=System.currentTimeMillis()-start;
        return runtime;
    }

}