public class Tester {
    public static void main(String[] args) {


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
/*
      for (double i = 0.0; i<=10.0; i++) {
        b = new RealNumber(i);
        System.out.println(a.equals(b));
      }

      for (double i = 0.0; i<=5.0; i+=1.0) {
        b = new RealNumber(i);
        System.out.println(a.getValue());
        a.add(b);
        System.out.println(a.getValue());
        System.out.println();
      }

      for (double i = 1.0; i<=5.0; i+=1.0) {
        b = new RealNumber(i);
        System.out.println(a.getValue());
        a.multiply(b);
        System.out.println(a.getValue());
        System.out.println();
      }

      System.out.println(600.0024 * 5.0);
      */
    }
}
