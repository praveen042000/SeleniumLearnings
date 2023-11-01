package FinalAssement;

class Customer {
    private String name;
    private String idNo;
    private double balance;
    private Item item;
    public Customer(String name, String idNo, double balance) {
        this.name = name;
        this.idNo = idNo;
        this.balance = balance;
    }
   public Customer(String name, String idNo) {
        this(name, idNo, 5000.00); // Default balance is 5000
    }
   // Getter and Setter methods
    public String getName() {
        return name;
    }
     public void setName(String name) {
       this.name = name;
    }
    public String getIdNo() {
        return idNo;
    }
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }
    public double getBalance() {

        return balance;
    }

    // Method to print item details and balance
    public void print() {
        System.out.println("CustomerName : " + name);
        System.out.println("CustomerId : " + idNo);
        System.out.println("CustomerBalance : " + balance);
        if (item != null) {
            System.out.println("ItemName : " + item.getItemName());
            System.out.println("Item Id : " + item.getItemidNo());
            System.out.println("ItemQuantity: " + item.getItemQuantity());
            System.out.println("ItemPrice : " + item.getItemPrice());
        }
    }
    // Method to buy an item
    public void buyItem(Item itemToBuy) {
        if (itemToBuy.getItemQuantity() < 1) {
            System.out.println("Order is not valid");
        } 
        else if (itemToBuy.getItemPrice()*itemToBuy.getItemQuantity() > balance) {

            System.out.println("Insufficient balance");

        } else {
         item = itemToBuy;
           balance -= itemToBuy.getItemPrice()*itemToBuy.getItemQuantity();
            System.out.println("ItemName : " + item.getItemName());
            System.out.println("Item Id : " + item.getItemidNo());
            System.out.println("ItemQuantity: " + item.getItemQuantity());
            System.out.println("ItemPrice : " + item.getItemPrice());
            System.out.println("Balance : " + balance);
        }

    }

}