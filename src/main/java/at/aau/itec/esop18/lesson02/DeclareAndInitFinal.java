package at.aau.itec.esop18.lesson02;

/*
Dieses Programm zeigt die Verwendung des Schlüsselworts final.
 */
class DeclareAndInitFinal {

    public static void main(String[] args) {
        final int maxNum = 42;
        int yPosition = 12;
        yPosition = 13;
        // x kann nicht mehr geändert werden.
        // x = 43;
    }
}