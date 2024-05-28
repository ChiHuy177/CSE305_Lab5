public class LowPriorityConcreteeCreator extends RequestCreator {
    @Override
    public Request createRequest() {
        LowPriorityConcrete request = new LowPriorityConcrete();
        request.setStatus();
        request.setExpire();
        request.setPriority();
        return new Request(request.getPriority(), request.getExpireDay(), request.getStatus());
    }
}
