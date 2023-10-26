
public class Sensor {

	/*
	 * Attributes
	 */
	private boolean isDeployed;
	private int sensorID;
	private Location location;
	private Temperature temperature;
	private SensorRegistry sensorRegistry; 
	
	/*
	 * Constructor
	 */
	public Sensor(boolean isDeployed, int sensorID) {
		this.isDeployed = isDeployed;
		this.sensorID = sensorID;
	}
	public Sensor(boolean isDeployed, int sensorID, Location location, Temperature temperature) {
		this.isDeployed = isDeployed;
		this.sensorID = sensorID;
		this.location = location;
		this.temperature = temperature;
	}

	/*
	 * Getters and Setters
	 */
	public boolean isDeployed() { return isDeployed; }
	public void setDeployed(boolean isDeployed) { this.isDeployed = isDeployed; }
	public int getSensorID() { return sensorID; }
	public void setSensorID(int sensorID) { this.sensorID = sensorID; }
	public Location getLocation() { return location; }
	public void setLocation(Location location) { this.location = location; }
	public Temperature getTemperature() { return temperature; }
	public void setTemperature(Temperature temperature) { this.temperature = temperature; }
	
} //end of class
