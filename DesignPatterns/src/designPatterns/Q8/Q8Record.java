package designPatterns.Q8;

public class Q8Record implements Q8AccessRecord {
    protected Q8Student student;

    public Q8Record(Q8Student student) {
        this.student = student;
    }

    @Override
    public void accessRecord() {
        System.out.println("Accessing Record : ");
        System.out.println(student);
    }
}
