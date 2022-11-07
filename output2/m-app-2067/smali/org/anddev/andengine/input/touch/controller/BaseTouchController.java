public abstract class org.anddev.andengine.input.touch.controller.BaseTouchController implements org.anddev.andengine.input.touch.controller.ITouchController {
	 /* # interfaces */
	 /* # instance fields */
	 private Boolean mRunOnUpdateThread;
	 private org.anddev.andengine.input.touch.controller.ITouchController$ITouchEventCallback mTouchEventCallback;
	 private final org.anddev.andengine.util.pool.RunnablePoolUpdateHandler mTouchEventRunnablePoolUpdateHandler;
	 /* # direct methods */
	 public org.anddev.andengine.input.touch.controller.BaseTouchController ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Lorg/anddev/andengine/input/touch/controller/BaseTouchController$1; */
		 /* invoke-direct {v0, p0}, Lorg/anddev/andengine/input/touch/controller/BaseTouchController$1;-><init>(Lorg/anddev/andengine/input/touch/controller/BaseTouchController;)V */
		 this.mTouchEventRunnablePoolUpdateHandler = v0;
		 return;
	 } // .end method
	 static org.anddev.andengine.input.touch.controller.ITouchController$ITouchEventCallback access$0 ( org.anddev.andengine.input.touch.controller.BaseTouchController p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.mTouchEventCallback;
	 } // .end method
	 /* # virtual methods */
	 public void applyTouchOptions ( org.anddev.andengine.engine.options.TouchOptions p0 ) {
		 /* .locals 1 */
		 v0 = 		 (( org.anddev.andengine.engine.options.TouchOptions ) p1 ).isRunOnUpdateThread ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/engine/options/TouchOptions;->isRunOnUpdateThread()Z
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/input/touch/controller/BaseTouchController;->mRunOnUpdateThread:Z */
		 return;
	 } // .end method
	 protected Boolean fireTouchEvent ( Float p0, Float p1, Integer p2, Integer p3, android.view.MotionEvent p4 ) {
		 /* .locals 2 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/input/touch/controller/BaseTouchController;->mRunOnUpdateThread:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 android.view.MotionEvent .obtain ( p5 );
			 org.anddev.andengine.input.touch.TouchEvent .obtain ( p1,p2,p3,p4,v0 );
			 v0 = this.mTouchEventRunnablePoolUpdateHandler;
			 (( org.anddev.andengine.util.pool.RunnablePoolUpdateHandler ) v0 ).obtainPoolItem ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/util/pool/RunnablePoolUpdateHandler;->obtainPoolItem()Lorg/anddev/andengine/util/pool/PoolItem;
			 /* check-cast v0, Lorg/anddev/andengine/input/touch/controller/BaseTouchController$TouchEventRunnablePoolItem; */
			 (( org.anddev.andengine.input.touch.controller.BaseTouchController$TouchEventRunnablePoolItem ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/input/touch/controller/BaseTouchController$TouchEventRunnablePoolItem;->set(Lorg/anddev/andengine/input/touch/TouchEvent;)V
			 v1 = this.mTouchEventRunnablePoolUpdateHandler;
			 (( org.anddev.andengine.util.pool.RunnablePoolUpdateHandler ) v1 ).postPoolItem ( v0 ); // invoke-virtual {v1, v0}, Lorg/anddev/andengine/util/pool/RunnablePoolUpdateHandler;->postPoolItem(Lorg/anddev/andengine/util/pool/PoolItem;)V
			 int v0 = 1; // const/4 v0, 0x1
		 } // :goto_0
	 } // :cond_0
	 org.anddev.andengine.input.touch.TouchEvent .obtain ( p1,p2,p3,p4,p5 );
	 v1 = 	 v1 = this.mTouchEventCallback;
	 (( org.anddev.andengine.input.touch.TouchEvent ) v0 ).recycle ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/input/touch/TouchEvent;->recycle()V
	 /* move v0, v1 */
} // .end method
public void onUpdate ( Float p0 ) {
	 /* .locals 1 */
	 /* iget-boolean v0, p0, Lorg/anddev/andengine/input/touch/controller/BaseTouchController;->mRunOnUpdateThread:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.mTouchEventRunnablePoolUpdateHandler;
		 (( org.anddev.andengine.util.pool.RunnablePoolUpdateHandler ) v0 ).onUpdate ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/util/pool/RunnablePoolUpdateHandler;->onUpdate(F)V
	 } // :cond_0
	 return;
} // .end method
public void reset ( ) {
	 /* .locals 1 */
	 /* iget-boolean v0, p0, Lorg/anddev/andengine/input/touch/controller/BaseTouchController;->mRunOnUpdateThread:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.mTouchEventRunnablePoolUpdateHandler;
		 (( org.anddev.andengine.util.pool.RunnablePoolUpdateHandler ) v0 ).reset ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/util/pool/RunnablePoolUpdateHandler;->reset()V
	 } // :cond_0
	 return;
} // .end method
public void setTouchEventCallback ( org.anddev.andengine.input.touch.controller.ITouchController$ITouchEventCallback p0 ) {
	 /* .locals 0 */
	 this.mTouchEventCallback = p1;
	 return;
} // .end method
