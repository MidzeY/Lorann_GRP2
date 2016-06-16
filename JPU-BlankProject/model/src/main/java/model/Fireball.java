package model;

public class Fireball extends Mobile {
	private static Sprite fireball = new Sprite("fireball");
	private static int speed = 20;

	public Fireball(boolean collidable, int posX, int posY, Sprite sprite, int speed){
		super(collidable, posX, posY, sprite, speed);
	}
}