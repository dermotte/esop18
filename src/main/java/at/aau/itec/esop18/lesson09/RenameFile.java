package at.aau.itec.esop18.lesson09;

public class RenameFile {
    public static void main(String[] args) {
        String inputFile = "my.paper.doc";
        // todo: make "paper.doc" out of it
        int whereIsTheDot = inputFile.lastIndexOf('.');
        StringBuilder out = new StringBuilder();
        out.append(inputFile.substring(0, whereIsTheDot));
        out.append(".pdf");
        System.out.println("out = " + out);
    }
}
