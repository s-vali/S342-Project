public class Temperature {

    private int temperature;

    public Temperature(){
        temperature = (int)(Math.random() *30 -30);
    }

    //** Getters */
    public int getCelsius()
    {
        return this.temperature;
    }

    @Override
    public String toString() {
        return "temperature: " + temperature;
    }

}
