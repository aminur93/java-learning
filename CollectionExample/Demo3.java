package CollectionExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// this is a class that implements the comperator interface
class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

// this is a class that implements the comparable interface
class Teacher implements Comparable<Teacher> {
    int age;
    String name;

    public Teacher(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';

    }

    @Override
    public int compareTo(Teacher t) {
        if (this.age > t.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class Demo3 {

    public static void main(String args[]) {

        // Comparator<Integer> com = (i, j) -> {

        // return i % 10 > j % 10 ? 1 : -1;

        // };

        // List<Integer> nums = new ArrayList<>();

        // nums.add(124);
        // nums.add(21);
        // nums.add(13);
        // nums.add(12);

        // Collections.sort(nums, com);

        // System.out.println(nums);

        // Comparator
        List<Student> students = new ArrayList<>();
        students.add(new Student(12, "John"));
        students.add(new Student(5, "Mike"));
        students.add(new Student(54, "Tom"));
        students.add(new Student(11, "Ron"));

        Collections.sort(students, (s1, s2) -> {
            return s1.age > s2.age ? 1 : -1;
        });

        for (Student s : students) {
            System.out.println(s);
        }

        // Comparable
        List<Teacher> teachers = new ArrayList<>();

        teachers.add(new Teacher(12, "John"));
        teachers.add(new Teacher(5, "Mike"));
        teachers.add(new Teacher(54, "Tom"));
        teachers.add(new Teacher(11, "Ron"));

        Collections.sort(teachers);

        for (Teacher t : teachers) {
            System.out.println(t);
        }

    }
}
