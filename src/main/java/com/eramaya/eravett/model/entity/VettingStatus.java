package com.eramaya.eravett.model.entity;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * VettingStatus generated by hbm2java
 */
@Entity
@Table(name="vetting_status"
    ,schema="eravett"
)
public class VettingStatus  implements java.io.Serializable {


     private Integer vettingStatusId;
     private Agency agency;
     private VettingProfile vettingProfile;
     private String status;
     private String comment;
     private Date createdDate;
     private String createdBy;

    public VettingStatus() {
    }

    public VettingStatus(Agency agency, VettingProfile vettingProfile, String status, String comment, Date createdDate, String createdBy) {
       this.agency = agency;
       this.vettingProfile = vettingProfile;
       this.status = status;
       this.comment = comment;
       this.createdDate = createdDate;
       this.createdBy = createdBy;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="vetting_status_id", unique=true, nullable=false)
    public Integer getVettingStatusId() {
        return this.vettingStatusId;
    }
    
    public void setVettingStatusId(Integer vettingStatusId) {
        this.vettingStatusId = vettingStatusId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="agency_id")
    public Agency getAgency() {
        return this.agency;
    }
    
    public void setAgency(Agency agency) {
        this.agency = agency;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="vetting_profile_id")
    public VettingProfile getVettingProfile() {
        return this.vettingProfile;
    }
    
    public void setVettingProfile(VettingProfile vettingProfile) {
        this.vettingProfile = vettingProfile;
    }

    
    @Column(name="status", length=10)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    
    @Column(name="comment", length=500)
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_date", length=29)
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    
    @Column(name="created_by", length=50)
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }




}


