import java.util.Date;
public class geometricObjects {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public geometricObjects()
    {
    }

    public geometricObjects(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isFilled()
    {
        return filled;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public Date getDateCreated()
    {
        return dateCreated;
    }

    public String toString()
    {
        return "Geometric Shape";
    }

}

