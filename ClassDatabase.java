package lab5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ClassDatabase {
    ArrayList<ArrayList<String>> database;

    public ClassDatabase() {
        database = new ArrayList<ArrayList<String>>();
    }

    public void addCourseStudent(String student, String course) {
        ArrayList<String> entry = new ArrayList<String>();
        entry.add(student);
        entry.add(course);
        database.add(entry);
    }

    public int countStudents(String course) {
        int count = 0;
        for (ArrayList<String> entry : database) {
            if (entry.get(1).equals(course)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        ClassDatabase db = new ClassDatabase();
        db.addCourseStudent("Alan Turing", "CITS2005");
        db.addCourseStudent("Alan Turing", "CITS2200");
        db.addCourseStudent("Max", "CITS9999");
        db.addCourseStudent("Gozz", "CITS9999");
        db.addCourseStudent("Jane Doe", "CITS2005");
        System.out.println(db.countStudents("CITS2005"));
        System.out.println(db.countStudents("CITS2200"));
        System.out.println(db.countStudents("CITS9999"));
    }
}
