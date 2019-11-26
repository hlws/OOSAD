package game03;

public class Enemy {
    String type;
    int maxLife;
    int curLife;
    boolean isLive;
    int attack;
    int defend;
    int agile;
    int hideRate;
    //定义构造函数 传入一个int类型的值 1是普通僵尸，2是魔法僵尸，3是大僵尸


    public boolean hidden(){
        //增加躲避判断
        return game02.GameUtil.isHide(this.hideRate,this.agile);
    }
    public void injured(Hunter hunter){
        if (hidden()){
            System.out.println(type+"躲避成功");
        }else {
            System.out.println(type+"嗷嗷嗷");
            int lostLife= GameUtil.calLostLife(hunter.attack,this.defend);
            curLife-=lostLife;
            if (curLife<=0){
                dead(hunter);
                return;
            }}
        show();
        kill(hunter);
    }
    public void kill(Hunter hunter){


    }
    public void dead(Hunter hunter){
        System.out.println("呜呜呜");
        isLive=false;

    }
    public void show(){
        System.out.println("["+type+",life:"+curLife+"maxlife"+maxLife+",isLife:"+isLive+"]"+"攻击力"+attack+"防御力"+defend);

    }
}
