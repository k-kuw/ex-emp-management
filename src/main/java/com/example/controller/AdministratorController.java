package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.form.InsertAdministratorForm;
import com.example.service.AdministratorService;

@Controller
public class AdministratorController {
  @Autowired
  AdministratorService administratorService;

  /**
   * 「administrator/insert.html」にフォワードする処理
   * @param form
   * @return
   */
  @GetMapping("/toInsert")
  public String toInsert(InsertAdministratorForm form) {
    return "administrator/insert";
  }
}
