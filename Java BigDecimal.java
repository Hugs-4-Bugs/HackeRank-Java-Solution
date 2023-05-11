mport java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        //  Arrays.sort(s, new Comparator<String>() {
        //     public int compare(String a, String b) {
        //         BigDecimal aBD = new BigDecimal(a);
        //         BigDecimal bBD = new BigDecimal(b);
        //         return bBD.compareTo(aBD);
        //     }
        // });
        
        

        Arrays.sort(s, 0, n, (s1, s2)-> new BigDecimal(s2).compareTo(new BigDecimal(s1)));

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
