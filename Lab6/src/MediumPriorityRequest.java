public class MediumPriorityRequest implements RequestProduct{
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
        this.priority = "Medium";
    }

    @Override
    public void setExpire() {
        this.expireDay = "28/6/2024";
        }

    @Override
    public void setStatus() {
        this.status = "Accepted";
    }

    @Override
    public void processRequest() {
        System.out.println("Request accept, estimated \r\n" + //
                        "completion date is " + expireDay);}
}
