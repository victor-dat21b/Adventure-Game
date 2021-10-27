import java.util.ArrayList;
import java.util.Scanner;
public class Adventure {
    private Map myMap;
    private Player myPlayer;

    public Adventure(){
       this.myMap = new Map();
       this.myPlayer = new Player(myMap.returnStartRoom());

    }




    public boolean tryToMoveRoom(String sendText) {
    return myPlayer.roomCheck(sendText);
    }


    public void moveRoom(String sendText){
        myPlayer.setPlayerCurrentRoom(sendText);

    }

    public String infoWhenPlayerMoved(){
        return this.myPlayer.roomInfo();
    }

    public String getStringInventory(){
        return myPlayer.getPlayerInventoryString();
    }

    public boolean inventoryStatus(){
        return myPlayer.inventoryStorageStatus();
    }


}


















