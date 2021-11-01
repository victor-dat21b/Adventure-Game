public class Adventure {
    private Map myMap;
    private Player myPlayer;

    public Adventure() {
        this.myMap = new Map();
        this.myPlayer = new Player(myMap.returnStartRoom());

    }


    public static void main(String[] args) {
        UserInterface myUserInterface = new UserInterface();
        myUserInterface.startGame();
    }


    public boolean tryToMoveRoom(String sendText) {
        return myMap.roomCheck(sendText, myPlayer.getCurrentRoom());
    }


    public void moveRoom(String sendText) {
        myPlayer.moveRoom(sendText);

    }

    public String roomInformation() {
        return myMap.roomInfo(myPlayer.getCurrentRoom());
    }

    public String getStringInventory() {
        return myPlayer.getPlayerInventoryString();
    }

    public boolean inventoryStatus() {
        return myPlayer.getStorageStatus();
    }

    public boolean roomItemsBool() {
        return myMap.roomItemsBool(myPlayer.getCurrentRoom());
    }

    public boolean tryToTakeItem(String sendText) {
        return myPlayer.tryToTakeItems(sendText);
    }

    public boolean dropItems(String sendText) {
        return myPlayer.dropItem(sendText);
    }

    public int getPlayerHealth() {
        return myPlayer.getPlayerHealth();
    }

    public void setPlayerHealth(int updateHealth) {
        myPlayer.addPlayerHealth(updateHealth);
    }

    public boolean lookForFood(String sendText) {
        return myPlayer.lookForFood(sendText);
    }

    public boolean eatFood(String sendText) {
        Food eatenFood = myPlayer.eatFood(sendText);
        myPlayer.addPlayerHealth(eatenFood.getHealthPoints());
        boolean boolFood = false;
        if (eatenFood.getHealthPoints() > 0) {
            boolFood = true;
        } else if (eatenFood.getHealthPoints() < 0) {
            boolFood = false;
        }
        return boolFood;
    }


    public boolean weaponEquipped() {
        return myPlayer.isWeaponEquipped();
    }


    public boolean equipWeapon(String sendText) {
        return myPlayer.equipWeapon(sendText);
    }

    public void unequipWeapon() {
        myPlayer.unequipWeapon();
    }


    public boolean checkForEnemy() {
        return myPlayer.lookForForEnemy();

    }

    public String getStringEnemy() {
        return myMap.getStringEnemy(myPlayer.getCurrentRoom());
    }


    public Weapon getPlayerWeapon() {
        return myPlayer.getPlayerWeapon();
    }

    public boolean attackEnemy() {
        return myPlayer.attackEnemy();
    }

    public int getPlayerDamage(){
    return myPlayer.getPlayerDamage();
    }


    public int getEnemyHealth(){
    return myMap.getEnemyHealth(myPlayer.getCurrentRoom());
    }

    public void removeEnemyFromRoom(){
        myMap.removeEnemyFromRoom(myPlayer.getCurrentRoom());
    }


    public boolean doesEnemyHaveWeapon(){
        return myMap.doesEnemyHaveWeapon(myPlayer.getCurrentRoom());
    }

    public void dropEnemyWeapon(){
        myMap.dropEnemyWeapon(myPlayer.getCurrentRoom());
    }

    public String getFightStatus(){
        StringBuilder buildingString = new StringBuilder();
        if(weaponEquipped()) {
            buildingString.append("You have a " + getPlayerWeapon() + " equipped.");
        }else {
            buildingString.append("You have no weapon equipped and are fighting with your fists.");
        }
        buildingString.append("You have " + getPlayerHealth() + " health.");
        buildingString.append(System.getProperty("line.separator"));
        buildingString.append("Enemy has " + getEnemyHealth() + " left.");
        return buildingString.toString();
    }

    public void playerGetsHit(){
        int damage = myMap.getEnemyAttackDamage(myPlayer.getCurrentRoom());
        myPlayer.subtractPlayerHealth(damage);
    }



    }


















