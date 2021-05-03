import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ScannerCSV {
    public ScannerCSV() {
    }

    public static void main(String[] args) throws IOException {


/*////Lesen CSV File ein
//        String fileName = "Data.csv";
//        File file = new File(fileName);
//
//        try {
//            Scanner inputStream = new Scanner(file);
//            while (inputStream.hasNext()) {
//                String data = inputStream.next();
//                System.out.println(data);
//            }
//            inputStream.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }*/

//Stream Anwendungen
// Filtern alle Vornamen mit A, sortieren diese und geben sie raus
        String [] names ={"Alexa","Lisa", "Alex", "Rolf","Lili", "Adolf", "Raik","Leo", "Nana", "Rita"};
        Stream.of(names)
                .filter(x -> x.startsWith("A"))
                .sorted()
                .forEach(System.out::println);

        Arrays.stream(new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20})
                .map(x ->x*x)
                .average()
                .ifPresent(System.out::println);
//wende map an, zähle von kleinen Buchstaben auf, filter Buchstabe a aus,
        List<String> people = Arrays.asList("Alexa","Lisa", "Alex", "Rolf","Lili", "Adolf", "Raik","Leo", "Nana", "Rita");
        people
                .stream()
                .map(String::toLowerCase)
                .filter(x ->x.startsWith("a"))
                .forEach(System.out::println);

 //filtern das Alter höher als 30
        Stream <String> age = Files.lines(Paths.get("Data.csv"));
        age
                .sorted()
                .filter(x -> x.length ()> 30)
                .forEach(System.out::println);
        age.close();

 //counten die Zeilen-> eine Zeile 19 hat nicht eine 5 Attribute, diese wird angezeigt
 //wird split die Attribute in "," auf, suchen nach 5 Attributen und zeigen an welche Zeile die Fehlerhafte Zeile befindet
        Stream<String> rows1 = Files.lines(Paths.get("Data.csv"));
        int rowCount = (int) rows1
                .map(x -> x.split(","))
                .filter(x -> x.length ==5)
                .count();
        System.out::println(rowCount + " rows.");
        rows1.close();

    // nutzen HashMAp und collect






    }
}






