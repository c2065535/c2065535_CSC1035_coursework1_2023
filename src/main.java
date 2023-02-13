public class main {
    private Item i;
    private AuctionHouse a;

    public main(Item i, AuctionHouse a){
        this.i = i;
        this.a = a;
    }
    public Item getI(){
        return i;
    }
    public void setI(Item i){
        this.i = i;
    }
    public AuctionHouse getA(){
        return a;
    }
    public void setA(AuctionHouse a){
        this.a = a;
    }

    public static void main(String[] args) {
        Item i = new Item(10, "Charlie", 100, 2013, "Sculpture");
        System.out.println(i);
        AuctionHouse a = new AuctionHouse("Randy", new String[]{"cat", "rat", "pig", "dog"});
        System.out.println(a);
    }
}
