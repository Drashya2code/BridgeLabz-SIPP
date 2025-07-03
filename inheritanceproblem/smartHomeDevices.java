package inheritanceproblem;

import java.util.Scanner;

class Thermostat{
    String temperaruteSetting;

    public Thermostat(String temperatureSetting){
        this.temperaruteSetting = temperatureSetting;
    }
}

class Device{
    int deviceId;
    String status;
    Thermostat thermostat;

    public Device(int deviceId, String status, Thermostat thermostat){
        this.deviceId = deviceId;
        this.status = status;
        this.thermostat = thermostat;
    }

    void displayStatus(){
       System.out.println("Your device with deviceId "+ deviceId +" is currently" + status + " with temperature setting as " + thermostat);
    }
}

public class smartHomeDevices {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter device Id: ");
        int deviceId = sc.nextInt();

        System.out.println("Enter current status of your device: ");
        String status = sc.nextLine();

        System.out.println("Enter the current Temperature Setting: ");
        String temperatureSetting = sc.nextLine();
        sc.nextLine();

        Thermostat thermostat = new Thermostat(temperatureSetting);

        Device device = new Device(deviceId, status, thermostat);

        device.displayStatus();
        
        sc.close();
        
        
    }
}
