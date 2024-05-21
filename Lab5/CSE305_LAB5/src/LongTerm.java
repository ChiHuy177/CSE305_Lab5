public class LongTerm implements ContractBuilder{
    private String contractID;
    private String tenantID;
    private String propertyID;
    private double rentAmount;

    


    @Override
    public void buildContractID(String contractID) {
        this.contractID = contractID;
        
    }
    @Override
    public void buildPropertyID(String propertyID) {
        this.propertyID = propertyID;
        
    }
    @Override
    public void buildRentAmount(double amout) {
        this.rentAmount = amout;
        
    }
    @Override
    public void buildTenantID(String tenantID) {
        this.tenantID = tenantID;
        
    }
    @Override
    public Contract signContract() {
        return new Contract(contractID, tenantID, propertyID, rentAmount);
    }


}

