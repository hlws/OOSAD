public class TestRandom {
    public static void main(String[] args) {
        for (int a=1;a<100;a++){
            System.out.println(randomRangi(20,30));
            int b;
            b=(int)(Math.random()*10);
            if (b<0 | b>9){
                System.out.println("error");

            }

        }
    }
    public static int randomRangi(int start,int end){
        return (int)(Math.random()*(end-start)+start);
    }
}
