public abstract class org.anddev.andengine.util.pool.Pool extends org.anddev.andengine.util.pool.GenericPool {
	 /* # direct methods */
	 public org.anddev.andengine.util.pool.Pool ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/util/pool/GenericPool;-><init>()V */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.pool.Pool ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/util/pool/GenericPool;-><init>(I)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.pool.Pool ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Lorg/anddev/andengine/util/pool/GenericPool;-><init>(II)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected java.lang.Object onHandleAllocatePoolItem ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.util.pool.Pool ) p0 ).onHandleAllocatePoolItem ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/pool/Pool;->onHandleAllocatePoolItem()Lorg/anddev/andengine/util/pool/PoolItem;
	 } // .end method
	 protected org.anddev.andengine.util.pool.PoolItem onHandleAllocatePoolItem ( ) {
		 /* .locals 1 */
		 /* invoke-super {p0}, Lorg/anddev/andengine/util/pool/GenericPool;->onHandleAllocatePoolItem()Ljava/lang/Object; */
		 /* check-cast v0, Lorg/anddev/andengine/util/pool/PoolItem; */
		 this.mParent = p0;
	 } // .end method
	 protected void onHandleObtainItem ( java.lang.Object p0 ) { //bridge//synthethic
		 /* .locals 0 */
		 /* check-cast p1, Lorg/anddev/andengine/util/pool/PoolItem; */
		 (( org.anddev.andengine.util.pool.Pool ) p0 ).onHandleObtainItem ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/util/pool/Pool;->onHandleObtainItem(Lorg/anddev/andengine/util/pool/PoolItem;)V
		 return;
	 } // .end method
	 protected void onHandleObtainItem ( org.anddev.andengine.util.pool.PoolItem p0 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p1, Lorg/anddev/andengine/util/pool/PoolItem;->mRecycled:Z */
		 (( org.anddev.andengine.util.pool.PoolItem ) p1 ).onObtain ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/util/pool/PoolItem;->onObtain()V
		 return;
	 } // .end method
	 protected void onHandleRecycleItem ( java.lang.Object p0 ) { //bridge//synthethic
		 /* .locals 0 */
		 /* check-cast p1, Lorg/anddev/andengine/util/pool/PoolItem; */
		 (( org.anddev.andengine.util.pool.Pool ) p0 ).onHandleRecycleItem ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/util/pool/Pool;->onHandleRecycleItem(Lorg/anddev/andengine/util/pool/PoolItem;)V
		 return;
	 } // .end method
	 protected void onHandleRecycleItem ( org.anddev.andengine.util.pool.PoolItem p0 ) {
		 /* .locals 1 */
		 (( org.anddev.andengine.util.pool.PoolItem ) p1 ).onRecycle ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/util/pool/PoolItem;->onRecycle()V
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p1, Lorg/anddev/andengine/util/pool/PoolItem;->mRecycled:Z */
		 return;
	 } // .end method
	 public synchronized Boolean ownsPoolItem ( org.anddev.andengine.util.pool.PoolItem p0 ) {
		 /* .locals 1 */
		 /* monitor-enter p0 */
		 try { // :try_start_0
			 v0 = this.mParent;
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* if-ne v0, p0, :cond_0 */
			 int v0 = 1; // const/4 v0, 0x1
		 } // :goto_0
		 /* monitor-exit p0 */
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
void recycle ( org.anddev.andengine.util.pool.PoolItem p0 ) {
	 /* .locals 0 */
	 (( org.anddev.andengine.util.pool.Pool ) p0 ).recyclePoolItem ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/util/pool/Pool;->recyclePoolItem(Lorg/anddev/andengine/util/pool/PoolItem;)V
	 return;
} // .end method
public void recyclePoolItem ( java.lang.Object p0 ) { //bridge//synthethic
	 /* .locals 0 */
	 /* check-cast p1, Lorg/anddev/andengine/util/pool/PoolItem; */
	 (( org.anddev.andengine.util.pool.Pool ) p0 ).recyclePoolItem ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/util/pool/Pool;->recyclePoolItem(Lorg/anddev/andengine/util/pool/PoolItem;)V
	 return;
} // .end method
public synchronized void recyclePoolItem ( org.anddev.andengine.util.pool.PoolItem p0 ) {
	 /* .locals 2 */
	 /* monitor-enter p0 */
	 try { // :try_start_0
		 v0 = this.mParent;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 final String v1 = "PoolItem not assigned to a pool!"; // const-string v1, "PoolItem not assigned to a pool!"
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
		 v0 = 		 (( org.anddev.andengine.util.pool.PoolItem ) p1 ).isFromPool ( p0 ); // invoke-virtual {p1, p0}, Lorg/anddev/andengine/util/pool/PoolItem;->isFromPool(Lorg/anddev/andengine/util/pool/Pool;)Z
		 /* if-nez v0, :cond_1 */
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 final String v1 = "PoolItem from another pool!"; // const-string v1, "PoolItem from another pool!"
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_1
	 v0 = 	 (( org.anddev.andengine.util.pool.PoolItem ) p1 ).isRecycled ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/util/pool/PoolItem;->isRecycled()Z
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 final String v1 = "PoolItem already recycled!"; // const-string v1, "PoolItem already recycled!"
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_2
	 /* invoke-super {p0, p1}, Lorg/anddev/andengine/util/pool/GenericPool;->recyclePoolItem(Ljava/lang/Object;)V */
	 /* :try_end_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 /* monitor-exit p0 */
	 return;
} // .end method
