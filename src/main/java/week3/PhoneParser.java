package week3;

import week02.Phone;

public class PhoneParser {
    private String phone = "30 - 1234567";

    private String prefix;
    private String number;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String PhoneParser(String prefix, String number) {
        return getPrefix();
    }

    public static void main(String[] args) {
        PhoneParser Phone1 = new PhoneParser();
    Phone1.setPrefix("30");
    Phone1.setNumber("1234567");

        System.out.println(Phone1);
    }
}
