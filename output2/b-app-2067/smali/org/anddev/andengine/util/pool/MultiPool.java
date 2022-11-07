public class org.anddev.andengine.util.pool.MultiPool {
	 /* # instance fields */
	 private final android.util.SparseArray mPools;
	 /* # direct methods */
	 public org.anddev.andengine.util.pool.MultiPool ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Landroid/util/SparseArray; */
		 /* invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V */
		 this.mPools = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object obtainPoolItem ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.mPools;
		 (( android.util.SparseArray ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
		 /* check-cast p0, Lorg/anddev/andengine/util/pool/GenericPool; */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
(( org.anddev.andengine.util.pool.GenericPool ) p0 ).obtainPoolItem ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/pool/GenericPool;->obtainPoolItem()Ljava/lang/Object;
} // .end method
public void recyclePoolItem ( Integer p0, java.lang.Object p1 ) {
/* .locals 1 */
v0 = this.mPools;
(( android.util.SparseArray ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/util/pool/GenericPool; */
if ( p0 != null) { // if-eqz p0, :cond_0
	 (( org.anddev.andengine.util.pool.GenericPool ) p0 ).recyclePoolItem ( p2 ); // invoke-virtual {p0, p2}, Lorg/anddev/andengine/util/pool/GenericPool;->recyclePoolItem(Ljava/lang/Object;)V
} // :cond_0
return;
} // .end method
public void registerPool ( Integer p0, org.anddev.andengine.util.pool.GenericPool p1 ) {
/* .locals 1 */
v0 = this.mPools;
(( android.util.SparseArray ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
return;
} // .end method
