public interface ContractBuilder {

    public void buildContractID(String contractID);

    public  void buildPropertyID(String propertyID);

    public void buildTenantID(String tenantID);

    public void buildRentAmount(double amout);

    public Contract signContract();


    

}
