/**
 * Created by WildSaoFeng on 2017/11/18.
 */
public class ch3_1_2 {
    public static void main(String[] args) {
        System.out.println("Start Counting.");
        int n=15;
        int[] F = new int[90000];
        F[1]=1;
        F[2]=2;
        for(int i=3;i<=n;i++){
            F[i]=F[i-1]+F[i-2];
        }
        System.out.println(F[n]);
    }
}
