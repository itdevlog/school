package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import sample.parser.*;

public class Controller {

    @FXML
    private Button Downloads;

    @FXML
    private TextField EnterNumber;

    @FXML
    private Label schoolConfig;

    @FXML
    private Label numberConfig;

    @FXML
    private TextArea DisplayFile;

    @FXML
    private ChoiceBox<String> ChoiseSchoolBox;

    //кнопка ChoiceBox (выбор школы)
    //устанавливаем в переменной адрес сайта с json
    public void checkText() throws IOException {
        String url = ChoiseSchoolBox.getValue();//присваиваем переменной url значение ChoiseSchoolBox
        String x = JsonFile.getLinkSchool(url); //получаем адрес сайта с json для школы
        JsonFile.setUrlSchool(x);                  //
        JsonFile.jsonWriteFile();               // получаем json с сайта и записываем в файл
    }


    @FXML
    void initialize() throws IOException {

        assert Downloads != null : "fx:id=\"Downloads\" was not injected: check your FXML file 'sample.fxml'.";
        assert EnterNumber != null : "fx:id=\"EnterNumber\" was not injected: check your FXML file 'sample.fxml'.";
        assert DisplayFile != null : "fx:id=\"Fileoutp\" was not injected: check your FXML file 'sample.fxml'.";
        assert ChoiseSchoolBox != null : "fx:id=\"ChoiseSchool\" was not injected: check your FXML file 'sample.fxml'.";

    }

    //кнопка Загрузка
    //отправляем введенный номер в интерфейсе
    @FXML
    public void clickSchool() throws IOException {

        if (JsonFile.urlSchool == null) {
            DisplayFile.clear();
            DisplayFile.setText("Выберите школу");
        } else {
            School.school(EnterNumber.getText());
            displayText();

        }
        if (!EnterNumber.getText().equals("")) {
            String ErNr = EnterNumber.getText();
            String CeSlBx = ChoiseSchoolBox.getValue();
            Setting.setSettirgSeting(CeSlBx, ErNr);
        } else {
            DisplayFile.clear();
            DisplayFile.setText("Введите номер очереди");

        }
    }

    //текстовое поле DisplayFile
    //выводит на экран содержимое файла в окно
    @FXML
    public void displayText() {
        DisplayFile.clear();
        DisplayFile.setText("Всего\tМесто\tДата\n");
        try {
            //rtf reads text and format characters
            Scanner s = new Scanner(new File("itog.txt")).useDelimiter("p");
            while (s.hasNext()) {
                DisplayFile.appendText(s.next() + " "); // read the next token
            }
        } catch (FileNotFoundException ex) {
            DisplayFile.setText("Файл не найден, проверьте файл itog.txt");
        }
    }

    @FXML
    //кнопка Загрузить сохраненные настройки
    public void getSettirg() throws IOException {
        File setupFile = new File("setting.txt");
        if (setupFile.exists()) {
            schoolConfig.setText(Setting.getSetting(0));
            numberConfig.setText(Setting.getSetting(1));
            String url = Setting.getSetting(0);//присваиваем переменной url значение ChoiseSchoolBox
            String x = JsonFile.getLinkSchool(url); //получаем адрес сайта с json для школы
            JsonFile.setUrlSchool(x);                  //
            JsonFile.jsonWriteFile();               // получаем json с сайта и записываем в файл
            School.school(Setting.getSetting(1));
            displayText();
        } else {
            DisplayFile.clear();
            DisplayFile.setText("Выберите школу и укажите номер очереди");

        }

    }
}