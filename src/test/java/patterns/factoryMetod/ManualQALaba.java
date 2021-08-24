package patterns.factoryMetod;

public class ManualQALaba implements QALaba{
    @Override
    public QAType createQA() {
        return new ManualQA();
    }
}
