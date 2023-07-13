package self_practice.lambda.prettyPrintOrangeTask;

import self_practice.lambda.Color;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<Orange>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(new Orange(100,Color.RED));
        inventory.add(new Orange(200,Color.GREEN));
        inventory.add(new Orange(50,Color.RED));

        OrangeFormatter orangeLambda = orange -> "An orange of " +orange.getWeight()+"g";
        prettyPrintApple(inventory, orangeLambda);

        prettyPrintApple(inventory, orange -> "An orange of " +orange.getWeight()+"g");
//        OrangeFormatter fancyFormatter = orange -> {
//            if (orange.getWeight()>200) return "A heavy " +orange.getColor() + " orange";
//            else return "A light "  +orange.getColor() + " orange";
//        };

        OrangeFormatter fancyFormatter = orange -> {
            String ch = orange.getWeight() > 200 ? "Heavy" : "Light";
            return "A " + ch +" " + orange.getColor() + " orange.";
        };

        prettyPrintApple(inventory, fancyFormatter);
    }

    public static void prettyPrintApple(List<Orange> inventory, OrangeFormatter formatter){
        for(Orange orange : inventory){
            String output = formatter.accept(orange);
            System.out.println(output);
        }
    }


}
