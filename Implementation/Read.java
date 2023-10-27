import java.util.HashMap;
import java.util.Map;

public class Read {

	/*
	 * Attributes
	 */
	private Temperature temperature;
	private Sensor sensor;
	//private HashMap<Sensor, Temperature> sensorTemperaturePairs;
	
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
	//public HashMap<Sensor, Temperature> getSensorTemperaturePairs() { return sensorTemperaturePairs; }
	//public void setSensorTemperaturePairs(HashMap<Sensor, Temperature> sensorTemperaturePairs) { this.sensorTemperaturePairs = sensorTemperaturePairs; }

	/*
	 * Methods
	 */
	public String toString() {
        return "MapsSensorTemp{" +
                "sensorTemperaturePairs=" + Reads.getReads() +
                '}';
    }
	
	/*
	 * DOM'S CODE FOR ADD(SENSOR, TEMPERATURE) HERE
	 */
	public static void deploySensorTemp(Sensor sensor){
		Temperature temp = new Temperature();
		Reads.getReads().put(sensor, temp);
	}
	
	//Will continue readTemperature(location) later
	public Temperature readTemperature(Location location) {
		Map map = new Map(); 
		boolean has = map.hasLocation(location);
		if(has) {
			Sensor sensor = map.getSensorMap(location);
			Temperature temperature = Reads.getReads().get(sensor);
			System.out.println("ok");
			return temperature;
		}
		else {
			System.out.println("Location not covered.");
		}
		return null;
	}	

} //end of class
