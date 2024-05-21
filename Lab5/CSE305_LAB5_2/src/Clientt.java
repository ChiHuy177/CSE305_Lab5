public class Clientt {
    private DocumentBuilder builder;

    public Clientt(DocumentBuilder builder) {
        this.builder = builder;
    }

    public Document newDocument(){
        builder.setEncrytion("encryp");
        builder.setExtension("Extension");
        return builder.buildDoc();
    }
}
