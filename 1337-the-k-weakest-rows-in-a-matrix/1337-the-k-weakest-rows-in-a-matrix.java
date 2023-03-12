class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int index = 0;
        int[] arrI = new int[mat.length];
        int[] arrV = new int[mat.length];
        for(int i = 0;i<mat.length;i++){
            int count = 0;
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j] == 0) break;
                count++;
            }
            arrI[index] = i;
            arrV[index]= count;  
            System.out.println("index : "+i+" value : "+count);
            index++;
        }
        return Arrays.copyOfRange(sortByValue(arrI, arrV), 0, k);
    }
    static int[] sortByValue(int[] indices, int[] values){
        for(int i =0;i<indices.length;i++){
            for(int j = i+1;j< indices.length; j++)
            {
                if(values[i]>values[j] || indices[i]>indices[j]){
                    int temp = indices[i];
                    indices[i] = indices[j];
                    indices[j] = temp;
                    temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }
        for(int i: indices) System.out.print(i+" ");
        return indices;
    }
    
}