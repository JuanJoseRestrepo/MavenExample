package org.example;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Aqui entre" );
        MySQLConnection connection = new MySQLConnection();
        //connection.createTableVehiculo();
        // connection.insertEstudiante(new Estudiante(-1,"Fernando","Fernandes",12));
        //connection.updateEstudiante(new Estudiante(2,"Bob","Baron",26));
        //connection.deleteEstudianteById(6);

       //ArrayList<Estudiante> estudiantes = connection.getAllEstudents();
       //System.out.println(estudiantes.size());

       ArrayList<Estudiante> estimate-s = connection.getEstudiantesByCursoID(1);
        System.out.println(estimates.size());

       for(int i = 0; i < estimates.size();i++){
           System.out.println(estimates.get(i).getNombre());
       }

        connection.closeDB();
    }
}
