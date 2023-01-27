import java.util.StringTokenizer;
public class IPCutterTokenizer
{
public static void IPCutterTokenizer(String mainString)
{
 StringTokenizer st = new StringTokenizer(mainString,"\\.");
     while (st.hasMoreTokens()) {
         System.out.println(st.nextToken("\\."));
     }
 
}
}