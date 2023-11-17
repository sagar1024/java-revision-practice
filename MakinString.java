public class MakinString {
    public String makinStrings() {
        String s = "Fred"; // One String object with value "Fred"
        s = s + "47"; // One new String object with value "Fred47"
        s = s.substring(2, 5); // One new String object with value "ed4"
        s = s.toUpperCase(); // One new String object with value "ED4"
        return s.toString(); // It returns the same String "ED4"
    }

    public static void main(String[] args) {
        MakinString obj1 = new MakinString();
        obj1.makinStrings();
    }
}
