package game03;

public class TestExtends {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.name="wang";
        dog.breath();

    }
}
class Animal{
    String name;
    public void breath(){
        System.out.println(name+" is breatning");
    }
}
class Dog extends Animal{

}