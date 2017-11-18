/**
 * Created by WildSaoFeng on 2017/11/18.
 */
public class ch3_3_2 {

    public static void main(String [] args){
        int change=63;
        int[] coins={25,10,5,1};
        int[] F=new int [64];

        F[1]=1;
        for(int i=2;i<=change;i++){
            F[i]=0x7fffffff;
            for(int j=0;j<=3;j++)
            if(i-coins[j]>0){
                F[i]=Math.min(F[i],F[i-coins[j]]+1);
            }
        }
        System.out.println(F[63]);
    }
}
