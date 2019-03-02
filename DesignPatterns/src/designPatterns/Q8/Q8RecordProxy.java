package designPatterns.Q8;

public class Q8RecordProxy extends Q8Record {
    private boolean isAdmin = false;
    private String uname;
    private String pwd;

    public Q8RecordProxy(Q8Student student, String uname, String pwd) {
        super(student);
        this.uname = uname;
        this.pwd = pwd;

        if ("reshma".equals(uname) && "12345".equals(pwd))
            isAdmin = true;
    }

    @Override
    public void accessRecord() {
        if (isAdmin)
            super.accessRecord();
        else
            System.out.println("Access Denied!!!!!!!!!");
    }
}
