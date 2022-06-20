package com.sid.rbactest.model;

import com.sid.rbactest.enums.BaseRole;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String team;
    private BaseRole baseRole;
    private String advertisers;
    //private List<Attributes> attributes;

    @Data
    static class Attributes {
        private String advertiserId;
        private String entity;
        private String access;
        private Boolean allowAll;
        private List<String> selector;
    }

}
