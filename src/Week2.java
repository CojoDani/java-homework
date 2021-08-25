import java.util.*;

public class Week2 {
    String car = "Blue car";
    String bicycle = "Red bicycle";
    String emptyString = "";
    String[] emptyArray = new String[4];
    HashMap<String, String> map = new HashMap<String, String>();



 public void isEqual(String car, String bicycle){
     System.out.println("Homework- Week 2 Ex 1:" + "\n");

     boolean isEqual = car.equals(bicycle);

     System.out.println("Check if the strings are equal:");
     System.out.println(isEqual);
     if (car == bicycle) {
         System.out.println("These strings are equal!");
     } else {
         System.out.println("These strings aren't equal!");
     }
 }

 public void concatenate(String car, String bicycle){
     System.out.println("Homework- Week 2 Ex 1:" + "\n");
     System.out.println("Concatenate these strings:");
     System.out.println(car + bicycle);
     System.out.println(car.concat(bicycle));
     System.out.println("");
 }

 public void isPalindrome(){
     System.out.println("Homework- Week 2 Ex 2:" + "\n");

     System.out.println("Entry any string: ");
     Scanner in = new Scanner(System.in);
     String originalString = in.nextLine();
     String reverseString = new StringBuilder(originalString).reverse().toString();
     if (originalString.equals(reverseString)) {
         System.out.println("String is a palindrome!" + "\n");
     } else {
         System.out.println("String isn't a palindrome!" + "\n");
     }
 }

 public void startsWithVowel(){
     System.out.println("Homework- Week 2 Ex 3: " + "\n");

     List<String> randomList = new ArrayList<>();
     randomList.add(0, "AerOPort");
     randomList.add(1, "caR");
     randomList.add(2, "eConoMYx");
     randomList.add(3, "PlaNe");
     randomList.add(4, "nO");
     randomList.add(5, "Xmas");

     int index = 0;
     for (int i = 0; i < randomList.size(); i++) {
         if (randomList.get(i).startsWith("A") || randomList.get(i).startsWith("a") || randomList.get(i).startsWith("E") ||
                 randomList.get(i).startsWith("e") || randomList.get(i).startsWith("I") || randomList.get(i).startsWith("i") ||
                 randomList.get(i).startsWith("O") || randomList.get(i).startsWith("o") || randomList.get(i).startsWith("U") ||
                 randomList.get(i).startsWith("u")) {
             emptyString += randomList.get(i).toLowerCase() + "; ";
             System.out.println("Cuvintele care incep cu o vocala sunt: " + emptyString);

         } else {
             emptyArray[index] = randomList.get(i).toUpperCase();
             index++;
         }
     }
     for (String incepCons : emptyArray) {
         System.out.println("Cuvintele care incep cu o consoana sunt: " + incepCons +"; ");
     }
        /*
        String vowel= "aeiou";
        for(String word : randomList){
            if(vowel.contains(String.valueOf(word.charAt(0)))){
                System.out.println("Merge!");
            }

            /*
        for (int x = 0; x < randomList.size(); x++) {
            switch (randomList.get(x).charAt(0)) {
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                case 'U':
                case 'u':
                    emptyString += randomList.get(x).toLowerCase();
                    emptyString.concat(" " + randomList.get(x).toLowerCase());
                    System.out.println(emptyString);
                default:
                    emptyArray[0] += randomList.get(x).toUpperCase();
                    for (String incepCons : emptyArray) {
                        System.out.println("Cuvintele care incep cu o consoana sunt: " + incepCons);
                    }
            }

*/


        }

        public void containsX(){
            List<String> randomList = new ArrayList<>();
            randomList.add(0, "AerOPort");
            randomList.add(1, "caR");
            randomList.add(2, "eConoMYx");
            randomList.add(3, "PlaNe");
            randomList.add(4, "nO");
            randomList.add(5, "Xmas");
            for (int y = 0; y < randomList.size(); y++) {
                if (randomList.get(y).contains("X") || randomList.get(y).contains("x") || (randomList.get(y).length() < 3)) {
                    String s1 = randomList.get(y).replace(randomList.get(y), "skipped");
                    System.out.println("The word which contains X is: " + randomList.get(y));
                    System.out.println("The new word is: " + s1);
                } /*else {
                if (randomList.get(y).contains("x")) {
                    String s2 = randomList.get(y).replace(randomList.get(y), "skipped");
                    System.out.println("The word which contains x is: " + randomList.get(y));
                    System.out.println("The new word is: " + s2);
                } else {
                    int aa = randomList.get(y).length();
                    if (aa < 3) {
                        String s3 = randomList.get(y).replace(randomList.get(y), "skipped");
                        System.out.println("The word with less than 3 letter is: " + s3);
                    }
                    */
            }
        }

        public void addACouple(String name, String email){
            System.out.println("");
            System.out.println("Homework- Week 2 Ex 4: a)" + "\n");


            map.put(name, email);
            System.out.println("The map: ");
            for (Map.Entry m : map.entrySet()) {
                System.out.println("Name: " + m.getKey() + ", email: " + m.getValue());
            }


        }

        public void theSize(){
            System.out.println("");
            System.out.println("Homework- Week 2 Ex 4 Pct b)" + "\n");
            System.out.println("The size of the map is: " + map.size());
        }

        public void isContainsByKey(String name){
            System.out.println("");
            System.out.println("Homework- Week 2 Ex 4 Pct c)" + "\n");
            System.out.println("The map contains name " + name + ": " + map.containsKey(name));
            System.out.println("");
            for (Map.Entry m : map.entrySet()) {
                String keyMap = (String) m.getKey();
                boolean isContained = keyMap.contains(name);
                System.out.println(keyMap + " contains name " + name + ": "  + isContained);
            }
        }

        public void isContainsByValue(String name){
            System.out.println("");
            System.out.println("Homework- Week 2 Ex 4 Pct d)" + "\n");
            map.containsValue(name);
            System.out.println(map.containsValue(name));
            for (Map.Entry m : map.entrySet()) {
                String valueMap = (String) m.getValue();
                boolean isContained = valueMap.contains(name);
                System.out.println(valueMap + " contains name " + name +": " + isContained);

            }
        }

        public void remove(String name){
            System.out.println("");
            System.out.println("Homework- Week 2 Ex 4 Pct e)" + "\n");
            map.remove(name);
            System.out.println("The list after remove an entry: ");
            for (Map.Entry m : map.entrySet()) {

                System.out.println("Name: " + m.getKey() + ", email: " + m.getValue());
            }
        }

        public void sortMap(){
            System.out.println("");
            System.out.println("Homework- Week 2 Ex 4 Pct f)" + "\n");
            for (Map.Entry m : map.entrySet()) {

                System.out.println("Name: " + m.getKey() + ", email: " + m.getValue());
            }
        }
 }

