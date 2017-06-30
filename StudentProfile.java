import processing.core.PApplet;
import processing.core.PImage;

public class StudentProfile
{
    PImage profileImage;
    String firstName;
    String lastName;
    String fullName;
    int posX;
    int posY;
    
    public StudentProfile(PImage image, String fn, String ln)
    {
        profileImage = image;
        firstName = fn;
        lastName = ln;
        fullName = firstName + " " + lastName;
    }
    
    public void draw(PApplet app) {
        app.image(profileImage, posX, posY, 100, 100);
        app.fill(0);
        app.textSize(12);
        app.textAlign(PApplet.CENTER);
        app.text(fullName, posX + 50, posY + 115);
    }
    
    public void setX(int x) 
    {
        posX = x;
    }
    
    public void setY(int y)
    {
        posY = y;
    }
}
