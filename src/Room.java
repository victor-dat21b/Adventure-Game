import java.lang.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Room {
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private String name;
    private String description;
    private ArrayList<Items> itemListRoom = new ArrayList<>();



    Room(String ne, String desCript) {
        this.name = ne;
        this.description = desCript;
    }
    Room(){
        }


// Er ikke brugt på nuverende tidspunkt, men kan blive brugt ved udvidelse af mappet.
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

// Er ikke brugt på nuverende tidspunkt, men kan blive brugt ved udvidelse af mappet.
    }public void setFieldWest(Room rnW) {
        this.west = rnW;
        if (rnW.getFieldEast() == null) {
            rnW.setFieldEast(this);
        }
    }
        public void setItemsListRoom(Items passedItems){
            this.itemListRoom.add(passedItems);
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

    public String getName(){
        return this.name;
    }

    public String getItems(){

        if (itemListRoom.isEmpty()){
            return "There are no items in this room";
        }else{
            StringBuilder buildingString = new StringBuilder();
            buildingString.append("In this room there are: ");
            for (Items i: itemListRoom){
                buildingString.append("a ");
                buildingString.append(i);
                buildingString.append(", ");
            }
            return buildingString.toString();


        }
    }
    public ArrayList<Items> getItemsInRoom(){
        return itemListRoom;
    }

    //OBS: NEXT TWO METHODS ARE OVERLOADED.
    public void updateItemList(Items passedItem){
        itemListRoom.add(passedItem);
}

    public void updateItemList(ArrayList<Items> passedItem){
        itemListRoom = passedItem;
    }


    }
