public class DoubleComplex implements Complex<Double> {

    public Double real;
    public Double img;
    
    public DoubleComplex(Double r, Double i)
    {
        real=r;
        img=i;
    }

    public void setComplex(Double r, Double i)
    {
        real=r;
        img=i;
    }

    @Override
    public Double getReal()
    {
        return real;

    }
    public Double getImg()
    {
        return img;

    }
   
    public Complex<Double> add (Complex<Double> c)
    {
       
        Double real= this.real+c.getReal();
        Double img=this.img+c.getImg();

        Complex<Double> temp = new DoubleComplex(real, img);
        return temp;


    }
    public Complex<Double> sub(Complex<Double> c)
    {
        Double real= this.real-c.getReal();
        Double img=this.img-c.getImg();

        Complex<Double> temp = new DoubleComplex(real, img);
        return temp;

    }
    public Complex<Double> mul(Complex<Double> c)
    {
        Double real= this.real * c.getReal();
        Double img=this.img * c.getImg();

        Complex<Double> temp = new DoubleComplex(real, img);
        return temp;

    }
    public Complex<Double> div(Complex<Double> c)
    {
        Double real= this.real / c.getReal();
        Double img=this.img / c.getImg();

        Complex<Double> temp = new DoubleComplex(real, img);
        return temp;
    }
    public void prinComplex() {
        
        if (this.getImg() > 0)
        {
        System.out.println(this.getReal()+"+"+this.getImg()+"i");
        }
        else if(this.getImg() < 0)
        {
        System.out.println(this.getReal()+"-"+this.getImg()+"i");
        }
        
    }
    
}
