public class Main {
    public static void main(String[] args) {

        DoubleComplex c1= new DoubleComplex(3d, 4d);
        DoubleComplex c2= new DoubleComplex(2d, 9d);
        Complex<Double> c3=new DoubleComplex(1d, 1d);
        Complex<Double> c4=new DoubleComplex(8d, 2d);


         c3=c4.add(c3);
         c3.prinComplex();

         System.out.println(" ");

        c2=(DoubleComplex) c1.mul(c2);
        c2.prinComplex();
        
    }
    
}
