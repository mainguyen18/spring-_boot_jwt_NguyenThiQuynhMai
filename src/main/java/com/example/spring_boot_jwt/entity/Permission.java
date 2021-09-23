package com.example.spring_boot_jwt.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "t_permission")
public class Permission extends BaseEntity{
    private String permissionName;

    private String permissionKey;
}
