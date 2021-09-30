public class Adventure {


    public static void main(String[] args) {
        Room room1 = new Room();
        Room room2 = new Room();
        Room room3 = new Room();
        Room room4 = new Room();
        Room room5 = new Room();
        Room room6 = new Room();
        Room room7 = new Room();
        Room room8 = new Room();
        Room room9 = new Room();

        room1.setFieldSouth(room4);; room1.setFieldEast(room2);
        room2.setFieldEast(room3); room2.setFieldWestRoom(room1);
        room3.setFieldSouth(room6); room3.setFieldWestRoom(room2);
        room4.setFieldNorth(room1); room4.setFieldSouth(room7);
        room5.setFieldSouth(room8);
        room6.setFieldNorth(room3); room6.setFieldSouth(room9);
        room7.setFieldNorth(room4); room7.setFieldEast(room8);
        room8.setFieldNorth(room5); room8.setFieldEast(room9); room8.setFieldWestRoom(room7);
        room9.setFieldNorth(room6); room9.setFieldWestRoom(room8);


        }









    }

/*


    public static void currentRoom(){
    hvor vi nuværende befinder os. Bliver opdateret igennem objekt attributter.



    }
    public static void look(){
        henter beskrivelse fra currentroom
    }
}



 */