public class GraphicCard {
    private String manufacture;
    private int videoMemoryCapacity;
    private int videoChipSerialNumber;

    public GraphicCard() {
    }

    public GraphicCard(String manufacture, int videoMemoryCapacity, int videoChipSerialNumber) {
        this.manufacture = manufacture;
        this.videoMemoryCapacity = videoMemoryCapacity;
        this.videoChipSerialNumber = videoChipSerialNumber;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getVideoMemoryCapacity() {
        return videoMemoryCapacity;
    }

    public void setVideoMemoryCapacity(int videoMemoryCapacity) {
        this.videoMemoryCapacity = videoMemoryCapacity;
    }

    public int getVideoChipSerialNumber() {
        return videoChipSerialNumber;
    }

    public void setVideoChipSerialNumber(int videoChipSerialNumber) {
        this.videoChipSerialNumber = videoChipSerialNumber;
    }

    //выдаём информацию о Graphic Card
    @Override
    public String toString() {
            return ("Graphic card: " +
                    "Graphic card manufacture: " + getManufacture() + "; " +
                    "Memory capacity: " + getVideoMemoryCapacity() + "; " +
                    "Serial number: " + getVideoChipSerialNumber());
        };
}
