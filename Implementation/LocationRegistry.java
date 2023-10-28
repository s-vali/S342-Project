import java.util.*;

public class LocationRegistry {
        private static final HashMap<String, Location> locations = new HashMap<String, Location>();
        
        //** Constructor */
        LocationRegistry(Location l){
                locations.put(l.getLocation(),l);
        }

        //** Getter */
        public static HashMap<String,Location> getLocationRegistry() {
                return locations;
        }

        //** Add location method */
        public static void addLocation(Location l) {
                if (locations.containsKey(l.getLocation())){
                        System.out.println("Location already known");
                    }
                    else {
                        locations.put(l.getLocation(), l);
                    }
        }

        //** Remove location method  */
        public void removeLocation(Location l) {
                if (locations.containsKey(l.getLocation())) {
                        locations.remove(l);
                }
                else
                        System.out.println("Location is not known");
        }

        //** Method to empty the location hash set */
        public void clearKnownLocations(){
                locations.clear();
        }

        //** Checking if location exists in hash set */
        public static Boolean hasLocation(Location l){
                return locations.containsKey(l.getLocation()) || locations.containsValue(l);
        }

}
