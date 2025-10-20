class TemperatureSensor {
    
    private int temperature;

    
    public void setTemperature(int t) {
        if (t >= 0 && t <= 100) {
            this.temperature = t;
        } else {
            System.out.println("Temperature out of range");
        }
    }

    
    public int getTemperature() {
        return temperature;
    }

    
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();

        
        sensor.setTemperature(-5);  
        System.out.println("Temperature = " + sensor.getTemperature());

        sensor.setTemperature(37);  
        System.out.println("Temperature = " + sensor.getTemperature());
    }
}
