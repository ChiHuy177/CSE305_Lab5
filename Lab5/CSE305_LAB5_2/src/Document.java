public class Document {
    private String extension;
    private String encrytion;

    public Document(String extension, String encrytion) {
        this.extension = extension;
        this.encrytion = encrytion;
 
    }
    @Override
    public String toString() {
        return this.extension +" "+ this.encrytion;
    }
}
