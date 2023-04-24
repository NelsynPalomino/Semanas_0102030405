
package S02;

public class Cancion {
    private String name;
    private String artist;
    private int year;
    private String genre;
    private String album;

    public Cancion() {
        this.name = "";
        this.artist = "";
        this.year = 0;
        this.genre = "";
        this.album = "";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

