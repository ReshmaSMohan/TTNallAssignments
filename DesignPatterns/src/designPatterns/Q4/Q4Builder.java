package designPatterns.Q4;

public class Q4Builder {
    public static void main(String[] args) {
        Q4Student q4Student = new Q4StudentBuilder()
                .setFirstName("reshma")
                .setLastName("mohan")
                .setAge(24)
                .setRollNo(33)
                .setPhoneNumber(9876123456L)
                .setStandard(12)
                .isChildSpeciallyAbled(false)
                .build();

        System.out.println(q4Student);
    }
}
