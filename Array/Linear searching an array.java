public class Linear_Searching
{
    public static int LinearSearch(int num[],int key)
    {
for(int i=0;i<num.length;i++)
{
if(num[i]==key)
return i;

}
return 0;
    }
    public static void main(String[] args)
    {
        int num[]={2,4,6,8,10,12,14,16};
        int key=10;
       int found= LinearSearch(num, key);
       if(found==0)
       System.out.println("Elements not found");
       else
       System.out.println(found);
        
    }
    
}
