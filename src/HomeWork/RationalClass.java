package HomeWork;

public class RationalClass extends Number implements Comparable<RationalClass> {
    // Data fields for numerator and denominator
    private long numerator = 0;
    private long denominator = 1;

    /** Construct a rational with default properties */
    public RationalClass() {
        this(0, 1);
    }

    /** Construct a rational with specified numerator and denominator */
    public RationalClass(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    /** Find GCD of two numbers */
    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }

        return gcd;
    }

    /** Return numerator */
    public long getNumerator() {
        return numerator;
    }

    /** Return denominator */
    public long getDenominator() {
        return denominator;
    }

    /** Add a rational number to this rational */
    public RationalClass add(RationalClass secondRationalClass) {
        long n = numerator * secondRationalClass.getDenominator() +
                denominator * secondRationalClass.getNumerator();
        long d = denominator * secondRationalClass.getDenominator();
        return new RationalClass(n, d);
    }

    /** Subtract a rational number from this rational */
    public RationalClass subtract(RationalClass secondRationalClass) {
        long n = numerator * secondRationalClass.getDenominator()
                - denominator * secondRationalClass.getNumerator();
        long d = denominator * secondRationalClass.getDenominator();
        return new RationalClass(n, d);
    }

    /** Multiply a rational number by this rational */
    public RationalClass multiply(RationalClass secondRationalClass) {
        long n = numerator * secondRationalClass.getNumerator();
        long d = denominator * secondRationalClass.getDenominator();
        return new RationalClass(n, d);
    }

    /** Divide a rational number by this rational */
    public RationalClass divide(RationalClass secondRationalClass) {
        long n = numerator * secondRationalClass.getDenominator();
        long d = denominator * secondRationalClass.numerator;
        return new RationalClass(n, d);
    }

    @Override
    public String toString() {
        if (denominator == 1)
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }

    @Override // Override the equals method in the Object class
    public boolean equals(Object other) {
        if ((this.subtract((RationalClass) (other))).getNumerator() == 0)
            return true;
        else
            return false;
    }

    @Override // Implement the abstract intValue method in Number
    public int intValue() {
        return (int) doubleValue();
    }

    @Override // Implement the abstract floatValue method in Number
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override // Implement the doubleValue method in Number
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }

    @Override // Implement the abstract longValue method in Number
    public long longValue() {
        return (long) doubleValue();
    }

    @Override // Implement the compareTo method in Comparable
    public int compareTo(RationalClass o) {
        if (this.subtract(o).getNumerator() > 0)
            return 1;
        else if (this.subtract(o).getNumerator() < 0)
            return -1;
        else
            return 0;
    }
}
