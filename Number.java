public abstract class Number {
  public abstract double getValue();

  /*return 0 when this Number equals the other Number
  return a negative value when this Number is smaller than the other Number
  return a positive value when this Number is larger than the other Number
  */
  public int compareTo(Number other) {
    double diff = (this.getValue() - other.getValue());
    if (diff==0) {
      return 0;
    } else if (diff > 0) {
      return 1;
    } else {
      return -1;
    }
  }

  /*
  *Return true when the % difference of the values
  *are within 0.00001 of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(Number other) {
    double a = this.getValue();
    double b = other.getValue();
    if (a==0 && b==0) {
      return true;
    }
    return Math.abs(a-b)/a <= 0.00001 && Math.abs(a-b)/b <= 0.00001;
  }

}
