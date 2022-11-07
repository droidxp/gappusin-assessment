public abstract class org.anddev.andengine.engine.handler.BaseEntityUpdateHandler implements org.anddev.andengine.engine.handler.IUpdateHandler {
	 /* # interfaces */
	 /* # instance fields */
	 private final org.anddev.andengine.entity.IEntity mEntity;
	 /* # direct methods */
	 public org.anddev.andengine.engine.handler.BaseEntityUpdateHandler ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.mEntity = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void onUpdate ( Float p0 ) {
		 /* .locals 1 */
		 v0 = this.mEntity;
		 (( org.anddev.andengine.engine.handler.BaseEntityUpdateHandler ) p0 ).onUpdate ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/anddev/andengine/engine/handler/BaseEntityUpdateHandler;->onUpdate(FLorg/anddev/andengine/entity/IEntity;)V
		 return;
	 } // .end method
	 protected abstract void onUpdate ( Float p0, org.anddev.andengine.entity.IEntity p1 ) {
	 } // .end method
	 public void reset ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
