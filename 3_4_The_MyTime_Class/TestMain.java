public class TestMain {
    public static void main(String[] args) {
        MyTime time = new MyTime(23, 59, 59);
        System.out.println(time);
        System.out.println(time.nextSecond());
        System.out.println(time.previousSecond());
        System.out.println(time.nextMinute());
        System.out.println(time.previousMinute());
        System.out.println(time.nextHour());
        System.out.println(time.previousHour());
        System.out.println(time.nextSecond().nextSecond().nextSecond());
        System.out.println(time.previousSecond().previousSecond().previousSecond());
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        time.setHour(12);
        time.setMinute(34);
        time.setSecond(56);
        System.out.println(time);
        time.setHour(25);

    }
}
