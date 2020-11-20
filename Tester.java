public class Tester {
    public static void main(String[] args) {
      RealNumber a = new RealNumber(10.0000001);
      for (double i = 0; i<=10; i++) {
        RealNumber b = new RealNumber(i);
        System.out.println(a.equals(b));
      }

      for (int i = 0; i<5; i++) {
        RealNumber b = new RealNumber(i);
        System.out.println(a.getValue());
        a.add(b);
        System.out.println(a.getValue());
        System.out.println();
      }
    }
}
