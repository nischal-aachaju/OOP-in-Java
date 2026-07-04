public class Product {
    private int productID;
    private  String productName;
    private double price;

    public Product(String name,int ID,double p) {
        this.productName=name;
        this.productID=ID;
        this.price=p;
    }

    
    public void setProductID(int productID){
        this.productID=productID;
    }

    public int getProductID(){
        return  this.productID;
    }

    public void setProductName(String name){
        this.productName=name;
    }
    public String getProductName(){
        return  this.productName;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return  this.price;
    }

    public double calculateDiscount(){
        if (this.price>1000){
            
            return this.price*0.85;
        }
        else if (this.price> 500){
            return  this.price * 0.90;
        }
        else {
            return  this.price*0.95;
        }
    }
    void displayProductDetails(){
        System.out.println("Name: "+this.getProductName()+" Price: "+this.getPrice()+" Total price: "+ this.calculateDiscount());

    };
};

class Main {
    public static void main(String[] args) {
    Product pen=new Product("Pen",1,5);
    pen.getPrice();
    pen.setPrice(600);
    pen.displayProductDetails();
}

}
