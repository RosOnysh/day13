package day13;

public class Student {
    String name;
    int course;
    double great;

    Student(String name, int course, double great) {
        this.name = name;
        this.course = course;
        this.great = great;
    }


    public static void swap(Student s1, Student s2) {
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1.name);
    }


    public static void ChangeName(Student s1){
        s1.name = "Vasya";
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Peotr", 4, 3.5);

        ChangeName(st2);
        System.out.println(st2.name);

    }


}
