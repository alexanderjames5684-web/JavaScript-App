//Import libraries
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Class Name Start******************************************************
public class InventoryApp{
    private List<TradingCard> inventoryList = new ArrayList<>();
    private List<Sale> salesList =new ArrayList<>();
    private Scanner scanner =new Scanner(System.in);

    public static void main(String[] args){
        InventoryApp app =new InventoryApp();
        app.run();
    }

    public void run() {
        boolean running =true;
        while (running){
            showMenu();
            int choice =Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    showInventory();
                    break;
                case 2:
                    addInventory();
                    break;
                case 3:
                    sellCard();
                    break;
                case 4:
                    purchaseCard();
                    break;
                case 5:
                    showSales();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
    }
        }
    }
    //Menu for user 1,2,3,4,5,0(***Make here***)
    private void showMenu() {
        System.out.println("\nTrading Card Inventory System");
        System.out.println("1. Show Inventory");
        System.out.println("2. Add Trading Card");
        System.out.println("3. Sell Trading Card");
        System.out.println("4. Purchase Trading Card");
        System.out.println("5. Show Sales");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }
//Choices Start*************************************************

    //Choice 1- Show inventory(***Empty at start, remember to print its empty if user checkls at start***)
    private void showInventory() {
        if (inventoryList.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("\nCurrent Inventory:");
            for (TradingCard card : inventoryList) {
                System.out.println(card.getDetails());
        }
        }
    }

    //Choice 2- Add new trading card to users inventory
    private void addInventory() {
        System.out.print("Enter the cards name, make it unique! ");
        String name =scanner.nextLine();
        System.out.print("Enter the cards rarity NOW! (Some options include- Uncommon, Common, Rare, Epic, Legendary) ");
        String rarity =scanner.nextLine();
        System.out.print("Enter the cards price and actually make it seem legit: $");
        double price =Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the cards evolution (1st evo, 2nd evo, etc)");
        String cardEvo =scanner.nextLine();

        TradingCard card =new TradingCard(name, rarity, price, cardEvo);
        inventoryList.add(card);
        System.out.println("Trading card magically added to your inventory;)");
    }

    //Choice 3- Sell a trading card from inventory
    private void sellCard() {
        System.out.print("Enter the unique code on the back of the card to sell.. ");
        String cardId =scanner.nextLine();
        System.out.print("Enter the cards name please... ");
        String purchaser =scanner.nextLine();

        boolean found =false;
        for (TradingCard card:inventoryList) {
            if (card.getId().equals(cardId)) {
                Sale sale =new Sale(card, purchaser);
                salesList.add(sale);
                inventoryList.remove(card);
                System.out.println("Trading card has been sold and will now be taken from you FOREVER!.");
                found =true;
                break;
        }
        }

        if (!found) {
            System.out.println("Card does not exist, and it never will..");
    }
    }

    //Choice 4- Purchase a trading card (buy from someone else to add to inventory)
    private void purchaseCard() {
        System.out.print("Enter the card ID to purchase, you can find the card ID in the 'show inventory' choice. As long as your inventory isn't empty. ");
        String cardId =scanner.nextLine();
        System.out.print("Enter purchaser name, you can find the card ID in the 'show inventory' choice. As long as your inventory isn't empty. ");
        String purchaser =scanner.nextLine();

        boolean found =false;
        for (TradingCard card : inventoryList){
            if (card.getId().equals(cardId)){
                Sale sale =new Sale(card, purchaser);
                salesList.add(sale);
                inventoryList.remove(card);
                System.out.println("You are now a proud owner of this card.");
                found =true;
                break;
        }
        }

        if (!found){
            System.out.println("Card was not found.");
        }
    }

    //Choice 5- Show the sales history of cards sold
    private void showSales(){
        if (salesList.isEmpty()){
            System.out.println("No sales have been made at this time, go make some money!");
        } else {
            System.out.println("\nSales History:");
            for (Sale sale :salesList){
                System.out.println(sale.getSaleDetails());
         }
        }
    }
}
