public class Warrior extends Entity{
    public int shield ;
public Warrior(String name , int hp , int damage , int shield, int maxHp){
    super(name , hp , damage , maxHp);
    this.shield = shield;
} @Override
    public  void takeDamage(int incomingDamage){
    int realDamage = incomingDamage - this.shield;
    if (realDamage < 0) realDamage = 0;
    this.hp -= realDamage;
        System.out.println(this.name + "----Заблокировало----" + (incomingDamage - realDamage) + "-----Урона");
    }
}
