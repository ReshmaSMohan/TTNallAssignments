package springsession.restwithspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springsession.restwithspring.entities.StudentV1;
import springsession.restwithspring.entities.StudentV2;

@RestController
public class StudentVersioningController {

    //URI Versioning
    @GetMapping("/student/version/V1")
    StudentV1 getStudentV1() {
        return new StudentV1("reshma mohan");
    }

    @GetMapping("/student/version/V2")
    StudentV2 getPersonV2() {
        System.out.println("vhjvhkbjlb");
        return new StudentV2("reshma", "mohan");
    }

    //Parameter Versioning
    @GetMapping(value = "/student/version/param", params = "version=1")
    StudentV1 getStudentParam1() {
        return new StudentV1("Pooja Solanki");
    }

    @GetMapping(value = "/student/version/param", params = "version=2")
    StudentV2 getStudentParam2() {
        return new StudentV2("Pooja", "Solanki");
    }


    //Header Versioning
    @GetMapping(value = "/student/version/header", headers = "API-VERSION=1")
    StudentV1 getStudentHeader1() {
        return new StudentV1("reshma mohan");
    }

    @GetMapping(value = "/student/version/header", headers = "API-VERSION=2")
    StudentV2 getStudentHeader2() {
        return new StudentV2("reshma", "mohan");
    }
}
