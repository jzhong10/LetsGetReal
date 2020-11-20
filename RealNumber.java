public class RealNumber {
  private double value;

  public RealNumber(double v) {
    value = v;
  }

  public double getValue() {
    return value;
  }

  public String toString() {
    return ""+getValue();
  }

  public boolean equals(RealNumber other) {
    if (value==0 && other.getValue()==0) {
      return true;
    }
    double a = value;
    double b = other.getValue();
    if (Math.abs(a-b)/a <= 0.00001 && Math.abs(a-b)/b <= 0.00001) {
      return true;
    }
    return false;
  }

}
