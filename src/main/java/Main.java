import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths.get("Задача ВС Java Сбер.csv"));


        while(scanner.hasNextLine()){
          String line = scanner.nextLine();
          String [] array = line.split(";");

          City city = new City();
          city.setName(array[1]);
          city.setRegion(array[2]);
          city.setDistrict(array[3]);
          city.setPopulation(Integer.parseInt(array[4]));
          if(array.length > 5){
              city.setFoundation(array[5]);
          }


          System.out.println(city);

        }

    }
}
