import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Person {
    private String firstname;
    private  String lastname;
    private  int age;
    private  int postcode;
    private  String gender;


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public  int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private List<Person> getListFromCsv() throws IOException, IllegalAccessException {
        Reader in = new FileReader("Data.csv");
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withDelimiter(',').withHeader().parse(in);
        ArrayList<Person> list = new ArrayList<>();

        for (CSVRecord record : records) {
            // Hier wird jede Zeile durchlaufen.
        }

        return list;
    }
    @Override
    public String toString() {
        return "Person{" +
                "Firstname='" + firstname + '\'' +
                ", Lastname='" + lastname + '\'' +
                ", Age=" + age + '\'' +
                ", PostCode=" + postcode + '\'' +
                ", gender=" + gender +
                '}';
    }

}
