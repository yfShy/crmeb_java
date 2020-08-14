package com.zbkj.crmeb.system.response;


import lombok.Data;

import java.io.Serializable;

/**
 * @author stivepeim
 * @title: SystemAdminResponse
 * @projectName crmeb
 * @Description: TODO
 * @since 2020/4/1417:36
 */
@Data
public class SystemAdminResponse implements Serializable {

    private Integer id;

    private String account;

//    private String pwd;

    private String realName;

    private String roles;

    private String lastIp;

    private Integer lastTime;

    private Integer addTime;

    private Integer loginCount;

    private Integer level;

    private Boolean status;

//    private Boolean isDel;

    private String Token;
}