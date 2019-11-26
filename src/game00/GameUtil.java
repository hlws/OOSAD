package game00;

public class GameUtil {
    static int lostBasicLife=7;
    public static int calLostLife(int attack,int defend){
        int lostLife=attack-defend;
        int rel=0;
        if (lostLife<=0){
            rel=lostBasicLife;
        }else {
            rel=(lostLife+lostBasicLife);
        }
        return rel;
    }
    public static int  randomRange(int start,int end){
        return (int)(Math.random()*(end-start)+start);
    }
    public static boolean isHide(int hideRate,int agile){
        int sucRate=agile*hideRate/100;
        //生产一个随机数来判断是否成功
        int ran=GameUtil.randomRange(1,101);
        if (ran<sucRate){
            return true;
        }
        else
            return false;
    }
}
