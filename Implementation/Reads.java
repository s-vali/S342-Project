import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Reads {

	//Attributes
	
	Sensor s1 = new Sensor(true, 1); Temperature t1 = new Temperature(0);
	Sensor s2 = new Sensor(true, 2); Temperature t2 = new Temperature(0);
	Sensor s3 = new Sensor(true, 3); Temperature t3 = new Temperature(0);
	
	Read r = new Read(s1,  t1);
	Read r2 = new Read(s2,  t2);
	Read r3 = new Read(s3,  t3);

	public Map<Sensor, Temperature> pairsST = new HashMap<>();
	
	List<Read> reads;
	public Reads() {
		reads = new ArrayList<Read>() {{
			add(r);
			add(r2);
			add(r3);
		}};
	}
	
	//Methods
	public Read getReadST(Sensor sensor) { //FOR LIST SEARCH
		Read resultRead = null;
		for (Read read : reads) {
            if (read.getSensor().getSensorID() == sensor.getSensorID()) {
                resultRead = read;
                break; // Stop searching once a match is found
            }
        }
        if (resultRead != null) {
            System.out.println("Found: " + resultRead + ", " + resultRead.getTemperature().getTemperature());
            return resultRead;
        } else {
            System.out.println("Not found.");
            return null;
        }
	}
	
} //end of class
