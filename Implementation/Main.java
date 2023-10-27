public class Main {
    public static void main(String[] args) {
        Sensor s1 = new Sensor();
        Location l1 = new Location("Monteal");
        MapOfSL maps = new MapOfSL();
        maps.DeploySensorLocation(s1,l1);
        System.out.println(maps.getSensorLocationPairs());
        maps.DeploySensorLocation(s1,l1);
        System.out.println(maps.getSensorLocationPairs());
        System.out.println(SensorRegistry.getSensorRegistry());
    }
}