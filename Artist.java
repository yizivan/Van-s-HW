/**
 * @author Hong Tran
 */
public class Artist
{
    private String Name;
    private int YearBorn;
    public Artist()
    {

    }
    public Artist(String Name, int YearBorn)
    {
        this.Name = Name;
        this.YearBorn = YearBorn;
    }
    public void setName(String Name)
    {
        this.Name = Name;
    }
    public void setYearBorn(int YearBorn)
    {
        this.YearBorn = YearBorn;
    }
    public String getName()
    {
        return Name;
    }
    public int getYearBorn()
    {
        return YearBorn;
    }

}