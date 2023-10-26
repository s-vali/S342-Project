import java.util.HashMap;

public class MapOfSL
{
    private Sensor sensor;
    private Location location;


    public HashMap<Sensor, Location> getSensorLocationPairs() {
        return Maps.getMaps();
    }

    public Boolean loopThroughIds(Sensor s){

        for (Sensor key : Maps.getMaps().keySet()) {
            if(s.getSensorID() == key.getSensorID()){
                return false;
            }

        }
        return true;
    }

    public void DeploySensor(Sensor sensor, Location location) {
        if(loopThroughIds(sensor)){
            Maps.getMaps().putIfAbsent(sensor, location);
            sensor.setDeployed(true);
        }
        else {
            System.out.println(sensor.getSensorID());
            sensor.setDeployed(false);
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
        return Maps.getMaps().containsValue(location);
    }

}
