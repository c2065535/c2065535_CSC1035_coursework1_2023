import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AuctionHouse {

    private Item i;
    private String auctionHouseName;
    //private String itemSold[];

    private List<Item> soldItems;

    //private Map<Boolean, Item> Items;


    public AuctionHouse(String auctionHouseName, List<Item> soldItems){
        this.auctionHouseName = auctionHouseName;
        this.soldItems = soldItems;
    }


    public String getAuctionHouseName(){
        return auctionHouseName;
    }
    public void setAuctionHouseName(String auctionHouseName){
        this.auctionHouseName = auctionHouseName;
    }


    public List<Item> getItemSold(){
        return soldItems;
    }


    public boolean addToAuctionHouse(Item item){

        if (soldItems.contains(item)){
            // dont add to list or map
        }else{
            soldItems.add(item);
        }
        return true;
    }

    // https://stackoverflow.com/questions/19338686/getting-max-value-from-an-arraylist-of-objects
    // Stream through items sold, compare itemPrice, return item with max price.
    public Item findHighestPrice(){
        return getItemSold().stream().max(Comparator.comparing(Item::getItemPrice)).get();
    }

    // https://stackoverflow.com/questions/10791568/calculating-average-of-an-array-list#:~:text=From%20Java8%20onward%20you%20can%20get%20the%20average,has%20the%20advantage%20of%20having%20no%20moving%20parts.
    // Method for finding Average price of a Auction House
    public double findAveragePrice(){
        // Stream through items sold, add up item price, return average price. Else - return 0.
        return getItemSold().stream().mapToInt(Item::getItemPrice).average().orElse(0.0);
    }

    // Method for finding Items sold over specific price.
    public List<Item> soldOverPrice(int price){
        // Make result a list to be returned
        List<Item> result = new ArrayList<>();

        // For every item sold
        for (Item item : getItemSold()){
            // If item sold is over price
            if (item.getItemPrice() > price){
                // add Item to result list
                result.add(item);
            }
        }
        return result;
    }

    /*
    public void setitemSold(String[] itemSold){
        this.itemSold = itemSold;
    }
    */

    //public String toString() {
      //  return String.format("Auction House: %s\nItems Sold: %s", getAuctionHouseName(), Arrays.toString(getitemSold()));
    //}

    @Override
    public String toString() {
        return "AuctionHouse{" +
                "i=" + i +
                ", auctionHouseName='" + auctionHouseName + '\'' +
                //", itemSold=" + Arrays.toString(itemSold) +
                ", soldItems=" + soldItems +
                //", Items=" + Items +
                '}';
    }
}
