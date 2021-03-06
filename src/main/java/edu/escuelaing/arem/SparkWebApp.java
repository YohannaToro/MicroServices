/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem;

/**
 *
 * @author YohannaToro
 */

import edu.escuelaing.arem.model.Calculator;
import spark.Request;
import static spark.Spark.*;

import java.awt.Window.Type;
import java.text.DecimalFormat;

import spark.Response;
import static spark.Spark.*;


public class SparkWebApp {

    /**
     * This main method uses SparkWeb static methods and lambda functions to
     * create a simple Hello World web app. It maps the lambda function to the
     * /hello relative URL.
     */
    public static void main(String[] args) {
        port(getPort());
        get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }

    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>Calculadora de cuadrados</h2>"
                + "<form action=\"/results\">"
                + "  Ingrese un numero para calcular su cuadrado: <br>"
                + "  <br>"
                + "  <br>"
                + "  <input type=\"text\" name=\"squareres\" value=\"\">"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Calcular\">"
                + "</form>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    private static String resultsPage(Request req, Response res) {

        String num= req.queryParams("squareres");

        DecimalFormat df= new DecimalFormat("#.##");

        String sq=String.valueOf(Calculator.square(Integer.parseInt(num)));
   
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>Calculadora de cuadrados</h2>"
                + "<form action=\"/results\">"
                + "  Respuesta<br>"
                 + "  <br>"
                + "  Square: "
                + sq
                + "  <br><br>"
                + "</form>"
                + "</body>"
                + "</html>";
       
        return pageContent;
    }

    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 8081; //returns default port if heroku-port isn't set (i.e. on localhost)
    }

}