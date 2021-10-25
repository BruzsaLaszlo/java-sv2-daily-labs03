package day01;

public class School {

    public static void main(String[] args) {

        Students students = new Students();

        students.addHeights(124, 132, 139, 140, 144, 144, 152, 152, 155, 156, 157);
        System.out.println(students.isHeightIncreasing());

        students.addHeight(156);
        System.out.println(students.isHeightIncreasing());

    }

}
