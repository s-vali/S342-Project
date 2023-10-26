import java.util.*;

public class LocationRegistry {
        private HashSet<Location> locations = new HashSet<Location>();

        public void removeLocation(Location l) {
                if (locations.contains(l)) {
                        locations.remove(l);
                }
        }

        public void addLocation(Location l) {
                if (!locations.contains(l)) {
                        locations.add(l);
                }
        }

        public Boolean hasLocation(Location l){
                return locations.contains(l);
        }

}
