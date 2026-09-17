import java.util.Random;

public class Entity {
    public int level = 1;
    public int exp = 0;
    public int maxHp;
    public int hp;
    public int damage;
    public String name;
    public Weapon weapon;
    public Entity(String name , int hp , int damage, int maxHp){
        this.name = name;
                this.damage = damage;
        this.hp = hp;
        this.maxHp = maxHp;
    }
    public void attack(Entity victim){
        Random random = new Random();
        int chance = random.nextInt(100);
        if (chance<15){
            System.out.println(this.name + "--Блуд атаковал--" + victim.name + "--- но промохнулся");
            return;
        }
        int totalDamage = this.damage;
        if (this.weapon !=null){
            totalDamage += this.weapon.bonusDamage;
        }
        int finalDamage = totalDamage;
        System.out.println(this.name + " ударил" + "------" + victim.name + "-----На----" + this.damage + "------Урона");
        victim.takeDamage(finalDamage);
    }
    public boolean isAlive(){
        return hp >0;
    }public void takeDamage(int incomingDamage){
        this.hp -= incomingDamage;

    }

    public void equipWeapon(Weapon newWeapon){
        this.weapon = newWeapon;
        System.out.println("UWU" + this.name + " Подобрало оружие" + newWeapon.name + "бонус к урону " + newWeapon.bonusDamage + "к урону");

    }public void gainXp(int amount){
        if ((!isAlive())) return;
        this.exp +=amount;
        if (this.exp >=100){
            levelUp();
        }

    }
   public void levelUp(){
        this.level++;
        this.exp -= 100;
        this.maxHp += 20;
        this.hp += this.maxHp;
        this.damage +=5;
    }
}
