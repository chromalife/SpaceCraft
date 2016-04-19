package SpaceCraft;

public final class Config
{

	public Config() {}


	public class java
	{

	}

	//Height, Width of App
	public static final int SCREEN_WIDTH = 480;
	public static final int	SCREEN_HEIGHT = 600; //made height shorter so it can show on my screen. 

	//Player Config Settings
	public static final double PLAYER_ATTACK_SPEED = 50;
	public static final double PLAYER_MOVE_SPEED = 500;
	public static final int PLAYER_HEALTH = 20;
	public static final int PLAYER_HEIGHT = 40;
	public static final String SPACE_SHIP_IMAGE = "spaceshipReduced.png";

	//Enemy Config Settings

	public static final String ENEMY_IMAGE = "enemyReduced1.png"; //need to array 1-3
	public static final String[] ENEMY_IMAGE_ARRAY = {"enemyReduced1.png","enemyReduced2.png","enemyReduced3.png"};
	public static final int ENEMY_IMAGE_SLICES = 2; 
	public static final double ENEMY_IMAGE_PLAY_TIME = 2; //in seconds
	public static final boolean ENEMIES_RANDOMIZE = true; //if you want to randomize enemies or not 
	public static final int ENEMY_HEALTH = 2;
	
	//Bullet Config Settings
	public static final double BULLET_MOVE_SPEED = 500;
	public static final int BULLET_HEIGHT = 12; //12 pixels
	public static final int BULLET_WIDTH = 12; //12 pixels

	//Wall Config Settings
	public static final int WALL_MIN_HEIGHT = 64 + PLAYER_HEIGHT;
	public static final int WALL_MIN_WIDTH = 64;
	public static final String WALL_IMAGE = "wall.png";
	public static final int WALL_HEALTH = 3;
	public static final int WALLS_NUMBER_ON_LOAD = 5; //we can adjust now


	//Image Config Settings



	
	//explosion settings
	////Enemy Exxplosion

	public static final String EXPLOSION_IMAGE = "explosion.png";
	public static final int EXPLOSION_IMAGE_SLICES = 50;
	public static final double EXPLOSION_IMAGE_PLAY_TIME = .5; //in seconds
	
	
	
	//MISC Image files
	public static final String LAZER_IMAGE = "bullet_red.png";
	public static final String BULLET_IMAGE = "tank_bullet.png";
	public static final String BONUS_LIFE_IMAGE = "life.png";
	public static final String LAZER_HIT_IMAGE = "lazer_hit.png";
	public static final String METEOR_IMAGE = "meteor1.png"; //will need 1-4 in an array
	


}
