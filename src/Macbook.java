public class Macbook extends Laptop {
    public Macbook(String manufacture, String model, String design, String form, Memory memory, GraphicCard graphicCard, AudioCard audioCard, Cpu cpu, float batteryCapacity, float screenSize) {
        super(manufacture, model, design, form, memory, graphicCard, audioCard, cpu, batteryCapacity, screenSize);
    }


    @Override
    public String checkOsVersion() {
        return("Mac OS is installed");
    }

    @Override
    public String batteryInfo() {
        return ("Macbook Battery capacity: "+getBatteryCapacity()+" mah");
    }
}
