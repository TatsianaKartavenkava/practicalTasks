package patterns.factoryMetod;

public class AndersenCompany {
    public static void main(String[] args) {
        QALaba qaLaba = createQASpecialty("auto");
        QAType qaType = qaLaba.createQA();

        qaType.testing();
    }

    static QALaba createQASpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("auto")) {
            return new AutoQALaba();
        } else if (specialty.equalsIgnoreCase("full")) {
            return new FullStackLaba();
        } else if (specialty.equalsIgnoreCase("manual")) {
            return new ManualQALaba();
        } else {
            throw new RuntimeException(specialty + " We are haven't this specialty in our laba");
        }
    }
}
