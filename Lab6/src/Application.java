public class Application {
    public static void main(String[] args) {
        LowPriorityConcreteeCreator requestCreator = new LowPriorityConcreteeCreator();
        Request request = requestCreator.createRequest();
        System.out.println(request.getStatus());
    }
}
