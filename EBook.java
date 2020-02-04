import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class EBook
{
    public static void main(String[] args)throws IOException
    {
        
       EBook x=new EBook();
        x.arr(args[0],args[1]);
        x.link(args[0],args[1]);
        x.hash(args[0],args[1]);
        x.trr(args[0],args[1]);

        
    }
    public void arr(String b1,String b2)throws IOException
    {
        long start=System.currentTimeMillis();
        List<String> distinct= new ArrayList<>();
        BufferedReader br1 = new BufferedReader(new FileReader("C:/Users/Lenovo/Downloads/"+b1)) ;
        BufferedReader br2 = new BufferedReader(new FileReader("C:/Users/Lenovo/Downloads/"+b2)) ;
        ArrayList<String> a=new ArrayList<>();
        ArrayList<String> b=new ArrayList<>();
        int ch=0;
        String s="";
        do
        {
            ch=br1.read();
            s=s+(char)ch;
            if(((char)ch)==' ')
            {a.add(s);
             // System.out.println(s+"added");
            s="";}
        }while(ch!=-1);
        ch=0;
        s="";
        
        distinct=a.stream().distinct().collect(Collectors.toList());
        
        do
        {
            ch=br2.read();
            s=s+(char)ch;
            if(((char)ch)==' ')
            {if(distinct.contains(s))
                {b.add(s);
                 //System.out.println(s+" is Distinct");
                 
                }
            s="";}

        }while(ch!=-1);
        distinct=distinct.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct.size());
       long run=System.currentTimeMillis()-start;
       System.out.println("Time: "+run);

    }
    public void link(String b1,String b2)throws IOException
    {
        long start=System.currentTimeMillis();
        List<String> distinct=new LinkedList<>();
        BufferedReader br1 = new BufferedReader(new FileReader("C:/Users/Lenovo/Downloads/"+b1)) ;
        BufferedReader br2 = new BufferedReader(new FileReader("C:/Users/Lenovo/Downloads/"+b2)) ;
        LinkedList<String> a=new LinkedList<>();
        LinkedList<String> b=new LinkedList<>();
        int ch=0;
        String s="";
        do
        {
            ch=br1.read();
            s=s+(char)ch;
            if(((char)ch)==' ')
            {a.add(s);
              //  System.out.println(s+"added");
            s="";}
        }while(ch!=-1);
        ch=0;
        s="";
        
        distinct=a.stream().distinct().collect(Collectors.toList());
        
        do
        {
            ch=br2.read();
            s=s+(char)ch;
            if(((char)ch)==' ')
            {if(distinct.contains(s))
                {b.add(s);
                 //System.out.println(s+" is Distinct");
                 
                }
            s="";}

        }while(ch!=-1);
        distinct=distinct.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct.size());
        long run=System.currentTimeMillis()-start;
        System.out.println("Time: "+run);
        

    }
    public void hash(String b1,String b2)throws IOException
    {
        long start=System.currentTimeMillis();
        BufferedReader br1 = new BufferedReader(new FileReader("C:/Users/Lenovo/Downloads/"+b1)) ;
        BufferedReader br2 = new BufferedReader(new FileReader("C:/Users/Lenovo/Downloads/"+b2)) ;
        HashSet<String> a=new HashSet<>();
        HashSet<String> b=new HashSet<>();
        int ch=0;
        String s="";
        do
        {
            ch=br1.read();
            s=s+(char)ch;
            if(((char)ch)==' ')
            {a.add(s);
               // System.out.println(s+"added");
            s="";}
        }while(ch!=-1);
        ch=0;
        s="";
        
        do
        {
            ch=br2.read();
            s=s+(char)ch;
            if(((char)ch)==' ')
            {if(a.contains(s))
                {b.add(s);
                // System.out.println(s+" is Distinct");
                 
                }
            s="";}

        }while(ch!=-1);
        
        System.out.println(b.size());
        long run=System.currentTimeMillis()-start;
        System.out.println("Time: "+run);

    }
    public void trr(String b1,String b2)throws IOException
    {
        long start=System.currentTimeMillis();
        BufferedReader br1 = new BufferedReader(new FileReader("C:/Users/Lenovo/Downloads/"+b1)) ;
        BufferedReader br2 = new BufferedReader(new FileReader("C:/Users/Lenovo/Downloads/"+b2)) ;
        TreeSet<String> a=new TreeSet<>();
        TreeSet<String> b=new TreeSet<>();
        int ch=0;
        String s="";
        do
        {
            ch=br1.read();
            s=s+(char)ch;
            if(((char)ch)==' ')
            {a.add(s);
                //System.out.println(s+"added");
            s="";}
        }while(ch!=-1);
        ch=0;
        s="";
        
        do
        {
            ch=br2.read();
            s=s+(char)ch;
            if(((char)ch)==' ')
            {if(a.contains(s))
                {b.add(s);
                 //System.out.println(s+" is Distinct");
                 
                }
            s="";}

        }while(ch!=-1);
        
        System.out.println(b.size());
        long run=System.currentTimeMillis()-start;
        System.out.println("Time: "+run);

    }
}