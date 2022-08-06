//import java.util.Scanner;
//
//public class BalancedParen
//{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str=sc.next();
//        int n=str.length();
//        balance(0,0,false,"",n);
//    }
//    public static void balance(int no_open,int no_close,boolean flag,String ans,int n)
//    {
//        if(no_open==no_close)
//        {
//            System.out.println(ans);
//            return;
//        }
//        if(no_open>n || no_close>n)
//        {
//            return;
//        }
//        balance(no_open+1,no_close,true,ans+"(",n-1);
//        balance(no_open,no_close+1,true);
//    }
//}
