package zttc.itat.feet3;

public class Dog extends Pet {
    public Dog(String name){
        super();
        setName(name);
    }
    public void  enjoy(){
        System.out.println(getName()+"汪汪汪");

    }
}
