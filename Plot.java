import java.util.ArrayList;
import java.util.*;
public class Plot
{
    public static void main(String[] args)
    {
        long start=System.currentTimeMillis();
        int i=1;
        ArrayList<Integer> a=new ArrayList<>();
        while(i<500000)
        {
            a.add((new Random().nextInt(9)));
            //System.out.println(i);
            i++;
        }
        while(a.size()!=0)
        {
        //a.remove(0);
        //a.remove(a.size()-1);
        //int x=(new Random()).nextInt(a.size());
        //System.out.println(x);
        int x=a.size();
        a.remove(x/2);
    }
        long runtime=System.currentTimeMillis()-start;
        System.out.println(runtime);
    }
}//The max size of an array list is 2,147,483,647 because 
//the get(int idx) method could retrieve only an int range of indices