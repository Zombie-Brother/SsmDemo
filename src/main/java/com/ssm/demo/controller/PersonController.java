package com.ssm.demo.controller;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.ssm.demo.entity.Person;
import com.ssm.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("/person")
public class PersonController {

    private final static Logger logger = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    private PersonService personService;
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/selectPerson")
    @ResponseBody
    public Map selectPerson(@RequestParam(value = "id") long id) {
        Person person = personService.findPersonById(id);
        Map map = new HashMap();
        map.put("person", person);
        redisTemplate.opsForValue().set("redis", "admin");
        return map;
    }
}