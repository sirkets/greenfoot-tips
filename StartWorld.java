import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        
        
    }
    
    public void onClick(){
        display.setValue("Thank you");
    }
    

}
