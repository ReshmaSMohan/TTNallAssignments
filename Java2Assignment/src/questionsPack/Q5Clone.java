package questionsPack;

// 5. WAP to show object cloning in java using cloneable and copy constructor both.

public class Q5Clone implements Cloneable {
    private Integer id;
    private String name;

    public Q5Clone(Integer id,String name) {
        this.id = id;
        this.name = name;
    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //copy constructor
    Q5Clone(Q5Clone cloneObj){
        this.id=cloneObj.id;
        this.name=cloneObj.name;
    }
}

class MyMain{
    public static void main(String[] args) throws CloneNotSupportedException {
    Q5Clone cloneObj = new Q5Clone(1,"Reshma");

    //  clone() of cloneable used;
    Q5Clone clonedNewObj = (Q5Clone)cloneObj.clone();
    System.out.println("Old oblect values    : "+cloneObj.getId()+" : "+cloneObj.getName());
    System.out.println("cloned   (clone()) object values : "+clonedNewObj.getId()+" : "+clonedNewObj.getName());

    // clone using copy constructor
    Q5Clone cloneCopyConst = new Q5Clone(cloneObj);
    System.out.println("cloned(copy const) object values : "+cloneCopyConst.getId()+" : "+cloneCopyConst.getName());


    }
}
