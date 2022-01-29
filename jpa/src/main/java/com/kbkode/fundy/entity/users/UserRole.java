package com.kbkode.fundy.entity.users;

import com.kbkode.fundy.entity.UniqueKey;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @date 24-May-2021
 * @author kbibby
 */
public class UserRole implements UniqueKey<Long> {

    Long id;
    UserRoleEnum role;

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    @Column( name = "id", unique = true, nullable = false )
    @Override
    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    @Column( name = "role", unique = true, nullable = false )
    @Enumerated( EnumType.STRING )
    public UserRoleEnum getRole() {
        return role;
    }

    public void setRole( UserRoleEnum role ) {
        this.role = role;
    }

}
