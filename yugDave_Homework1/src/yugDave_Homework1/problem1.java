package yugDave_Homework1;

public class problem1 {

	public static void main(String[] args) {
		double diameterSun = 865000.0;  
	    double diameterEarth = 7600.0; 
	    double radiusEarth = 0.0; 
	    double radiusSun = 0.0;
	    double volumeEarth = 0.0;
	    double volumeSun = 0.0;
	    double volumeRatio = 0.0;

	    radiusEarth = diameterEarth / 2;
	    radiusSun = diameterSun / 2;

	        
	    volumeEarth = (4.0 * Math.PI * Math.pow(radiusEarth, 3))/3.0;
	    volumeSun = (4.0 * Math.PI * Math.pow(radiusSun, 3))/3.0;

	        
	    volumeRatio = volumeSun / volumeEarth;

	        
	    System.out.printf("The volume of the Earth is %.2f cubic miles, the volume of the Sun is %.2f cubic miles, and the ratio of the volume of the Sun to the volume of the Earth is %.2f.\n", volumeEarth, volumeSun, volumeRatio);

	}

}
