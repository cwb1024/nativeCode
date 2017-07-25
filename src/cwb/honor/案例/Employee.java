package cwb.honor.案例;

/**
 * Created by PC-CWB on 2017/4/8.
 */
public abstract class Employee {
    private String name;
    private String id;

    public Employee() {

    }

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract void work();

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;

    }

    public String getId() {
        return id;
    }
}
