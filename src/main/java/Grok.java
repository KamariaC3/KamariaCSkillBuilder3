
/**
 * Groks are bad actors in a game.  Groks have the ability to ingest
 * a PowerPill to replenish their energy.  This makes them difficult
 * to kill.
 *
 * @author (You Again)
 * @version (0.1)
 */
public class Grok
{
    // implement this class per instructions in Required Activities.
    private static final int DEFAULT_POWER_LEVEL = 50;

    private int powerLevel;
    public Grok(int powerLevel){
        this.powerLevel = powerLevel;
    }
    public Grok(){
        this.powerLevel = DEFAULT_POWER_LEVEL;
    }
    public int getPowerLevel(){
        return powerLevel;
    }
    public void setPowerLevel(int powerLevel){
        this.powerLevel = powerLevel;
    }
    public void takePowerPill(PowerPill pill){
        //*
  /* Set the power level of this Grok to the power level of
  * the pill.
  * @param pill The PowerPill that the this Grok.  The power
  * of the pill is added to the power level of this Grok.
                */
        this.powerLevel += pill.getPower();
    }
    public void tookHit (){
        this.powerLevel -= 5;
    }
}
/*
 \* Initializes a Grok object to the default power level of 50.
 */
