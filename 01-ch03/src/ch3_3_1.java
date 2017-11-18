/**
 * Created by WildSaoFeng on 2017/11/18.
 */
public class ch3_3_1 {
    public static void main(String [] args){
        int count=0;
        int change=63,i=0;
        int[] coins={25,10,5,1};

        while(change!=0){
            while(change>=coins[i]){
                count++;
                change-=coins[i];
            }
            i++;
        }
        System.out.println(count);
    }
}
