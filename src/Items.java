public abstract class Items {
    private String name;

    public Items(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}

class Lamp extends Items{
    private String name;

    public Lamp(String name){
        super(name);
        this.name =name;
    }

    public String toString(){
        return name;
    }

    }


class Sword extends Items {
    private String name;

    public Sword(String name){
        super(name);
        this.name =name;
    }
    public String toString() {
        return name;
    }

    }


class Statue extends Items {
    private String name;

    public Statue(String name){
        super(name);
        this.name =name;
    }
    public String toString() {
        return name;
    }
    }




