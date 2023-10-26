public class Temperature {
    private float temperature;

    public final float getCelsius()
    {
        return (int)(Math.random() *30 -30);
    }

    public final float getFahrenheit()
    {
        return (int)(Math.random() *86 - 22);
    }
}
