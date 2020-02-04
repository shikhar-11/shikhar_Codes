

import java.util.Scanner;

public class guessme {
  public guessme() {}
  
  public static void main(String[] paramArrayOfString) {
    Scanner localScanner = new Scanner(System.in);
    System.out.println("Enter an integer between zero and nine");
    int i = localScanner.nextInt();
    int j = (int)(1000.0D * (1.0D + Math.random()));
    System.out.printf("I converted %d into %d! For full credit, go and tell Prem how I did it!", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
  }
}

