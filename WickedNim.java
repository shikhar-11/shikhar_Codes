import java.util.Scanner;
public class WickedNim{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter the no. of objects");
        int n=in.nextInt();
        System.out.println("there are total "+ n+ " objects");
        while(n>0){
            if (n%4==0){
                System.out.println("Please choose atleast 1 object and atmost 3 objects");
                int x=in.nextInt();
                System.out.println("You choose " + x + " objects");
                n=n-x;
                System.out.println("objects left :" + n);
                if (n==0){
                    System.out.println("You win the game");
                    break;
                }
                int z=n%4;
                
                System.out.println("computer choose " +z+" objects");
                n=n-z;
                System.out.println("objects left :" + n);
                if (n==0){
                    System.out.println("Computer win the game");
                    break;
                }
            }
            else{
                
                int x=n%4;
                System.out.println("Computer choose " + x + " objects");
                n=n-x;
                System.out.println("objects left :" + n);
                if (n==0){
                    System.out.println("Computer win the game");
                    break;
                }
                System.out.println("Please choose atleast 1 object and atmost 3 objects");
                int z=in.nextInt();
                
                System.out.println("You choose " +z+" objects");
                n=n-z;
                System.out.println("objects left :" + n);
                if (n==0){
                    System.out.println("You win the game");
                    break;


                }

            }
        }
    }
}