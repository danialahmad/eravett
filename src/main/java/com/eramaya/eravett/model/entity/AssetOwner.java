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
 * AssetOwner generated by hbm2java
 */
@Entity
@Table(name="asset_owner"
    ,schema="eravett"
)
public class AssetOwner  implements java.io.Serializable {


     private Integer assetOwnerId;
     private String name;
     private Set<VettingOrder> vettingOrders = new HashSet<VettingOrder>(0);

    public AssetOwner() {
    }

    public AssetOwner(String name, Set<VettingOrder> vettingOrders) {
       this.name = name;
       this.vettingOrders = vettingOrders;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="asset_owner_id", unique=true, nullable=false)
    public Integer getAssetOwnerId() {
        return this.assetOwnerId;
    }
    
    public void setAssetOwnerId(Integer assetOwnerId) {
        this.assetOwnerId = assetOwnerId;
    }

    
    @Column(name="name")
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="assetOwner")
    public Set<VettingOrder> getVettingOrders() {
        return this.vettingOrders;
    }
    
    public void setVettingOrders(Set<VettingOrder> vettingOrders) {
        this.vettingOrders = vettingOrders;
    }




}

