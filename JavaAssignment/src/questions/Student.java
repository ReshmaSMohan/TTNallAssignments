package questions;

public class Student {

    private static String firstname;
    private static String lastname;
    private static Integer age;

    static {
        firstname = "Reshma";
        lastname = "Mohan";
        age = 24;

        System.out.println("Firstname : " + firstname);
        System.out.println("Lastname : " + lastname);
        System.out.println("Age : " + age);
    }


   /* public static void printDetails(){
        System.out.println("Firstname : "+firstname);
        System.out.println("Lastname : "+lastname);
        System.out.println("Age : "+age);
    }*/
}
