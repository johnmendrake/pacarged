import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu1 here:
 * I Don't know this too.
 * 
 * @author Benedikt Rölle 
 * @version IDon'tKnow ~Yannik
 */
public class StartScreen extends MenuStreuerung
{
    /**
     * Act - do whatever the StartScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets predsed in the environment.
     */
    private String enter = "enter";
    private String space = "space";
    public void act() 
    {
        Greenfoot.start();
        this.getWorld().showText("Press Space to start", this.getX(), this.getY());// Add your action code here.
        if (Greenfoot.isKeyDown(enter)||Greenfoot.isKeyDown(space)){
        Greenfoot.setWorld(new Menu1());
        
    }    
}
}
