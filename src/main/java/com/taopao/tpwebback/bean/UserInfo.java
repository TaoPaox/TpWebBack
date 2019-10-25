package com.taopao.tpwebback.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("用户信息表")
@Data
public class UserInfo {
    @ApiModelProperty("用户姓名")
    private String name;
    @ApiModelProperty("年龄")
    private int age;
    @ApiModelProperty("手机号")
    private String mobile;
    @ApiModelProperty("性别")
    private String sex;
}
