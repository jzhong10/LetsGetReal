public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno) {
    super(0.0);
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    }
    numerator = nume;
    denominator = deno;
    if (deno < 0) {
      numerator *= -1;
      denominator *= -1;
    }
  }

}
