public class Hp extends Laptop {
    public Hp() {
    }

    public Hp(String manufacture, String model, String design, String form, Memory memory, GraphicCard graphicCard, AudioCard audioCard, Cpu cpu, float batteryCapacity, float screenSize) {
        super(manufacture, model, design, form, memory, graphicCard, audioCard, cpu, batteryCapacity, screenSize);
    }



    @Override
    public String checkOsVersion() {
        return ("Linux is installed");
    }

    @Override
    public String batteryInfo() {
        return ("Hp Battery capacity: "+getBatteryCapacity()+" mah");
    }
    @Override
    public String toString() {
        return turnOn()+"\n"+batteryInfo()+"\n"+checkOsVersion();
    }

}
