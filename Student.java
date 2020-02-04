import java.io.*;

public class Student extends MainProg
{
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
 //instance data
 
String studentName;
float ct1,ct2;
 //constructor 
 public Student(String studentName)
 {
 //add body of constructor
 this.studentName=studentName;
 ct1=0.0f;
 ct2=0.0f;
 }


 //inputGrades (version 1): prompt for and read in student's grades for ct1 and ct2.
 public void inputGrades()throws IOException
 {
 //add body of inputGrades
 System.out.println("Enter grades for B. Vagat: ");
 ct1=Float.parseFloat(br.readLine());
 ct2=Float.parseFloat(br.readLine());
 }
 
 //inputGrades (version 2): ct1 and ct2 as params. 
 public void inputGrades(float ct_1,float ct_2)// modify as needed 
 {
 //add body of inputGrades
ct1=ct_1;
ct2=ct_2;
 }

 //getAverage: compute and return the student's test average
 //add header for getAverage
 public float getAverage()
 {
 //add body of getAverage
float avg=(ct1+ct2)/2;
return avg;

 }

 //getName: print the student's name
 //add header for printName
 public void getName()
 {
 //add body of printName
 System.out.println("The name is:" +studentName);

 }
}