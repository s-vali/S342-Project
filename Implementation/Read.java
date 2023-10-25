
public class Read {

	//Attributes
	private Temperature temperature;
	private Sensor sensor;
	
	//Constructor
	public Read(Sensor sensor, Temperature temperature) {
		this.temperature = temperature;
		this.sensor = sensor;
	}
	
	//Getters and Setters
	public Temperature getTemperature() {
		return temperature;
	}

	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}

	public Sensor getSensor() {
		return sensor;
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

	//Methods
	public Temperature readTemperatureHASHMAP(Location location) {
		return null;
	}
	

} //end of class
