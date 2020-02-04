public class MMM{
    public static void main(String args[]){
        int t=Integer.parseInt(args[0]);
        int z=Integer.parseInt(args[0]);
        float sum=Float.parseFloat(args[0]);
        for(int i=1; i<args.length;i++){
            if (t>Integer.parseInt(args[i])){
                t=Integer.parseInt(args[i]);
            }
            if (z<Integer.parseInt(args[i])){
                z=Integer.parseInt(args[i]);
            }
            float f=Float.parseFloat(args[i]);
            sum=sum+f;
            }
        float avg=sum/(args.length);
        System.out.println("Maximum : " + z);
        System.out.println("Minimum : " + t);
        System.out.println("Average : " + avg );
        }
    }
