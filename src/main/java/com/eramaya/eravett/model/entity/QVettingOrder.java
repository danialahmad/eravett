package com.eramaya.eravett.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QVettingOrder is a Querydsl query type for VettingOrder
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QVettingOrder extends EntityPathBase<VettingOrder> {

    private static final long serialVersionUID = -2050358293L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QVettingOrder vettingOrder = new QVettingOrder("vettingOrder");

    public final QAssetOwner assetOwner;

    public final QEmployer employer;

    public final StringPath poNo = createString("poNo");

    public final StringPath purpose = createString("purpose");

    public final NumberPath<Integer> vettingOrderId = createNumber("vettingOrderId", Integer.class);

    public final SetPath<Vetting, QVetting> vettings = this.<Vetting, QVetting>createSet("vettings", Vetting.class, QVetting.class, PathInits.DIRECT2);

    public QVettingOrder(String variable) {
        this(VettingOrder.class, forVariable(variable), INITS);
    }

    public QVettingOrder(Path<? extends VettingOrder> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QVettingOrder(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QVettingOrder(PathMetadata<?> metadata, PathInits inits) {
        this(VettingOrder.class, metadata, inits);
    }

    public QVettingOrder(Class<? extends VettingOrder> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.assetOwner = inits.isInitialized("assetOwner") ? new QAssetOwner(forProperty("assetOwner")) : null;
        this.employer = inits.isInitialized("employer") ? new QEmployer(forProperty("employer")) : null;
    }

}

