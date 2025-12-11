package labyrinth.entities;

public class LivingEntity {
    private String name;   
    
    private double hp; //vita != 0 || < 0
    
    private double maxHp; //max vita != 0 || < 0
    
    private double strength; // != 0 || < 0
    
    private double defense; // != 0 || < 0
    
    public LivingEntity(String name,double hp,double maxHp, double strength,double defense ){
    	this.name = name;
    	this.hp = hp;
    	this.maxHp = maxHp;
    	this.strength = strength;
    	this.defense = defense;
    }
    
    public void takeDamage(double damage) {
        hp -= damage;
        if (hp < 0) hp = 0; // prevent negative health
    }
    
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public double getHp() {return hp;}
	public void setHp(double hp) {this.hp = hp;}
	
	public double getMaxHp() {return maxHp;}
	public void setMaxHp(double maxHp) {this.maxHp = maxHp;}
	
	public double getStrength() {return strength;}
	public void setStrength(double strength) {this.strength = strength;}
	
	public double getDefense() {return defense;}
	public void setDefense(double defense) {this.defense = defense;}
    
}