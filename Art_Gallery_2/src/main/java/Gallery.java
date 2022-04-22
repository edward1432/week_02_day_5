import java.util.ArrayList;

public class Gallery {

    private String name;
    private int till;
    private ArrayList<Artwork> collection;

    public Gallery(String name, int till){
        this.name = name;
        this.till = till;
        this.collection = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public ArrayList<Artwork> getCollection() {
        return collection;
    }

    public void setCollection(ArrayList<Artwork> collection) {
        this.collection = collection;
    }

    public void addArt(Artwork artwork){
        this.collection.add(artwork);
    }

    public boolean sellArt(Artwork artwork){
        System.out.println("Till balance: " + till);
        if (collection.contains(artwork)) {
            this.collection.remove(artwork);
            till += artwork.getPrice();
            System.out.println("Till balance: " + till);
            return true;
        } return false;
    }
}
