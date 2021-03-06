class Eulerian {
    private int[][] dp;

    public Eulerian (int n, int m){
        dp = new int[n+1][m+1];
    }
    int euleriantab(int n, int m)
    {
        // For each row from 1 to n
        for (int i = 1; i <= n; i++) {

            // For each column from 0 to m
            for (int j = 0; j <= m; j++) {

                // If i is greater than j
                if (i > j) {

                    // If j is 0, then make
                    // that state as 1.
                    if (j == 0) {
                        dp[i][j] = 1;

                        // basic recurrence relation.
                    }else {
                        dp[i][j] = ((i - j) * dp[i - 1][j - 1]) + ((j + 1) * dp[i - 1][j]);
                    }
                }
            }
        }

        return dp[n][m];
    }

    int eulerianmem(int n, int m){
        if (dp[n][m] != 0) return dp[n][m];
        if (n > m){
            if(m == 0){
                dp[n][m] = 1;
            }else{
                dp[n][m] = ((n-m) * eulerianmem(n-1, m-1)) + ((m+1) * eulerianmem(n-1, m));
            }
        }
        return dp[n][m];
    }

}
