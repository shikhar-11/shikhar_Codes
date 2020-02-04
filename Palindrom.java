import java.util.Scanner;
public class Palindrom{
     public static void isPal(String x){
        StringBuilder str1=new StringBuilder(x);
        
        if (str1.reverse().toString().equals(x)){
            System.out.println("yes the entered string is palindrome");
            
        }
        else{
            System.out.println("no the entered string is not a palindrome");
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your String");
        String str=in.nextLine();
        
        isPal(str.toLowerCase());
        
        }
   
    }



