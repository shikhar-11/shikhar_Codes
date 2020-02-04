import java.io.*;

public class MainProg
{
    
 public static void main(String[] args)throws IOException
 {
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
 Student s1 = new Student("Bhasudev Vagat");
 Student s2 = new Student("Baninder Makshi");
 float sub1, sub2; 
 //input grades for B. Vagat
 s1.inputGrades();
 //print average for B. Vagat
 float avg1=s1.getAverage();
 System.out.println("Avg of B. Vagat: "+avg1);
 System.out.println();
 //input grades for B. Makshi into sub1, sub2
 //and then inpout the grades (using the second version of the input function)
 System.out.println("Enter grades for B. Makshi: ");
 sub1=Float.parseFloat(br.readLine());
 sub2=Float.parseFloat(br.readLine());
 s2.inputGrades(sub1,sub2);
 //print average for both
 float avg2=s2.getAverage();
 System.out.println("Avg of B. Vagat: "+avg1);
 System.out.println("Avg of B. Makshi: "+avg2);
 }
} 