public class Tester {
    public static void main(String[] args) {


      RealNumber a = new RealNumber(10.0);
      RealNumber b = new RealNumber(6.0);
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
    }
}
