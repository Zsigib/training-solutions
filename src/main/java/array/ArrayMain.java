package array;

public class ArrayMain {
    public static void main(String[] args) {
        String [] weekdays = {"Monday", "Tuesday", "Wednesday", "Thirsday", "Friday", "Saturday", "Sunday"};

        System.out.println(weekdays[1]);
        System.out.println(weekdays.length);

        int [] powersOfTwo = new int[5];
        for (int i = 0; i < powersOfTwo.length; i++) {
            powersOfTwo[i] = powersOfTwo[i - 1] * 2;
        }
    }


}
