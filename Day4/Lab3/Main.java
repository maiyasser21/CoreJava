public class Main {
    public static void main(String[] args) {

        Complex<Double> c1= new DoubleComplex(3d, 4d);
        Complex<Double> c2= new DoubleComplex(2d, 9d);

        // c1=c2.add(c1);
        // c1.prinComplex();

        c2=c1.mul(c2);
        c2.prinComplex();
        
    }
    
}
