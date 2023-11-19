public class Main {
    public static void main(String[] args) {
        //** Creating required objects for testing */
        Sensor s1 = new Sensor();
        Sensor s2 = new Sensor();
        Sensor s3 = new Sensor();
        Location l1 = new Location("Montreal");
        Location l2 = new Location("Detroit");
        Location l3 = new Location("Quebec");
        LocationRegistry.addLocation(l1);
        LocationRegistry.addLocation(l2);
        LocationRegistry.addLocation(l3);
        MapOfSL maps = new MapOfSL();

        //** Testing that a location cannot be doubled in the registry */
        System.out.println("--Testing that a location cannot be doubled in the registry: ");
        System.out.println("\nAdding a duplicate location for testing:");
        Location l4 = new Location("Montreal");
        LocationRegistry.addLocation(l4);

        System.out.println("\n--Displaying Registries to demonstrate that all locations were added as expected:");
        System.out.println("Sensor Registry: "+SensorRegistry.getSensorRegistry());
        System.out.println("Location Registry: "+LocationRegistry.getLocationRegistry()+"\n");

        //** Deploying a sensor */
        System.out.println("--Testing deploying a sensor: "); 
        System.out.println("s1=" + s1 + ", l1=" + l1); 
        System.out.println("Deploying sensor..."); 
        maps.DeploySensorLocation(s1,l1);
        System.out.println("Maps pairs after deploying sensor: "+ maps.getSensorLocationPairs());
        System.out.println("Reads pairs after deploying sensor: "+ Reads.getReads()+"\n");

        //** Trying to deploy the same sensor in a different location */
        System.out.println("--Trying to deploy the same sensor in a different location: "); 
        maps.DeploySensorLocation(s1,l2);
        System.out.println("Table of (Sensor, Location): " + maps.getSensorLocationPairs()+"\n");

        //** Trying to deploy a new sensor in a location that is already covered */

        System.out.println("--Trying to deploy a new sensor in a location that is already covered: ");
        maps.DeploySensorLocation(s2,l1);
        System.out.println("Table of (Sensor, Location): " + maps.getSensorLocationPairs()+"\n");

        //** Creating a location that we do not know and trying to send a sensor there */
        System.out.println("--Creating a location that we do not know and trying to send a sensor there: ");
        Location l5 = new Location("Delta");
        maps.DeploySensorLocation(s2,l5);
        System.out.println(maps.getSensorLocationPairs()+"\n");

        System.out.println("--Deploying new (sensor, location) --> (s2, l2) and (s3, l3): ");
	maps.DeploySensorLocation(s2,l2);//deploying new sensors, will yield their own temperatures and add to Reads table
	maps.DeploySensorLocation(s3,l3);
		
	System.out.println("\n--Testing readTemperature");
	Read reads = new Read();
        System.out.println(reads.toString());
	System.out.println("Consider l3=" + l3 + ", s3=" + s3);
	System.out.println("Getting sensor associated with l3: " + maps.getSensorMap(l3));
	Temperature t3 = reads.readTemperature(l3);
	System.out.println("The Temperature instance found is: " + t3);
	Temperature.showTemperature(t3);
	
	System.out.println("\n--Testing on location that does not exist in LocationRegistry");
	Temperature.showTemperature(reads.readTemperature(new Location("Boston")));

	/*Testing returning <Location, Temperature>*/
	System.out.println("\n--Testing new function returnLocationTemperature() for <Location, Temperature> pairs deployed in the tables Maps and Reads: ");
    	Read.returnLocationTemperature();

	/* Iteration 2 video

        Sensor s1 = new Sensor();
        Sensor s2 = new Sensor();
        Sensor s3 = new Sensor();
        Sensor s4 = new Sensor();
        Location l1 = new Location("Montreal");
        Location l2 = new Location("Detroit");
        Location l3 = new Location("Quebec");
        LocationRegistry.addLocation(l1);
        LocationRegistry.addLocation(l2);
        LocationRegistry.addLocation(l3);
        MapOfSL maps = new MapOfSL();
        Read r = new Read();

        maps.DeploySensorLocation(s1,l1);
        maps.DeploySensorLocation(s2,l2);
        maps.DeploySensorLocation(s3,l3);

        System.out.println(SensorRegistry.getSensorRegistry());
        maps.DeleteFromRegistery(s2);
        System.out.println(SensorRegistry.getSensorRegistry());
        
        */
    }
}
