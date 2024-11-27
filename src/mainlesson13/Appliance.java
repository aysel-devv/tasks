package mainlesson13;

public abstract class Appliance {
    abstract void turnOn();

    public void showBrand(String brandName){
        System.out.println("Brand name: "+brandName);
    }
}
