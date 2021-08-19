package patterns.factoryMetod;

public class AutoQALaba implements QALaba {

    @Override
    public QAType createQA() {
        return new AutomationQA();
    }
}
