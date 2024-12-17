package Class_14_12_2024;

public class Computer {
    private String cpu;
    private String motherBoard;
    private String ram;
    private String psu;
    private String ssd;
    private String keyboard;
    private String mouse;
    private String monitor;
    private String speaker;

    public Computer() {
    }

    public Computer(String cpu, String motherBoard, String ram, String psu, String ssd) {
        this.cpu = cpu;
        this.motherBoard = motherBoard;
        this.ram = ram;
        this.psu = psu;
        this.ssd = ssd;
    }

    public Computer(String cpu, String motherBoard, String ram, String psu, String ssd, String keyboard, String mouse, String monitor, String speaker) {
        this.cpu = cpu;
        this.motherBoard = motherBoard;
        this.ram = ram;
        this.psu = psu;
        this.ssd = ssd;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
        this.speaker = speaker;
    }

    void turnOn() {
        System.out.println("Started the computer");
    }

    void turnOff() {
        System.out.println("Turned off the PC");
    }

    void hangPc() {
        System.out.println("System stuck");
    }

    void restartPc() {
        System.out.println("Restarting PC");
    }

    public String getCpu() {
        return cpu;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public String getRam() {
        return ram;
    }

    public String getPsu() {
        return psu;
    }

    public String getSsd() {
        return ssd;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public String getMonitor() {
        return monitor;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setPsu(String psu) {
        this.psu = psu;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", motherBoard='" + motherBoard + '\'' +
                ", ram='" + ram + '\'' +
                ", psu='" + psu + '\'' +
                ", ssd='" + ssd + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", mouse='" + mouse + '\'' +
                ", monitor='" + monitor + '\'' +
                ", speaker='" + speaker + '\'' +
                '}';
    }
}
