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
    private ArrayList<Enemy> roomEnemies = new ArrayList<>();


    Room(String ne, String desCript) {
        this.name = ne;
        this.description = desCript;
    }

    Room() {
    }


    // Er ikke brugt på nuverende tidspunkt, men kan blive brugt ved udvidelse af mappet.
    public void setFieldNorth(Room rnN) {
        this.north = rnN;
        if (rnN.south == null) {
            rnN.setFieldSouth(this);
        }


    }

    public void setFieldSouth(Room rnS) {
        this.south = rnS;
        if (rnS.north == null) {
            rnS.setFieldNorth(this);
        }

    }

    public void setFieldEast(Room rnE) {
        this.east = rnE;
        if (rnE.west == null) {
            rnE.setFieldWest(this);
        }

// Er ikke brugt på nuverende tidspunkt, men kan blive brugt ved udvidelse af mappet.
    }

    public void setFieldWest(Room rnW) {
        this.west = rnW;
        if (rnW.east == null) {
            rnW.setFieldEast(this);
        }
    }

    public void setItemsListRoom(Items passedItems) {
        this.itemListRoom.add(passedItems);
    }



    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public String getItems() {

        if (itemListRoom.isEmpty()) {
            return "There are no items in this room";
        } else {
            StringBuilder buildingString = new StringBuilder();
            buildingString.append("This room contains: ");
            buildingString.append(itemListRoom.toString());
            return buildingString.toString();
        }
    }


    public ArrayList<Items> getItemsInRoom() {
        return itemListRoom;
    }

    //OBS: NEXT TWO METHODS ARE OVERLOADED.
    public void updateItemList(Items passedItem) {
        itemListRoom.add(passedItem);
    }

    public void updateItemList(ArrayList<Items> passedItem) {
        itemListRoom = passedItem;
    }


    public boolean roomCheck(String sendText) {
        boolean myBool = false;
        switch (sendText) {
            case "east":
            case "go east":
                if (this.east == null) {
                    myBool = false;
                } else if (this.east != null) {
                    myBool = true;
                }
                break;

            case "west":
            case "go west":
                if (this.west == null) {
                    myBool = false;
                } else if (this.west != null) {
                    myBool = true;
                }
                break;


            case "south":
            case "go south":
                if (this.south == null) {
                    myBool = false;
                } else if (this.south != null) {
                    myBool = true;
                }
                break;


            case "north":
            case "go north":
                if (this.north == null) {
                    myBool = false;
                } else if (this.north != null) {
                    myBool = true;
                }
                break;
        }
        return myBool;

    }


    public Room moveRoom(String sendText) {
        Room sendRoom = null;
        switch (sendText) {
            case "east":
            case "go east":
                sendRoom = this.east;
                break;

            case "west":
            case "go west":
                sendRoom = this.west;
                break;

            case "south":
            case "go south":
                sendRoom = this.south;
                break;

            case "north":
            case "go north":
                sendRoom = this.north;
                break;
        }
        return sendRoom;
    }


    public void addRoomEnemy(Enemy passedEnemy){
        this.roomEnemies.add(passedEnemy);
    }



}
