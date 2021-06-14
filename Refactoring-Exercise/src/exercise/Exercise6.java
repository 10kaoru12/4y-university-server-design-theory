package exercise;

import java.math.BigDecimal;

public class Exercise6 {
    // 割引率の閾値
    private static final BigDecimal DISCOUT_THRESHOLD = new BigDecimal("1000");

    // 通常の割引率
    private static final BigDecimal NORMAL_DISCOUNT = new BigDecimal("0.98");

    // 特別な割引率
    private static final BigDecimal SPECIAL_DISCOUNT = new BigDecimal("0.95");

    /** 商品の定価 */
    private BigDecimal _itemPrice;

    /** 商品の数量 */
    private BigDecimal _quantity;
    
    public BigDecimal getPrice() {
        return calcPrice(_quantity.multiply(_itemPrice));
    }

    private BigDecimal calcPrice(BigDecimal basePrice) {
        if(basePrice.compareTo(DISCOUT_THRESHOLD) == 0){
            return basePrice.multiply(SPECIAL_DISCOUNT);
        }else{
            return basePrice.multiply(NORMAL_DISCOUNT);
        }
    } 
}