
public class Item{
    private int item_lot_number;
    private String buyerName;
    private int itemPrice;
    private int yearItemSold;
    private String itemType;
    // 3 types are - Furniture, Painting, Sculpture


    public String toString(){
        return String.format("""
                Lot Number:%s
                Buyer Name:%s
                Item Price:%s
                Year Item Sold:%s
                Item Type:%s""", item_lot_number, buyerName, itemPrice, yearItemSold, itemType);
    }

    public Item(int item_lot_number, String buyerName, int itemPrice, int yearItemSold, String itemType){
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

    public int getYearItemSold() {
        return yearItemSold;
    }

    public void setYearItemSold(int yearItemSold) {
        this.yearItemSold = yearItemSold;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }


}
