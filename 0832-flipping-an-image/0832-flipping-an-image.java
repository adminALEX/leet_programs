class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row, col=0;
        int[][] res = new int[image.length][image[0].length];
        for(int i=0;i<image.length; i++){
            row = 0;
            for(int j=image[0].length-1;j>=0;j--){
                res[col][row]=1^image[i][j];
                row++;
            }
            col++;
        }
        return res;
        
    }
}