public class ReverseString {

  /**
   * We iterate all the characters from the input starting from right to left
   * and append them to the <i>reversed</i> variable resulting to a new String object each time.
   * Regardless of the fact it has Time & Space Complexity of O(n) it's still inefficient due to the multiple string instantiations.
   */
  public static String reverseBruteForce(String input) {
    if (input == null || input.isBlank()) {
      return input;
    }

    String reversed = "";

    for (int i = input.length() - 1; i >= 0; i--) {
      reversed += input.charAt(i);
    }

    return reversed;
  }

  /**
   * An improvement of the old one.
   * It's better because the StringBuilder allocates as many slots in the backing array as instructed by the argument "input.length()"
   * and during the iteration they are filled without creating new Strings, leading to only 1 instantiation once the return is reached.
   */
  public static String reverseSlightlyOptimized(String input) {
    if (input == null || input.isBlank()) {
      return input;
    }

    StringBuilder reversed = new StringBuilder(input.length());

    for (int i = input.length() - 1; i >= 0; i--) {
      reversed.append(input.charAt(i));
    }

    return reversed.toString();
  }

  /**
   * An improvement of the previous two versions. The method only traverses through half of the elements
   * and swaps the values on each iteration. The swapping happens thanks to the initially loaded input in the StringBuilder object.
   * The logic behind it is that on each character index the value on the opposite position is stored in a temp variable.
   * The value on the current index is then placed on that opposite position and lastly the temp value is placed in the current position.
   *
   * <ol>
   *  <li>Cases like input being null, empty or contains only whitespaces are being caught by the first if condition.</li>
   *  <li>If the input has length of 1 it doesn't even access the for loop and no processing is done on it.</li>
   * </ol>
   *
   * The Space & Time Complexity of this method is O(n) again. The reason is that the constants are dropped on runtime because Big O just describes
   * the rate of increase. Algorithm that takes O(1/2N) or O(2N) is written as O(n).
   */
  public static String reverseOptimal(String input) {
    if (input == null || input.isBlank()) {
      return input;
    }

    StringBuilder reversed = new StringBuilder(input);

    int length = input.length();

    for (int i = 0; i < length / 2; i++) {
      int reversedPos = (length - i) - 1;
      char temp = input.charAt(reversedPos);

      reversed.setCharAt(reversedPos, input.charAt(i));
      reversed.setCharAt(i, temp);
    }

    return reversed.toString();
  }
}
