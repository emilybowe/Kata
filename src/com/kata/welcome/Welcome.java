package com.kata.welcome;
import java.util.HashMap;

public class Welcome {
    public static void greet(String language){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("english", "Welcome");
        hashMap.put("czech", "Vitejte");
        hashMap.put("danish", "Velkomst");
        hashMap.put("dutch", "Welkom");
        hashMap.put("estonian", "Tere tulemast");
        hashMap.put("finnish", "Tervetuloa");
        hashMap.put("flemish", "Welgekomen");
        hashMap.put("french", "Bienvenue");
        hashMap.put("german", "Willkommen");
        hashMap.put("irish", "Failte");
        hashMap.put("italian", "Benvenuto");
        hashMap.put("latvian", "Gaidits");
        hashMap.put("lithuanian", "Laukiamas");
        hashMap.put("polish", "Witamy");
        hashMap.put("spanish", "Bienvenido");
        hashMap.put("swedish", "Valkommen");
        hashMap.put("welsh", "Croeso");
        System.out.println(hashMap.getOrDefault(language, "Welcome"));
    }

    public static void main(String[] args) {
        greet("welsh");
    }
}
