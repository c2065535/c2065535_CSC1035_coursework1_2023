import java.util.Arrays;

public class AuctionHouse {

    // How to get itemSold to link with an Item from the Item class?
    // e.g. AuctionHouse(car) = {item_lot_number, buyerName, itemPrice, yearItemSold, itemType}
    // AuctionHouse(Painting) = {item_lot_number, buyerName, itemPrice, yearItemSold, itemType}

    private Item i;
    private String auctionHouseName;
    private String itemSold[];

    public String getAuctionHouseName(){
        return auctionHouseName;
    }
    public void setAuctionHouseName(String auctionHouseName){
        this.auctionHouseName = auctionHouseName;
    }

    public String[] getitemSold(){
        return itemSold;
    }

    public void setitemSold(String[] itemSold){
        this.itemSold = itemSold;
    }

    public AuctionHouse(String auctionHouseName, String[] itemSold){
        this.auctionHouseName = auctionHouseName;
        this.itemSold = itemSold;
    }

    public String toString() {
        return String.format("Auction House: %s\nItems Sold: %s", getAuctionHouseName(), Arrays.toString(getitemSold()));
    }

}
