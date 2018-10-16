package br.com.senior.treinamento.spring.treinamentospring.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QClienteEntity is a Querydsl query type for ClienteEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QClienteEntity extends EntityPathBase<ClienteEntity> {

    private static final long serialVersionUID = 2008331091L;

    public static final QClienteEntity clienteEntity = new QClienteEntity("clienteEntity");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    public QClienteEntity(String variable) {
        super(ClienteEntity.class, forVariable(variable));
    }

    public QClienteEntity(Path<? extends ClienteEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QClienteEntity(PathMetadata metadata) {
        super(ClienteEntity.class, metadata);
    }

}

