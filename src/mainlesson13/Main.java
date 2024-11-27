package mainlesson13;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SmartFridge smartFridge=new SmartFridge();
        SmartWashingMachine smartWashingMachine=new SmartWashingMachine();

        smartFridge.turnOn();
        smartFridge.connectToWifi();
        smartFridge.showBrand("CoolTech Appliances");
        System.out.println("-------------------------------------------");
        smartWashingMachine.turnOn();
        smartWashingMachine.connectToWifi();
        smartWashingMachine.showBrand("CleanTech Solutions");




    }
}