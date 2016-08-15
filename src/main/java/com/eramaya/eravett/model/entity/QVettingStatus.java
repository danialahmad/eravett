package com.eramaya.eravett.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QVettingStatus is a Querydsl query type for VettingStatus
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QVettingStatus extends EntityPathBase<VettingStatus> {

    private static final long serialVersionUID = 979691253L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QVettingStatus vettingStatus = new QVettingStatus("vettingStatus");

    public final QAgency agency;

    public final StringPath comment = createString("comment");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.util.Date> createdDate = createDateTime("createdDate", java.util.Date.class);

    public final StringPath status = createString("status");

    public final QVettingProfile vettingProfile;

    public final NumberPath<Integer> vettingStatusId = createNumber("vettingStatusId", Integer.class);

    public QVettingStatus(String variable) {
        this(VettingStatus.class, forVariable(variable), INITS);
    }

    public QVettingStatus(Path<? extends VettingStatus> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QVettingStatus(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QVettingStatus(PathMetadata<?> metadata, PathInits inits) {
        this(VettingStatus.class, metadata, inits);
    }

    public QVettingStatus(Class<? extends VettingStatus> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.agency = inits.isInitialized("agency") ? new QAgency(forProperty("agency")) : null;
        this.vettingProfile = inits.isInitialized("vettingProfile") ? new QVettingProfile(forProperty("vettingProfile"), inits.get("vettingProfile")) : null;
    }

}

