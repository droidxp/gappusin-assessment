public abstract class org.anddev.andengine.util.pool.RunnablePoolUpdateHandler extends org.anddev.andengine.util.pool.PoolUpdateHandler {
	 /* # direct methods */
	 public org.anddev.andengine.util.pool.RunnablePoolUpdateHandler ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/util/pool/PoolUpdateHandler;-><init>()V */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.pool.RunnablePoolUpdateHandler ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/util/pool/PoolUpdateHandler;-><init>(I)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected org.anddev.andengine.util.pool.PoolItem onAllocatePoolItem ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.util.pool.RunnablePoolUpdateHandler ) p0 ).onAllocatePoolItem ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/pool/RunnablePoolUpdateHandler;->onAllocatePoolItem()Lorg/anddev/andengine/util/pool/RunnablePoolItem;
	 } // .end method
	 protected abstract org.anddev.andengine.util.pool.RunnablePoolItem onAllocatePoolItem ( ) {
	 } // .end method
	 protected void onHandlePoolItem ( org.anddev.andengine.util.pool.PoolItem p0 ) { //bridge//synthethic
		 /* .locals 0 */
		 /* check-cast p1, Lorg/anddev/andengine/util/pool/RunnablePoolItem; */
		 (( org.anddev.andengine.util.pool.RunnablePoolUpdateHandler ) p0 ).onHandlePoolItem ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/util/pool/RunnablePoolUpdateHandler;->onHandlePoolItem(Lorg/anddev/andengine/util/pool/RunnablePoolItem;)V
		 return;
	 } // .end method
	 protected void onHandlePoolItem ( org.anddev.andengine.util.pool.RunnablePoolItem p0 ) {
		 /* .locals 0 */
		 (( org.anddev.andengine.util.pool.RunnablePoolItem ) p1 ).run ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/util/pool/RunnablePoolItem;->run()V
		 return;
	 } // .end method
