package com.eramaya.eravett.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QProfile is a Querydsl query type for Profile
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QProfile extends EntityPathBase<Profile> {

    private static final long serialVersionUID = 1859492537L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProfile profile = new QProfile("profile");

    public final QAddress addressByMailingAddressId;

    public final QAddress addressByPermanentAddressId;

    public final DatePath<java.util.Date> dob = createDate("dob", java.util.Date.class);

    public final StringPath email = createString("email");

    public final QFileBlob fileBlob;

    public final StringPath gender = createString("gender");

    public final StringPath idNumber = createString("idNumber");

    public final NumberPath<Integer> idType = createNumber("idType", Integer.class);

    public final StringPath mobileNo = createString("mobileNo");

    public final StringPath name = createString("name");

    public final StringPath phoneNo = createString("phoneNo");

    public final StringPath pob = createString("pob");

    public final NumberPath<Integer> profileId = createNumber("profileId", Integer.class);

    public final NumberPath<Integer> raceId = createNumber("raceId", Integer.class);

    public final QUser user;

    public final SetPath<VettingProfile, QVettingProfile> vettingProfiles = this.<VettingProfile, QVettingProfile>createSet("vettingProfiles", VettingProfile.class, QVettingProfile.class, PathInits.DIRECT2);

    public QProfile(String variable) {
        this(Profile.class, forVariable(variable), INITS);
    }

    public QProfile(Path<? extends Profile> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProfile(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProfile(PathMetadata<?> metadata, PathInits inits) {
        this(Profile.class, metadata, inits);
    }

    public QProfile(Class<? extends Profile> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.addressByMailingAddressId = inits.isInitialized("addressByMailingAddressId") ? new QAddress(forProperty("addressByMailingAddressId")) : null;
        this.addressByPermanentAddressId = inits.isInitialized("addressByPermanentAddressId") ? new QAddress(forProperty("addressByPermanentAddressId")) : null;
        this.fileBlob = inits.isInitialized("fileBlob") ? new QFileBlob(forProperty("fileBlob")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

