public class TestGame {
    public static void main(String[] args){
        Hunter h=new Hunter();
        h.name="菜10";
        h.isLive=true;
        h.life=100;
        h.weapon="菜刀";
        Monster m=new Monster();
        m.isLive=true;
        m.life=180;
        m.type="普通僵尸";
        h.fight(m);
        m.kill(h);
        h.fight(m);
        m.kill(h);
        h.fight(m);
        m.kill(h);
        h.fight(m);
        m.kill(h);
        h.fight(m);
        m.kill(h);
        h.fight(m);
        m.kill(h);


    }
}
class Hunter{
    String name;
    int life;
    boolean isLive;
    String weapon;
    public void fight(Monster monster){
        //自己死亡也不能打
        if (isLive==false){
            return;
        }
        if (monster.isLive==false){
            return;
        }
        //判断如果僵尸死了就不能再打了
        System.out.println("["+name+"挥舞着"+weapon+"杀向"+ monster.type+"]");
        monster.injurde();
        show();
    }
    public void injured(){
        life-=20;
        //判断是否死亡，死亡调用dead
        if (life<=0){
            dead();
            return;
        }

        System.out.println("["+name+"啊啊啊啊"+"]");

        System.out.println("["+name+"：小样，敢打我"+"]");
        show();

    }
    public void dead(){
        System.out.println(name+":天妒英才！！！ ");
        isLive=false;
    }
    public void show(){
        System.out.println("["+name+",life:"+life+",isLife:"+isLive+",weaper:"+weapon+"]");

    }

}
class Monster{
    String type;
    boolean isLive;
    int life;
    public void injurde(){
        life-=20;
        //判断是否死亡，如果死亡就调用dead方法
        if(life<=0){
            dead();
            return;
        }
        System.out.println("["+type+"呜呜呜呜"+"]");
        show();

    }
    public void kill(Hunter hunter){
        //如果死亡就无法kill 直接return
        if (!isLive){
            return;
        }
        if (!hunter.isLive){
            return;
        }

        System.out.println(type+"呜呜呜啊啊啊扑向"+hunter.name);
        hunter.injured();


    }
    public void dead(){
       System.out.println("哇哇哇");
       isLive=false;

    }
    public void show(){
        System.out.println("["+type+",life:"+life+",isLife:"+isLive+"]");
    }

}
