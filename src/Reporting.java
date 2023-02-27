import java.util.List;
import java.util.ArrayList;

/**
 * This is a class for storing all auctionhouses and the items it has sold, as well as methods to retreive
 * the item with the largest price ever recorded, the auctionhouse with the largest average price for a
 * given year, and a list of all items it has sold above a given price level.
 */
public class Reporting {
        private AuctionHouse a;

        private List<Reporting> reportingList;
        private Item i;


        public void reporting(Item i, AuctionHouse a){
                this.i = i;
                this.a = a;
        }
        /*
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
        */

        public static void main(String[] args) {

                List<Item> a = new ArrayList<>();

                // TEST
                // Auction house G
                AuctionHouse g = new AuctionHouse("Randy", a);
                // Add Item i1 & i2 to Auction house G
                Item i1 = new Item(10, "Charlie", 100, 2013, "Sculpture");
                a.add(i1);
                Item i2 = new Item(101, "Charles", 10, 2013, "Sculpture");
                g.addToAuctionHouse(i2);

                /*
                System.out.println("----");
                System.out.println(g.soldOverPrice(11));
                System.out.println("----");

                a.add(i2);
                */

                // TEST
                // Auction house h
                AuctionHouse h = new AuctionHouse("Randy1", new ArrayList<Item>());
                // Add Item j1 & j2 to Auction house G
                Item j1 = new Item(10, "Charlie1", 100, 2014, "Sculpture");
                h.addToAuctionHouse(j1);
                Item j2 = new Item(103, "Charlie2", 111, 2016, "Sculpture");
                h.addToAuctionHouse(j2);

                System.out.println(g);
                System.out.println("----");
                System.out.println(h);


                //System.out.println(i);
                //AuctionHouse a = new AuctionHouse("Randy", new String[]{"cat", "rat", "pig", "dog"});
                //System.out.println(a);
        }

}
