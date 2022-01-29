package com.kbkode.fundy.entity.users;

import com.kbkode.fundy.entity.UniqueKey;
import com.kbkode.fundy.entity.users.UserRole;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @date 24-May-2021
 * @author kbibby
 */
@Entity
@Table( name = "users" )
public class User implements UniqueKey<Long> {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String userName;
    private String password;
    private String email;
    private UserRole role;

    /**
     * @return the id
     */
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    @Column( name = "id", unique = true, nullable = false )
    @Override
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId( Long id ) {
        this.id = id;
    }

    /**
     * @return the userName
     */
    @Column( name = "username", nullable = false )
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName( String userName ) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    @Column( name = "password", nullable = false )
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword( String password ) {
        this.password = password;
    }

    /**
     * @return the email
     */
    @Column( name = "email" )
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail( String email ) {
        this.email = email;
    }

    /**
     * @return the role
     */
    @ManyToOne( fetch = FetchType.EAGER )
    @JoinColumn( name = "role_id", referencedColumnName = "id" )
    public UserRole getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole( UserRole role ) {
        this.role = role;
    }
}
