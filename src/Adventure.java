import java.util.ArrayList;
import java.util.Scanner;
public class Adventure {
    private Interface myInterface = new Interface();


    public static void main(String[] args) {
        Adventure begin = new Adventure();
        begin.start();
    }


    public void start() {
        Scanner in = new Scanner(System.in);
        Map myMap = new Map();
        Room[] allRooms = myMap.mapCreationArray(); //Instanciate all our rooms and return list.
        Player myPlayer = new Player(allRooms[0]); //Sets the players current room.
        boolean gameFlag = true;
        myInterface.userOutput(1);
        myInterface.passOutput(allRooms[0].getDescription());
        myInterface.passOutput(allRooms[0].getItems());

        while (gameFlag) {
            Room currentRoom = myPlayer.getRoom(); //Added for readability when used in code
            myInterface.userOutput(2);
            String inputFromTheUser = in.nextLine();
            if (inputFromTheUser.equals("east") || (inputFromTheUser.equals("go east")) || (inputFromTheUser.equals("west")
                    || (inputFromTheUser.equals("go west"))) || (inputFromTheUser.equals("south") || (inputFromTheUser.equals("go south"))
                    || (inputFromTheUser.equals("north") || (inputFromTheUser.equals("go north"))))) {

                myPlayer.setRoom((roomCheck(currentRoom, inputFromTheUser)));


            } else if (inputFromTheUser.equals("exit")) {
                gameFlag = false;
                myInterface.userOutput(4);

            } else if (inputFromTheUser.equals("look")) {
                myInterface.dynamicOutput(currentRoom.getName(), 2);
                myInterface.passOutput(currentRoom.getItems());

            } else if (inputFromTheUser.equals("help")) {
                myInterface.userOutput(5);

            } else if (inputFromTheUser.equals("take lamp") || (inputFromTheUser.equals("take sword")) ||
                    (inputFromTheUser.equals("take statue"))) {
                tryToTakeItems(inputFromTheUser, currentRoom, myPlayer);


            } else if (inputFromTheUser.equals("drop lamp") || (inputFromTheUser.equals("drop sword")) ||
                    (inputFromTheUser.equals("drop statue"))) {
                dropItem(inputFromTheUser, currentRoom, myPlayer);

            } else if (inputFromTheUser.equals("inventory")) {
                if (myPlayer.getPlayerInventory().isEmpty()) {
                    myInterface.userOutput(6);
                }else {
                    myInterface.dynamicOutput(myPlayer.getPlayerInventoryString(), 7);
                }

            }
        }


    }


    public Room roomCheck(Room currentRoom, String sendText) {
        switch (sendText) {
            case "east":
            case "go east":
                if (currentRoom.getFieldEast() == null) {
                    myInterface.userOutput(3);
                } else if (currentRoom.getFieldEast() != null) {
                    currentRoom = currentRoom.getFieldEast();
                    myInterface.dynamicOutput(currentRoom.getName(), 1);
                    myInterface.passOutput(currentRoom.getDescription());
                    myInterface.passOutput(currentRoom.getItems());

                }
                break;


            case "west":
            case "go west":
                if (currentRoom.getFieldWest() == null) {
                    myInterface.userOutput(3);
                } else if (currentRoom.getFieldWest() != null) {
                    currentRoom = currentRoom.getFieldWest();
                    myInterface.dynamicOutput(currentRoom.getName(), 1);
                    myInterface.passOutput(currentRoom.getDescription());
                    myInterface.passOutput(currentRoom.getItems());
                }

                break;

            case "south":
            case "go south":
                if (currentRoom.getFieldSouth() == null) {
                    myInterface.userOutput(3);
                } else if (currentRoom.getFieldSouth() != null) {
                    currentRoom = currentRoom.getFieldSouth();
                    myInterface.dynamicOutput(currentRoom.getName(), 1);
                    myInterface.passOutput(currentRoom.getDescription());
                    myInterface.passOutput(currentRoom.getItems());
                }
                break;

            case "north":
            case "go north":
                if (currentRoom.getFieldNorth() == null) {
                    myInterface.userOutput(3);
                } else if (currentRoom.getFieldNorth() != null) {
                    currentRoom = currentRoom.getFieldNorth();
                    myInterface.dynamicOutput(currentRoom.getName(), 1);
                    myInterface.passOutput(currentRoom.getDescription());
                    myInterface.passOutput(currentRoom.getItems());
                }
                break;
        }
        return currentRoom;

    }


    // Taking item from the currentroom object, adds it to playerinventory and updates the new room itemlist.
    //OBS: The thing that is being looked for is searched using the passed string by splitting it!!!
    public void tryToTakeItems(String sendText, Room currentRoom, Player myPlayer) {
        String[] arrOfStr = sendText.split(" ");
        ArrayList<Items> currentList = currentRoom.getItemsInRoom();
        ArrayList<Items> toRemove = new ArrayList<>();
        for (Items str : currentList) {
            if (str.getName().equalsIgnoreCase(arrOfStr[1])) {
                toRemove.add(str);
                break;
            }
        }
        if (toRemove.isEmpty()) {
            myInterface.dynamicOutput(arrOfStr[1], 3);
        } else {
            myPlayer.setPlayerInventory(toRemove.get(0));
            currentList.removeAll(toRemove);
            currentRoom.updateItemList(currentList);
            myInterface.dynamicOutput(arrOfStr[1], 4);
        }

    }


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
            myInterface.dynamicOutput(arrOfStr[1], 5);
        } else {
            currentRoom.updateItemList(toRemove.get(0));
            currentList.removeAll(toRemove);
            myPlayer.setPlayerInventory(currentList);
            myInterface.dynamicOutput(arrOfStr[1], 6);
        }


    }
}


















