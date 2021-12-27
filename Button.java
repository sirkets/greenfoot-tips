import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clickable button
 */
public class Button extends Actor
{
    // The images of the different button states
    GreenfootImage up = new GreenfootImage("button_up.png");
    GreenfootImage down = new GreenfootImage("button_down.png");

    // The current state of the button.
    // The initial state of the button is UP
    private State state = State.UP;

    // The text to display on the button
    private Clickable object;
    private String text;

    // Assign descriptive names to numbers
    // Basically, UP = 0, DOWN = 1, HOVER = 2, NONE = 3
    private enum State
    {
        UP, DOWN, HOVER, NONE
    }

    /**
     * Consruct a button with text, width and height
     * @param text The text to show on the button
     * @param width The width of the button
     * @param height the height of the button
     */
    public Button(Clickable object, String text, int width, int height)
    {
        this.object = object;
        this.text = text;

        // Scale the button image
        up.scale(width, height);
        down.scale(width, height);
  
        // Show text on the button
        Label label = new Label(text, height);
        int textWidth = label.getImage().getWidth()/2;  // get width of the text
        up.drawImage(label.getImage(), textWidth, 0);
        down.drawImage(label.getImage(), textWidth, 0);

        setImage(up);
    }

    public void act()
    {
        // Get mouse info and exit the act() loop if there is no mouse information
        MouseInfo info = Greenfoot.getMouseInfo();
        if(info == null) {
            return;
        }

        // Determine if the mouse pointer is clicked or released

        if(Greenfoot.mousePressed(this))  // Mouse button is clicked
        {
            state = state.DOWN;
        }
        else if(Greenfoot.mouseClicked(this))  // Mouse button is released
        {
            state = state.UP;

            // call the onClick method of the Clickable object
            // referenced by this button
            object.onClick();
        }

        // Update the button image
        updateImage();
    }

    /**
     * Update the button image based on its current state
     */
    private void updateImage()
    {
        switch (state)
        {
            case UP:
                setImage(up);
                break;
            case DOWN:
                setImage(down);
                break;

        }

    }
}
