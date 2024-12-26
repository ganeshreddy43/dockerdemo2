package jpainheritence;

import java.util.Date;

public class StockTest {

    public static void main(String[] args) {
        StockService dao = new StockService();

        RestrictedStocksEntity restrictedStock = new RestrictedStocksEntity();
        restrictedStock.setPrice(300.5);
        restrictedStock.setDuration(24);
        restrictedStock.setLockInPeriod(12);

        OptionalStockEntity optionalStock = new OptionalStockEntity();
        optionalStock.setPrice(400.75);
        optionalStock.setDuration(36);
        optionalStock.setStrikePrice(190.5);

        FutureStockEntity futureStockEntity = new FutureStockEntity();
        futureStockEntity.setPrice(550.25);
        futureStockEntity.setDuration(18);
        futureStockEntity.setDeliveryDate(new Date());

        dao.saveStock(restrictedStock);
        dao.saveStock(optionalStock);
        dao.saveStock(futureStockEntity);
    }


}
