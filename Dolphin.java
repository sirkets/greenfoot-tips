import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dolphin extends Actor implements Clickable
{
    int alpha = 255;
    
    public void onClick()
    {
        toggleTransparency();
    }
    
    private void toggleTransparency()
    {
        if(alpha == 255){
            alpha = 0;
        } else {
            alpha = 255;
        }
        getImage().setTransparency(alpha);
    }
}
