package com.example.pp_3_1_2.dao;

import com.example.pp_3_1_2.model.Role;

import java.util.List;

public interface RoleDao {
    List<Role> getAllRoles();

    Role getRole(String userRole);

    Role getRoleById(Long id);

    void addRole(Role role);
}

