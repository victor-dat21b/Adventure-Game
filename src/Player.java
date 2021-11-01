import java.util.ArrayList;

public class Player {
    private Room currentRoom;
    private ArrayList<Items> playerInventory = new ArrayList<>();
    private int health;
    private String[] arrOfStr;
    private Weapon playerWeapon = null;
    private int fistDamage;

    public Player(Room setCurrentRoom) {
        this.currentRoom = setCurrentRoom;
        this.health = 100;
        this.fistDamage = 5;
    }


    public void moveRoom(String sendText) {
        this.currentRoom = this.currentRoom.moveRoom(sendText);

    }

    public Room getCurrentRoom(){
        return currentRoom;
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
        if (this.playerInventory.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public String getPlayerInventoryString() {
        return playerInventory.toString();
    }





    // Taking item from the currentroom object, adds it to playerinventory and updates the new room itemlist.
    //OBS: The thing that is being looked for is searched using the passed string by splitting it!!!
    public boolean tryToTakeItems(String sendText) {
        this.arrOfStr = sendText.split(" ");
        ArrayList<Items> currentList = this.currentRoom.getItemsInRoom(); //Måske vil den ikke iterere over en liste fordi jeg importere den.
        ArrayList<Items> toRemove = new ArrayList<>();
        for (Items str : currentList) {
            if (str.getName().equalsIgnoreCase(arrOfStr[1])) {
                toRemove.add(str);
                break;
            }
        }
        if (toRemove.isEmpty()) {
            return false;
        } else {
            setPlayerInventory(toRemove.get(0));
            currentList.removeAll(toRemove);
            this.currentRoom.updateItemList(currentList);
            return true;
        }

    }

    //FLYT TIL PLAYER
    public boolean dropItem(String sendText) {
        this.arrOfStr = sendText.split(" ");
        ArrayList<Items> currentList = getPlayerInventory();
        ArrayList<Items> toRemove = new ArrayList<>();
        for (Items str : currentList) {
            if (str.getName().equalsIgnoreCase(arrOfStr[1])) {
                toRemove.add(str);
                break;
            }
        }
        if (toRemove.isEmpty()) {
            return false;
        } else {
            this.currentRoom.updateItemList(toRemove.get(0));
            currentList.removeAll(toRemove);
            setPlayerInventory(currentList);
        }
        return true;


    }




    public void setPlayerHealth(int updateHealth) {
        this.health = Math.addExact(this.health, updateHealth);
    }

    public int getPlayerHealth() {
        return this.health;
    }

    public boolean lookForFood(String sendText) {
        boolean boolReturn = false;
        this.arrOfStr = sendText.split(" ");
        for (Items i : getPlayerInventory()) {
            if (i.getName().equalsIgnoreCase(arrOfStr[1])) {
                boolReturn = true;
                break;
            }
        }
        for (Items i : this.currentRoom.getItemsInRoom()) {
            if (i.getName().equalsIgnoreCase(arrOfStr[1])) {
                boolReturn = true;
                break;
            }
        }
        return boolReturn;
    }


    public Food eatFood(String sendText) {
        Food sendFood = null;
        this.arrOfStr = sendText.split(" ");
        ArrayList<Items> currentList = this.currentRoom.getItemsInRoom();
        ArrayList<Items> toRemove = new ArrayList<>();
        for (Items str : currentList) {
            if (str.getName().equalsIgnoreCase(arrOfStr[1])) {
                toRemove.add(str);
                break;
            }
        }
        if (toRemove.isEmpty()) {
            ArrayList<Items> currentListSecond = getPlayerInventory();
            ArrayList<Items> toRemoveSecond = new ArrayList<>();
            for (Items str : currentListSecond) {
                if (str.getName().equalsIgnoreCase(arrOfStr[1])) {
                    toRemoveSecond.add(str);
                    break;
                }
            } if (!toRemoveSecond.isEmpty()){
                sendFood = (Food) toRemoveSecond.get(0);
                currentListSecond.removeAll(toRemoveSecond);
                setPlayerInventory(currentListSecond);
            }
        } else if(!toRemove.isEmpty()){
            sendFood = (Food) toRemove.get(0);
            currentList.removeAll(toRemove);
            this.currentRoom.updateItemList(currentList);
        }
        return sendFood;
        }



    public boolean equipWeapon(String sendText) {
        boolean myBool = false;
        this.arrOfStr = sendText.split(" ");
        ArrayList<Items> currentList = this.currentRoom.getItemsInRoom();
        ArrayList<Items> toRemove = new ArrayList<>();
        for (Items str : currentList) {
            if (str.getName().equalsIgnoreCase(arrOfStr[1])) {
                toRemove.add(str);
                break;
            }
        }
        if (toRemove.isEmpty()) {
            ArrayList<Items> currentListSecond = getPlayerInventory();
            ArrayList<Items> toRemoveSecond = new ArrayList<>();
            for (Items str : currentListSecond) {
                if (str.getName().equalsIgnoreCase(arrOfStr[1])) {
                    toRemoveSecond.add(str);
                    break;
                }
            } if (!toRemoveSecond.isEmpty()){
                myBool = true;
                this.playerWeapon = (Weapon) toRemoveSecond.get(0);
                currentListSecond.removeAll(toRemoveSecond);
                setPlayerInventory(currentListSecond);
            }
        } else if(!toRemove.isEmpty()){
            myBool = true;
            this.playerWeapon = (Weapon) toRemove.get(0);
            currentList.removeAll(toRemove);
            this.currentRoom.updateItemList(currentList);
        }
        return myBool;
    }


    public void unequipWeapon(){
        this.playerInventory.add(this.playerWeapon);
        this.playerWeapon = null;
    }

    public boolean lookForForEnemy(){
        if (currentRoom.getRoomEnemy() == null){
            return false;
        } else{
            return true;
        }

    }

    public boolean isWeaponEquipped(){
        if(this.playerWeapon == null){
            return false;
        } else{
            return true;
        }
    }

    public Weapon getPlayerWeapon(){
        return this.playerWeapon;
    }

    public boolean attackEnemy(){
        boolean myBool = false;
        if(this.playerWeapon == null){
            currentRoom.attackRoomEnemy(this.fistDamage);
            myBool = false;
        } else{
            currentRoom.attackRoomEnemy(this.playerWeapon.getWeaponDamage());
            myBool = true;
        }
        return myBool;
    }


    public int getPlayerDamage(){
        if(this.playerWeapon == null){
            return this.fistDamage;
        }else{
            return this.playerWeapon.getWeaponDamage();
        }
    }

    public int getEnemyHealth(){
        return currentRoom.getEnemyHealth();
    }


}





