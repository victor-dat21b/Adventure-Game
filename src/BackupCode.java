/*
import java.util.Scanner;

public class TestForaAdventure {
    /*
}
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        Room room1 = new Room("Room 1", "In the ceiling above " +
                "you see the hole in which " +
                "you fell down. Nothing else is in the cave");
        Room room2 = new Room("Room 2", "You feel something slithering " +
                "along in the dark " +
                "and notices that the room is full of snakes.");
        Room room3 = new Room("Room 3", "The walls of the cave is filled with skulls " +
                "and unrecognisable scriptures. ");
        Room room4 = new Room("Room 4", "Knee high water.");
        Room room5 = new Room("Room 5", "Bats circling a golden statue");
        Room room6 = new Room("Room 6", "Spiders crawling around.");
        Room room7 = new Room("Room 7", "Humid");
        Room room8 = new Room("Room 8", "Rats");
        Room room9 = new Room("Room 9", "Cold");

/*
        boolean gameFlag = true;
        Room currentRoom = room1;
        Scanner in = new Scanner(System.in);
        System.out.println(room1.getFieldEast() + "+" + room2.getFieldWest());
        room1.setEastAndWest(room2);
        System.out.println(room1.getFieldEast() + "+" + room2.getFieldWest());



 */
        /*

        Room room1 = new Room("Room 1", "In the ceiling above you see the hole in which " +
                "you fell down. Nothing else is in the cave");
        Room room2 = new Room("Room 2", "You feel something slithering along in the dark " +
                "and notices that the room is full of snakes.");
        Room room3 = new Room("Room 3", "The walls of the cave is filled with skulls " +
                "and unrecognisable scriptures. ");
        Room room4 = new Room("Room 4", "Knee high water.");
        Room room5 = new Room("Room 5", "Bats circling a golden statue");
        Room room6 = new Room("Room 6", "Spiders crawling around.");
        Room room7 = new Room("Room 7", "Humid");
        Room room8 = new Room("Room 8", "Rats");
        Room room9 = new Room("Room 9", "Cold");

        room1.setFieldSouth(room4);
        room1.setFieldEast(room2);
        room2.setFieldEast(room3);
        room2.setFieldWestRoom(room1);
        room3.setFieldSouth(room6);
        room3.setFieldWestRoom(room2);
        room4.setFieldNorth(room1);
        room4.setFieldSouth(room7);
        room5.setFieldSouth(room8);
        room6.setFieldNorth(room3);
        room6.setFieldSouth(room9);
        room7.setFieldNorth(room4);
        room7.setFieldEast(room8);
        room8.setFieldNorth(room5);
        room8.setFieldEast(room9);
        room8.setFieldWestRoom(room7);
        room9.setFieldNorth(room6);
        room9.setFieldWestRoom(room8);


        boolean gameFlag = true;
        Room currentRoom = room1;
        while (gameFlag) {
            System.out.println("Insert string");
            String userInput = in.nextLine();
            if (userInput.equals("east")) {
                if (currentRoom.getFieldEast() == null) {
                    System.out.println("There is not a path here. Try another way");
                } else if (currentRoom.getFieldEast() != null) {
                    currentRoom = currentRoom.getFieldEast();
                    System.out.println(currentRoom);
                } else {
                    System.out.println("Error in choosing room after validating user input");
                }

            } else if (userInput.equals("west")) {
                if (currentRoom.getFieldWest() == null) {
                    System.out.println("There is not a path here. Try another way");
                    System.out.println(currentRoom);
                } else if (currentRoom.getFieldWest() != null) {
                    currentRoom = currentRoom.getFieldWest();
                } else {
                    System.out.println("Error in choosing room after validating user input");
                }


            } else if (userInput.equals("south")) {
                if (currentRoom.getFieldSouth() == null) {
                    System.out.println("There is not a path here. Try another way");
                } else if (currentRoom.getFieldSouth() != null) {
                    currentRoom = currentRoom.getFieldSouth();
                    System.out.println(currentRoom.toString());
                    System.out.println("When to new room");
                } else {
                    System.out.println("Error in choosing room after validating user input");
                }

            } else if (userInput.equals("north")) {
                if (currentRoom.getFieldNorth() == null) {
                    System.out.println("There is not a path here. Try another way");
                    System.out.println(currentRoom.toString());
                } else if (currentRoom.getFieldNorth() != null) {
                    currentRoom = currentRoom.getFieldNorth();
                } else {
                    System.out.println("Error in choosing room after validating user input");
                }

            } else if (userInput.equals("exit")) {
                gameFlag = false;
            } else if (userInput.equals("print")) {
                System.out.println(currentRoom.getRoom());
            } else {
                System.out.println("Couldnt find e, w, s, n, exit or print");
            }


        }


    }




    public Room roomCheck(Room currentRoom, String sendText) {
        switch (sendText) {
            case "east":
            case "go east":
                if (currentRoom.getFieldEast() == null) {
                    myInterface.userOutput(3);
                    return currentRoom;
                } else if (currentRoom.getFieldEast() != null) {
                    currentRoom = currentRoom.getFieldEast();
                    myInterface.dynamicOutput(currentRoom.getName(), 1);
                    System.out.println(currentRoom.getDescription());
                    System.out.println(currentRoom.getItems());
                    return currentRoom;
                } else {
                    System.out.println("Error in choosing room after validating user input");
                    return currentRoom;
                }
                break;


            case "west":
            case "go west":
                if (currentRoom.getFieldWest() == null) {
                    myInterface.userOutput(3);
                    return currentRoom;
                } else if (currentRoom.getFieldWest() != null) {
                    currentRoom = currentRoom.getFieldWest();
                    System.out.println("You went to " + currentRoom.getName() + ".");
                    System.out.println(currentRoom.getDescription());
                    System.out.println(currentRoom.getItems());
                    return currentRoom;
                } else {
                    System.out.println("Error in choosing room after validating user input");
                    return currentRoom;
                }
                break;

            case "south":
            case "go south":
                if (currentRoom.getFieldSouth() == null) {
                    myInterface.userOutput(3);
                    return currentRoom;
                } else if (currentRoom.getFieldSouth() != null) {
                    currentRoom = currentRoom.getFieldSouth();
                    System.out.println("You went to " + currentRoom.getName() + ".");
                    System.out.println(currentRoom.getDescription());
                    System.out.println(currentRoom.getItems());
                    return currentRoom;
                } else {
                    System.out.println("Error in choosing room after validating user input");
                    return currentRoom;
                }
                break;

            case "north":
            case "go north":
                if (currentRoom.getFieldNorth() == null) {
                    myInterface.userOutput(3);
                    return currentRoom;
                } else if (currentRoom.getFieldNorth() != null) {
                    currentRoom = currentRoom.getFieldNorth();
                    System.out.println("You went to " + currentRoom.getName() + ".");
                    System.out.println(currentRoom.getDescription());
                    System.out.println(currentRoom.getItems());
                    return currentRoom;
                } else {
                    System.out.println("Error in choosing room after validating user input");
                    return currentRoom;
                }
                break;

        }

    }



        public Room southRoomCheck(Room currentRoom) {
            if (currentRoom.getFieldSouth() == null) {
                myInterface.userOutput(3);
                return currentRoom;
            } else if (currentRoom.getFieldSouth() != null) {
                currentRoom = currentRoom.getFieldSouth();
                System.out.println("You went to " + currentRoom.getName() + ".");
                System.out.println(currentRoom.getDescription());
                System.out.println(currentRoom.getItems());
                return currentRoom;
            } else {
                System.out.println("Error in choosing room after validating user input");
                return currentRoom;
            }
        }

        public Room eastRoomCheck(Room currentRoom) {
            if (currentRoom.getFieldEast() == null) {
                myInterface.userOutput(3);
                return currentRoom;
            } else if (currentRoom.getFieldEast() != null) {
                currentRoom = currentRoom.getFieldEast();
                myInterface.dynamicOutput(currentRoom.getName(), 1);
                System.out.println(currentRoom.getDescription());
                System.out.println(currentRoom.getItems());
                return currentRoom;
            } else {
                System.out.println("Error in choosing room after validating user input");
                return currentRoom;
            }
        }

        public Room westRoomCheck(Room currentRoom) {
            if (currentRoom.getFieldWest() == null) {
                myInterface.userOutput(3);
                return currentRoom;
            } else if (currentRoom.getFieldWest() != null) {
                currentRoom = currentRoom.getFieldWest();
                System.out.println("You went to " + currentRoom.getName() + ".");
                System.out.println(currentRoom.getDescription());
                System.out.println(currentRoom.getItems());
                return currentRoom;
            } else {
                System.out.println("Error in choosing room after validating user input");
                return currentRoom;
            }
        }

        public Room northRoomCheck(Room currentRoom) {
            if (currentRoom.getFieldNorth() == null) {
                myInterface.userOutput(3);
                return currentRoom;
            } else if (currentRoom.getFieldNorth() != null) {
                currentRoom = currentRoom.getFieldNorth();
                System.out.println("You went to " + currentRoom.getName() + ".");
                System.out.println(currentRoom.getDescription());
                System.out.println(currentRoom.getItems());
                return currentRoom;
            } else {
                System.out.println("Error in choosing room after validating user input");
                return currentRoom;
            }
        }
        /*
        }
      }

ArrayList<Items> currentList = currentRoom.getItemsInRoom();
        switch (sendText) {
            case "take lamp":
                ArrayList<Items> toRemove = new ArrayList<>();

                for (Items str : currentList) {
                    if (str.getName() == "Lamp") {
                        toRemove.add(str);
                        break;
                    }
                }
                if (toRemove.isEmpty()) {
                    System.out.println("There is no lamp here.");
                } else {
                    myPlayer.setPlayerInventory(toRemove.get(0));
                    currentList.removeAll(toRemove);
                    currentRoom.updateItemList(currentList);
                    System.out.println("Lamp added to inventory!");
                }
                break;
            case "take sword":
                toRemove = new ArrayList<>();
                for (Items str : currentList) {
                    if (str instanceof Sword) {
                        toRemove.add(str);
                        break;
                    }
                }
                if (toRemove.isEmpty()) {
                    System.out.println("There is no Sword here.");
                } else {
                    myPlayer.setPlayerInventory(toRemove.get(0));
                    currentList.removeAll(toRemove);
                    currentRoom.updateItemList(currentList);
                    System.out.println("Sword added to inventory!");
                }
                break;

            case "take statue":
                toRemove = new ArrayList<>();
                for (Items str : currentList) {
                    if (str instanceof Statue) {
                        toRemove.add(str);
                        break;
                    }
                }
                if (toRemove.isEmpty()) {
                    System.out.println("There is no Statue here.");
                } else {
                    myPlayer.setPlayerInventory(toRemove.get(0));
                    currentList.removeAll(toRemove);
                    currentRoom.updateItemList(currentList);
                    System.out.println("Statue added to inventory!");
                }
                break;
        }


public abstract class Items {
    private String name;

    public String getName(){
        return this.name;
    }

}

class Lamp extends Items{
    private String name;

    public Lamp(){
        this.name = "Lamp";
    }

    public String toString(){
        return name;
    }

    }


class Sword extends Items {
    private String name;

    public Sword() {
        this.name = "Sword";


    }
    public String toString() {
        return name;
    }

    public String getName(){
        return this.name;
    }

}
class Statue extends Items {
    private String name;

    public Statue() {
        this.name = "Statue";

    }
    public String toString() {
        return name;
    }
    public String getName(){
        return this.name;
    }
}


         */