package Leetcode;

/**
 * @Description
 * @params $
 * @returns $
 * @Author Jingyi Yan
 * @Date $
 * @Note
 */
public class FlippingImage {
    public int[][] flipAndInvertImage(int[][] A) {
        int number=A[0].length;

            for (int i = 0; i < number; i++) {
                for(int j=0;j<A[0].length/2;j++) {
                int temp = 0;
                temp = A[i][j];
                A[i][j] = A[i][number-1-j];
                A[i][number-1-j] = temp;
                }
            }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(A[i][j]==1){
                    A[i][j]=0;
                }
                else{
                    A[i][j]=1;
                }
            }
        }
        return A;
    }
    public static void main(String[] args){
        FlippingImage f1 = new FlippingImage();
        int[][] test ={{1,1,0},{1,0,1},{0,0,0}};
        for(int i=0;i<test.length;i++){
            for(int j=0;j<test[0].length;j++){
                System.out.print(test[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------");
        int[][] result=f1.flipAndInvertImage(test);
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
