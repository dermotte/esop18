package at.aau.itec.esop18.lesson14;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

public class LocalClassExample {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Mathias", "Lux"));
        students.add(new Student("Xaver", "Mustermann"));
        students.add(new Student("Gustav", "Gleich"));
        students.add(new Student("Otto", "Normalverbraucher"));
        students.add(new Student("Andrea", "Anders"));

        /*
        // local class
        class StudentComparator<T> implements Comparator<T> {
            @Override
            public int compare(T o1, T o2) {
                return ((Student) o1).surname.compareTo(((Student) o2).surname);
            }
        }
        */

        /*
        // anonymous class
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (o1).surname.compareTo((o2).surname);
            }
        });
        */

        students.sort((o1, o2) -> (o1).surname.compareTo((o2).surname));

        students.forEach(student -> System.out.println(student));
    }

}



class Student {
    String firstname;
    String surname;

    public Student(String firstname, String surname) {
        this.firstname = firstname;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return surname + ", " + firstname;
    }
}