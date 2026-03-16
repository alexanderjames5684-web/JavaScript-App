//import library
import java.time.LocalDateTime;

//Main class start***********
public class Sale{
    private TradingCard tradingCard;
    private String purchaser;
    private LocalDateTime date;

    public Sale(TradingCard tradingCard, String purchaser) {
        this.tradingCard =tradingCard;
        this.purchaser =purchaser;
        this.date =LocalDateTime.now();//set the purchase date
    }

    public String getSaleDetails() {
        return String.format("Trading Card: %s || Purchased by: %s || Date: %s", 
        tradingCard.getName(),purchaser,date.toString());
}
}
