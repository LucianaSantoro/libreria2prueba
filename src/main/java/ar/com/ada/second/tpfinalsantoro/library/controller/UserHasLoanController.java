package ar.com.ada.second.tpfinalsantoro.library.controller;


import ar.com.ada.second.tpfinalsantoro.library.service.UserHasLoanService;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController

public class UserHasLoanController {

    @Autowired
    private UserHasLoanService userHasLoanService;



}
