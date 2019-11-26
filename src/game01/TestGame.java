package game01;

public class TestGame {
   public static void main(String[] args){
     new Game().start();
   }
}
/*
实现升级
1、增加属性：经验值，最大生命，当前生命，等级
2、如何计算升级：当经验达到一定的数值（达到50升级）
1:50  2：150  3:300 4:500
3、如何计算经验：monster的生命是多少就加多少经验
升级后变动
攻击力增加4，防御力增加3，maxlife增加 curlife=maxlife
 */
/*
下一个版本增加躲避和自动打
1躲避和敏捷有关增加敏捷属性
2什么情况算是躲避
 */
