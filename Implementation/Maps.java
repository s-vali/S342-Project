import java.util.HashMap;

public class Maps
{
    private static final HashMap<Sensor,Location> sensorLocationPairs = new HashMap<>();

    private Maps(){}

    public static HashMap<Sensor, Location> getMaps() {
        return sensorLocationPairs;
    }


//    public HashMap<Sensor, Location> getSensorLocationPairs() {
//        return sensorLocationPairs;
//    }
//
//    public void hasLocation(Location location)
//    {
//
//    }
//
//    public void clearPairs (){
//        sensorLocationPairs.clear();
//    }
//
//
//    @Override
//    public String toString() {
//        return "Maps{" +
//                "sensorLocationPairs=" + sensorLocationPairs +
//                '}';
//    }
}

