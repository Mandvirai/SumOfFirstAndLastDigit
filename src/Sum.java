import java.util.Scanner;
public class Sum { // find the sum of first and last digit of any given number

        public static void main(String[] args) throws java.lang.Exception
        {
            Scanner in = new Scanner(System.in);
            int T = in.nextInt();
            for(int i=0;i<T;i++)
            {
                int n = in.nextInt();
                String s = String.valueOf(n);
                int l = s.length();
                int A = Integer.valueOf(s.substring(0,1));
                int B = Integer.valueOf(s.substring(l-1,l));
                System.out.println(A+B);
            }
        }


}
