package questions;

import static questions.Student.mystaticvar;

public class Question7 {

    static Student studentStatic;

    static {

        studentStatic = new Student("Reshmi", "Mohan", 18);
        System.out.println("--------from static block-------");
        System.out.println("Firstname : " + studentStatic.getFirstname());
        System.out.println("Lastname : " + studentStatic.getLastname());
        System.out.println("Age : " + studentStatic.getAge());
    }

    public static void main(String[] args) {

        printDetailsStatic();
        Student student = new Student("Reshma", "Mohan", 24);
        printDetails(student);
        System.out.println(mystaticvar);

    }

    public static void printDetails(Student student) {
        System.out.println("-------From static method--------");
        System.out.println("Firstname : " + student.getFirstname());
        System.out.println("Lastname : " + student.getLastname());
        System.out.println("Age : " + student.getAge());
    }

    public static void printDetailsStatic() {
        System.out.println("-------From static method using static variable-----");
        System.out.println("Firstname : " + studentStatic.getFirstname());
        System.out.println("Lastname : " + studentStatic.getLastname());
        System.out.println("Age : " + studentStatic.getAge());
    }
}
