package sample.parser;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Setting {
    private String idSchool;
    private String idNumber;


    public static void setSettirgSeting(String idSchool, String idNumber) {
        File f = new File("setting.txt");
        try{
            // Create new file
            String idS = idSchool;
            String idN = idNumber;
            String path="setting.txt";
            File file = new File(path);

            // если файла нет, то создать его
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            // Write in file
            bw.write(idS);
            bw.newLine();
            bw.write(idN);

            // Close connection
            bw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }


    public static String getSetting(int id) throws IOException {
        File f = new File("setting.txt");
        if (!f.exists()) {
            f.createNewFile();
        } else {
            List<String> result = null;
            result = Files.lines(Paths.get("setting.txt"), StandardCharsets.UTF_8).collect(Collectors.toList());
            return result.get(id);
        }
        return null;
    }
}
