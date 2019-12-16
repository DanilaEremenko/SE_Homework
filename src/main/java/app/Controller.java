package app;

import java.text.ParseException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import model.CurrentTime;
import model.RemainingTime;
import model.Timer;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public @ResponseBody
    CurrentTime getCurrentTime() {
        return Timer.getCurrentTime();
    }

    @RequestMapping("/deadline")
    public @ResponseBody
    RemainingTime getRemainingTime(@RequestParam String deadline) {
        return Timer.getRemainingTime(deadline);
    }

}
