public class Adventure {


    public static void main(String[] args) {
        Room room1 = new Room(null, "south", "east", null);
        Room room2 = new Room(null, null, "east", "west");
        Room room3 = new Room(null, "south", null, "west");
        Room room4 = new Room("north", "south", null, null);
        Room room5 = new Room(null, "south", null, null);
        Room room6 = new Room("north", "south", null, null);
        Room room7 = new Room("north", null, "east", null);
        Room room8 = new Room("north", null, "east", "west");
        Room room9 = new Room("north", null, null, "west");

    }

}

