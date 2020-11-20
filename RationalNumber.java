public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno) {
    super(0.0);
    numerator = nume;
    denominator = deno;
    if (deno < 0) {
      numerator *= -1;
      denominator *= -1;
    }
    reduce();
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    }
  }

  public double getValue() {
    return (double) numerator / denominator;
  }

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  public RationalNumber reciprocal() {
    return new RationalNumber(getDenominator(), getNumerator());
  }

  public boolean equals(RationalNumber other) {
    return (getNumerator()==other.getNumerator() && getDenominator()==other.getDenominator());
  }

  public String toString() {
    return getNumerator() + "/" + getDenominator();
  }

  public static int gcd(int a, int b) {
    if (a==0 || b==0) {
      return 1;
    }
    if (b>a) {
      int temp = a;
      a = b;
      b = temp;
    }
    int rem = a%b;
    int g = b;
    while (rem!=0) {
      int temp = rem;
      rem = g%rem;
      g = temp;
    }
    return g;
  }

  private void reduce() {
    int gcd = gcd(getNumerator(), getDenominator());
    numerator /= gcd;
    denominator /= gcd;
  }

  //Operations
  public RationalNumber multiply(RationalNumber other) {
    int nume = getNumerator() * other.getNumerator();
    int deno = getDenominator() * other.getDenominator();
    return new RationalNumber(nume, deno);
  }

  public RationalNumber divide(RationalNumber other) {
    return this.multiply(other.reciprocal());
  }

  public RationalNumber add(RationalNumber other) {
    int nume = getNumerator() * other.getDenominator() + other.getNumerator() * getDenominator();
    int deno = getDenominator() * other.getDenominator();
    return new RationalNumber(nume, deno); 
  }
}
