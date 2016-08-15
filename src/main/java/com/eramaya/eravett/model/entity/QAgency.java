package com.eramaya.eravett.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QAgency is a Querydsl query type for Agency
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAgency extends EntityPathBase<Agency> {

    private static final long serialVersionUID = 728475893L;

    public static final QAgency agency = new QAgency("agency");

    public final NumberPath<Integer> agencyId = createNumber("agencyId", Integer.class);

    public final StringPath name = createString("name");

    public final SetPath<VettingStatus, QVettingStatus> vettingStatuses = this.<VettingStatus, QVettingStatus>createSet("vettingStatuses", VettingStatus.class, QVettingStatus.class, PathInits.DIRECT2);

    public QAgency(String variable) {
        super(Agency.class, forVariable(variable));
    }

    public QAgency(Path<? extends Agency> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAgency(PathMetadata<?> metadata) {
        super(Agency.class, metadata);
    }

}

