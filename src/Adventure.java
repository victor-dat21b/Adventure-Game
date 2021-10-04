import java.util.Scanner;
public class Adventure {


    public static void main(String[] args) {
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
        Scanner in = new Scanner(System.in);
        System.out.println("You were out hiking with some friends, when you suddenly fell down a hole.");
        while (gameFlag) {
            System.out.println("What do you wish to do?");
            String inputFromTheUser = in.nextLine();
            switch (inputFromTheUser) {
                    case "east":
                        currentRoom = eastRoomCheck(currentRoom);
                        break;
                    case "west":
                        currentRoom = weastRoomCheck(currentRoom);

                        break;
                    case "south":
                        currentRoom = southRoomCheck(currentRoom);

                        break;
                    case "north":
                        currentRoom = northRoomCheck(currentRoom);
                        break;

                    case "exit":
                        gameFlag = false;
                        break;
                    case "look":
                        System.out.println(currentRoom.getDescription());
                        break;
                case "help":
                    System.out.println("Type go east, go north, go west, go south to " +
                            "move around the map.");
                    System.out.println("Type exit to quit the game. Type look to get " +
                            "a description of the room. Type help for help.");
                    break;

                    default:
                        System.out.println("Wrong input, please try again. Type help for commands.");
                        break;

            }
        }


/*



        }
        public static void look() {
            //  henter beskrivelse fra currentroom
        }


        public static Room[] arrayReturn(){
        Room room1 = new Room("Room 1");
        Room room2 = new Room("Room 2");
        Room room3 = new Room("Room 3");
        Room room4 = new Room("Room 4");
        Room room5 = new Room("Room 5");
        Room room6 = new Room("Room 6");
        Room room7 = new Room("Room 7");
        Room room8 = new Room("Room 8");
        Room room9 = new Room("Room 9");

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
            return new Room[]{room1, room2, room3, room4, room5, room6, room7, room8, room9};
            }


        public static String validateUserInput(){
            return in.nextLine();
        }

 */
    }

    public static Room southRoomCheck(Room currentRoom){
        if (currentRoom.getFieldSouth() == null) {
            System.out.println("There is not a path here. Try another way");
            return currentRoom;
        } else if (currentRoom.getFieldSouth() != null) {
            currentRoom = currentRoom.getFieldSouth();
            System.out.println("You went to room" + currentRoom.getRoom());
            return currentRoom;
        } else {
            System.out.println("Error in choosing room after validating user input");
            return currentRoom;
        }
    }
    public static Room eastRoomCheck(Room currentRoom){
        if (currentRoom.getFieldEast() == null) {
            System.out.println("There is not a path here. Try another way");
            return currentRoom;
        } else if (currentRoom.getFieldEast() != null) {
            currentRoom = currentRoom.getFieldEast();
            System.out.println("You went to room" + currentRoom.getRoom());
            return currentRoom;
        } else {
            System.out.println("Error in choosing room after validating user input");
            return currentRoom;
        }
    }
    public static Room weastRoomCheck(Room currentRoom){
        if (currentRoom.getFieldWest() == null) {
            System.out.println("There is not a path here. Try another way");
            return currentRoom;
        } else if (currentRoom.getFieldWest() != null) {
            currentRoom = currentRoom.getFieldWest();
            System.out.println("You went to room" + currentRoom.getRoom());
            return currentRoom;
        } else {
            System.out.println("Error in choosing room after validating user input");
            return currentRoom;
        }
    }
    public static Room northRoomCheck(Room currentRoom){
        if (currentRoom.getFieldNorth() == null) {
            System.out.println("There is not a path here. Try another way");
            return currentRoom;
        } else if (currentRoom.getFieldNorth() != null) {
            currentRoom = currentRoom.getFieldNorth();
            System.out.println("You went to room" + currentRoom.getRoom());
            return currentRoom;
        } else {
            System.out.println("Error in choosing room after validating user input");
            return currentRoom;
        }
    }
}




