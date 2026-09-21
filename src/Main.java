public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger phoneCharger = new SmartphoneCharger();


        PowerOutlet laptopOutlet = new LaptopAdapter(laptop);
        PowerOutlet fridgeOutlet = new RefrigeratorAdapter(refrigerator);
        PowerOutlet phoneOutlet = new SmartphoneAdapter(phoneCharger);


        System.out.println("--- Plugging in devices ---\n");
        laptopOutlet.plugIn();
        fridgeOutlet.plugIn();
        phoneOutlet.plugIn();
    }
}