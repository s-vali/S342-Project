
public class Sensor {

	private boolean isDeployed;
	private int sensorID;
	
	//Constructor
	public Sensor(boolean isDeployed, int sensorID) {
		super();
		this.isDeployed = isDeployed;
		this.sensorID = sensorID;
	}

	//Getters and Setter methods
	public boolean isDeployed() {
		return isDeployed;
	}

	public void setDeployed(boolean isDeployed) {
		this.isDeployed = isDeployed;
	}

	public int getSensorID() {
		return sensorID;
	}

	public void setSensorID(int sensorID) {
		this.sensorID = sensorID;
	}
	
	
	
	
	
}
