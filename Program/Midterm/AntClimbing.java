import java.util.Random;
//==================================================================
// Class: AntClimbing
// Description: ant crawl up a building of height 6 steps.
//              50% chance to craws up one step or falls all the way back to the ground.
// By: J.Ho
// Date: 02/24/2020
//==================================================================
public class AntClimbing {

	public static void main(String[] args) {
		Random rd = new Random();
		int height = 0; 
		int cntFalls = 0;

		while(height != 6){

			// get number between 0 - 1 (0:fall down, 1:craw up)
			int isFall = rd.nextInt(2);

			if(isFall==0){
				height = 0;		// fall doen to the ground
				cntFalls++;		// count up falls
			}
			else if(isFall==1){
				height++;		// craw up one step
			}
		}
		// print out the number of falls that the ant took before it reached the top
		System.out.println("number of falls: " + cntFalls);
	}
}
