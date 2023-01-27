public class MinArray
{
public static int MinArray(int[]arr)
{
int minVal=arr[0];
for (int i=0;i<arr.length;i++)
{
if (arr[i]<=minVal)
{
minVal=arr[i];

}

}
return minVal;
}


}