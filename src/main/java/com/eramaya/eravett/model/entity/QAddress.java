package com.eramaya.eravett.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QAddress is a Querydsl query type for Address
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAddress extends EntityPathBase<Address> {

    private static final long serialVersionUID = 1021226244L;

    public static final QAddress address = new QAddress("address");

    public final StringPath address1 = createString("address1");

    public final StringPath address2 = createString("address2");

    public final StringPath address3 = createString("address3");

    public final StringPath city = createString("city");

    public final NumberPath<Integer> countryId = createNumber("countryId", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath postcode = createString("postcode");

    public final SetPath<Profile, QProfile> profilesForMailingAddressId = this.<Profile, QProfile>createSet("profilesForMailingAddressId", Profile.class, QProfile.class, PathInits.DIRECT2);

    public final SetPath<Profile, QProfile> profilesForPermanentAddressId = this.<Profile, QProfile>createSet("profilesForPermanentAddressId", Profile.class, QProfile.class, PathInits.DIRECT2);

    public final NumberPath<Integer> stateId = createNumber("stateId", Integer.class);

    public QAddress(String variable) {
        super(Address.class, forVariable(variable));
    }

    public QAddress(Path<? extends Address> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAddress(PathMetadata<?> metadata) {
        super(Address.class, metadata);
    }

}

