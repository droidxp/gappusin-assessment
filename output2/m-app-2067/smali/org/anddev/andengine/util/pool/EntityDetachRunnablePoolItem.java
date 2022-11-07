public class org.anddev.andengine.util.pool.EntityDetachRunnablePoolItem extends org.anddev.andengine.util.pool.RunnablePoolItem {
	 /* # instance fields */
	 protected org.anddev.andengine.entity.IEntity mEntity;
	 /* # direct methods */
	 public org.anddev.andengine.util.pool.EntityDetachRunnablePoolItem ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/util/pool/RunnablePoolItem;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 1 */
		 v0 = this.mEntity;
		 return;
	 } // .end method
	 public void setEntity ( org.anddev.andengine.entity.IEntity p0 ) {
		 /* .locals 0 */
		 this.mEntity = p1;
		 return;
	 } // .end method
