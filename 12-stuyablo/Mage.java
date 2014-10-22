import java.util.*;
public class Mage extends baseChar{
    //private String name = "DEFAULT";
    //private int Health=20;
    // private int attack=3;
    // private int defense=2;
    private int mana=10;
    // private int dexterity=4;
    public Mage(String name){
    	super(name);
	setHealth(20);
	setDex(4);
	setAttack(4);
	setDef(2);
	setMana(7);
    }
    /* public Boolean runAway(){
	//0-9
	Random a = new Random();
	int chance=a.nextInt(10);
	if (chance<dexterity){
	    return true;
		}
	else 
	    return false;
    }
    public int getHealth(){
	return this.Health;
	}*/
}
