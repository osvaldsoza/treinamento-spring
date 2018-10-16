package br.com.senior.treinamento.spring.treinamentospring.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPedidoEntity is a Querydsl query type for PedidoEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPedidoEntity extends EntityPathBase<PedidoEntity> {

    private static final long serialVersionUID = -1784550414L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPedidoEntity pedidoEntity = new QPedidoEntity("pedidoEntity");

    public final QClienteEntity cliente;

    public final DateTimePath<java.time.LocalDateTime> dataPedido = createDateTime("dataPedido", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<ItemEntity, QItemEntity> itens = this.<ItemEntity, QItemEntity>createList("itens", ItemEntity.class, QItemEntity.class, PathInits.DIRECT2);

    public QPedidoEntity(String variable) {
        this(PedidoEntity.class, forVariable(variable), INITS);
    }

    public QPedidoEntity(Path<? extends PedidoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPedidoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPedidoEntity(PathMetadata metadata, PathInits inits) {
        this(PedidoEntity.class, metadata, inits);
    }

    public QPedidoEntity(Class<? extends PedidoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cliente = inits.isInitialized("cliente") ? new QClienteEntity(forProperty("cliente")) : null;
    }

}

