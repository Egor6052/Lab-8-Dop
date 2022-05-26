package Package;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Database {

    private double[] Products;



    /**
     * Сохранение файла;
     *
     * @return
     */
    public void save(String filename) throws IOException {
        FileWriter outStream = new FileWriter(filename);
        BufferedWriter bw = new BufferedWriter(outStream);
        for (int i = 0; i < 6; i++) {
            try {
                bw.write(String.valueOf(Products[i]));
                bw.write(System.lineSeparator());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        bw.close();
        outStream.close();
    }

    /**
     * Загрузка файла;
     *
     * @param filename
     * @throws IOException
     */
    public void load(String filename) throws IOException {
        this.clear();
        Scanner scanner = new Scanner(new FileReader(filename));
        double rec = -1;

        while (scanner.hasNextLine()) {
            rec = Double.parseDouble(scanner.nextLine());
//            Products.add(new Products);
        }
        scanner.close();
    }

    private void clear() {
//            this.Products.clear();
    }

    /**
     * Бэкап Файла;
     */
    public static class Backup {
        private final Calendar calendar = Calendar.getInstance();
        private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");
        private String time = "cdds.txt";
        private String date = dateFormat.format(calendar.getTime()) + "text.txt";

        public void save(Database db) throws IOException {
            db.save(date);
            System.out.println(time);
        }

        public void load(Database db) throws IOException {
            db.load(date);
        }
    }
}