
public class Contract {
    private String contractID;
    private String tenantID;
    private String propertyID;
    private double rentAmount;
    
    public Contract(String contractID, String tenantID, String propertyID, double rentAmount) {
        this.contractID = contractID;
        this.tenantID = tenantID;
        this.propertyID = propertyID;
        this.rentAmount = rentAmount;
    }

    @Override
    public String toString() {
        return this.contractID + " " + this.tenantID+ " "+ this.propertyID+" "+this.rentAmount;
    }

    
}
