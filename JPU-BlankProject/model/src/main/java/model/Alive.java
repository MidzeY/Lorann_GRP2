package model; 

public class Alive  extends Mobile {
	private boolean isAlive;
	public boolean setIsAlive(boolean isAliveNow){
		isAlive = isAliveNow;
	} 
	public Alive(boolean collidable, int posX, int posY, Sprite aSprite, int aSpeed, boolean isAliveNow){
		super(collidable, posX, posY, aSprite, aSpeed); 
		isAlive = isAliveNow;
	}
}