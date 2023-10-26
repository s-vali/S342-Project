import java.util.HashMap;

public class Maps
{
    private static final HashMap<Sensor,Location> sensorLocationPairs = new HashMap<>();

    private Maps(){}

    public static HashMap<Sensor, Location> getMaps() {
        return sensorLocationPairs;
    }
}

