public class Adventure {
    private Map myMap;
    private Player myPlayer;

    public Adventure(){
       this.myMap = new Map();
       this.myPlayer = new Player(myMap.returnStartRoom());

    }



    public static void main(String[] args) {
        UserInterface myUserInterface = new UserInterface();
        myUserInterface.startGame();
    }





    public boolean tryToMoveRoom(String sendText) {
    return myPlayer.roomCheck(sendText);
    }


    public void moveRoom(String sendText){
        myPlayer.moveRoom(sendText);

    }

    public String roomInformation(){
        return this.myPlayer.roomInfo();
    }

    public String getStringInventory(){
        return myPlayer.getPlayerInventoryString();
    }

    public boolean inventoryStatus(){
        return myPlayer.inventoryStorageStatus();
    }

    public boolean roomItemsBool(){
        return myPlayer.roomItemsBool();
    }

    public boolean tryToTakeItem(String sendText){
        return myPlayer.tryToTakeItems(sendText);
    }

    public boolean dropItems(String sendText){
        return myPlayer.dropItem(sendText);
    }


}


















