
public class Factorial {
    public static void main(String[] args)
    {

        int a = Integer.parseInt(args[0]);
        int b = 1;
        for(int i = 1; i < a; i++){
            b *= i;
            System.out.println(i);
        }
        System.out.print("   "+b);
    }



}

