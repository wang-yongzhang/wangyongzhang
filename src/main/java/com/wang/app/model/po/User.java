package com.wang.app.model.po;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private Long id;
    private String idType;
    private String idNum;
    private String userName;
    private String address;
    private String loginPhone;
    private String password;
    private Boolean deleted;
    private Date createDate;
    private Date pubts;
}
