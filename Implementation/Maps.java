import java.util.HashMap;

public class Maps
{
    private HashMap<Sensor,Location> sensorLocationPairs = new HashMap<>();
    private MapOfSL newPair;

    public Boolean loopThroughIds(Sensor s){

        for (Sensor key : sensorLocationPairs.keySet()) {
            if(s.getSensorID() == key.getSensorID()){
                return false;
            }
        }
        return true;
    }

    public void DeploySensor(Sensor sensor, Location location) {
        newPair = new MapOfSL();
        if(loopThroughIds(sensor))
            this.sensorLocationPairs.putIfAbsent(sensor, location);
    }

    public HashMap<Sensor, Location> getSensorLocationPairs() {
        return sensorLocationPairs;
    }

    public void hasLocation(Location location)
    {

    }

    public void clearPairs (){
        sensorLocationPairs.clear();
    }


    @Override
    public String toString() {
        return "Maps{" +
                "sensorLocationPairs=" + sensorLocationPairs +
                '}';
    }
}

