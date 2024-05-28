public class MidPriorityConcreteCreator extends RequestCreator{
    @Override
    public Request createRequest() {
        MediumPriorityRequest request = new MediumPriorityRequest();
        request.setStatus();
        request.setExpire();
        request.setPriority();
        return new Request(request.getPriority(), request.getExpireDay(), request.getStatus());
    }
}
