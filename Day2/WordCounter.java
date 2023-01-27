public class WordCounter{
public static int WordCounter(String string1,String word)
{
int count=0;
String str[]=string1.split(" ");
//System.out.println("inside function");
for (int i=0;i<str.length;i++)
{
//System.out.println("inside for");

if(word.equals(str[i]))
{
//System.out.println("inside if");
count++;

}
}
return count;
}


}