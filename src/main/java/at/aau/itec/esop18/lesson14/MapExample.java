package at.aau.itec.esop18.lesson14;


import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, List<String>> stud2course = new LinkedHashMap<>();
        stud2course.put("mlux", new LinkedList<>());
        stud2course.put("alice", new LinkedList<>());
        stud2course.put("bob", new LinkedList<>());
        stud2course.put("charly", new LinkedList<>());

        stud2course.get("mlux").add("esop");
        stud2course.get("mlux").add("einf");

        stud2course.get("alice").add("esop");
        stud2course.get("alice").add("einf");
        stud2course.get("alice").add("dsig");

        stud2course.get("bob").add("esop");
        stud2course.get("bob").add("einf");
        stud2course.get("bob").add("prog1");

        stud2course.get("charly").add("esop");
        stud2course.get("charly").add("einf");

        // do something

        for (Iterator<String> iterator = stud2course.keySet().iterator(); iterator.hasNext(); ) {
            String student = iterator.next();
            System.out.println(student + " is enrolled in " + stud2course.get(student));

        }
    }
}
