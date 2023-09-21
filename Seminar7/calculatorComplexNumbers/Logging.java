package Seminar7.calculatorComplexNumbers;

import java.io.*;
import java.util.Date;

public class Logging {
    public void log(String l) {
        Date date = new Date();
        try {
            FileWriter fw = new FileWriter("logFile.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(date + " " + l);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
            e.printStackTrace();
        }
    }

    public void readLogFile() {
        try {
            FileReader fr = new FileReader("logFile.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
            e.printStackTrace();
        }
    }
}
