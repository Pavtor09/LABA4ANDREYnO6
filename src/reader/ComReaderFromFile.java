package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ComReaderFromFile implements Reader {
    public  List<String> lines = new ArrayList<>();

    public  List<String> getLines() {
        return lines;
    }

    /**
     *
     * @param fileName
     * читает из файла скрипт и переписывает его в lines
     */
    public  void read(String fileName) throws IOException {
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
//            System.out.println(lines);

        } catch (IOException e) {
            throw new IOException("Ну там какие-то проблемы");
        }

        // Преобразуем список в массив строк
//        System.out.println("считал файл");
         lines.toArray(new String[0]);
    }
}


