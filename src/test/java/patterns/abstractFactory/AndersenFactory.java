package patterns.abstractFactory;

public class AndersenFactory {
    HiringOnWork getNewCandidates(CandidatesType type) {
        HiringOnWork toReturn = null;
        switch (type) {
            case DESIGNER:
                toReturn = new CandidatesDesigner();
                break;
            case AQA_JAVA:
                toReturn = new CandidatesAQAJava();
                break;
            case DEVELOPER:
                toReturn = new CandidatesDev();
                break;
            default:
                throw new IllegalArgumentException("У нас такой вакансии нет");
        }
        return toReturn;
    }
}
