PROBLEMA:
double getFinalPrice(){
    double basePrice  = quantity*itemPrice;
    double discount;
    System.out.println("The base price is " + basePrice);
    System.out.print("The final price is " + basePrice*0.95);
    if(basePrice > 5000){
        discount = basePrice*0.95;
    }else{
        System.out.print("The price is " + basePrice*0.98);
        discount = basePrice * 0.98;
    }
    return 
}

REFACTOR:
double getBasePrice(){
    return quantity * itemPrice;
}

double getFinalPrice(){
    double base = getBasePrice();
    double finalPrice = getPriceWithDiscount(base);
    printDetails(base, finalPrice);
    return finalPrice;
}

double getPriceWithDiscount(double price){
    if(basePrice > 5000){
        return basePrice*0.95;
    return basePrice * 0.98;
}

void printDetails(double base, double finalP){
    System.out.println("The base price is " + base);
    System.out.println("The final price is " + finalP);
}