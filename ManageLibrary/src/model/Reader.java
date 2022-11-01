package model;

public class Reader {
    private int id;
    private String name;
    private String address;
    private String phoneNumber;

    public Reader(int id) {
        this.id = id;
    }

    public Reader(int id, String address, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Add or fix more functions if necessary

    public int getId() {
        return id;
    }



    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                "\n";
    }
}
