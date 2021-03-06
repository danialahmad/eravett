package com.eramaya.eravett.model.entity;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Address generated by hbm2java
 */
@Entity
@Table(name="address"
    ,schema="eravett"
)
public class Address  implements java.io.Serializable {


     private Integer id;
     private String address1;
     private String address2;
     private String address3;
     private String postcode;
     private String city;
     private Integer stateId;
     private Integer countryId;
     private Set<Profile> profilesForPermanentAddressId = new HashSet<Profile>(0);
     private Set<Profile> profilesForMailingAddressId = new HashSet<Profile>(0);

    public Address() {
    }

    public Address(String address1, String address2, String address3, String postcode, String city, Integer stateId, Integer countryId, Set<Profile> profilesForPermanentAddressId, Set<Profile> profilesForMailingAddressId) {
       this.address1 = address1;
       this.address2 = address2;
       this.address3 = address3;
       this.postcode = postcode;
       this.city = city;
       this.stateId = stateId;
       this.countryId = countryId;
       this.profilesForPermanentAddressId = profilesForPermanentAddressId;
       this.profilesForMailingAddressId = profilesForMailingAddressId;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="address1")
    public String getAddress1() {
        return this.address1;
    }
    
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    
    @Column(name="address2")
    public String getAddress2() {
        return this.address2;
    }
    
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    
    @Column(name="address3")
    public String getAddress3() {
        return this.address3;
    }
    
    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    
    @Column(name="postcode", length=5)
    public String getPostcode() {
        return this.postcode;
    }
    
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    
    @Column(name="city")
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    
    @Column(name="state_id")
    public Integer getStateId() {
        return this.stateId;
    }
    
    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    
    @Column(name="country_id")
    public Integer getCountryId() {
        return this.countryId;
    }
    
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="addressByPermanentAddressId")
    public Set<Profile> getProfilesForPermanentAddressId() {
        return this.profilesForPermanentAddressId;
    }
    
    public void setProfilesForPermanentAddressId(Set<Profile> profilesForPermanentAddressId) {
        this.profilesForPermanentAddressId = profilesForPermanentAddressId;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="addressByMailingAddressId")
    public Set<Profile> getProfilesForMailingAddressId() {
        return this.profilesForMailingAddressId;
    }
    
    public void setProfilesForMailingAddressId(Set<Profile> profilesForMailingAddressId) {
        this.profilesForMailingAddressId = profilesForMailingAddressId;
    }




}


