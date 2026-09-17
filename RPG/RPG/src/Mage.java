public class Mage  extends  Entity{
    public int mana;
    public Mage(String name , int hp , int damage , int mana,int maxHp){
        super(name , hp , damage, maxHp);
        this.mana = mana;
    }
    @Override
    public  void attack(Entity victim){
        if (this.mana >=10){
            int spellDamage = this.damage * 2;
            this.mana -=10;
            System.out.println(this.name + "Кастует Снежный шар" + victim.name);
            victim.takeDamage(spellDamage);

        }else {
            System.out.println(this.name + "Нехватает манні ");
            super.attack(victim);
        }
    }@Override public void levelUp(){
        super.levelUp();
        this.mana += 20;

    }
}
