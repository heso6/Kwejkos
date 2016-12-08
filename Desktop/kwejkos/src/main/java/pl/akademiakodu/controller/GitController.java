package pl.akademiakodu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.akademiakodu.model.Gif;

@Controller
public class GitController {
    @RequestMapping("/")
    public String listGifts(){
        return "home";
    }
    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap){
        Gif gif = new Gif("compiler-bot","michalos",true);
        modelMap.put("gif",gif);
        return "gif-details";
    }
}
