public class Binary_Searching
{
    public static int binarySearch(int num[],int key)
    {
    int start=0; int end=num.length-1;
    while (start<=end)
    {
        int mid=(start+end)/2;
        // comparision
        if(num[mid]==key)
        {
            return mid;
        }
        if(num[mid]<key)
        {
            start=mid+1;
        }
        else
        {
            end=mid-1;
        }
    }
    return 0;
        
    }
    public static void main(String[] args)
    {
        int num[]={2,4,6,8,10,12,14};
        int key=10;
       int index= binarySearch(num, key);
       if(index==0)
       {
        System.out.println("Number not found");
       }
       else
       {
        System.out.println("Number at index"+index);
       }
        
    }
    
}
