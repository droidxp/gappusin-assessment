public class org.anddev.andengine.util.TransformationPool {
	 /* # static fields */
	 private static final org.anddev.andengine.util.pool.GenericPool POOL;
	 /* # direct methods */
	 static org.anddev.andengine.util.TransformationPool ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Lorg/anddev/andengine/util/TransformationPool$1; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/TransformationPool$1;-><init>()V */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.TransformationPool ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.util.Transformation obtain ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.util.TransformationPool.POOL;
		 (( org.anddev.andengine.util.pool.GenericPool ) v0 ).obtainPoolItem ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/util/pool/GenericPool;->obtainPoolItem()Ljava/lang/Object;
		 /* check-cast v0, Lorg/anddev/andengine/util/Transformation; */
	 } // .end method
	 public static void recycle ( org.anddev.andengine.util.Transformation p0 ) {
		 /* .locals 1 */
		 (( org.anddev.andengine.util.Transformation ) p0 ).setToIdentity ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/Transformation;->setToIdentity()V
		 v0 = org.anddev.andengine.util.TransformationPool.POOL;
		 (( org.anddev.andengine.util.pool.GenericPool ) v0 ).recyclePoolItem ( p0 ); // invoke-virtual {v0, p0}, Lorg/anddev/andengine/util/pool/GenericPool;->recyclePoolItem(Ljava/lang/Object;)V
		 return;
	 } // .end method
