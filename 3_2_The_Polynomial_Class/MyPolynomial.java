public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public double evaluate(double x) {
        double sum = 0;
        for (int i = 0; i < this.coeffs.length; i++) {
            sum += this.coeffs[i] * Math.pow(x, coeffs.length - 1 - i);
        }
        return sum;
    }

    public int getDegree() {
        return this.coeffs.length - 1;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < this.coeffs.length; i++) {
            if (i == 0) {
                s += this.coeffs[i] + "x^" + (this.coeffs.length - 1);
            } else if (i == this.coeffs.length - 1) {
                s += " + " + this.coeffs[i];
            } else {
                s += " + " + this.coeffs[i] + "x^" + (this.coeffs.length - 1 - i);
            }
        }
        return s;
    }

}