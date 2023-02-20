import java.util.function.BiPredicate;

public class Main{
    public static String betterstring(String s1,String s2,BiPredicate<String,String> p) {

        if(p.test(s1,s2))
        {
            return s1;
        }
        else
        {
            return s2;
        }
    

        
    }



public static void main(String[] args) {
    String string1 = new String("mai");
    String string2= new String("mayy");
    String longer = Main.betterstring(string1, string2, (s1,s2)->s1.length()>s2.length());
    System.out.println("Longer string is: "+longer);
    String first=Main.betterstring(string1, string2, (s1,s2)->true);
    System.out.println("first is: "+first);


}
}

