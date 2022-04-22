import java.util.ArrayList;

public class Artist {
    private String name;
    private ArrayList<Artwork> portfolio;

    public Artist(String name){
        this.name = name;
        this.portfolio = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Artwork> getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(ArrayList<Artwork> portfolio) {
        this.portfolio = portfolio;
    }
}
