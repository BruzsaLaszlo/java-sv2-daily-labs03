package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {

    private List<String> names = new ArrayList<>();

    public boolean addStudent(String name) {
        if (name.indexOf(" ") > 0)
            return names.add(name);
        return false;
    }

    public static void main(String[] args) {

        Journal journal = new Journal();
        System.out.println(journal.addStudent("Kis Pista"));
        System.out.println(journal.addStudent("Madonna"));

    }

}