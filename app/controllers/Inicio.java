package controllers;

import models.Persona;
import play.mvc.Controller;


public class Inicio extends Controller{
    public static void index(){
        session.clear();
        render();
    }

    public static void login(String usuario,String password){
        validation.required(usuario).message("validation.userRequired");
        validation.required(password).message("validation.passwordRequider");

       // if(validation.hasError()){
        //    render("@Index");
       // }

        Persona login= Persona.checkUsuario(usuario);
    }


}
