public class Maximum_Element
{
    public static int getLargest(int arr[])
    {
        int max;
        max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6};
        System.out.println("largest value is :"+getLargest(arr));
    }
}
