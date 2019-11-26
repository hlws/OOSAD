package zttc.itat.feet3;

public class Cat extends Pet {
    public Cat(String name){
        this.setName(name);
    }

    @Override
    public void enjoy() {
        System.out.println(getName()+"喵喵喵");
    }
}
