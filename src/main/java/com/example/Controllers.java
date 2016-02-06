package com.example;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by christianzambrano on 2/6/16.
 */

@RestController
@RequestMapping("/cors")
public class Controllers {

    @CrossOrigin
    @RequestMapping(path = "corsRequestPlain",
            method = RequestMethod.POST,
            consumes = MediaType.TEXT_PLAIN_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> plainEndPoint() {
        Map<String, String> response = new HashMap<String, String>();
        response.put("response", "plain");
        return response;
    }

    @CrossOrigin
    @RequestMapping(path = "corsRequestJson",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> jsonEndPoint() {
        Map<String, String> response = new HashMap<String, String>();
        response.put("response", "json");
        return response;
    }
}
