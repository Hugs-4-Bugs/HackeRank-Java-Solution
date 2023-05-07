import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int lineNum = sc.nextInt();
        int lineLength = 0;
        
        //Fill Lines
        ArrayList<ArrayList<Integer>> lines = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<lineNum; i++){
            lines.add(new ArrayList<Integer>());
            lineLength = sc.nextInt();
            for(int j=0;j<lineLength;j++){
                lines.get(i).add(sc.nextInt());
            }
        }
        
        //Fill Queries
        int queryNum = sc.nextInt();
        ArrayList<ArrayList<Integer>> queries = new ArrayList<ArrayList<Integer>>();
        for(int k=0; k<queryNum; k++){
            queries.add(new ArrayList<Integer>());
            queries.get(k).add(sc.nextInt());
            queries.get(k).add(sc.nextInt()); 
        }
        
        //Check
        for(int n = 0; n<queryNum;n++){
            try{
                System.out.println(lines.get(queries.get(n).get(0)-1).get(queries.get(n).get(1)-1));
            }
            catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
