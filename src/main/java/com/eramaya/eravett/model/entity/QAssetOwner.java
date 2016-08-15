package com.eramaya.eravett.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QAssetOwner is a Querydsl query type for AssetOwner
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAssetOwner extends EntityPathBase<AssetOwner> {

    private static final long serialVersionUID = -1423179117L;

    public static final QAssetOwner assetOwner = new QAssetOwner("assetOwner");

    public final NumberPath<Integer> assetOwnerId = createNumber("assetOwnerId", Integer.class);

    public final StringPath name = createString("name");

    public final SetPath<VettingOrder, QVettingOrder> vettingOrders = this.<VettingOrder, QVettingOrder>createSet("vettingOrders", VettingOrder.class, QVettingOrder.class, PathInits.DIRECT2);

    public QAssetOwner(String variable) {
        super(AssetOwner.class, forVariable(variable));
    }

    public QAssetOwner(Path<? extends AssetOwner> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAssetOwner(PathMetadata<?> metadata) {
        super(AssetOwner.class, metadata);
    }

}

