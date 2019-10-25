package com.taopao.tpwebback.study;

import com.alibaba.fastjson.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(tags = "学习")
@Controller
public class MyStudyController {

    @ApiOperation("获取服务器当前时间")
    @GetMapping("getCurrentTime")
    @ResponseBody
    public String getCurrentTime() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        return dateFormat.format(date);
    }

    @ApiOperation("测试json请求")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "json", value = "{\n" +
                    "    \"userCode\": \"15106115982\",\n" +
                    "    \"appName\": \"xj-hami\"\n" +
                    "    \n" +
                    "}", required = true, paramType = "body"),
    })
    @RequestMapping(value = "/api/v1/postJson", method = {RequestMethod.POST})
    @ResponseBody
    public String postJson(@RequestBody JSONObject json) {
        return json.toString();
    }


}

