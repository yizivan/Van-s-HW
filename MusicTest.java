/**
 * @author Hong Tran
 */
public class MusicTest
{
    public static void main(String[] args)
    {
        Music firstMusic = new Music("Last Christmas");
        Music secondMusic = new Music("A Thousand Years", 2011);
        firstMusic.setYearRelease(1986);
        Artist firstArtist = new Artist();
        firstArtist.setName("Wham!");
        firstArtist.setYearBorn(1963);
        Artist secondArtist = new Artist("Christina Perri", 1986);
        firstMusic.setArtist(firstArtist);
        secondMusic.setArtist(secondArtist);
        System.out.println("The first song is " + firstMusic.getSongName());
        System.out.println("and its released year was " + firstMusic.getYearRelease());
        System.out.println(firstMusic.getArtist());
        System.out.println("Its full information is " + firstMusic);
        System.out.println("The second song is " + secondMusic.getSongName());
        System.out.println("and its released year was " + secondMusic.getYearRelease());
        System.out.println(secondMusic.getArtist());
        System.out.println("Its full information is " + secondMusic);
    }
}