/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumjava.praktikum.java;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ERIK
 */
@Controller
public class projectController {
    @RequestMapping("/usdtoidr")
    @ResponseBody
    public String usdtoidr() {
        int usd = 1;
        int idr = 14148;
        int convert = usd*idr;
        
        return "hasil konversi USD to IDR dari " +usd+ " USD adalah Rp." +convert+ ".";
    }
    
    @RequestMapping("/idrtousd")
    @ResponseBody
    public String idrtousd(){
        double idr = 14148;
        double usd = 1;
        double convert = usd/idr;
        
        return "hasil konversi IDR to USD dari Rp." +idr+ " adalah " +convert+ "USD.";
    }
    
    @RequestMapping("/myrtoidr")
    @ResponseBody
    public String myrtoidr(){
        int myr = 1;
        int idr = 3424;
        int convert = myr*idr;
        
        return "hasil konversi MYR to IDR dari " +myr+ " MYR adalah Rp. " +convert; 
    }
    
    @RequestMapping("/myrtousd")
    @ResponseBody
    public String myrtousd(){
        int myr = 5;
        double usd = 0.24;
        double convert = myr * usd;
        
        return "hasil konversi MYR to USD dari " +myr+ " MYR adalah " +convert+ " USD";
        
    }
}
