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

    }public void setFieldSouth(Room rnS) {
        this.south = rnS;

    }public void setFieldEast(Room rnE) {
        this.east = rnE;

    }public void setFieldWestRoom(Room rnW) {
        this.west = rnW;
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
