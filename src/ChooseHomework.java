import java.util.Random;

public class ChooseHomework {
    String[] team = {"Alina Mesesan", "Bogdan Crisan", "Cosmin Muntean", "Cristina Cotetiu", "Daniel Cojocaru", "Daniel Kolsis",
            "Iulia Cristescu", "Kiss Zsolt Norbert", "Maria Heres", "Marius Coman", "Raul Bucata", "Razvan Trufan", "Remus Dranca",
            "Simona Rosu"};

    int[] theFour = new Random().ints(1,14).distinct().limit(4).toArray();
    public void chooseTheLuckiest(){
        System.out.println("\n" + "The luckiest people are: ");

        for(int i=0; i < theFour.length; i++){
            System.out.println(team[theFour[i]]);
        }
    }

}