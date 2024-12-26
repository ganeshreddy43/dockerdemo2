package jpainheritence;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "restricted_stock" ,schema = "sonar")
public class RestrictedStocksEntity extends StockEntity {
    private int lockInPeriod; // Additional property to RestrictedStock

    public int getLockInPeriod() {
        return lockInPeriod;
    }


    public void setLockInPeriod(int lockInPeriod) {
        this.lockInPeriod = lockInPeriod;
    }
}