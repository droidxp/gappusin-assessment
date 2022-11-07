public abstract class org.anddev.andengine.util.pool.GenericPool {
	 /* # instance fields */
	 private final java.util.Stack mAvailableItems;
	 private final Integer mGrowth;
	 private Integer mUnrecycledCount;
	 /* # direct methods */
	 public org.anddev.andengine.util.pool.GenericPool ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0}, Lorg/anddev/andengine/util/pool/GenericPool;-><init>(I)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.pool.GenericPool ( ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* invoke-direct {p0, p1, v0}, Lorg/anddev/andengine/util/pool/GenericPool;-><init>(II)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.pool.GenericPool ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Ljava/util/Stack; */
		 /* invoke-direct {v0}, Ljava/util/Stack;-><init>()V */
		 this.mAvailableItems = v0;
		 /* if-gez p2, :cond_0 */
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 final String v1 = "pGrowth must be at least 0!"; // const-string v1, "pGrowth must be at least 0!"
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_0
	 /* iput p2, p0, Lorg/anddev/andengine/util/pool/GenericPool;->mGrowth:I */
	 /* if-lez p1, :cond_1 */
	 (( org.anddev.andengine.util.pool.GenericPool ) p0 ).batchAllocatePoolItems ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/util/pool/GenericPool;->batchAllocatePoolItems(I)V
} // :cond_1
return;
} // .end method
/* # virtual methods */
public synchronized void batchAllocatePoolItems ( Integer p0 ) {
/* .locals 3 */
/* monitor-enter p0 */
try { // :try_start_0
	 v0 = this.mAvailableItems;
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 int v1 = 1; // const/4 v1, 0x1
	 /* sub-int v1, p1, v1 */
} // :goto_0
/* if-gez v1, :cond_0 */
/* monitor-exit p0 */
return;
} // :cond_0
try { // :try_start_1
(( org.anddev.andengine.util.pool.GenericPool ) p0 ).onHandleAllocatePoolItem ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/pool/GenericPool;->onHandleAllocatePoolItem()Ljava/lang/Object;
(( java.util.Stack ) v0 ).push ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* add-int/lit8 v1, v1, -0x1 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized Integer getUnrecycledCount ( ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
	 /* iget v0, p0, Lorg/anddev/andengine/util/pool/GenericPool;->mUnrecycledCount:I */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* monitor-exit p0 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
public synchronized java.lang.Object obtainPoolItem ( ) {
	 /* .locals 3 */
	 /* monitor-enter p0 */
	 try { // :try_start_0
		 v0 = this.mAvailableItems;
		 v0 = 		 (( java.util.Stack ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Stack;->size()I
		 /* if-lez v0, :cond_0 */
		 v0 = this.mAvailableItems;
		 (( java.util.Stack ) v0 ).pop ( ); // invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;
	 } // :goto_0
	 (( org.anddev.andengine.util.pool.GenericPool ) p0 ).onHandleObtainItem ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/util/pool/GenericPool;->onHandleObtainItem(Ljava/lang/Object;)V
	 /* iget v1, p0, Lorg/anddev/andengine/util/pool/GenericPool;->mUnrecycledCount:I */
	 /* add-int/lit8 v1, v1, 0x1 */
	 /* iput v1, p0, Lorg/anddev/andengine/util/pool/GenericPool;->mUnrecycledCount:I */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* monitor-exit p0 */
} // :cond_0
try { // :try_start_1
	 /* iget v0, p0, Lorg/anddev/andengine/util/pool/GenericPool;->mGrowth:I */
	 int v1 = 1; // const/4 v1, 0x1
	 /* if-ne v0, v1, :cond_1 */
	 (( org.anddev.andengine.util.pool.GenericPool ) p0 ).onHandleAllocatePoolItem ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/pool/GenericPool;->onHandleAllocatePoolItem()Ljava/lang/Object;
} // :goto_1
/* new-instance v1, Ljava/lang/StringBuilder; */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
java.lang.String .valueOf ( v2 );
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v2 = "<"; // const-string v2, "<"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v2 ).getSimpleName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "> was exhausted, with "; // const-string v2, "> was exhausted, with "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Lorg/anddev/andengine/util/pool/GenericPool;->mUnrecycledCount:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " item not yet recycled.Allocated "; // const-string v2, " item not yet recycled.Allocated "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Lorg/anddev/andengine/util/pool/GenericPool;->mGrowth:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " more."; // const-string v2, " more."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
org.anddev.andengine.util.Debug .i ( v1 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_1
try { // :try_start_2
/* iget v0, p0, Lorg/anddev/andengine/util/pool/GenericPool;->mGrowth:I */
(( org.anddev.andengine.util.pool.GenericPool ) p0 ).batchAllocatePoolItems ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/util/pool/GenericPool;->batchAllocatePoolItems(I)V
v0 = this.mAvailableItems;
(( java.util.Stack ) v0 ).pop ( ); // invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
protected abstract java.lang.Object onAllocatePoolItem ( ) {
} // .end method
protected java.lang.Object onHandleAllocatePoolItem ( ) {
/* .locals 1 */
(( org.anddev.andengine.util.pool.GenericPool ) p0 ).onAllocatePoolItem ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/pool/GenericPool;->onAllocatePoolItem()Ljava/lang/Object;
} // .end method
protected void onHandleObtainItem ( java.lang.Object p0 ) {
/* .locals 0 */
return;
} // .end method
protected void onHandleRecycleItem ( java.lang.Object p0 ) {
/* .locals 0 */
return;
} // .end method
public synchronized void recyclePoolItem ( java.lang.Object p0 ) {
/* .locals 2 */
/* monitor-enter p0 */
/* if-nez p1, :cond_0 */
try { // :try_start_0
	 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
	 final String v1 = "Cannot recycle null item!"; // const-string v1, "Cannot recycle null item!"
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // :cond_0
try { // :try_start_1
	 (( org.anddev.andengine.util.pool.GenericPool ) p0 ).onHandleRecycleItem ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/util/pool/GenericPool;->onHandleRecycleItem(Ljava/lang/Object;)V
	 v0 = this.mAvailableItems;
	 (( java.util.Stack ) v0 ).push ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;
	 /* iget v0, p0, Lorg/anddev/andengine/util/pool/GenericPool;->mUnrecycledCount:I */
	 int v1 = 1; // const/4 v1, 0x1
	 /* sub-int/2addr v0, v1 */
	 /* iput v0, p0, Lorg/anddev/andengine/util/pool/GenericPool;->mUnrecycledCount:I */
	 /* iget v0, p0, Lorg/anddev/andengine/util/pool/GenericPool;->mUnrecycledCount:I */
	 /* if-gez v0, :cond_1 */
	 final String v0 = "More items recycled than obtained!"; // const-string v0, "More items recycled than obtained!"
	 org.anddev.andengine.util.Debug .e ( v0 );
	 /* :try_end_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :cond_1
/* monitor-exit p0 */
return;
} // .end method
public synchronized void shufflePoolItems ( ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
	 v0 = this.mAvailableItems;
	 java.util.Collections .shuffle ( v0 );
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* monitor-exit p0 */
	 return;
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
