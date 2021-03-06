package com.kyk.demowebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@Controller
public class SampleController {

    @GetMapping("/events/form")
    public String eventForm(Model model) {
        Event newEvent = new Event();
        newEvent.setLimit(20);
        model.addAttribute("event" ,newEvent);
        return "events/form";
    }

    @PostMapping("/events")
    @ResponseBody
    public Event getEvent(@RequestParam String name,
                          @RequestParam Integer limit){
        Event event = new Event();
        event.setName(name);
        event.setLimit(limit);
        return event;
    }


}
