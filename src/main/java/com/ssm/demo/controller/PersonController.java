package com.ssm.demo.controller;

import com.ssm.demo.entity.Person;
import com.ssm.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/selectPerson")
    @ResponseBody
    public Map selectPerson(HttpServletRequest request) {
        long personId = Long.parseLong(request.getParameter("id"));
        Person person = personService.findPersonById(personId);

        Map map = new HashMap();
        map.put("person", person);

        return map;
    }
}