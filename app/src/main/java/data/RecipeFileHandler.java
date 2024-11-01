//package data;を宣言
package data;

import java.io.BufferedReader;
import java.io.FileReader;
//java.io.IOException;をimport
import java.io.IOException;
//java.util.ArrayList;をimport
import java.util.ArrayList;
//RecipeFileHandlerのclassを宣言する
public class RecipeFileHandler {
    //アクセス修飾子private、String型、filePath;
    private String filePath;
    //アクセス修飾子public、RecipeFileHandlerをメソッドに
    public RecipeFileHandler() {
        //ファイル名宣言filePath = "app/src/main/resources/recipes.txt";
        filePath = "app/src/main/resources/recipes.txt";
    }
    //アクセス修飾子public、メソッドRecipeFileHandler(String型 引数filePath)
    public RecipeFileHandler(String filePath) {
        //thisで同クラス内のfilepathにアクセスする
        this.filePath = filePath;
    }

    /**
     * 設問1: 一覧表示機能
     * recipes.txtからレシピデータを読み込み、それをリスト形式で返します。 <br>
     * IOExceptionが発生したときは<i>Error reading file: 例外のメッセージ</i>とコンソールに表示します。
     *
     * @return レシピデータ
     */
    public ArrayList<String> readRecipes() {
        // ファイルの読み込み
        String recipesname = "resources/recipes.txt";
        //
        try (BufferedReader reader = new BufferedReader(new FileReader(recipesname))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file:" + e.getMessage());
        }
        // try {

        // } catch (IOException e) {
        // System.out.println("Error reading file:" + e.getMessage());
        // }
        return null;
    }

    /**
     * 設問2: 新規登録機能
     * 新しいレシピをrecipes.txtに追加します。<br>
     * レシピ名と材料はカンマ区切りで1行としてファイルに書き込まれます。
     *
     * @param recipeName  レシピ名
     * @param ingredients 材料名
     */
    //
    public void addRecipe(String recipeName, String ingredients) {
        // try {

        // } catch (IOException e) {

        // }
    }
}
