package GabrielBischof;
import robocode.*;

public class DerPortugisischeDämon extends JuniorRobot
{

	int northeast = 45;
	int southwest = 150;
	int victim = scannedAngle;
    int  latestenemy = hitByBulletBearing;
	
	public void run() {
	
		setColors(red,green,white);
		firstmove();

		while(true) {
		
        //Standard movement in Loop
            turnTo(180);
			ahead(fieldHeight);
			turnTo(270);
			ahead(fieldWidth);
			turnTo(0);
			ahead(fieldHeight);
			turnTo(90);
			ahead(fieldWidth);
			
		}
	}

	public void firstmove(){	
	

     	int heightdistance;
		int widthdistance;
		heightdistance = fieldHeight - robotY;
		widthdistance = fieldWidth - robotX;
		turnTo(northeast);
		ahead(heightdistance);
		turnTo(southwest);
		ahead(widthdistance);
}
	 
	public void onScannedRobot() {
	
	
        turnGunTo(victim);
		turnTo(victim);
		ahead(100);
	

		if (victim < 100)
		{
			fire (3);
			
		} 
		if (victim  < 200)
		{
			fire (2.2);
			
		} 
		else
		{
			fire (1.5);
			
		}
		
		
	}


	public void onHitByBullet() {
	
		
 	
		turnTo(latestenemy);
		turnGunTo(latestenemy);
		fire (3);
		
	
		
	}
	

	public void onHitWall() {
	
		


		back(300);
		turnLeft(180);
		turnGunLeft(189);
		
		
		
	}	
}
