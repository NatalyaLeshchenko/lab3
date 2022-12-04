public class Story {
    public static void main( String[] argv){
        Freken_Bok freken_bok= new Freken_Bok("Фрекен Бок");
        Gospodin_Pek gospodin_pek= new Gospodin_Pek("Господин Пек");
        freken_bok.appear("на экране");
gospodin_pek.appear("Рядом с ней");
gospodin_pek.run_program("программу");
freken_bok.flinch();
freken_bok.listen("она ","слова Карлсона.");
freken_bok.worry (" очень","потому что");
freken_bok.stand("перед всем шведским народом");
freken_bok.tell("как");
freken_bok.start("'Соус Хильдур Бок'");
freken_bok.cook(Ingredients.tomato_paste);
        freken_bok.cook(Ingredients.salt);
        freken_bok.cook(Ingredients.onions);
        freken_bok.cook(Ingredients.garlic);
        freken_bok.cook(Ingredients.pepper);
    }
}
