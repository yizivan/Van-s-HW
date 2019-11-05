/**
 * @author Hong Tran
 */
public class Music
{
    private String songName;
    private int yearRelease;
    private Artist artist = new Artist();
    public Music(String songName)
    {
        this.songName = songName;
    }
    public Music(String songName, int yearRelease)
    {
        this.songName = songName;
        this.yearRelease = yearRelease;
    }
    public void setSongName(String songName)
    {
        this.songName = songName;
    }
    public void setYearRelease(int yearRelease)
    {
        this.yearRelease = yearRelease;
    }
    public String getSongName()
    {
        return songName;
    }
    public int getYearRelease()
    {
        return yearRelease;
    }
    public String toString()
    {
        return ("<" + songName + "> " + yearRelease + ". " + getArtist());
    }
    public void setArtist(String name, int yearborn)
    {
        artist.setName(name);
        artist.setYearBorn(yearborn);
    }
    public void setArtist(Artist artist)
    {
        this.artist.setName(artist.getName());
        this.artist.setYearBorn(artist.getYearBorn());
    }
    public String getArtist()
    {
        return("This artist name is \"" + artist.getName() + "\" and the year born was " + artist.getYearBorn());
    }
}