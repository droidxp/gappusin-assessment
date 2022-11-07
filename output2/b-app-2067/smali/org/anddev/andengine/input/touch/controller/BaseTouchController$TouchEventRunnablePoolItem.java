class org.anddev.andengine.input.touch.controller.BaseTouchController$TouchEventRunnablePoolItem extends org.anddev.andengine.util.pool.RunnablePoolItem {
	 /* # instance fields */
	 private org.anddev.andengine.input.touch.TouchEvent mTouchEvent;
	 final org.anddev.andengine.input.touch.controller.BaseTouchController this$0; //synthetic
	 /* # direct methods */
	 org.anddev.andengine.input.touch.controller.BaseTouchController$TouchEventRunnablePoolItem ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Lorg/anddev/andengine/util/pool/RunnablePoolItem;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onRecycle ( ) {
		 /* .locals 2 */
		 /* invoke-super {p0}, Lorg/anddev/andengine/util/pool/RunnablePoolItem;->onRecycle()V */
		 v0 = this.mTouchEvent;
		 (( org.anddev.andengine.input.touch.TouchEvent ) v0 ).getMotionEvent ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/input/touch/TouchEvent;->getMotionEvent()Landroid/view/MotionEvent;
		 (( android.view.MotionEvent ) v1 ).recycle ( ); // invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V
		 (( org.anddev.andengine.input.touch.TouchEvent ) v0 ).recycle ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/input/touch/TouchEvent;->recycle()V
		 return;
	 } // .end method
	 public void run ( ) {
		 /* .locals 2 */
		 v0 = this.this$0;
		 org.anddev.andengine.input.touch.controller.BaseTouchController .access$0 ( v0 );
		 v1 = this.mTouchEvent;
		 return;
	 } // .end method
	 public void set ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
		 /* .locals 0 */
		 this.mTouchEvent = p1;
		 return;
	 } // .end method
