public class TestException
{
    public void methodOne() throws ExceptionHandler
    {
        int i=0;
        if (i==0)
        {
            throw new ExceptionHandler();
        }
    }
    public void methodTwo() throws ExceptionHandler
    {
        int i=1;
        if (i==1)
        {
            throw new ExceptionHandler();
        }
    }
    public void methodThree() throws ExceptionHandler
    {
        int i=2;
        if (i==2)
        {
            throw new ExceptionHandler();
        }
    }
    
}