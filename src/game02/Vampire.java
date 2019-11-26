package game02;

class Vampire {
    String type;
    int maxLife;
    int curLife;
    boolean isLive;
    int attack;
    int defend;
    int agile;
    int hideRate;
    int getLifeRate;
    //定义构造函数 传入一个int类型的值 1是普通僵尸，2是魔法僵尸，3是大僵尸
    public Vampire(int vt){
        isLive=true;
        hideRate=67;
        if (vt==1){
            type="吸血蝙蝠";
            maxLife=400;
            attack=20;
            defend=8;
            agile=30;
            getLifeRate=45;
        }
        else if (vt==2){
            type="吸血鬼";
            maxLife=350;
            attack=35;
            defend=5;
            agile=40;
            getLifeRate=66;
        }
        else if(vt==3){
            type="吸血鬼王";
            maxLife=400;
            attack=15;
            defend=15;
            agile=16;
            getLifeRate=80;

        }
        curLife=maxLife;

    }
    public boolean hidden(){
        //增加躲避判断
        return GameUtil.isHide(this.hideRate,this.agile);
    }
    //传入受到的伤害
    public void getLife(int damage){
        int addLife=damage*getLifeRate/100;
        System.out.println("吸血成功生命+"+addLife+"，当前生命："+curLife);
        if (addLife+curLife>=maxLife){
            curLife=maxLife;
        }
        else {
            curLife+=addLife;
        }


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
        if (!isLive){
            return;
        }
        if (!hunter.isLive){
            return;
        }
        System.out.println(type+":呼呼呼呼!杀向"+hunter.name);
        //依然需要传递自己的攻击力
        hunter.injured(this);
        int lostLift=hunter.injured(this);
        this.getLife(lostLift);

    }
    public void dead(Hunter hunter){
        hunter.expAdd(this);
        System.out.println("呜呜呜");
        isLive=false;

    }
    public void show(){
        System.out.println("["+type+",life:"+curLife+"maxlife"+maxLife+",isLife:"+isLive+"]"+"攻击力"+attack+"防御力"+defend);

    }
}
