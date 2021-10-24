public class Items {
    private String name;

    public String getName(){
        return this.name;
    }

}

class Lamp extends Items{
    private String name;

    public Lamp(){
        this.name = "Lamp";
    }

    public String toString(){
        return name;
    }
    public String getName(){
        return this.name;
    }
}

class Sword extends Items {
    private String name;

    public Sword() {
        this.name = "Sword";


    }
    public String toString() {
        return name;
    }

    public String getName(){
        return this.name;
    }

}
class Statue extends Items {
    private String name;

    public Statue() {
        this.name = "Statue";

    }
    public String toString() {
        return name;
    }
    public String getName(){
        return this.name;
    }
}



