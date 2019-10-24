package com.taopao.tpwebback;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class MyStudyController {
    @GetMapping("getCurrentTime")
    @ResponseBody
    public String getCurrentTime() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        return dateFormat.format(date)+"错错错错错错饿额额";
    }
}

