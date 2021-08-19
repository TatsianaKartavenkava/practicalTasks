package patterns.factoryMetod;

public class FullStackLaba implements QALaba{
    @Override
    public QAType createQA() {
        return new FullStackQA();
    }
}
