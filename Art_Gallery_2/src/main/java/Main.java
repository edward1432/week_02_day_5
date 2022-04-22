public class Main {
    public static void main(String[] args) {

        Artwork art1 = new Artwork("Starry Night", "Van Gogh", 4, "StarryNightNFT");

        Gallery gallery1 = new Gallery("Louvre", 65);

        Artist artist1 = new Artist("Van Gogh");

        Customer customer1 = new Customer("Brian", 5);

        gallery1.addArt(art1);

        customer1.buyArt(art1, gallery1);
    }
}
