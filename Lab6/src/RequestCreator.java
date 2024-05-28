public abstract class RequestCreator {
    public Request createRequest(){
        return null;

    }
    public Request processRequest(String priority, String exprireDay, String status){
        return new Request(priority, exprireDay, status);

    }
}
