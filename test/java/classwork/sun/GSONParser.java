package classwork.sun;

import gherkin.deps.com.google.gson.Gson;
import gherkin.deps.com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class GSONParser {

    private static final String JSON = "src/test/resources/recipe.json";

    public static void ParseGSON() throws FileNotFoundException {
        Gson gson = new Gson();
        Recipe recipe = gson.fromJson(new JsonReader(new FileReader(JSON)),Recipe.class);
        System.out.println(recipe.recipename);

    }


}
