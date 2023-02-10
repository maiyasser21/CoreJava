import java.util.function.Function;
public class TempMainTwo {
    public static void main(String[] args)
    {
        float x=24;
        float out=new Function<Float, Float>() {
            @Override
            public Float apply(Float t)
            { 
                Float returnVal = (float) ((t * 1.8) + 32);
                return returnVal;
            }
        }.apply(x);
            System.out.println("Temp is = " + x + " C " + out + " F");
            
        }
    }