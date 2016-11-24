package com.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControladorInicio {
    @RequestMapping("/")
    @ResponseBody  String inicio(){
        return ".....";
    }
}
