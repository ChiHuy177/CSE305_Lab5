public class HighPriorityRequest implements RequestProduct {
    private String priority;
    private String expireDay;
    private String status;
    

    public String getPriority() {
        return priority;
    }

    public String getExpireDay() {
        return expireDay;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void setPriority() {
        this.priority = "Emergency";
    }

    @Override
    public void setExpire() {
        this.expireDay = "28/5/2024";
    }

    @Override
    public void setStatus() {
        this.status = "Accept";
    }

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately !");
    }

}
