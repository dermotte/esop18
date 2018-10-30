package at.aau.itec.esop18.lesson06;

/**
 * Shifts characters by a fixed amount of letters
 */
public class CesarShiftCommandLine {

    public static void main(String[] args) {
        int shift = Integer.parseInt(args[1]);
        // alphabet
        char[] letters = "abcdefghijklmnopqrstuvwxyz .,:!\"§".toCharArray();
        // message to encode
        String msg = args[0];
        String enc = "x :qyfu.!§y";

        // change message to array to be able to iterate
        char[] msgLetters = msg.toCharArray();
        for (int i = 0; i < msgLetters.length; i++) {
            int position = findLetterInAlphabet(letters, msgLetters[i]);
            int newPosition = position + shift; // just for decoding: + letters.length;
            System.out.print(letters[newPosition%letters.length]);
        }
        System.out.println();
    }

    private static int findLetterInAlphabet(char[] alphabet, char letter) {
        for (int i = 0; i < alphabet.length; i++) {
            if (letter == alphabet[i]) return i;
        }
        return -1;
    }

}
