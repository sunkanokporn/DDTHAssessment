package com.assessment;

import com.assessment.com.MainLogic;
import com.bean.Input;
import com.bean.Output;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class API {
    static  MainLogic mainLogic = new MainLogic();

    @RequestMapping("/api/hello")
    public String hello(){
        return "Hello";
    }

    @RequestMapping(path = "/api/firstfactorial",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Output firstfactorial(@RequestBody Input input ){
        int inpitInt =  Integer.parseInt(input.getInput());
        int result = mainLogic.FirstFactorial(inpitInt);
        Output output = new Output(String.valueOf(result));
        return output ;
    }

    @RequestMapping(path = "/api/rirstreverse",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Output rirstreverse(@RequestBody Input input ){
        String result = mainLogic.FirstReverse(input.getInput());
        Output output = new Output(String.valueOf(result));
        return output ;
    }

    @RequestMapping(path = "/api/alphabetsoup",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Output alphabetsoup(@RequestBody Input input ){
        String result = mainLogic.AlphabetSoup(input.getInput());
        Output output = new Output(String.valueOf(result));
        return output ;
    }
}
