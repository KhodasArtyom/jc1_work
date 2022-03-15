package my.strings;

public class ImmutableStr {
    public static void main(String[] args) {
        String s = new String("a");
        System.out.println(s);
        String s2 = s.concat("b");
        System.out.println("s = " + s);
        System.out.println("s2 = " + s2);

        char[]  charArray = {'a', 'b', 'c'};
        String str2 = new String(charArray);
        str2 = str2.intern();
        System.out.println(str2);
    }
}
