import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by WildSaoFeng on 2017/11/18.
 */
public class ch3_5_1 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        BigInteger[] F=new BigInteger[55];
        F[1]=BigInteger.valueOf(1);
        F[2]=BigInteger.valueOf(2);
        for(int i=3;i<=50;i++)
            F[i]=F[i-2].add(F[i-1]);
        while(input.hasNextInt()){
            int N=input.nextInt();
            System.out.println(F[N]);
        }
        return ;
    }
}
