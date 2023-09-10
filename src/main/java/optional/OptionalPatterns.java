package optional;

import java.util.Optional;

public class OptionalPatterns {
  public static void main(String[] args) throws Exception {
    initialization();
    access();
    whenToUseAndAvoid();
  }

  private static Optional<String> initialization() {
    // Initialization
    // Best Practice ->
    Optional<String> optional = Optional.ofNullable(null);

    // Anti-pattern to avoid ->
    // Optional.of(null);

    return optional;
  }

  private static void access() {
    // Access
    Optional<String> optional = initialization();

    // Best practices ->
    System.out.println(optional.orElse("NA"));
    optional.ifPresent(s -> System.out.println("Present"));
    optional.ifPresentOrElse(s -> System.out.println("present"), () -> System.out.println("Not Present"));
    // optional.orElseThrow(() -> new IllegalStateException());

    // Anti-pattern to avoid ->
    // optional.get();
  }

  private static void whenToUseAndAvoid() {
    // Where to use and Where to avoid optional
    // Use -
    // When returning a single value
    // Not use -
    // When returning a collection or array of values
    // As method parameter -> rather method overloading
  }
}
