package sample.parser;

import sample.parser.Model.Root;
import java.io.IOException;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class School {

    //выполнение кнопки Загрузка
    public static void school(String EnterNumber){
        JsonParser parser = new JsonParser();   //
        Root root = parser.parse();             //
        itog(EnterNumber, root);             // сохраняем результат в itog.txt
    }

    //сохраняем результаты в файл itog.txt
    public static void itogSave(String text) {
        try (FileOutputStream fos = new FileOutputStream("itog.txt",true)) {
            // перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }
    public static void itog(String index, Root root) {
//копируем из списка items в spisok.
        ArrayList<String> spisok = new ArrayList<>();
        for (int i = 0; i < root.items.size(); i++) {
            String x = String.valueOf(root.items.get(i));
            spisok.add(i, x);
        }
        int number;
//создаем объект с датой, для фиксации времени обращения
        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
//поиск и вывод номера очеди | так же проверка на поиск значения в массиве
        if (spisok.indexOf(index) != -1) {
            number = spisok.indexOf(index) + 1;
//сохраняем полученные данные в файл itog.txt
            itogSave(root.getCount() + " \t" + number + " \t" + formatForDateNow.format(date) + "\n");
        } else {

            itogSave(index + " \t" + "Введен не правильный номер, очередь не найдена" + "\n");
        }

    }
    }

