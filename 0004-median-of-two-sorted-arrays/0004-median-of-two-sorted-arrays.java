class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a1 = nums1.length;
        int b1 = nums2.length;
        int c1 = a1 + b1;
        int[] c = new int[c1];
        System.arraycopy(nums1, 0, c, 0, a1);
        System.arraycopy(nums2, 0, c, a1, b1);
        Arrays.sort(c);
        if(c1%2==1) return c[c1/2];
        else {
            System.out.println(c[c1/2-1]+" "+c[c1/2]);
            return (double)(c[c1/2-1]+c[c1/2])/2;
    }
}
}