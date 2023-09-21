  public static int chocolateFeast(int n, int c, int m) {
    // Write your code here
    int candies = n/c;
        int consumed = n/c;
        
        while(candies>=m){
        consumed += candies/m ; 
        candies = candies/m +candies%m;
           
        }
        return consumed;

    }

}
