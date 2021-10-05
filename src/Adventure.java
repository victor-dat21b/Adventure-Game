import java.util.Scanner;
public class Adventure {


    public static void main(String[] args) {
        boolean gameFlag = true;
        Room[] currentArray = Map.mapCreationArray();
        Room currentRoom = currentArray[0];
        Scanner in = new Scanner(System.in);
        System.out.println("You were out hiking with some friends, when you suddenly fell down a hole.");
        while (gameFlag) {
            System.out.println("What do you wish to do?");
            String inputFromTheUser = in.nextLine();
            if (inputFromTheUser.equals("east") || (inputFromTheUser.equals("go east"))){
                currentRoom = Player.eastRoomCheck(currentRoom);

            } else if (inputFromTheUser.equals("west")|| (inputFromTheUser.equals("go west"))){
                currentRoom = Player.westRoomCheck(currentRoom);

            }else if (inputFromTheUser.equals("south")|| (inputFromTheUser.equals("go south"))){
                currentRoom = Player.southRoomCheck(currentRoom);

            }else if (inputFromTheUser.equals("north")|| (inputFromTheUser.equals("go north"))){
                currentRoom = Player.northRoomCheck(currentRoom);

            }else if (inputFromTheUser.equals("exit")){
                gameFlag = false;
                System.out.println("You exited the game.");

            }else if (inputFromTheUser.equals("look")){
                System.out.println("You are in " + currentRoom.getRoom());
                System.out.println(currentRoom.getDescription());

            }else if (inputFromTheUser.equals("help")){
                    System.out.println("Type go east, go north, go west, go south to " +
                            "move around the map.");
                    System.out.println("Type exit to quit the game. Type look to get " +
                            "a description of the room. Type help for help.");

            }
        }
    }

}




