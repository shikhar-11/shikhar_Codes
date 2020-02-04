import java.util.ArrayList;
import java.util.*;
public class PhoneBook
{
    
    public static void main(String[] args)
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        ArrayList<String> names=new ArrayList<>();
        ArrayList<String> email=new ArrayList<>();
        ArrayList<String> ph=new ArrayList<>();
        while(true)
        {
            System.out.println("Enter name: ");
            names.add(sc.nextLine());
            System.out.println("Enter email: ");
            email.add(sc.nextLine());
            System.out.println("Enter ph no.: ");
            ph.add(sc.nextLine());
            System.out.println("done?");
            if(sc.nextLine().equals("yes"))
            break;
            else continue;

        }
        System.out.println("Enter Name to find record: ");
        String n=sc.nextLine();
        for(i=0;i<names.size();i++)
        {
        if(names.get(i).equals(n))    
        System.out.println("Email: "+email.get(i)+"\tPh no.: "+ph.get(i));
        }
        int flag=0;
        String s="";
        for(i=0;i<names.size();i++)
        {
            for(j=i+1;j<names.size();j++)
            {
                if((names.get(i).equals(names.get(j)))  &&  (email.get(i).equals(email.get(j)))  &&  (ph.get(i).equals(ph.get(j))))
                {flag=1;
                 s=s+Integer.toString(j);
                }
            }
            if(flag==1&&s.indexOf(Integer.toString(i))==-1)
            System.out.println("Name: "+names.get(i)+"Email: "+email.get(i)+"Phone no. "+ph.get(i));
            flag=0;
        }

        System.out.println("Enter Domain for search: ");
        String n1=sc.nextLine();
        for(i=0;i<names.size();i++)
        {
            if(email.get(i).indexOf(n1)!=-1)
            System.out.println("Name: "+names.get(i)+"\tPhone: "+ph.get(i));
        }


    }
}