import java.util.Scanner;
public class UserInterface {



    public void startGame() {
        Scanner in = new Scanner(System.in);
        Adventure myAdventure = new Adventure();
        System.out.println("You were out hiking with some friends, when you suddenly fell down a hole.");
        System.out.println("You can see that north and west is blocked from big rocks laying on the ground.");
        System.out.println("South and east seems clear!");
        boolean gameFlag = true;
        while (gameFlag) {
            System.out.println("What do you wish to do?");
            String inputFromTheUser = in.nextLine();
            if (inputFromTheUser.equals("east") || (inputFromTheUser.equals("go east")) || (inputFromTheUser.equals("west")
                    || (inputFromTheUser.equals("go west"))) || (inputFromTheUser.equals("south") || (inputFromTheUser.equals("go south"))
                    || (inputFromTheUser.equals("north") || (inputFromTheUser.equals("go north"))))) {
                if (myAdventure.tryToMoveRoom(inputFromTheUser)) {
                    myAdventure.moveRoom(inputFromTheUser);
                    System.out.println("You went to " + myAdventure.roomInformation());

                } else {
                    System.out.println("There is not a path here. Try to go another way");
                }


            } else if (inputFromTheUser.equals("exit")) {
                gameFlag = false;
                System.out.println("You exited the game.");

            } else if (inputFromTheUser.equals("look")) {
                System.out.println(myAdventure.roomInformation());


            } else if (inputFromTheUser.equals("help")) {
                System.out.println("Type go east, go north, go west, go south to " +
                        "move around the map.");
                System.out.println("Type exit to quit the game. Type look to get " +
                        "a description of the room. Type help for help.");
                System.out.println("Use the word -take- followed by the item you wish to take." +
                        "Example: take lamp.");


            } else if (inputFromTheUser.equals("take lamp") || (inputFromTheUser.equals("take sword")) ||
                    (inputFromTheUser.equals("take statue")) || (inputFromTheUser.equals("take apple")) ||
                    (inputFromTheUser.equals("take potato")) || (inputFromTheUser.equals("take bow"))) {
                String[] arrOfStr = inputFromTheUser.split(" ");
                if (!myAdventure.roomItemsBool()) {
                    System.out.println("There is nothing to take in the room.");
                } else if (!myAdventure.tryToTakeItem(inputFromTheUser)) {
                    System.out.println("Item could not be taken since its not in the room.");
                } else {
                    System.out.println(arrOfStr[1] + " taken from room and added to inventory!");
                }


            } else if (inputFromTheUser.equals("drop lamp") || (inputFromTheUser.equals("drop sword")) ||
                    (inputFromTheUser.equals("drop statue")) || (inputFromTheUser.equals("drop apple")) ||
                    (inputFromTheUser.equals("drop potato")) || (inputFromTheUser.equals("drop bow"))) {
                String[] arrOfStr = inputFromTheUser.split(" ");
                if (!myAdventure.dropItems(inputFromTheUser)) {
                    System.out.println(arrOfStr[1] + " is not in inventory and could not be dropped.");
                } else {
                    System.out.println(arrOfStr[1] + " dropped.");
                }


            } else if (inputFromTheUser.equals("inventory")) {
                if (myAdventure.inventoryStatus()) {
                    System.out.println("In your inventory are: " + myAdventure.getStringInventory());
                } else {
                    System.out.println("There is nothing in your inventory");
                }

            } else if (inputFromTheUser.equals("health")) {
                int health = myAdventure.getPlayerHealth();
                if (health > 50) {
                    System.out.println("You have " + health + " in health. You seem in good shape to fight.");
                } else if (health <= 50) {
                    System.out.println("You have " + health + " in health. You have less than half in health and probably should´nt fight right now.");
                }


            } else if ((inputFromTheUser.equals("eat apple") || (inputFromTheUser.equals("eat potato")))) {
                String[] arrOfStr = inputFromTheUser.split(" ");
                if (myAdventure.lookForFood(inputFromTheUser)) {
                    boolean myBool = myAdventure.eatFood(inputFromTheUser);
                    if (myBool) {
                        System.out.println("Food eaten! It tasted great and your health increased!");
                    } else if (!myBool) {
                        System.out.println("The food was bad and you lost health!");
                    }
                } else {
                    System.out.println(arrOfStr[1] + " is neither in your inventory or in room and therefore cannot be eaten.");
                }


            } else if (inputFromTheUser.equals("equip bow") || (inputFromTheUser.equals("equip sword"))) {
                if (myAdventure.weaponEquipped()) {
                    System.out.println("You already have a weapon equipped. Unequip your current weapon to equip a new one. To unequip just write the command: unequip weapon");
                } else if (myAdventure.equipWeapon(inputFromTheUser)) {
                    System.out.println("Weapon equipped!");
                } else {
                    System.out.println("Could´nt find weapon in inventory or in the room.");
                }

            } else if (inputFromTheUser.equals("unequip weapon")) {
                if (myAdventure.weaponEquipped()) {
                    myAdventure.unequipWeapon();
                    System.out.println("Weapon unequipped and added to inventory!");

                } else{
                    System.out.println("You have no weapon equipped and therefore nothing to unequip.");
                }
            }



            else{
                System.out.println("Error, wrong input, try again.");
            }
    }
    }
}
