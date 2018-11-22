package at.aau.itec.esop18.lesson09;

public class Date {
    int day;
    String month;
    int year;

    public Date(int year, String month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * Takes a String argument in the form yyyy-mm-dd and parses it into the internal fields
     * @param americanLocaleDate String like 2018-11-22
     */
    public Date(String americanLocaleDate) {
        String[] split = americanLocaleDate.split("-");
        year = Integer.parseInt(split[0]);
        day = Integer.parseInt(split[2]);
        String[] monthArray = new String[] {
                "Jänner", "Februar", "März", "rest",
                "rest", "rest", "rest", "rest", "rest", "rest", "rest", "rest"
        };
        month = monthArray[Integer.parseInt(split[1])-1];
    }

    public static void main(String[] args) {
        Date d2 = new Date("2018-01-12");
        Date d1 = new Date("2098-03-11");

        System.out.println(d1.year + " " + d1.month + " " + d1.day);
    }
}
