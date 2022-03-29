package my.generics;

public class Main {
    public static void main(String[] args) {
        String s = "some value";


        OldBox oldBox = new OldBox();
        oldBox.setValue(s);
        String s2 =(String) oldBox.getValue(); //First problem

        NewBox<String> newBox = new NewBox<>();
        newBox.setValue(s);
        String s3 = newBox.getValue();
    }
}
