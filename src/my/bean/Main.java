package my.bean;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.setName("Apple iPhone 13");
        mobilePhone.setPrice(4500.0);
        mobilePhone.setColor("Ocean Blue");
        System.out.println(mobilePhone.toString());
    }
}
