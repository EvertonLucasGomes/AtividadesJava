public class MoreCompleteMyComplex {
    private double real;
    private double imag;

    public MoreCompleteMyComplex() {
        this.real = 0;
        this.imag = 0;
    }

    public MoreCompleteMyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return this.real;
    }

    public double getImag() {
        return this.imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return "(" + this.real + " + " + this.imag + "i)";
    }

    public boolean isReal() {
        return this.imag == 0;
    }

    public boolean isImaginary() {
        return this.real == 0;
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MoreCompleteMyComplex another) {
        return (this.real == another.real && this.imag == another.imag);
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imag, 2));
    }

    public double argument() {
        return Math.atan2(this.imag, this.real);
    }

    public MoreCompleteMyComplex add(MoreCompleteMyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MoreCompleteMyComplex addNew(MoreCompleteMyComplex right) {
        return new MoreCompleteMyComplex(this.real + right.real, this.imag + right.imag);
    }

    public MoreCompleteMyComplex subtract(MoreCompleteMyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MoreCompleteMyComplex subtractNew(MoreCompleteMyComplex right) {
        return new MoreCompleteMyComplex(this.real - right.real, this.imag - right.imag);
    }

    public MoreCompleteMyComplex multiply(MoreCompleteMyComplex right) {
        double real = (this.real * right.real) - (this.imag * right.imag);
        double imag = (this.real * right.imag) + (this.imag * right.real);
        this.real = real;
        this.imag = imag;
        return this;
    }

    public MoreCompleteMyComplex divide(MoreCompleteMyComplex right) {
        double real = ((this.real * right.real) + (this.imag * right.imag))
                / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        double imag = ((this.imag * right.real) - (this.real * right.imag))
                / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        this.real = real;
        this.imag = imag;
        return this;
    }

    public MoreCompleteMyComplex conjugate() {
        return new MoreCompleteMyComplex(this.real, -this.imag);
    }
}
