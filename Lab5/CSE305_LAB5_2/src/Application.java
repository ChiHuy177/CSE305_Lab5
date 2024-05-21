public class Application {
    public static void main(String[] args) {
        DocumentBuilder documentBuilder = new ConfidentialDoc();
        Clientt client =  new Clientt(documentBuilder);
        Document doc = client.newDocument();
        System.out.println(doc);
    }
}
