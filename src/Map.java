public class Map {
private Room[] myRooms;


    //Game opretter et map der laver alle rooms. Game fortæller hvilket rum player skal befinde sig i.
    public Map() {
        //Pass arraylist of items to room
        Room room1 = new Room("Room 1", "In the ceiling above " +
                "you see the hole in which " +
                "you fell down.");
        Room room2 = new Room("Room 2", "You feel something slithering " +
                "along in the dark " +
                "and notices that the room is full of snakes.");
        Room room3 = new Room("Room 3", "The walls of the cave is filled with skulls " +
                "and unrecognisable scriptures. ");
        Room room4 = new Room("Room 4", "The room is filled with water. It goes all the way up to your knees." +
 "\\n Something is moving around your legs, but the water is cloudy and you cannot what it is.");
        Room room5 = new Room("Room 5", "Bats circling a golden statue");
        Room room6 = new Room("Room 6", "The room is filled with webs. Spiders are crawling everywhere.");
        Room room7 = new Room("Room 7", "It´s very humid in here. What is humid you ask?");
        Room room8 = new Room("Room 8", "In here, rats are scurrying about.");
        Room room9 = new Room("Room 9", "It´s oddly cold in here. Icicles are forming from the cave ceiling.");


        room1.setFieldSouth(room4);
        room1.setFieldEast(room2);
        room2.setFieldEast(room3);
        room3.setFieldSouth(room6);
        room4.setFieldSouth(room7);
        room5.setFieldSouth(room8);
        room6.setFieldSouth(room9);
        room7.setFieldEast(room8);
        room8.setFieldEast(room9);

        room2.setItemsListRoom(new Lamp("lamp"));
        room5.setItemsListRoom(new Statue("statue"));
        room9.setItemsListRoom(new Sword("sword"));


        myRooms = new Room[]{room1, room2, room3, room4, room5, room6, room7, room8, room9};
    }

    public Room returnStartRoom(){
        return myRooms[0];
    }




}






