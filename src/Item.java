
public class Item{
    private int item_lot_number;
    private String buyerName;
    private int itemPrice;
    private String yearItemSold;
    private String itemType;

    public Item(int item_lot_number, String buyerName, int itemPrice, String yearItemSold, String itemType){
        this.item_lot_number = item_lot_number;
        this.buyerName = buyerName;
        this.itemPrice = itemPrice;
        this.yearItemSold = yearItemSold;
        this.itemType = itemType;
    }

    public int getItem_lot_number() {
        return item_lot_number;
    }

    public void setItem_lot_number(int item_lot_number) {
        this.item_lot_number = item_lot_number;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getYearItemSold() {
        return yearItemSold;
    }

    public void setYearItemSold(String yearItemSold) {
        this.yearItemSold = yearItemSold;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }


}
