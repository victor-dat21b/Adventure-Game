public class Room {
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private String name;

    Room(String ne){
    this.name = ne;


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
    public String getRoom(){
        return this.name;
        }

    }
