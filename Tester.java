public class Tester {
    public static void main(String[] args) {

/*
      RealNumber a = new RealNumber(10.0);
      RealNumber b = new RealNumber(4.0);

      for (double i = 0; i<=4.0; i+=0.5) {
        RealNumber c = new RealNumber(i);
        System.out.println(b.equals(c));
      }

      for (double i = 1.2; i<=6.0; i+=1.2) {
        RealNumber c = new RealNumber(i);
        System.out.print(b);
        System.out.print(", ");
        double sum = b.add(c).getValue();
        System.out.print(sum);
        System.out.print(" equals ");
        System.out.print(a);
        c = new RealNumber(sum);
        System.out.println(" " + a.equals(c));
      }

      for (double i = 1.0; i<= 5.0; i++) {
        RealNumber c = new RealNumber(i+0.01*i);
        System.out.print(c);
        System.out.print(", ");
        System.out.print(b);
        c = b.multiply(c);
        System.out.print(" ");
        System.out.println(c);
      }

      for (double i = 1.0; i<= 10.0; i++) {
        RealNumber c = new RealNumber(i);
        System.out.print(b);
        System.out.print(", ");
        System.out.print(c);
        c = b.divide(c);
        System.out.print(" ");
        System.out.println(c);
      }

      a = new RealNumber(10.0);
      for (double i = 1.0; i<=5; i+=.7) {
        RealNumber c = new RealNumber(i);
        System.out.print(a);
        System.out.print(" subtracted by ");
        System.out.print(c);
        c = a.subtract(c);
        System.out.print(" equals ");
        System.out.println(c);
      }
*/
      System.out.println("Rational Number Testing:");

      RationalNumber n = new RationalNumber(2, 0);
      System.out.println(n.getValue());
      System.out.println(n.getNumerator());
      System.out.println(n.getDenominator());

      n = new RationalNumber(2, 5);
      System.out.println(n.getValue());
      System.out.println(n.getNumerator());
      System.out.println(n.getDenominator());

      n = n.reciprocal();
      System.out.println(n.getValue());
      System.out.println(n.getNumerator());
      System.out.println(n.getDenominator());

      System.out.println(n.equals(n.reciprocal())); // false unless 1/1 or 1/0
      n = new RationalNumber(1, 1);
      System.out.println(n.equals(n.reciprocal()));
      n = new RationalNumber(1, 0);
      System.out.println(n.equals(n.reciprocal()));
      n = new RationalNumber(0, 1);
      System.out.println(n.equals(n.reciprocal()));


    }
}
