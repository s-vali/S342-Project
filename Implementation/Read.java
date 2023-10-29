import java.util.HashMap;
import java.util.Map;

public class Read {

	/*
	 * Attributes
	 */
	private Temperature temperature;
	private Sensor sensor;
	private HashMap<Sensor, Temperature> sensorTemperaturePairs;
	
	/*
	 * Constructor
	 */
	public Read() {}
	public Read(Sensor sensor, Temperature temperature) {
		this.sensor = sensor;
		this.temperature = temperature;
	}
	
	/*
	 * Getters and Setters
	 */
	public HashMap<Sensor, Temperature> getSensorTemperaturePairs() { return sensorTemperaturePairs; }
	public void setSensorTemperaturePairs(HashMap<Sensor, Temperature> sensorTemperaturePairs) { this.sensorTemperaturePairs = sensorTemperaturePairs; }

	/*
	 * Methods
	 */
	public static void deploySensorTemp(Sensor sensor){
		Temperature temp = new Temperature();
		Reads.getReads().put(sensor, temp);
	}
	
	public Temperature readTemperature(Location location) {
		MapOfSL map = new MapOfSL(); 
		boolean has = map.hasLocation(location);
		if(has) {
			Sensor sensor = map.getSensorMap(location);
			if(sensor == null) {
				System.out.println("No sensor is deployed at this location.");
				return null;
			}
			Temperature temperature = Reads.getReads().get(sensor);
			System.out.println("Ok, from readTemperature(" + location + ").");
			return temperature;
		}
		else {
			System.out.println("Location not covered, from readTemperature(" + location + ").");
		}
		return null;
	}

	public String toString() {
        return "MapsSensorTemp{" +
                "sensorTemperaturePairs=" + Reads.getReads() +
                '}';
    	}

} //end of class
