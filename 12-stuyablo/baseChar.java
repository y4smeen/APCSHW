import java.util.*;
public class baseChar{
    private String name="DEFAULT";
    private int Health=30;
    private int attack=5;
    private int defense=2;
    private int dexterity=5;
    private int mana=0;
    public baseChar(String s){
    	name = s;
     }
    
    public baseChar(){
	name="bob";
    }
    public String toString(){
	return name;
    }
    public Boolean runAway(){
	//0-9
	Random a = new Random();
	int chance=a.nextInt(10);
	if (chance<dexterity){
	    return true;
		}
	else 
	    return false;
    }
    public void spell(baseChar other){
	Random magic = new Random();
	int x=2+magic.nextInt(mana);
	if(x<0){
	    x=0;
	}
	other.changeHealth(-x);
	System.out.println(this+" casts spell on "+other+" for "+x);
    }
    public void attacking(baseChar other){
	//consider this basechar's attack and dexterity and the other basechar's
	// defense. range of attack damage is +-2. dexterity determines chance
	// of hit. defense negates some damage.
	Random rand = new Random();
	
	int n = rand.nextInt(5)+attack-2-other.defense;
	if(n<0){
	    n=0;
	}
	other.changeHealth(-n);
	System.out.println(this+" attacks "+other+" for "+n);

    }
    public int getHealth(){
	return this.Health;
    }
    public void changeHealth(int value){
	this.Health = this.Health+value;
    }
    public void usePotion(){
	this.Health=this.Health+10;
    }
    public void setHealth(int x){
	this.Health=x;
    }
    public void setDex(int y){
	this.dexterity=y;
	    }
    public void setAttack(int z){
	this.attack=z;
    }
    public void setDef(int d){
	this.defense=d;
    }
    public void setMana(int m){
	this.mana=m;
    }

}
