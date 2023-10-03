package effective_practice;

public class Practice_num44 {

    public static class MutableComplex {
        private double re;
        private double im;

        private MutableComplex(double re, double im) {
            this.re = re;
            this.im = im;
        }
        
        public static MutableComplex create(double re, double im) {
            return new MutableComplex(re, im);
        }

        public double realPart() {
            return re;
        }

        public double imaginaryPart() {
            return im;
        }

        public static MutableComplex fromImmutable(Complex complex) {
            return new MutableComplex(complex.realPart(), complex.imaginaryPart());
        }

        public Complex toImmutable() {
            return Complex.create(re, im);
        }

        public void setReal(double re) {
            this.re = re;
        }

        public void setImag(double im) {
            this.im = im;
        }
        
        @Override
        public String toString() {
            return "(" + re + " + " + im + "i)";
        }
    

    }

    public static void main(String[] args) {
    	
        Complex immutableComplex = Complex.create(3.0, 4.0);
        System.out.println("불변한 복소수: " + immutableComplex);

        MutableComplex mutableComplex = MutableComplex.fromImmutable(immutableComplex);
        mutableComplex.setReal(5.0);
        mutableComplex.setImag(2.0);

        System.out.println("가변한 복소수: " + mutableComplex);

        Complex result = mutableComplex.toImmutable();
        System.out.println("결과 (불변한 복소수): " + result);
    }
}
