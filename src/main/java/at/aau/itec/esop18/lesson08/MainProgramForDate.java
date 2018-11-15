package at.aau.itec.esop18.lesson08;

public class MainProgramForDate {
    public static void main(String[] args) {
        Date x, y;
        x = new Date();
        y = new Date();

        x.day = 15;
        x.month = "November";
        x.year = 2018;

        y.day = 15;
        y.month = "November";
        y.year = 2018;

        if (equalDate(x, y)) {
            System.out.println("Same date!");
        } else {
            System.out.println("Not the same date!");
        }

    }

    public static boolean equalDate(Date x, Date y) {
        boolean isSameDate = true;
        if (x.day != y.day) isSameDate = false;
        if (x.year != y.year) isSameDate = false;
        if (!x.month.equals(y.month))
            isSameDate = false;
        return isSameDate;
    }
}
