package at.aau.itec.esop18.lesson08;

class Time {
    int h,m,s;
}

public class TimeProgram {
    public static void main(String[] args) {
        Time t = convert(45142);

        System.out.println("t.h = " + t.h);
        System.out.println("t.m = " + t.m);
        System.out.println("t.s = " + t.s);
    }

    public static Time convert(int sec) {
        Time result = new Time();
        result.h = sec/(60*60);
        result.m = (sec - result.h*3600) / 60;
        result.s = sec % 60;
        return result;
    }

}
