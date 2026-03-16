//import libraries
import java.util.UUID;

//Class for my trading card(add my methods)
public class TradingCard{
    private String id;
    private String name;
    private String rarity;
    private double price;
    private String cardSet;

    //All card traits should be below**********

    public TradingCard(String name, String rarity, double price, String cardSet) {
        this.id =UUID.randomUUID().toString(); //Makes cards unique with a number
        this.name =name; //Name whatever I want
        this.rarity =rarity;//Choose the rarity of your card, or whatever you want it to be.
        this.price =price;//Choose how expensive you want your card to be
        this.cardSet =cardSet;//Card set which could be what evolution it is
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getRarity(){
        return rarity;
    }
    public double getPrice(){
        return price;
    }
    public String getCardSet(){
        return cardSet;
    }
    public String getDetails(){
        return String.format("ID: %s || Name: %s || Rarity: %s || Price: $%.2f || Card Evolution: %s", 
        id, name, rarity, price, cardSet);
    }
}

