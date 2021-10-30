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
    public int getPlayerHealth(){
        return myPlayer.getPlayerHealth();
    }
    public void setPlayerHealth(int updateHealth){
        myPlayer.setPlayerHealth(updateHealth);
    }

    public boolean lookForFood(String sendText){
        return myPlayer.lookForFood(sendText);
    }

    public boolean eatFood(String sendText){
        Food eatenFood = myPlayer.eatFood(sendText);
        myPlayer.setPlayerHealth(eatenFood.getHealthPoints());
        boolean boolFood = false;
        if(eatenFood.getHealthPoints() > 0){
            boolFood = true;
        }else if (eatenFood.getHealthPoints() < 0){
            boolFood = false;
        }
        return boolFood;
    }


}


















