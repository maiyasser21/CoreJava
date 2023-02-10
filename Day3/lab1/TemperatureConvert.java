import java.util.function.Function;

public class TemperatureConvert implements Function<Float, Float> {
    @Override
    public Float apply(Float t) {
        Float returnVal = (float) ((t * 1.8) + 32);
        return returnVal;
    }
}
