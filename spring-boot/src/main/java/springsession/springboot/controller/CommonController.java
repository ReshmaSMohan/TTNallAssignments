package springsession.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springsession.springboot.entity.Database;
import springsession.springboot.entity.User;

@RestController
public class CommonController {

    @Autowired
    User user;

    @Autowired
    Database database;

    Logger logger = LoggerFactory.getLogger(CommonController.class);

    @GetMapping("/user")
    public User getuser(){
        logger.info("INFO : getUser Method");
        return user;
    }

    @GetMapping("/database")
    public Database getDatabase(){
        logger.info("INFO : getDatabase Method");
        return database;
    }
}
