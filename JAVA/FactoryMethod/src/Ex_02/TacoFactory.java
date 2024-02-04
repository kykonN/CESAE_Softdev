package Ex_02;

import java.util.Locale;

public class TacoFactory {


    public static Tacos criarTacos (String tipoTaco){
        tipoTaco=tipoTaco.toLowerCase();

        switch (tipoTaco){

            case "Vaca":
                return new Vaca();

            case "Frango" :
                return new Frango();

            case "Vegetarino":
                return new Vegetariano();

            default:
                throw new IllegalArgumentException(" Não sabes comer não comas  " + tipoTaco);

        }

    }
}
