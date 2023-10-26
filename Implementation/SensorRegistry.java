import java.util.HashSet;

public class SensorRegistry {
        private static final HashSet<Sensor> sensors = new HashSet<Sensor>();

        SensorRegistry(Sensor s){
                sensors.add(s);
        }

        public void clearSetSensors(){
                sensors.clear();
        }

        public void removeSensor(Sensor s) {
                sensors.remove(s);
        }

        public void addSensor(Sensor s) {
                if (!sensors.contains(s)) {
                        sensors.add(s);
                }
                else{
                        System.out.println("Sensor Already Deployed!");
                }
        }

        public Boolean SensorAlreadyDeployed(Sensor s){
                return sensors.contains(s);
        }

}
