package com.andi947;

/**
 * Created by Andrea on 2017/02/06.
 */
public class PC {

    // Composition - created class PC that **has a** :
    // - Case; field called theCase
    // - Monitor; field called monitor
    // - Motherboard; field called motherboard
    // Thus each instance of PC will have these classes as well

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    // Constructor is now taking 3 objects instead of just parameters
    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //Fancy graphics
        //getMonitor().drawPixelAt(1200, 50, "yellow"); // if looking for validation then we would use getters
        monitor.drawPixelAt(1200, 50, "yellow"); // this is the better method
    }

}
