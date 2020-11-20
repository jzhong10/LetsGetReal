public class Tester {
    public static void main(String[] args) {
      RealNumber a = new RealNumber(10.0000001);
      for (double i = 0; i<=10; i++) {
        RealNumber b = new RealNumber(i);
        System.out.println(a.equals(b));
      }

    }
}
