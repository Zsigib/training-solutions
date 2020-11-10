package introcontrol;

public class IntroControl {
    int number;

    public int substractTenIfGreaterThanTen(int number) {
        if (number > 10) {return number - 10;}
        else return number;
    }

    public String describeNumber(int number) {
        if (number == 0) {return "Zero";}
        else return "Not Zero";
    }

    public String greetingToJoe(String name) {
        if (name.equals("Joe")) {return "Hello Joe";}
        else return "";
    }
    public int calculateBonus(int sale){
        if (sale >= 1000000) {return sale / 10;}
        else return 0;
    }
    public int calculateConsumption(int prev, int next){
        if(prev <= next) {return next - prev;}
        else {return (10000 - prev) + next;}
    }
    public void printNumbersBetween(int min, int max){

    }
}
