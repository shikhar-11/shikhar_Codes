public class thread1 extends Thread
{ long i=1;
    public void run()
    {
        while(i<1000000){
        System.out.println(this.getName()+": "+i);
        i++;}
    }
    public static void main(String[] args)
    {
        thread1 t1=new thread1();
        thread1 t2=new thread1(); 
        t1.start();
        t2.start();
        

    

    }
}