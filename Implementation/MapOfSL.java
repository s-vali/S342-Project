import java.util.HashMap;
import java.util.Map;

public class MapOfSL
{
    private Sensor sensor;
    private Location location;
    
    public void ReplaceSensor(Sensor s, Sensor sensor2){
        if(searchForSensor(s) !=null) {
            Location l = s.getLocation();
            sensor2.setLocation(l);
            Reads.getReads().put(sensor2, Read.readTemperature(l));
            Reads.getReads().remove(s);
            Maps.getMaps().put(sensor2, l);
            Maps.getMaps().remove(s);
        }
    }

    public HashMap<Sensor, Location> getSensorLocationPairs() {
        return Maps.getMaps();
    }

   // Helper function for DeploySensor()
    public Boolean loopThroughIds(Sensor s){
        for (Sensor key : Maps.getMaps().keySet()) {
            if(s.getSensorID() == key.getSensorID()){
                return false;
            }
        }
        return true;
    }

    // Assigning a sensor-location pairs.
    public void DeploySensorLocation(Sensor sensor, Location location) {
        if(loopThroughIds(sensor)){
            if(LocationRegistry.hasLocation(location)){
                if(!hasLocation(location)){
                Maps.getMaps().putIfAbsent(sensor, location);
                sensor.setDeployed(true);
                location.setCovered(true);
                Read.deploySensorTemp(sensor);
                System.out.println("Sensor deployed");
                System.out.println("Ok");}
            }
            else{
                System.out.println("Location is not known");
            }
        }
        else {
            System.out.println("Sensor already deployed");
        }
    }


    public void clearPairs (){
        Maps.getMaps().clear();
    }

    @Override
    public String toString() {
        return "MapOfSL{" +
                "sensor=" + sensor +
                ", location=" + location +
                '}';
    }

    public MapOfSL(){}

    public MapOfSL(Sensor sensor, Location location){
        this.sensor = sensor;
        this.location = location;
    }

    public boolean hasLocation(Location location) {
        if (Maps.getMaps().containsValue(location)){
            System.out.println("Location already covered");
            return true;
        }
        else {
            System.out.println("Location not covered");
            return false;
        }
    }

    public Sensor getSensorMap(Location location) {
    	for (HashMap.Entry<Sensor, Location> entry : Maps.getMaps().entrySet()) {
    	    Sensor key = entry.getKey();
    	    if(entry.getValue().equals(location)) {
    	    	return key;
    	    }
    	}
    	return null; //no sensor was found in the table
    }
    
    public Map.Entry<Sensor, Location> searchForSensor(Sensor s){
        for (Map.Entry<Sensor, Location> entry : Maps.getMaps().entrySet()) {
            Sensor sensor = entry.getKey();
            if(sensor.getSensorID() == (s.getSensorID())){
                return entry;
            }
        }
        return null;
    }

    public void DeleteFromRegistery(Sensor s){
        SensorRegistry reg = new SensorRegistry(s);
        reg.removeSensor(s);
    }

}
