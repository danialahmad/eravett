package com.eramaya.eravett.model.entity;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Profile generated by hbm2java
 */
@Entity
@Table(name="profile"
    ,schema="eravett"
)
public class Profile  implements java.io.Serializable {


     private Integer profileId;
     private Address addressByPermanentAddressId;
     private Address addressByMailingAddressId;
     private FileBlob fileBlob;
     private User user;
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
     private Set<VettingProfile> vettingProfiles = new HashSet<VettingProfile>(0);

    public Profile() {
    }

    public Profile(Address addressByPermanentAddressId, Address addressByMailingAddressId, FileBlob fileBlob, User user, String name, Date dob, String idNumber, Integer idType, String email, String mobileNo, String phoneNo, String gender, String pob, Integer raceId, Set<VettingProfile> vettingProfiles) {
       this.addressByPermanentAddressId = addressByPermanentAddressId;
       this.addressByMailingAddressId = addressByMailingAddressId;
       this.fileBlob = fileBlob;
       this.user = user;
       this.name = name;
       this.dob = dob;
       this.idNumber = idNumber;
       this.idType = idType;
       this.email = email;
       this.mobileNo = mobileNo;
       this.phoneNo = phoneNo;
       this.gender = gender;
       this.pob = pob;
       this.raceId = raceId;
       this.vettingProfiles = vettingProfiles;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="profile_id", unique=true, nullable=false)
    public Integer getProfileId() {
        return this.profileId;
    }
    
    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="permanent_address_id")
    public Address getAddressByPermanentAddressId() {
        return this.addressByPermanentAddressId;
    }
    
    public void setAddressByPermanentAddressId(Address addressByPermanentAddressId) {
        this.addressByPermanentAddressId = addressByPermanentAddressId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="mailing_address_id")
    public Address getAddressByMailingAddressId() {
        return this.addressByMailingAddressId;
    }
    
    public void setAddressByMailingAddressId(Address addressByMailingAddressId) {
        this.addressByMailingAddressId = addressByMailingAddressId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="photo_id")
    public FileBlob getFileBlob() {
        return this.fileBlob;
    }
    
    public void setFileBlob(FileBlob fileBlob) {
        this.fileBlob = fileBlob;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="username")
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    
    @Column(name="name")
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dob", length=13)
    public Date getDob() {
        return this.dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }

    
    @Column(name="id_number", length=50)
    public String getIdNumber() {
        return this.idNumber;
    }
    
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    
    @Column(name="id_type")
    public Integer getIdType() {
        return this.idType;
    }
    
    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    
    @Column(name="email")
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="mobile_no", length=20)
    public String getMobileNo() {
        return this.mobileNo;
    }
    
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    
    @Column(name="phone_no", length=20)
    public String getPhoneNo() {
        return this.phoneNo;
    }
    
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    
    @Column(name="gender", length=1)
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    
    @Column(name="pob")
    public String getPob() {
        return this.pob;
    }
    
    public void setPob(String pob) {
        this.pob = pob;
    }

    
    @Column(name="race_id")
    public Integer getRaceId() {
        return this.raceId;
    }
    
    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="profile")
    public Set<VettingProfile> getVettingProfiles() {
        return this.vettingProfiles;
    }
    
    public void setVettingProfiles(Set<VettingProfile> vettingProfiles) {
        this.vettingProfiles = vettingProfiles;
    }




}


