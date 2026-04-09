class MergeDD
{
    public static void main(String args[])
    {
        int arr1[][]={{1,2,3}, {2,3,4}};
        int arr2[][]={{4,5,6},{7,8,9}};
        int m = arr1[0].length;
        int n= arr2[0].length;
        int arr3[][] = new int[2][m+n];
        for(int j=0;j<2;j++)
        {
            for(int i=0;i<m+n;i++)
            {
                    if(i<m)
                        arr3[i]=arr1[j][i];
                    else
                        arr3[i]=arr2[j][i%m];
            }
}
    }
}