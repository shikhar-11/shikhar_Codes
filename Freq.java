class Freq
{
    public static void main(String[]args)
    {
        
        int[] a=new int[26];
        char[] b=new char[26];
        String s="";
        int i,t=0,j,p=0,l=args.length,temp1=0;
        char c,temp2;
        for(j=0;j<l;j++)
        {
            s=args[j];    
        for(i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            t=(int)c;
            if(t>=65&&t<=90)
            {p=t-65;
            a[p]++;}
            else if(t>=97&&t<=122)
            {p=t-97;
            a[p]++;}
        }
        s="";
        }
        for(i=0;i<26;i++)
         b[i]=(char)(i+65);

        for(i=0;i<26;i++)
        {
            for(j=0;j<26-i-1;j++)
            {
                if(a[j]<a[j+1])
                {
                    temp1 = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp1;
                    temp2 = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp2;
                }


            }
        }
        for(i=0;i<26;i++)
        {
            if(a[i]!=0)
            
              System.out.println(b[i]+"\t"+a[i]);
               
            }
    }
}