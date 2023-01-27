public class MaxArray
{
public static int MaxArray(int[]arr)
{
int maxVal=arr[0];
for (int i=0;i<arr.length;i++)
{
if (arr[i]>=maxVal)
{
maxVal=arr[i];

}

}
return maxVal;
}


}