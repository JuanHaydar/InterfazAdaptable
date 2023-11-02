/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazadaptable;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Juan Haydar
 * clase que sirve para adaptar la futura base de datos de la aplicacion.
 * Se usa un documento txt para simular la base de datos, y que tenga funcionalidad a nivel local
 * Pero con esta clase podras adaptar tu base de datos con los distintos atributos y metodos de
 * la clase
 */
public class Data {
     private static String Contraseña="";
    private static String Correo="";
    
    //Setters 
    public static void setContraseña(String contraseña) {
    Contraseña = contraseña;
}
    public static void setCorreo(String correo) {
    Correo = correo;
}

// Getters
public static String getContraseña() {
    return Contraseña;
}
public static String getCorreo() {
    return Correo;
}
/**
 * Compara el correo y contraseña dado con los que se encuentren en la base de datos(En este caso local)
     * @param Correo Correo a comparar
 *@param Contraseña  Contraseña a comparar
 * @return Verdadero si el correo y contraseña coinciden con alguna en la base de datos, 
 * y falso de no estar
 */
public static boolean Comparador(String Correo,String Contraseña){
    String lineString;
        boolean Flag=false;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("test\\Perfiles.txt"));
            while ((lineString = reader.readLine()) != null) {
            String []perfil=lineString.split(";");
                if(Correo.equals(perfil[0])&&Contraseña.equals(perfil[1])){
                Flag=true;
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error. No se encontro el archivo a leer: "+ e.getMessage());
        }
        return Flag;
    }
/**
 * Verifica si el correo ya existe en la base de datos local(en este caso el txt 'Perfiles')
 * en test
 * @param CadA Correo a comparar
 * @return booleano Verdadero si el correo ya se encuentra usado y Falso sino.
 */
public static boolean Comparador2(String CadA){
    String lineString;
        boolean Flag=false;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("test\\Perfiles.txt"));
            while ((lineString = reader.readLine()) != null) {
            String []perfil=lineString.split(";");
                if(CadA.equals(perfil[0])){
                Flag=true;
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error. No se encontro el archivo a leer: "+ e.getMessage());
        }
        return Flag;
    }

/**
 * Construye el Perfil a guardarse en la base de datos, separandolos por ';' para luego hacer
 * split mediante este simbolo.
 * @return String con el perfil a guardarse
 */
private static String Perfil(){
    String Perfil = getCorreo()+";"+getContraseña()+"\n";
    return Perfil;
    }
/**
 * Guarda el inicio de sesion en un txt apartado llamado 'Recordar' en test
 * @param Correo correo a guardar
 * @param Contraseña Contraseña a guardar
 */
public static void GuardarRecuerdo(String Correo, String Contraseña){
try {
                
            // Abre el archivo para escritura (creará el archivo si no existe)
            BufferedWriter escritor = new BufferedWriter(new FileWriter( "test\\Recordar.txt",false)); 
            
            // Escribe líneas en el archivo
            escritor.write(Correo+";"+Contraseña);
            // Cierra el BufferedWriter
            escritor.close();
            System.out.println("Contenido agregado en el archivo correctamente");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
}
/**
 * Lee el recuerdo guardado en 'Recordar' 
 * @return String con el perfil guardado en Recordar
 */
public static String[] LeerRecuerdo(){
            String lineString;
            String []perfil=new String[2];
        try {
            BufferedReader reader = new BufferedReader(new FileReader("test\\Recordar.txt"));
            lineString = reader.readLine();
            perfil[0]=lineString.substring(0,lineString.indexOf(";"));
            perfil[1]=lineString.substring(lineString.indexOf(";")+1,lineString.length());
            reader.close();
        } catch (IOException e) {
            System.out.println("Error. No se encontro el archivo a leer: "+ e.getMessage());
        }
        
        return perfil;
}
/**
 * Guarda el perfil en la base de datos(Recordar.txt)
 */
public static void Guardado(){
            try {
                
            // Abre el archivo para escritura (creará el archivo si no existe)
            BufferedWriter escritor = new BufferedWriter(new FileWriter( "test\\Perfiles.txt",true)); 
            
            // Escribe líneas en el archivo
            escritor.write(Perfil());
            // Cierra el BufferedWriter
            escritor.close();
            System.out.println("Contenido agregado en el archivo correctamente");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
    
}
