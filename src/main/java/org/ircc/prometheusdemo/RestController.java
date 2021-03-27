package org.ircc.prometheusdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@Controller
public class RestController {

  @GetMapping("/")
  public String loadContent() {
    return "index";
  }

  @PostMapping("/")
  public ResponseEntity<String> submitRequest(String action) {
    if (action.equals("HTTP 200")) {
      return new ResponseEntity(HttpStatus.ACCEPTED);
    }
    return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
  }

}