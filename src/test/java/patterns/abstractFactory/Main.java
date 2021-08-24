package patterns.abstractFactory;

public class Main {
    public static void main(String[] args) {
        AndersenFactory vacancy = new AndersenFactory();

        HiringOnWork autoQAJava = vacancy.getNewCandidates(CandidatesType.AQA_JAVA);
        HiringOnWork developer = vacancy.getNewCandidates(CandidatesType.DEVELOPER);
        HiringOnWork designer = vacancy.getNewCandidates(CandidatesType.DESIGNER);

        autoQAJava.hiringCandidate();
        designer.hiringCandidate();
        developer.hiringCandidate();
    }
}
