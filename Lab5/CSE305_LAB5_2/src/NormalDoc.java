public class NormalDoc implements DocumentBuilder {
    private String extension;
    private String encrytion;

    @Override
    public void setExtension(String extesion) {
        this.extension = extesion;
    }

    @Override
    public void setEncrytion(String encrytion) {
        this.encrytion = encrytion;
    }

    @Override
    public Document buildDoc() {
        return new Document(extension, encrytion);
    }

}
