public class Player {

    public static Room southRoomCheck(Room currentRoom){
        if (currentRoom.getFieldSouth() == null) {
            System.out.println("There is not a path here. Try another way");
            return currentRoom;
        } else if (currentRoom.getFieldSouth() != null) {
            currentRoom = currentRoom.getFieldSouth();
            System.out.println("You went to " + currentRoom.getRoom() + ".");
            System.out.println(currentRoom.getDescription());
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
            System.out.println("You went to " + currentRoom.getRoom() + ".");
            System.out.println(currentRoom.getDescription());
            return currentRoom;
        } else {
            System.out.println("Error in choosing room after validating user input");
            return currentRoom;
        }
    }
    public static Room westRoomCheck(Room currentRoom){
        if (currentRoom.getFieldWest() == null) {
            System.out.println("There is not a path here. Try another way");
            return currentRoom;
        } else if (currentRoom.getFieldWest() != null) {
            currentRoom = currentRoom.getFieldWest();
            System.out.println("You went to " + currentRoom.getRoom() + ".");
            System.out.println(currentRoom.getDescription());
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
            System.out.println("You went to " + currentRoom.getRoom() + ".");
            System.out.println(currentRoom.getDescription());
            return currentRoom;
        } else {
            System.out.println("Error in choosing room after validating user input");
            return currentRoom;
        }
    }
}
