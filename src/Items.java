public abstract class Items {
    private String name;

    public Items(String name){
        this.name = name;
    }
    public Items(){}

    public String getName(){
        return this.name;
    }

}

class Lamp extends Items{

    public Lamp(String name){
        super(name);
    }

    public String toString() {
        return super.getName();
    }

    }


abstract class Weapon extends Items {
private int damage;

    public Weapon(String name, int damage){
        super(name);
        this.damage = damage;
    }
    public String toString() {
        return super.getName();
    }

    }


    class shootingWeapon extends Weapon{

        public shootingWeapon(String name, int damage) {
            super(name, damage);
        }

        public String toString() {
            return super.getName();
        }
    }


class meleeWeapon extends Weapon{

    public meleeWeapon(String name, int damage) {
        super(name, damage);
    }

    public String toString() {
        return super.getName();
    }
}
















class Statue extends Items {

    public Statue(String name){
        super(name);
    }
    public String toString() {
        return super.getName();
    }
    }

class Food extends Items{
    private int healthPoints;

    public Food(String name, int healthPoints) {
        super(name);
        this.healthPoints = healthPoints;

    }

    public int getHealthPoints() {
        return healthPoints;
    }


    public String toString() {
        return super.getName();
    }
}






