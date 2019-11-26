public class TestStaticInit {

    public static void main(String[] args) {
        new Person1();
    }
}
class Person1{
    Book1 b1=new Book1(1);
    public Person1(){
        System.out.println("person");
    }
    static Book1 b2=new Book1(2);
}
class Book1{
    Leaf l=new Leaf(1);
    Book1(int page){
        System.out.println("book["+page+"]");

    }
    static Leaf l2=new Leaf(2);

}
class Leaf{
    public Leaf(int page){
        System.out.println("left["+page+"]");

    }
}
