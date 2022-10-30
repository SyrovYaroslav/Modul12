public class FizzBuzz  {
    public void check(int n) {
        for (int i = 1; i < n; i++) {
            Thread a = new Thread(new Number(i));
            a.start();
//            if (i % 3 == 0)...
//            if (i % 5 == 0)...
//            if (i % 15 == 0)...
//            if (i % 3 != 0 && i % 5 != 0)...
        }
//        Thread a = new Thread(new Number(i));
//        Thread b = new Thread(() -> System.out.println("buzz"));
//        Thread c = new Thread(() -> System.out.println("fizz"));
//        Thread d = new Thread(() -> System.out.println("fizz"));
    }
}
