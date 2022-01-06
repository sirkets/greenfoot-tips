import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartWorld extends World implements Clickable
{
    Label display;
    Button button;
    ArrayList<String> nouns;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public StartWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        // Instantiate the label and button
        display = new Label("Hello", 100);
        button = new Button(this, "Click Me", 200, 30);

        // Add the label to the world
        int labelWidth = (int) (getWidth() * 0.5);
        int labelHeight = (int) (getHeight() * 0.35);
        addObject(display, labelWidth, labelHeight);

        // Add the button to the world
        int buttonWidth = (int) (getWidth() * 0.5);
        int buttonHeight = (int) (getHeight() * 0.7);
        addObject(button, buttonWidth, buttonHeight);

        // Instantiate arraylist
        nouns = new ArrayList<String>();
        
        // Read nouns into list
        try{
            Reader.readInto(nouns);
        }catch(Exception e){}

        
        Dolphin d = new Dolphin();
        Button dButton = new Button(d, "Dolphin", 200, 30);
        addObject(dButton, getWidth()/2, getHeight() - 50);
    }

    public void onClick()
    {
        int r = Greenfoot.getRandomNumber(nouns.size());
        display.setValue(nouns.get(r));
    }

}
