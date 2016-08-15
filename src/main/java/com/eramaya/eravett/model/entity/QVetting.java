package com.eramaya.eravett.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QVetting is a Querydsl query type for Vetting
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QVetting extends EntityPathBase<Vetting> {

    private static final long serialVersionUID = -1772564189L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QVetting vetting = new QVetting("vetting");

    public final DatePath<java.util.Date> date = createDate("date", java.util.Date.class);

    public final DatePath<java.util.Date> expiryDate = createDate("expiryDate", java.util.Date.class);

    public final NumberPath<Integer> vettingId = createNumber("vettingId", Integer.class);

    public final QVettingOrder vettingOrder;

    public final SetPath<VettingProfile, QVettingProfile> vettingProfiles = this.<VettingProfile, QVettingProfile>createSet("vettingProfiles", VettingProfile.class, QVettingProfile.class, PathInits.DIRECT2);

    public QVetting(String variable) {
        this(Vetting.class, forVariable(variable), INITS);
    }

    public QVetting(Path<? extends Vetting> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QVetting(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QVetting(PathMetadata<?> metadata, PathInits inits) {
        this(Vetting.class, metadata, inits);
    }

    public QVetting(Class<? extends Vetting> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.vettingOrder = inits.isInitialized("vettingOrder") ? new QVettingOrder(forProperty("vettingOrder"), inits.get("vettingOrder")) : null;
    }

}

