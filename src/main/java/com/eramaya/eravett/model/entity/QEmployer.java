package com.eramaya.eravett.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QEmployer is a Querydsl query type for Employer
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QEmployer extends EntityPathBase<Employer> {

    private static final long serialVersionUID = -289540181L;

    public static final QEmployer employer = new QEmployer("employer");

    public final NumberPath<Integer> employerId = createNumber("employerId", Integer.class);

    public final StringPath name = createString("name");

    public final SetPath<ProfileEmployer, QProfileEmployer> profileEmployers = this.<ProfileEmployer, QProfileEmployer>createSet("profileEmployers", ProfileEmployer.class, QProfileEmployer.class, PathInits.DIRECT2);

    public final SetPath<VettingOrder, QVettingOrder> vettingOrders = this.<VettingOrder, QVettingOrder>createSet("vettingOrders", VettingOrder.class, QVettingOrder.class, PathInits.DIRECT2);

    public QEmployer(String variable) {
        super(Employer.class, forVariable(variable));
    }

    public QEmployer(Path<? extends Employer> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEmployer(PathMetadata<?> metadata) {
        super(Employer.class, metadata);
    }

}

