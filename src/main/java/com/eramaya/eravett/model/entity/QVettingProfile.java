package com.eramaya.eravett.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QVettingProfile is a Querydsl query type for VettingProfile
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QVettingProfile extends EntityPathBase<VettingProfile> {

    private static final long serialVersionUID = 1893356294L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QVettingProfile vettingProfile = new QVettingProfile("vettingProfile");

    public final StringPath active = createString("active");

    public final QProfile profile;

    public final StringPath status = createString("status");

    public final QVetting vetting;

    public final NumberPath<Integer> vettingProfileId = createNumber("vettingProfileId", Integer.class);

    public final SetPath<VettingStatus, QVettingStatus> vettingStatuses = this.<VettingStatus, QVettingStatus>createSet("vettingStatuses", VettingStatus.class, QVettingStatus.class, PathInits.DIRECT2);

    public QVettingProfile(String variable) {
        this(VettingProfile.class, forVariable(variable), INITS);
    }

    public QVettingProfile(Path<? extends VettingProfile> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QVettingProfile(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QVettingProfile(PathMetadata<?> metadata, PathInits inits) {
        this(VettingProfile.class, metadata, inits);
    }

    public QVettingProfile(Class<? extends VettingProfile> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.profile = inits.isInitialized("profile") ? new QProfile(forProperty("profile"), inits.get("profile")) : null;
        this.vetting = inits.isInitialized("vetting") ? new QVetting(forProperty("vetting"), inits.get("vetting")) : null;
    }

}

