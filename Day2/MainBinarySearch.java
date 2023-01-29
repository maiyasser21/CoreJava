public class MainBinarySearch{
public static void main(String[] args)
{

BinarySearch bs=new BinarySearch();
int[] arr={1,2,3,4,5,6};
int item=3;

int j=bs.BinarySearch(arr,item);
System.out.println(j);
System.out.println(System.nanoTime());

}
}