package zttc.itat.feet3;

public abstract class Pet {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract void enjoy();

}
