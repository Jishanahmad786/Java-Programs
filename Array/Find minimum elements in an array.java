

public class Test6
{
    public static int minimum(int arr[])
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;

    }
    public static void main(String[] args)
    {
        int arr[]={1,4,2,6,4,8,4};
        int res=minimum(arr);
        System.out.println(res);
        
    }
    

}
