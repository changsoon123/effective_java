package effective_practice;

import java.util.Objects;

import effective_practice.Practice_num44.MutableComplex;

public final class Complex {

	private final double re; // 실수 부분
    private final double im; // 허수 부분

    private Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double realPart() {
        return re;
    }

    public double imaginaryPart() {
        return im;
    }

    public Complex plus(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    public Complex minus(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }

    public Complex times(Complex c) {
        return new Complex(re * c.re - im * c.im,
        					re * c.re + im * c.im);
    }
    

    public Complex dividedBy(Complex c) {
    	double tmp = c.re * c.re + c.im * c.im;
    	
    	return new Complex(re * c.re + im * c.im / tmp,
							im * c.re - re * c.im / tmp);
    }
    
    public MutableComplex toMutable() {
        return MutableComplex.fromImmutable(this);
    }
    
    public static Complex create(double re, double im) {
        return new Complex(re, im);
    }

    @Override
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }

    @Override
    public boolean equals(Object o) {
        if ( o == this ) return true;
        
        if (!(o instanceof Complex)) return false;
        
        Complex c = (Complex) o;
    	
        return Double.compare(c.re, re) == 0 && Double.compare(c.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(re) + Double.hashCode(im);
    }
	
}
