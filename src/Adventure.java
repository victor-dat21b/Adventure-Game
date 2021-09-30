import java.util.Scanner;
public class Adventure {
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        boolean gameFlag = true;
        Room[] currentArray = arrayReturn();
        while (gameFlag) {
            String userInput = in.nextLine();

        }
    }





        public static void currentRoom () {
            //hvor vi nuværende befinder os. Bliver opdateret igennem objekt attributter.


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


        public static void validateUserInput(){

        }
        }



