package zttc.itat.feet3;

public class Richmen {
    private String name;
    private Pet pet;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public Richmen(String name,Pet pet){
       // super();

        this.name=name;
       this.pet=pet;
    }

    public void  play(){
        System.out.println(name+"正在和"+pet.getName()+"玩耍");
        pet.enjoy();
    }
}
