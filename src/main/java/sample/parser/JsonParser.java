package sample.parser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import sample.parser.Model.Root;
import sample.parser.Model.Items;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JsonParser {

    private static final String TAG_COUNT = "count";
    private static final String TAG_ITEMS = "items";
    private static final String TAG_DECLARATIONNUMBER = "declarationNumber";


    public Root parse() {
//создаем Обект Root и parser
        Root root = new Root();
        JSONParser parser = new JSONParser();

//Пробегаемся по файлу json.json и раскладываем его в массив данных
        try (FileReader reader = new FileReader("json.json")) {

            //объект всего файла json
            JSONObject rootJsonObject = (JSONObject) parser.parse(reader);

            //получаем count
            long count = (long) rootJsonObject.get(TAG_COUNT);
            //получаем массив item
            JSONArray itemsJsonArray = (JSONArray) rootJsonObject.get(TAG_ITEMS);
            //раскидываем массив по значениям
            List<Items> itemsList = new ArrayList<>();
            for (Object it : itemsJsonArray) {
                JSONObject itemObject = (JSONObject) it;
                String itemDeclaration = (String) itemObject.get(TAG_DECLARATIONNUMBER);
                String.valueOf(itemDeclaration);
                Items items = new Items(itemDeclaration);
                itemsList.add(items);
            }

            root.setCount(count);
            root.setDeclarationNumber(itemsList);

            return root;

        } catch (Exception e) {
            System.out.println("parsing error: " + e.toString());
        }

        return null;
    }
}
