public class Netflow implements Keyable{
    String inputIf;
    String outputIf;
    long bytes;

    public Netflow(String inputIf, String outputIf, long bytes) {
        this.inputIf = inputIf;
        this.outputIf = outputIf;
        this.bytes = bytes;
    }

    public String getInputIf() {
        return inputIf;
    }

    public void setInputIf(String inputIf) {
        this.inputIf = inputIf;
    }

    public String getOutputIf() {
        return outputIf;
    }

    public void setOutputIf(String outputIf) {
        this.outputIf = outputIf;
    }

    public long getBytes() {
        return bytes;
    }

    public void setBytes(long bytes) {
        this.bytes = bytes;
    }

    @Override
    public String getKey() {
        return inputIf + "_" + outputIf;
    }
}
