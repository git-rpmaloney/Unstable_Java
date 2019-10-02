class shop{
    public static void main(String abc[]){
        int quantity;
        float price;
        float amount;
        String product;
        quantity = 23;
        price = 3.10F;
        product = "Oreo LARGE";
        amount = quantity*price;
        //prints the receipt
        System.out.println("***ASDA RECEIPT***");
        System.out.println("Your server today was Shafeeq");
        System.out.println("_____________________________________");
        System.out.println("Product: "+ product);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + price);
        System.out.println("Amount: " + amount);
        System.out.println("VAT: "+((amount*20)/100));
        System.out.println("Net Amount:" +
        (amount-(amount*20/100)));
    }
}
