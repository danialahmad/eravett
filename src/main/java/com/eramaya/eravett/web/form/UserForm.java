package com.eramaya.eravett.web.form;

import java.util.Date;

import lombok.Data;

@Data
public class UserForm {

    private String username;
    private String password;
    private Date registrationDate;
    private String activeFlag;
    private Integer profileId;
    private Integer permanentAddressId;
    private String permanentAddress1;
    private String permanentAddress2;
    private String permanentAddress3;
    private String permanentPostcode;
    private String permanentCity;
    private Integer permanentStateId;
    private Integer permanentCountryId;
    private Integer mailingAddressId;
    private String mailingAddress1;
    private String mailingAddress2;
    private String mailingAddress3;
    private String mailingPostcode;
    private String mailingCity;
    private Integer mailingStateId;
    private Integer mailingCountryId;
    private Integer fileBlobId;
    private String name;
    private Date dob;
    private String idNumber;
    private Integer idType;
    private String email;
    private String mobileNo;
    private String phoneNo;
    private String gender;
    private String pob;
    private Integer raceId;
}
