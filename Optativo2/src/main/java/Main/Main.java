/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package Main;

import Models.PersonaModels;
import Contactos.PersonaService;


public class Main {
    public static void main(String[] args) {
        PersonaService personaService = new PersonaService("postgres", "12345", "localhos", "15432", "postgres");
        PersonaModels persona = new PersonaModels();
        persona.Nombre = "";
        persona.Apellido = "";
        personaService.registrarPersona(persona);
    }
}