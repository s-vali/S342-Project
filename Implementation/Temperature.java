public class Temperature {

    private int temperature;

    public Temperature(){
        temperature = (int)(Math.random() *30 -30);
    }

    //** Getters */
    public int getTemperature()
    {
        return this.temperature;
    }

    public static void showTemperature(Temperature t) {
        if(t == null) {
            System.out.println("No temperature associated with this location");
        }
        else {
            System.out.println("temperature=" + t.getTemperature());
        }
    }

}
