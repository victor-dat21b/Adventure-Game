import java.util.ArrayList;

public class Player {
    private Room currentRoom;
    private ArrayList<Items> playerInventory = new ArrayList<>();


    public Player(Room setCurrentRoom) {
        this.currentRoom = setCurrentRoom;
    }



    public Room getRoom() {
        return this.currentRoom;
    }

    public void setRoom(Room passedRoom) {
        this.currentRoom = passedRoom;
    }

    public String getPlayerInventoryString(){
        return playerInventory.toString();
        /*
        StringBuilder buildingString = new StringBuilder();
        for (Items i: playerInventory){
            buildingString.append("a ");
            buildingString.append(i);
            buildingString.append(", ");
        }
        return buildingString.toString();

         */
    }

//OBS: NEXT TWO METHODS ARE OVERLOADED.
    public void setPlayerInventory(Items passedItem){
        playerInventory.add(passedItem);
    }

    public void setPlayerInventory(ArrayList<Items> passedItem){
        playerInventory = passedItem;
    }

    public ArrayList<Items> getPlayerInventory(){
        return playerInventory;
    }


}
