public abstract class org.anddev.andengine.util.pool.PoolItem {
	 /* # instance fields */
	 org.anddev.andengine.util.pool.Pool mParent;
	 Boolean mRecycled;
	 /* # direct methods */
	 public org.anddev.andengine.util.pool.PoolItem ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/util/pool/PoolItem;->mRecycled:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.util.pool.Pool getParent ( ) {
		 /* .locals 1 */
		 v0 = this.mParent;
	 } // .end method
	 public Boolean isFromPool ( org.anddev.andengine.util.pool.Pool p0 ) {
		 /* .locals 1 */
		 v0 = this.mParent;
		 /* if-ne p1, v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isRecycled ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/util/pool/PoolItem;->mRecycled:Z */
} // .end method
protected void onObtain ( ) {
/* .locals 0 */
return;
} // .end method
protected void onRecycle ( ) {
/* .locals 0 */
return;
} // .end method
public void recycle ( ) {
/* .locals 2 */
v0 = this.mParent;
/* if-nez v0, :cond_0 */
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Item already recycled!"; // const-string v1, "Item already recycled!"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
v0 = this.mParent;
(( org.anddev.andengine.util.pool.Pool ) v0 ).recycle ( p0 ); // invoke-virtual {v0, p0}, Lorg/anddev/andengine/util/pool/Pool;->recycle(Lorg/anddev/andengine/util/pool/PoolItem;)V
return;
} // .end method
