class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int i,n,m,l,j,k;
        Set<Integer> hs=new HashSet<Integer>();
        Arrays.sort(digits);
        for(i=0;i<digits.length;i++)
        {   if(digits[i]==0)
                 continue;
            n=digits[i]*10;
                //   System.out.println(i+" "+n);
            for(j=0;j<digits.length;j++)
            {   if(i==j)
                  continue;   
                m=(n+digits[j])*10;
                //   System.out.println(m);
                 for(k=0;k<digits.length;k++)
                {   if(k==j || k==i)
                     continue;  
                    l=m+digits[k];
                  if(l%2==0)
                     hs.add(l);
                }
            }
        }  
        int arr[] = new int[hs.size()]; 
        i=0;
        for(int ele:hs){
          arr[i++] = ele;
        }
        Arrays.sort(arr);
        return arr;
    }
}