package com.eramaya.eravett.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QProfileEmployer is a Querydsl query type for ProfileEmployer
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QProfileEmployer extends EntityPathBase<ProfileEmployer> {

    private static final long serialVersionUID = 1695358100L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProfileEmployer profileEmployer = new QProfileEmployer("profileEmployer");

    public final QEmployer employer;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath position = createString("position");

    public final QProfile profile;

    public QProfileEmployer(String variable) {
        this(ProfileEmployer.class, forVariable(variable), INITS);
    }

    public QProfileEmployer(Path<? extends ProfileEmployer> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProfileEmployer(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProfileEmployer(PathMetadata<?> metadata, PathInits inits) {
        this(ProfileEmployer.class, metadata, inits);
    }

    public QProfileEmployer(Class<? extends ProfileEmployer> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.employer = inits.isInitialized("employer") ? new QEmployer(forProperty("employer")) : null;
        this.profile = inits.isInitialized("profile") ? new QProfile(forProperty("profile"), inits.get("profile")) : null;
    }

}

