import processing.core.PApplet;

/**
 * Creates the application full of StudentProfile objects.
 *
 * @author demc
 * @version 6/30/2017
 */
public class App extends PApplet
{
    StudentProfile[] profiles;
    
    public void settings() 
    {
        size(800, 600);
    }
    
    public void setup()
    {
        profiles = new StudentProfile[20];
        profiles[0] = new StudentProfile(loadImage("dmcmillen.jpeg"), "Derrick", "McMillen");
        profiles[1] = new StudentProfile(loadImage("oscar.png"), "Oscar", "the Grouch");
        profiles[2] = new StudentProfile(loadImage("MCMILLEN.jpg"), "The ", "Toddler");

        //
        // Add your StudentProfile object here.
        //
        
        int row = 0;
        int col = 0;
        for (int i = 0; i < profiles.length; i++)
        {
            if (profiles[i] != null) 
            {
                profiles[i].setX(col * 115);
                profiles[i].setY(row * 115);
            }
            
            if (i > 0 && i % 8 == 0)
            {
                row++;
                col = 0;
            }
            else 
            {
                col++;
            }
        }
    }
    
    public void draw() 
    {
        background(color(255));
        
        for (int i = 0; i < profiles.length; i++)
        {
            if (profiles[i] != null)
            {
                profiles[i].draw(this);
            }
        }
    }
}
