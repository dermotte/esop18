package at.aau.itec.esop18.lesson05;

public class NameGenerator {
    static char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    static char[] consonants = "bcdfghjklmnpqrstvwxyz".toCharArray();
    static String[] title = {"Lord", "Gratious", "Stinking", "Unholy"};

    public static void main(String[] args) {
        System.out.println(getRandomName("t cvc cvccvvvc"));
    }

    static String getRandomName(String pattern) {
        String result = "";
        char[] namePatternArray = pattern.toCharArray();
        for (int i = 0; i < namePatternArray.length; i++) {
            char letter = namePatternArray[i];
            if (letter == 'c') {
                result += consonants[getRandomNumber(consonants.length)];
            } else if (letter == 'v') {
                result += vowels[getRandomNumber(vowels.length)];
            } else if (letter == 't') {
                result += title[getRandomNumber(title.length)];
            } else {
                result += " ";
            }
        }
        return result;
    }


    /**
     * Creates a "random" number
     *
     * @param max
     * @return
     */
    public static int getRandomNumber(int max) {
        return (int) ((System.nanoTime() ^ 42) % max);
    }

}
