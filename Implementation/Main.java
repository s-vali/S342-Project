public class Main {
    public static void main(String[] args) {
        //** Creating required objects for testing */
        Sensor s1 = new Sensor();
        Sensor s2 = new Sensor();
        Sensor s3 = new Sensor();
        Location l1 = new Location("Monteal");
        Location l2 = new Location("Detroit");
        Location l3 = new Location("Quebec");
        LocationRegistry.addLocation(l1);
        LocationRegistry.addLocation(l2);
        LocationRegistry.addLocation(l3);
        MapOfSL maps = new MapOfSL();

        //** Testing that a location cannot be doubled in the registry */
        System.out.println("\nAdding a duplicate location for testing:");
        Location l4 = new Location("Quebec");
        LocationRegistry.addLocation(l4);

        System.out.println("\nDisplaying Registries to demonstrate that all locations were added as expected:");
        System.out.println("Sensor Registry: "+SensorRegistry.getSensorRegistry());
        System.out.println("Location Registry: "+LocationRegistry.getLocationRegistry()+"\n");

        //** Deploying a sensor */
        maps.DeploySensorLocation(s1,l1);
        System.out.println("Maps pairs after deploying sensor: "+maps.getSensorLocationPairs());
        System.out.println("Reads pairs after deploying sensor: "+Reads.getReads()+"\n");

        //** Trying to deploy the same sensor in a different location */
        maps.DeploySensorLocation(s1,l2);
        System.out.println(maps.getSensorLocationPairs()+"\n");

        //** Trying to deploy a new sensor in a location that is already covered */
        maps.DeploySensorLocation(s2,l1);
        System.out.println(maps.getSensorLocationPairs()+"\n");

        //** Creating a location that we do not know and trying to send a sensor there */
        Location l5 = new Location("Delta");
        maps.DeploySensorLocation(s2,l5);
        System.out.println(maps.getSensorLocationPairs()+"\n");
    }
}