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
        
        
        
        // for(int i=0;i<image.length;i++){
        //     int first = 0, last=image[i].length-1;
        //     for(int j = 0;j<=image[0].length/2;j++){
        //         int t = image[i][first];
        //         image[i][first] = image[i][last] == 0 ? 1:0;
        //         image[i][last] = t == 0?1:0;
        //         if(first>last) break;
        //         first++;
        //         last--;
        //     }
        // }
        // return image;
    }
}