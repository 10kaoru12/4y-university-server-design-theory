public class Exercise6 {

    /** 商品の定価 */
    private int _itemPrice;

    /** 商品の数量 */
    private int _quantity;

    public double getPrice() {
        int basePrice = _quantity * _itemPrice;
        double discountFactor;
        if(basePrice > 1000){
            discountFactor = 0.95;
        }else{
            discountFactor = 0.98;
        }
        return basePrice * discountFactor;
    }
}
