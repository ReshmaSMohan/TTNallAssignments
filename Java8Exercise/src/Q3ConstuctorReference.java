
/*
* Create an Employee Class with instance variables (String) name, (Integer)age, (String)city
* and get the instance of the Class using constructor reference
* */


@FunctionalInterface
interface ConstructorRefDemo {
    Q3Employee createEmp(String name, Integer age, String city);
}

public class Q3ConstuctorReference {
    public static void main(String[] args) {
        ConstructorRefDemo constructorRefDemo = Q3Employee::new; //new tells interface to use the constructor of employee class
        System.out.println(constructorRefDemo.createEmp("reshma", 24, "delhi"));
    }
}
