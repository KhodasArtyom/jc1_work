package my.strings;

public class StringSpeed {

    public static String buildString() {
        String result = "";
        for (int i = 0; i <=100000; i ++) {
            result = result + i;
        }
        return result;
    }
    public static String buildStringBuilder() {
        StringBuilder result = new StringBuilder("") ;
        for (int i = 0; i <= 100000; i++) {
            result = result.append(i);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        buildStringBuilder();
        long t2 = System.currentTimeMillis();
        System.out.println("Result: " + (t2 - t1));
    }



}
