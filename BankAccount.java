import java.io.*;
class BankAccount
{
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
    private String accName,accNo;
    private double accBal;
    public BankAccount(String accNo,String accName)
    {
        this.accNo=accNo;
        this.accName=accName;
        accBal=1000.0;
    }
    public static void main(String[]args)throws IOException
    {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        System.out.println("Enter Name: ");
        String name=br.readLine();
        System.out.println("Enter Bank Acc No.: ");
        String no=br.readLine();
        
        BankAccount a1=new BankAccount(no,name);
        while(true){
            System.out.println("1.Withdraw Money /n 2. Deposit Money /n 3. Check Balance /n 4. Deduct Maintenance fees /n 5. Exit");
        System.out.println("Enter your choice: ");
        int n=Integer.parseInt(br.readLine());
        switch(n)
        {
            case 1: a1.withdraw();
            break;
            case 2: a1.deposit();
            break;
            case 3: System.out.println(a1);
            break;
            case 4: a1.deduct();
            break;
            case 5: System.exit(0);
            break;
            default: System.out.println("Enter correct choice!!");
            break;

        }
    }
    }
    public void withdraw()throws IOException
    {
      double w=0.0;
      System.out.println("Enter amt to withdraw: ");
      w=Double.parseDouble(br.readLine());
      accBal=accBal-w;
      System.out.println("Amount Withdrawn!");

    }
    public void deposit()throws IOException
    {
        double d=0.0;
        System.out.println("Enter amt to deposit: ");
        d=Double.parseDouble(br.readLine());
        accBal=accBal+d;
        System.out.println("Amount Deposited!!");

    }
    public void deduct()
    {
        accBal=accBal-100;
        System.out.println("Maintenance fees of  rs.100 deducted");
    }
    public String toString()
    {
        String str="AccName: "+accName+"/nAccNo: "+accNo+"/nBalance: "+accBal+"/n";
        return str;
    }
}