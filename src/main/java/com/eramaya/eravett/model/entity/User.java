package com.eramaya.eravett.model.entity;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name="user"
    ,schema="uam"
)
public class User  implements java.io.Serializable {


     private String username;
     private String password;
     private Date registrationDate;
     private String activeFlag;
     private Set<Profile> profiles = new HashSet<Profile>(0);

    public User() {
    }

	
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public User(String username, String password, Date registrationDate, String activeFlag, Set<Profile> profiles) {
       this.username = username;
       this.password = password;
       this.registrationDate = registrationDate;
       this.activeFlag = activeFlag;
       this.profiles = profiles;
    }
   
     @Id 

    
    @Column(name="username", unique=true, nullable=false, length=50)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="password", nullable=false)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="registration_date", length=29)
    public Date getRegistrationDate() {
        return this.registrationDate;
    }
    
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    
    @Column(name="active_flag", length=1)
    public String getActiveFlag() {
        return this.activeFlag;
    }
    
    public void setActiveFlag(String activeFlag) {
        this.activeFlag = activeFlag;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set<Profile> getProfiles() {
        return this.profiles;
    }
    
    public void setProfiles(Set<Profile> profiles) {
        this.profiles = profiles;
    }




}


