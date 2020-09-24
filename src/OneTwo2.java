public class OneTwo2 {
  public String oneTwo(String str) {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < str.length() - 2; i = i + 3) {
      result.append(str.substring(i + 1, i + 3)).append(str.charAt(i));
    }
    return result.toString();
  }
}
