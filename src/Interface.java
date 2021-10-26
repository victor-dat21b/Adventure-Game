public class Interface {


    public void userOutput (int chooseOutput){ //Static text
        switch (chooseOutput){
            case 1:
                System.out.println("You were out hiking with some friends, when you suddenly fell down a hole.");
                System.out.println("You can see that north and west is blocked from big rocks laying on the ground.");
                System.out.println("South and east seems clear!");
                break;
            case 2:
                System.out.println("What do you wish to do?");
                break;
            case 3:
                System.out.println("There is not a path here. Try another way");
                break;
            case 4:
                System.out.println("You exited the game.");
                break;
            case 5:
                System.out.println("Type go east, go north, go west, go south to " +
                        "move around the map.");
                System.out.println("Type exit to quit the game. Type look to get " +
                        "a description of the room. Type help for help.");
                System.out.println("Use the word -take- followed by the item you wish to take." +
                        "Example: take lamp.");
                break;
            case 6:
                System.out.println("There is nothing in your inventory.");


        }



    }

    public void dynamicOutput(String textSend, int sendInt){
        switch(sendInt){
            case 1:
                System.out.println("You went to " + textSend + ".");
                break;
            case 2:
                System.out.println("You are in " + textSend);
                break;
            case 3:
                System.out.println(("There is no " + textSend + " here."));

                break;
            case 4:
                System.out.println(textSend + " added to inventory!");

                break;
            case 5:
                System.out.println("There is no " + textSend + " in your inventory");
                break;

            case 6:
                System.out.println(textSend + " removed from inventory and dropped on the ground.");
                break;
            case 7:
                System.out.println("Your inventory contains: " + textSend);

        }
    }

    public void passOutput (String passedOutput){
        System.out.println(passedOutput);
    }
}