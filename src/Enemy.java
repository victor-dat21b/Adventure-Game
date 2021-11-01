public class Enemy {
    private String name;
    private int health;
    private int damage;
    private Weapon equippedWeapon = null;


    public Enemy(String name, int health, int damage){
    this.name = name;
    this.damage = damage;
    this.health = health;
}


    public void giveWeapon(Weapon passedWeapon){
    this.equippedWeapon = passedWeapon;
    }


    public String toString() {
        return this.name;
    }

}



