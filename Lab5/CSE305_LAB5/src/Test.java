 class Client {
    private ContractBuilder builder;
    public Client(ContractBuilder builder){
        this.builder = builder;
    }


    public Contract requestCreateRentalContract(){
        builder.buildContractID("01");
        builder.buildPropertyID("01");
        builder.buildTenantID("01");
        builder.buildRentAmount(01);
        return builder.signContract();
    }

    
}

 class Test{
    public static void main(String[] args) {
        ContractBuilder contractBuilder = new LongTerm();
        Client client = new Client(contractBuilder);
        Contract contract = client.requestCreateRentalContract();
        System.out.println(contract);
    }
}


