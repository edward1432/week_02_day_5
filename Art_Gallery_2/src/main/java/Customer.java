import java.util.ArrayList;

public class Customer {
    private String name;
    private int wallet;
    private ArrayList<Artwork> privateCollection;

    public Customer(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
        this.privateCollection = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public void buyArt(Artwork artwork, Gallery gallery) {
        if (wallet >= artwork.getPrice()) {
            System.out.println("Wallet: " + wallet);
            if (gallery.sellArt(artwork) == true) {
                this.privateCollection.add(artwork);
                wallet -= artwork.getPrice();
                System.out.println("You have successfully bought " + artwork.getTitle()+ " and it's been added to your collection!");
                System.out.println("Wallet: " + wallet);
            } else {
                System.out.println("Out of stock!");
            }
        } else {
            System.out.println("You don't have enough money to buy that!");
        }
        for (int i = 0; i < privateCollection.size(); i++) {
            System.out.println(privateCollection.get(i).getTitle());
        }
        }
    }