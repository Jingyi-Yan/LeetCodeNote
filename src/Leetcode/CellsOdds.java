package Leetcode;

/**
 * @Description
 * @params $
 * @returns $
 * @Author Jingyi Yan
 * @Date $
 * @Note
 */
public class CellsOdds {
    public CellsOdds() {
    }

    public int oddCells(int n, int m, int[][] indices) {
        int[][] test = new int[n][m];
        int odds =0;
        for(int i=0;i<indices.length;i++){
            int incrementR=indices[i][0];
            int incrementC=indices[i][1];
            for(int j=0;j<m;j++){
                test[incrementR][j]++;}
            for(int k=0;k<n;k++){
                test[k][incrementC]++;
            }

        } for(int l=0;l<n;l++){
            for(int j=0;j<m;j++){
                System.out.print(test[l][j]);
                if(test[l][j]%2!=0){
                    odds++;
                }
            }
            System.out.println();
        }
        return odds;
    }
    public static void main(String[] args){
        CellsOdds c1 = new CellsOdds();
        int[][] testCase ={{0,1},{1,1}};
        System.out.println(c1.oddCells(2,3,testCase));
    }
}
