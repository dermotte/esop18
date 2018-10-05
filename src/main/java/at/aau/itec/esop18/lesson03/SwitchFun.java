package at.aau.itec.esop18.lesson03;

public class SwitchFun {
    public static void main(String[] args) {
        int month = 1;
        int days = -1;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
            default:
                System.out.println("error");
                break;
        }
        System.out.println(days);
    }
}
