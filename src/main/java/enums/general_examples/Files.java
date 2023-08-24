package enums.general_examples;

import java.io.*;

public class Files {


    // write to a file
    BufferedWriter bufferedWriter;

    {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("creds.json"));
            bufferedWriter.write("{\n" +
                    "    \"username\" : \"admin\",\n" +
                    "    \"password\" : \"password123\"\n" +
                    "}");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // read from a file
    BufferedReader bufferedReader;

    {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            bufferedReader = new BufferedReader(new FileReader("creds.json"));
            String line;
            while ((line = bufferedReader.readLine()) !=null){
                stringBuilder.append(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(stringBuilder);
    }





    @Override
    public String toString() {
        return "Files{" +
                "bufferedWriter=" + bufferedWriter +
                '}';
    }
}

