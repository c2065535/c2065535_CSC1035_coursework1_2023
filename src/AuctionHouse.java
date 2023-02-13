public class AuctionHouse {
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
        return String.format("%s%s", getAuctionHouseName(), getitemSold());
    }
}
