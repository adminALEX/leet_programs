class Solution {
    public int countEven(int num) {
        int i,c=0;
        for(i=2;i<=num;i++)
        {
            if(sum(i)%2==0)
               c++;

        }
        return c;
    }
    int sum(int x)
    {  int s=0;
        while(x!=0)
        {   s=s+(x%10);;
            x=x/10;
        }
        return s;
    }
}