//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> res = new ArrayList();
        
        if(matrix.length==0){
            
            return res;
        }
        
        
        
        int beginRow = 0;
        int endRow = matrix.length -1;
        int beginColumn = 0;
        int endColumn = matrix[0].length -1;
        
        while(beginRow<=endRow && beginColumn<=endColumn){
            for(int i=beginColumn; i<=endColumn; i++){
                res.add(matrix[beginRow][i]);
            }
            beginRow++;
            for(int i=beginRow; i<=endRow; i++){
                res.add(matrix[i][endColumn]);
            }
            endColumn--;
            if(beginRow<=endRow){
                for(int i=endColumn; i>=beginColumn; i--){
                    res.add(matrix[endRow][i]);
                }
            }
            endRow--;
            if(beginColumn<=endColumn){
                for(int i=endRow; i>=beginRow; i--){
                    res.add(matrix[i][beginColumn]);
                }
            }
            beginColumn++;
            
            
        }
        
        
        return res;
    }
}
