public class Swap_Alternate {
    // swaping logic
    public static void Swaping(int arr[])
    {
        for(int i=0;i<arr.length;i+=2)
        {
            if(i+1<arr.length)
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
// printing the array elements after swaping
    public static void Print_Array(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }

    }
    public static void main(String[] args) 
    {
        int arr[]={2,4,6,8,10,12};
        Swaping(arr);       // swapping call
        Print_Array(arr);   // print after swaping 
       
    }
    
}
