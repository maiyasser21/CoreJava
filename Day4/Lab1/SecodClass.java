public class SecodClass {
    public static void main(String[] args) {
        TestException ts=new TestException();
        // try{
        //     ts.methodOne();
        // }
        // catch(ExceptionHandler e)
        // {
        //     System.out.println("catch the error");
        // }
        try{
            ts.methodTwo();
        }
        catch(ExceptionHandler e)
        {
            System.out.println("catch the error Two");
        }
        try{
            ts.methodThree();
        }
        catch(ExceptionHandler e)
        {
            System.out.println("catch the error Three");
        }
    }
}
