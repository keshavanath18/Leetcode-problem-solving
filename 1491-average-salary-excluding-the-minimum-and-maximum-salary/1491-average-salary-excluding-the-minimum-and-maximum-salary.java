class Solution {
    public double average(int[] salary) {
        int sum=0,n=salary.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int s:salary){
            sum+=s;
            if(s<min)min=s;
            if(s>max)max=s;
        }
        sum=sum-max-min;
        
        return (double) sum/(n-2);
    }
}