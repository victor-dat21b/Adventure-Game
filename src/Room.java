public class Room {
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private String name;
    private String description;

    Room(String ne, String desCript) {
        this.name = ne;
        this.description = desCript;
    }
    Room(){
        }



    public void setFieldNorth(Room rnN) {
        this.north = rnN;
        if (rnN.getFieldSouth() == null){
            rnN.setFieldSouth(this);
        }


    }public void setFieldSouth(Room rnS) {
        this.south = rnS;
        if (rnS.getFieldNorth() == null){
            rnS.setFieldNorth(this);
        }

    }public void setFieldEast(Room rnE) {
        this.east = rnE;
        if (rnE.getFieldWest() == null){
            rnE.setFieldWest(this);
        }

    }public void setFieldWest(Room rnW) {
        this.west = rnW;
        if (rnW.getFieldWest() == null){
            rnW.setFieldWest(this);
        }
    }




    public Room getFieldNorth() {
        return this.north;

    }public Room getFieldSouth() {
        return this.south;

    }public Room getFieldEast() {
        return this.east;

    }public Room getFieldWest() {
        return this.west;
    }
    public String getDescription() {
        return this.description;

    }
    public String getRoom(){
        return this.name;
        }


    }
