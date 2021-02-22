package exam03retake01;

public class CdvCheck {

    public boolean check(String s) {

        try { int number = Integer.parseInt(s);

        }
        catch (IllegalArgumentException ae) {
            throw new IllegalArgumentException("Illegal Argument Exceptiption", ae);





        }
    }
}
