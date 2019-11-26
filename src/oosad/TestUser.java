package oosad;

public class TestUser {
    public static void main(String[] args) {
        User u=new User();
        u.setAge(13);
        System.out.println(u.getAge());


    }
}
class User{
    private String username;
    private String password;
    private int age;
    public void setUsername(String username){
        this.username=username;
    }
    public String getUsername(){
        return username;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

}
