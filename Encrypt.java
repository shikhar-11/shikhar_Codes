import java.util.Scanner;
public class Encrypt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string for Encryption");
        String s=sc.nextLine();
        char[] ch=new char[s.length()];
        ch[0]=s.charAt(0);
        int count1=1;
        int count2=0;
        for(int i=1;i< s.length();i++){
            if(i%2==0){
                ch[i]=s.charAt(i-count1);
                count1+=1;
            }
            else{
                ch[i]=s.charAt(s.length()-i+count2);
                count2+=1;
            }
            
        }
        String str=new String(ch);
        System.out.println("Encrypted String" + " : " + str);
        }
    }
