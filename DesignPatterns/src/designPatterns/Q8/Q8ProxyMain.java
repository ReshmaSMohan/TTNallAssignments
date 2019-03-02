package designPatterns.Q8;

public class Q8ProxyMain {
    public static void main(String[] args) {
        Q8Student student = new Q8Student("reshma","mohan",33,12,24);
        Q8AccessRecord accessRecord = new Q8RecordProxy(student,"reshma","12345");
        accessRecord.accessRecord();
    }
}
