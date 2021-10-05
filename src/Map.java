public class Map {

    public static Room[] mapCreationArray() {
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


        room1.setFieldSouth(room4);
        room1.setFieldEast(room2);
        room2.setFieldEast(room3);
        room3.setFieldSouth(room6);
        room4.setFieldSouth(room7);
        room5.setFieldSouth(room8);
        room6.setFieldSouth(room9);
        room7.setFieldEast(room8);
        room8.setFieldEast(room9);

        return new Room[]{room1, room2, room3, room4, room5, room6, room7, room8, room9};
    }



    }



