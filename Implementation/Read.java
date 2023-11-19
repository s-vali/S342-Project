import java.util.HashMap;
import java.util.Map;

public class Read {

	/*
	 * Attributes
	 */
	private Temperature temperature;
	private Sensor sensor;
	private static HashMap<Sensor, Temperature> sensorTemperaturePairs;
	
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
	
	public static Temperature readTemperature(Location location) {
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
        return "ReadsSensorTemp{" +
                "sensorTemperaturePairs=" + Reads.getReads() +
                '}';
    	}
	
	//NEW METHOD PAIRS LOCATION AND TEMPERATURE
    public static HashMap<Location, Temperature> returnLocationTemperature() {
        /*obtain the necessary tables*/
        HashMap<Sensor, Location> maps = Maps.getMaps(); //<sensor, location>
        sensorTemperaturePairs = Reads.getReads(); //<sensor, temperature> //CHANGED TO STATIC
        /*create new table of <location, temperature>*/
        final HashMap<Location, Temperature> locationTempPairs = new HashMap<>(); //<location, temperature>
        
        /*iterate through both hashMaps and compare their sensors (sensors=key)*/
        for(HashMap.Entry<Sensor, Location> sl : maps.entrySet()) {
            for(HashMap.Entry<Sensor, Temperature> st : sensorTemperaturePairs.entrySet()) {
                if(sl.getKey().getSensorID() == st.getKey().getSensorID()) {
                    locationTempPairs.put(sl.getValue(), st.getValue()); //<location, temperature>
                }
            }
        }
        
        /*print out <location, temperature> table*/
        for(HashMap.Entry<Location, Temperature> entry : locationTempPairs.entrySet()) {
            System.out.println("<" + entry.getKey() + ", " + entry.getValue() + ">");
        }

        return locationTempPairs; 
    }
} //end of class