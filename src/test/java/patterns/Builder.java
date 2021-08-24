package patterns;

public class Builder {
    public static void main(String[] args) {
        Candidate newCandidate = new CandidateBuilderImpl()
                .setFirstName("Петр")
                .setLastName("Мамонов")
                .setAge(19)
                .setTechnology("AQA Java")
                .setWontSalary(1000)
                .setLanguage("English - B1")
                .setCity("Vitebsk")
                .setCountry("Belarus")
                .build();
        newCandidate.print();

        System.out.println("/////////////////////////////////////////////////////////////////////");

        Candidate newCandidate2 = new CandidateBuilderImpl()
                .setFirstName("Михаил")
                .setLastName("Котиков")
                .setAge(65)
                .setTechnology("Dev")
                .setWontSalary(258.25)
                .build();

        newCandidate2.print();
    }
}

class Candidate {
        String firstName;
        String lastName;
        int age;
        String technology;
        String language;
        String country;
        String city;
        double wontSalary;
        public void print() {
            System.out.println(firstName + " " + lastName + ", " + age + " лет\n"
                    + "Технология - " + technology + " \n" + language + " \n" + country
                    + " \n" + city + " \n" + "Хочет зарплату - " + wontSalary + "$");
        }
}

interface CandidateBuilder {
        CandidateBuilder setFirstName(String firstName);
        CandidateBuilder setLastName(String lastName);
        CandidateBuilder setAge(int age);
        CandidateBuilder setTechnology(String technology);
        CandidateBuilder setLanguage(String language);
        CandidateBuilder setCountry(String country);
        CandidateBuilder setCity(String city);
        CandidateBuilder setWontSalary(double wontSalary);
        Candidate build();
}

class CandidateBuilderImpl implements CandidateBuilder {
    Candidate candidate = new Candidate();

    @Override
    public CandidateBuilder setFirstName(String name) {
        candidate.firstName = name;
        return this;
    }

    @Override
    public CandidateBuilder setLastName(String lastName) {
        candidate.lastName = lastName;
        return this;
    }

    @Override
    public CandidateBuilder setAge(int age) {
        candidate.age = age;
        return this;
    }

    @Override
    public CandidateBuilder setTechnology(String technology) {
        candidate.technology = technology;
        return this;
    }

    @Override
    public CandidateBuilder setLanguage(String language) {
        candidate.language = language;
        return this;
    }

    @Override
    public CandidateBuilder setCountry(String country) {
        candidate.country = country;
        return this;
    }

    @Override
    public CandidateBuilder setCity(String city) {
        candidate.city = city;
        return this;
    }

    @Override
    public CandidateBuilder setWontSalary(double wontSalary) {
        candidate.wontSalary = wontSalary;
        return this;
    }

    @Override
    public Candidate build() {
        return candidate ;
    }
}




