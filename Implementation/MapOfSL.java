import java.util.HashMap;

public class MapOfSL
{
    private Sensor sensor;
    private Location location;
    private static int sensorId = 0;


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
            Maps.getMaps().putIfAbsent(sensor, location);
            sensor.setDeployed(true);
            location.setCovered(true);
            System.out.println("Sensor deployed");
            System.out.println("Ok");
        }
        else {
            System.out.println("Sensor already deployed");
        }
    }

    // Assign unique ids to a sensor when deployed.
    public static int getNextUniqueNumber(){
        sensorId += 1;
        return sensorId;
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
        return Maps.getMaps().containsValue(location);
    }

}
