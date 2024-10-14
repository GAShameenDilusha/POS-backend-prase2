package lk.ijse.posbackendprase2.util;

import java.util.UUID;

public class AppUtil {

    public static String generateCustomerId(){
        return "CUSID-" + UUID.randomUUID();
    }

    public static String generateItemId(){
        return "ITEMID-" + UUID.randomUUID();
    }

    public static String generateOrderId(){
        return "ORDERID-" + UUID.randomUUID();
    }

    public static String generateOrderDetailId(){ return "ORDERDETAILID-" + UUID.randomUUID();}
}
