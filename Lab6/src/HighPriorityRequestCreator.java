public class HighPriorityRequestCreator extends RequestCreator{
    @Override
    public Request createRequest() {
        HighPriorityRequest request = new HighPriorityRequest();
        request.setStatus();
        request.setExpire();
        request.setPriority();
        return new Request(request.getPriority(), request.getExpireDay(), request.getStatus());
    }
}
