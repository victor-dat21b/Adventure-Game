import java.util.ArrayList;

public class Player {
    private Room currentRoom;
    private ArrayList<Items> playerInventory = new ArrayList<>();


    public Player(Room setCurrentRoom) {
        this.currentRoom = setCurrentRoom;
    }



    public void setPlayerCurrentRoom(String sendText){
        switch (sendText) {
            case "east":
            case "go east":
                this.currentRoom = this.currentRoom.getFieldEast();
                break;

            case "west":
            case "go west":
                this.currentRoom = this.currentRoom.getFieldWest();
                break;

            case "south":
            case "go south":
                this.currentRoom = this.currentRoom.getFieldSouth();
                break;

            case "north":
            case "go north":
                this.currentRoom = this.currentRoom.getFieldNorth();
                break;
        }

    }

    public boolean roomCheck(String sendText) {
        boolean myBool = false;
        switch (sendText) {
            case "east":
            case "go east":
                if (this.currentRoom.getFieldEast() == null) {
                    myBool = false;
                } else if (this.currentRoom.getFieldEast() != null) {
                    myBool = true;
                }
                break;

            case "west":
            case "go west":
                if (this.currentRoom.getFieldWest() == null) {
                    myBool = false;
                } else if (this.currentRoom.getFieldWest() != null) {
                    myBool = true;
                }
                break;


            case "south":
            case "go south":
                if (this.currentRoom.getFieldSouth() == null) {
                    myBool = false;
                } else if (this.currentRoom.getFieldSouth() != null) {
                    myBool = true;
                }
                break;


            case "north":
            case "go north":
                if (this.currentRoom.getFieldNorth() == null) {
                    myBool = false;
                } else if (this.currentRoom.getFieldNorth() != null) {
                    myBool = true;
                }
                break;
        }
        return myBool;

    }
    public String roomInfo(){
        StringBuilder buildingString = new StringBuilder();
        buildingString.append(this.currentRoom.getName());
        buildingString.append(System.getProperty("line.separator"));
        buildingString.append(this.currentRoom.getDescription());
        buildingString.append(System.getProperty("line.separator"));
        buildingString.append(this.currentRoom.getItems());
        return buildingString.toString();
    }




    //OBS: NEXT TWO METHODS ARE OVERLOADED.
    public void setPlayerInventory(Items passedItem) {
        playerInventory.add(passedItem);
    }

    public void setPlayerInventory(ArrayList<Items> passedItem) {
        playerInventory = passedItem;
    }

    public ArrayList<Items> getPlayerInventory() {
        return playerInventory;
    }

    public boolean inventoryStorageStatus() {
        if (this.playerInventory.isEmpty()){
            return false;
        }else {
            return true;
        }
    }

    public String getPlayerInventoryString() {
        return playerInventory.toString();
    }






    //FLYT TIL PLAYER
    // Taking item from the currentroom object, adds it to playerinventory and updates the new room itemlist.
    //OBS: The thing that is being looked for is searched using the passed string by splitting it!!!
    public void tryToTakeItems(String sendText, Room currentRoom, Player myPlayer) {
        String[] arrOfStr = sendText.split(" ");
        ArrayList<Items> currentList = currentRoom.getItemsInRoom(); //Måske vil den ikke iterere over en liste fordi jeg importere den.
        ArrayList<Items> toRemove = new ArrayList<>();
        for (Items str : currentList) {
            if (str.getName().equalsIgnoreCase(arrOfStr[1])) {
                toRemove.add(str);
                break;
            }
        }
        if (toRemove.isEmpty()) {
            // myInterface.dynamicOutput(arrOfStr[1], 3);
        } else {
            myPlayer.setPlayerInventory(toRemove.get(0));
            currentList.removeAll(toRemove);
            currentRoom.updateItemList(currentList);
            // myInterface.dynamicOutput(arrOfStr[1], 4);
        }

    }

    //FLYT TIL PLAYER
    public void dropItem(String sendText, Room currentRoom, Player myPlayer) {
        String[] arrOfStr = sendText.split(" ");
        ArrayList<Items> currentList = myPlayer.getPlayerInventory();
        ArrayList<Items> toRemove = new ArrayList<>();
        for (Items str : currentList) {
            if (str.getName().equalsIgnoreCase(arrOfStr[1])) {
                toRemove.add(str);
                break;
            }
        }
        if (toRemove.isEmpty()) {
            //  myInterface.dynamicOutput(arrOfStr[1], 5);
        } else {
            currentRoom.updateItemList(toRemove.get(0));
            currentList.removeAll(toRemove);
            myPlayer.setPlayerInventory(currentList);
            //myInterface.dynamicOutput(arrOfStr[1], 6);
        }


    }





}
