public class Car{
    private int price;
    private String type;
    Car(){
       type = "noshape";
       price = 0;
    }
    Car(int price,String type){
        this.type=type;
        this.price=price;
    }
    public int getPrice(){ return price; }
    public String getType(){ return type; }
    public void setPrice(int ang){this.price=ang;}
    public void setType(String ty){this.type=ty;}
    public void printCar()
	{

        System.out.println("----------------");
		System.out.println(getPrice());
		System.out.println(getType());
        System.out.println("----------------");
        
	}
}

