public class SUVCar extends Car {
    public String manufacturer;
    SUVCar(){
        manufacturer="BMW";
    }
    SUVCar(String manu){
        manufacturer=manu;
    }
    
    SUVCar(int price,String type,String manu){
        super(price, type);
        manufacturer=manu;
    }

    public void setManufacturer(String mn){this.manufacturer=mn;}
    public String getManufacturer(){return manufacturer;}

    public void printCar(){
        System.out.println("----------------");
		System.out.println(getPrice());
		System.out.println(getType());
        System.out.println(getManufacturer());
    }
}