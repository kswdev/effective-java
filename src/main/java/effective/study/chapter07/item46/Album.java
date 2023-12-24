package effective.study.chapter07.item46;

public class Album {
    private String artist;
    private int sales;

    public Album(String artist, int sales) {
        this.artist = artist;
        this.sales = sales;
    }

    public String getArtist() {
        return artist;
    }

    public int getSales() {
        return sales;
    }
}
