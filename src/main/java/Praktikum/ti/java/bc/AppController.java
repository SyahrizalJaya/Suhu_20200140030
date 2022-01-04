/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.ti.java.bc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author JAYA
 */
@Controller
@ResponseBody
public class AppController
{
    @RequestMapping("/suhu")
    public String getSuhu(){
        String konversi = " ";
        
        double celcius = 55.4;
        double farenheit = 105.7;
        double kelvin = 200;
        
        double suhu;
        double suhu2;
        
        
        String pilih = "f";
        
        if(pilih == "c"){
            suhu = celcius*5/9+32;
            suhu2 = celcius + 273.15;
            konversi = "Suhu Celcius dari Farenheit :"+ suhu + "<br>" +
            "Suhu Celcius dari Kelvin :"+suhu2;
        }
        else if(pilih == "f"){
            suhu = (farenheit-32)*5/9;
            suhu2 = (farenheit-32)*5/9+273.15;
            konversi = "Suhu Farenheit dari Celcius :"+ suhu + "<br>" +
            "Suhu Farenheit dari Kelvin :"+ suhu2;

        }
        else if(pilih == "k"){
            suhu = kelvin-273.15;
            suhu2 = (kelvin-273.15)*9/5+32;
            konversi = "Suhu Kelvin dari Celcius :" +suhu +"<br>" +
            "Suhu Kelvin dari Farenheit :"+ suhu2;

        }
        else{
            konversi = "Tidak di temukan";
        }
        return konversi;
    }
    
}
