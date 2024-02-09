package self_practice.comparatorAndComparable;

import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ToString
class Student implements Comparable<Student> {
    int rollNo, marks;
    String name;

    public Student(int rollNo, String name,int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
        this.name = name;
    }

    //override the compareTo method in Comparable interface
//    public int compareTo(Student student){
//        return marks> student.marks?1:-1;
//    }

    public int compareTo(Student student){
        return name.length()> student.name.length()?1:-1;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(23, "Mahesh", 55));
        students.add(new Student(24, "Sony", 64));
        students.add(new Student(25, "Larry", 25));
        students.add(new Student(26, "Joseph", 36));


//        if you want to pass students into Collections.sort() Students need to implement Comparable interface
        Collections.sort(students, Comparator.comparing(student -> student.name));
        students.sort(Comparator.comparing(student -> student.name));
        Collections.sort(students);

        students.forEach(student -> System.out.println(student));



    }


}


