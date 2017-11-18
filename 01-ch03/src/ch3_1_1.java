/**
 * Created by WildSaoFeng on 2017/11/18.
 */
public class ch3_1_1 {
    static int count=0; //计算F(n)被调用了计次
    static int F(int n)
    {
        count++;
        if(n==0) return 1;         //n等于0，恰好到达9层阶梯
        if(n<0) return 0;
        return F(n-1)+F(n-2);  //深搜，走3级，4级，6级能到达目的地的次数相加
    }

    public static void main(String[] args) {
        System.out.println("Start Counting.");
        int n=90;
        System.out.println(F(n)+" count="+count);
    }
}
