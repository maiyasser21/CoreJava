public interface Complex<T>{
    public T getReal();
    public T getImg();
    public Complex<T> add(Complex<T> c);
    public Complex<T> sub(Complex<T> c);
    public Complex<T> mul(Complex<T> c);
    public Complex<T> div(Complex<T> c);
    public void prinComplex();

}