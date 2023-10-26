import java.util.HashMap;

public class Reads {

	/*
	 * Attributes
	 */
	private static HashMap<Sensor, Temperature> sensorTemperaturePairs = new HashMap<>();
	
	/*
	 * Singleton Constructor
	 */
	private Reads() {} 

	/*
	 * Singleton Method
	 */
	public static HashMap<Sensor, Temperature> getMaps() {
        return sensorTemperaturePairs;
    }	
	
} //end of class
