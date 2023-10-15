package utils.lazy;

import java.util.function.Supplier;

public class Lazy<T> {
  // FR
  // Init on Access
  // Generic API
  // Thread Safe

  // NFR
  // Clear and easy to understand

  private T value;
  private final Supplier<T> supplier;

  private Lazy(Supplier<T> supplier) {
    this.supplier = supplier;
  }

  public static<T> Lazy<T> of(Supplier<T> supplier) {
    return new Lazy<>(supplier);
  }

  public T get() {
    if (value != null) {
      return value;
    }
    init();
    return value;
  }

  private synchronized void init() {
    if (value == null) {
      System.out.println("Initializing");
      value = supplier.get();
    }
  }
}
