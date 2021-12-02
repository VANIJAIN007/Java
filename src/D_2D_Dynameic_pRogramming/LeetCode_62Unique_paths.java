package D_2D_Dynameic_pRogramming;

import java.util.Scanner;

public class LeetCode_62Unique_paths
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] dp=new int[m][n];

        System.out.println(uniquePaths(dp,m,n));
    }
    static int uniquePaths(int dp[][],int m, int n) {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=1;
                }
                else
                {
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
