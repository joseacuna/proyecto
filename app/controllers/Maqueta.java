package controllers;

import play.mvc.Controller;

/**
 * Created by slenderman on 18-10-15.
 */
public class Maqueta extends Controller{

    public static void index(){
        render();
    }
    public static void menu() {render();}
    public static void header(){render();}
    public static void formReserva(){render();}
    public static void formularioCrearPersona(){render();};

}
