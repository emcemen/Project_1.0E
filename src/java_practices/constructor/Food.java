package java_practices.constructor;


    //create a class called Food
    public class Food {
    //- data:name, quantity, unit price, total price
    public String name;
    public int quantity;
    public double unitPrice;
    public double totalPrice;

    //- create a constructor that creates a Food object with the name
    public Food(String name) {
        this.name = name;
    }

    //- create a constructor that creates a Food object with the name and quantity
    public Food(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    //- create a constructor that creates a Food object with the name, quantity, and unit price
    public Food(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    //-> call calculatePrice() method here
    //- method: - calculatePrice(): multiple the quantity by unit price and assign the value to the total price
    public double calculatePrice() {
        totalPrice = quantity * unitPrice;
        return totalPrice;
    }

    //- toString()
    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
