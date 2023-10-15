package utils.lazy;

public class LazyClient {

  static final Lazy<Integer> VAL = Lazy.of(() -> 10);

  public static void main(String[] args) {
    for (int i = 0 ; i < 10 ; i++) {
      new Thread(() -> System.out.println(VAL.get())).start();
    }
  }
}
