package application;

import entities.Buyer;
import enumEntities.Cities;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        String name[] = {"Danilo","Agnaldo","José","Vitória","Juliette","Kaisa","Ferndando","Sara"};
        String address = "Rua qualquer em qualquer lugar, numero 42";

        double value[] = {123.3, 3214.3, 444.3, 847.0, 123, 4345, 9999.99, 9876.54};

        List<Buyer> buyersList = new ArrayList<>();

        for (int n=0; n<8; n++){
            Buyer b1 = new Buyer(name[n], address, value[n], Cities.getRandom());
            buyersList.add(b1);
        }

        System.out.println();

        // PRINT DE TODA A TABELA DE COMPRADORES
        for(Buyer b : buyersList){
            System.out.println(b.toString());
        }

        System.out.println("\n-----------------------------------------------------\n");

        Cities filter = Cities.ANAPOLIS;
        System.out.println("People who resist: "+ filter);

        buyersList.stream()
                .filter(b -> b.getCity() == filter)
                .forEach(b -> System.out.println(b.toString()));

    }

}
