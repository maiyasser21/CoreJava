public class MainMin
{
public static void main(String[] args)
{
int[] arr1={2,3,1,4,5,1,4,9,9,7};
MinArray arr=new MinArray();
//MaxArray arr=new MaxArray();
//int j=arr.MaxArray(arr1);
int j=arr.MinArray(arr1);
System.out.println(j);
System.out.println(System.nanoTime());

}
}