package classwork.sun;

import gherkin.deps.com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ToJSON {

    String JSON_1 = "src/test/resources/JSonRecipe.json";

    public void fromGSON() throws IOException {

        Gson gson = new Gson();
        Recipe recipe = new Recipe("Borsch", new Ingredient[]{}, 120);
        System.out.println(gson.toJson(recipe));

        Files.write(Paths.get(JSON_1), gson.toJson(recipe).getBytes());

    }

}
