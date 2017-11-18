import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by WildSaoFeng on 2017/11/18.
 */
public class ch3_6_1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        BigInteger[][] F=new BigInteger[45][2];
        F[1][0]=BigInteger.valueOf(2);
        F[1][1]=BigInteger.valueOf(1);

        for (int i=2;i<=40;i++){
            F[i][0]=F[i-1][0].add(F[i-1][1]).multiply(BigInteger.valueOf(2));
            F[i][1]=F[i-1][0];

        }

        while(input.hasNextInt()){
            int N=input.nextInt();
            System.out.println(F[N][0].add(F[N][1]));
        }
    }
}
