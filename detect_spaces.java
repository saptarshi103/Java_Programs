public class detect_spaces {
    public static void main(String[] args) {
        String name = "Saptarshi  Ulhas   Pujari";
        System.out.println("Double spaces: "+ name.indexOf("  "));
        System.out.println("Triple spaces: "+ name.indexOf("   "));
    }
}
