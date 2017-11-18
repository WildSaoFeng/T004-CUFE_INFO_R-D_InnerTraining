/**
 * Created by WildSaoFeng on 2017/11/18.
 */
import java.util.*;

public class ch3_4_1 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        int cases=input.nextInt();
        int[] weight=new int [1004];
        int[] value=new int [1004];
        int[][] F=new int [1004][1004];

        while((cases--)!=0){
            int items,pack;

            items=input.nextInt();
            pack=input.nextInt();
            for(int i=1;i<=items;i++)
                value[i]=input.nextInt();
            for(int i=1;i<=items;i++)
                weight[i]=input.nextInt();

            for(int i=1;i<=items;i++){
                for(int j=0;j<=pack;j++){
                    if(weight[i]<=j)
                        F[i][j]=Math.max(F[i-1][j],F[i-1][j-weight[i]]+value[i]);
                    else
                        F[i][j]=F[i-1][j];
                }
            }
            System.out.println(F[items][pack]);
        }

        return ;
    }
}
