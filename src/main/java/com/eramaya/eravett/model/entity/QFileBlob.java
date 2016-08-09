package com.eramaya.eravett.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QFileBlob is a Querydsl query type for FileBlob
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QFileBlob extends EntityPathBase<FileBlob> {

    private static final long serialVersionUID = 2075888681L;

    public static final QFileBlob fileBlob = new QFileBlob("fileBlob");

    public final ArrayPath<byte[], Byte> blobContent = createArray("blobContent", byte[].class);

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.util.Date> createdDate = createDateTime("createdDate", java.util.Date.class);

    public final NumberPath<Integer> docSize = createNumber("docSize", Integer.class);

    public final StringPath fileName = createString("fileName");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath mimeType = createString("mimeType");

    public final SetPath<Profile, QProfile> profiles = this.<Profile, QProfile>createSet("profiles", Profile.class, QProfile.class, PathInits.DIRECT2);

    public final StringPath updatedBy = createString("updatedBy");

    public final DateTimePath<java.util.Date> updatedDate = createDateTime("updatedDate", java.util.Date.class);

    public QFileBlob(String variable) {
        super(FileBlob.class, forVariable(variable));
    }

    public QFileBlob(Path<? extends FileBlob> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFileBlob(PathMetadata<?> metadata) {
        super(FileBlob.class, metadata);
    }

}

