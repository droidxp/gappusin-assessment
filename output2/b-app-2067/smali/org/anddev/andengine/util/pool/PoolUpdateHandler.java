public abstract class org.anddev.andengine.util.pool.PoolUpdateHandler implements org.anddev.andengine.engine.handler.IUpdateHandler {
	 /* # interfaces */
	 /* # instance fields */
	 private final org.anddev.andengine.util.pool.Pool mPool;
	 private final java.util.ArrayList mScheduledPoolItems;
	 /* # direct methods */
	 public org.anddev.andengine.util.pool.PoolUpdateHandler ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mScheduledPoolItems = v0;
		 /* new-instance v0, Lorg/anddev/andengine/util/pool/PoolUpdateHandler$1; */
		 /* invoke-direct {v0, p0}, Lorg/anddev/andengine/util/pool/PoolUpdateHandler$1;-><init>(Lorg/anddev/andengine/util/pool/PoolUpdateHandler;)V */
		 this.mPool = v0;
		 return;
	 } // .end method
	 public org.anddev.andengine.util.pool.PoolUpdateHandler ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mScheduledPoolItems = v0;
		 /* new-instance v0, Lorg/anddev/andengine/util/pool/PoolUpdateHandler$2; */
		 /* invoke-direct {v0, p0, p1}, Lorg/anddev/andengine/util/pool/PoolUpdateHandler$2;-><init>(Lorg/anddev/andengine/util/pool/PoolUpdateHandler;I)V */
		 this.mPool = v0;
		 return;
	 } // .end method
	 public org.anddev.andengine.util.pool.PoolUpdateHandler ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mScheduledPoolItems = v0;
		 /* new-instance v0, Lorg/anddev/andengine/util/pool/PoolUpdateHandler$3; */
		 /* invoke-direct {v0, p0, p1, p2}, Lorg/anddev/andengine/util/pool/PoolUpdateHandler$3;-><init>(Lorg/anddev/andengine/util/pool/PoolUpdateHandler;II)V */
		 this.mPool = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.util.pool.PoolItem obtainPoolItem ( ) {
		 /* .locals 1 */
		 v0 = this.mPool;
		 (( org.anddev.andengine.util.pool.Pool ) v0 ).obtainPoolItem ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/util/pool/Pool;->obtainPoolItem()Ljava/lang/Object;
		 /* check-cast p0, Lorg/anddev/andengine/util/pool/PoolItem; */
	 } // .end method
	 protected abstract org.anddev.andengine.util.pool.PoolItem onAllocatePoolItem ( ) {
	 } // .end method
	 protected abstract void onHandlePoolItem ( org.anddev.andengine.util.pool.PoolItem p0 ) {
	 } // .end method
	 public void onUpdate ( Float p0 ) {
		 /* .locals 5 */
		 v1 = this.mScheduledPoolItems;
		 /* monitor-enter v1 */
		 try { // :try_start_0
			 v2 = 			 (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
			 /* if-lez v2, :cond_0 */
			 v3 = this.mPool;
			 int v0 = 0; // const/4 v0, 0x0
			 /* move v4, v0 */
		 } // :goto_0
		 /* if-lt v4, v2, :cond_1 */
		 (( java.util.ArrayList ) v1 ).clear ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
	 } // :cond_0
	 /* monitor-exit v1 */
	 return;
} // :cond_1
(( java.util.ArrayList ) v1 ).get ( v4 ); // invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/util/pool/PoolItem; */
(( org.anddev.andengine.util.pool.PoolUpdateHandler ) p0 ).onHandlePoolItem ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/util/pool/PoolUpdateHandler;->onHandlePoolItem(Lorg/anddev/andengine/util/pool/PoolItem;)V
(( org.anddev.andengine.util.pool.Pool ) v3 ).recyclePoolItem ( v0 ); // invoke-virtual {v3, v0}, Lorg/anddev/andengine/util/pool/Pool;->recyclePoolItem(Lorg/anddev/andengine/util/pool/PoolItem;)V
/* add-int/lit8 v0, v4, 0x1 */
/* move v4, v0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void postPoolItem ( org.anddev.andengine.util.pool.PoolItem p0 ) {
/* .locals 3 */
v0 = this.mScheduledPoolItems;
/* monitor-enter v0 */
/* if-nez p1, :cond_0 */
try { // :try_start_0
	 /* new-instance v1, Ljava/lang/IllegalArgumentException; */
	 final String v2 = "PoolItem already recycled!"; // const-string v2, "PoolItem already recycled!"
	 /* invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v1 */
	 /* :catchall_0 */
	 /* move-exception v1 */
	 /* monitor-exit v0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v1 */
} // :cond_0
try { // :try_start_1
	 v1 = this.mPool;
	 v1 = 	 (( org.anddev.andengine.util.pool.Pool ) v1 ).ownsPoolItem ( p1 ); // invoke-virtual {v1, p1}, Lorg/anddev/andengine/util/pool/Pool;->ownsPoolItem(Lorg/anddev/andengine/util/pool/PoolItem;)Z
	 /* if-nez v1, :cond_1 */
	 /* new-instance v1, Ljava/lang/IllegalArgumentException; */
	 final String v2 = "PoolItem from another pool!"; // const-string v2, "PoolItem from another pool!"
	 /* invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v1 */
} // :cond_1
v1 = this.mScheduledPoolItems;
(( java.util.ArrayList ) v1 ).add ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* monitor-exit v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
return;
} // .end method
public void reset ( ) {
/* .locals 4 */
v0 = this.mScheduledPoolItems;
/* monitor-enter v0 */
try { // :try_start_0
	 v1 = 	 (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
	 v2 = this.mPool;
	 int v3 = 1; // const/4 v3, 0x1
	 /* sub-int/2addr v1, v3 */
} // :goto_0
/* if-gez v1, :cond_0 */
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* monitor-exit v0 */
return;
} // :cond_0
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/util/pool/PoolItem; */
(( org.anddev.andengine.util.pool.Pool ) v2 ).recyclePoolItem ( p0 ); // invoke-virtual {v2, p0}, Lorg/anddev/andengine/util/pool/Pool;->recyclePoolItem(Lorg/anddev/andengine/util/pool/PoolItem;)V
/* add-int/lit8 v1, v1, -0x1 */
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
