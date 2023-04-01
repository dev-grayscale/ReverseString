import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

  @Test
  void execute() {
    Assertions.assertEquals(null, ReverseString.reverseSlightlyOptimized(null));
    Assertions.assertEquals(null, ReverseString.reverseOptimal(null));
    Assertions.assertEquals(null, ReverseString.reverseBruteForce(null));

    Assertions.assertEquals("    ", ReverseString.reverseSlightlyOptimized("    "));
    Assertions.assertEquals("    ", ReverseString.reverseOptimal("    "));
    Assertions.assertEquals("    ", ReverseString.reverseBruteForce("    "));

    Assertions.assertEquals("", ReverseString.reverseBruteForce(""));
    Assertions.assertEquals("", ReverseString.reverseSlightlyOptimized(""));
    Assertions.assertEquals("", ReverseString.reverseOptimal(""));

    Assertions.assertEquals("a", ReverseString.reverseBruteForce("a"));
    Assertions.assertEquals("a", ReverseString.reverseSlightlyOptimized("a"));
    Assertions.assertEquals("a", ReverseString.reverseOptimal("a"));

    Assertions.assertEquals("dcba", ReverseString.reverseBruteForce("abcd"));
    Assertions.assertEquals("dcba", ReverseString.reverseSlightlyOptimized("abcd"));
    Assertions.assertEquals("dcba", ReverseString.reverseOptimal("abcd"));

    Assertions.assertEquals("321", ReverseString.reverseBruteForce("123"));
    Assertions.assertEquals("321", ReverseString.reverseSlightlyOptimized("123"));
    Assertions.assertEquals("321", ReverseString.reverseOptimal("123"));


    Assertions.assertEquals("tset ymmuD", ReverseString.reverseBruteForce("Dummy test"));
    Assertions.assertEquals("tset ymmuD", ReverseString.reverseSlightlyOptimized("Dummy test"));
    Assertions.assertEquals("tset ymmuD", ReverseString.reverseOptimal("Dummy test"));

    Assertions.assertEquals("321 dlroW olleH", ReverseString.reverseBruteForce("Hello World 123"));
    Assertions.assertEquals("321 dlroW olleH", ReverseString.reverseSlightlyOptimized("Hello World 123"));
    Assertions.assertEquals("321 dlroW olleH", ReverseString.reverseOptimal("Hello World 123"));
  }
}
