public class TestInit {
    public static void main(String[] args) {
        Bag bag=new Bag();


    }
}
class Bag{
    Book b1=new Book(1);
    public Bag (){
        System.out.println("bag");
    }
    Book b2=new Book(2);

}
class Book{
    public Book(int num){
        System.out.println("book"+num);
    }
}