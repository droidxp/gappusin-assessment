class org.anddev.andengine.input.touch.controller.BaseTouchController$1 extends org.anddev.andengine.util.pool.RunnablePoolUpdateHandler {
	 /* # instance fields */
	 final org.anddev.andengine.input.touch.controller.BaseTouchController this$0; //synthetic
	 /* # direct methods */
	 org.anddev.andengine.input.touch.controller.BaseTouchController$1 ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Lorg/anddev/andengine/util/pool/RunnablePoolUpdateHandler;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected org.anddev.andengine.input.touch.controller.BaseTouchController$TouchEventRunnablePoolItem onAllocatePoolItem ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Lorg/anddev/andengine/input/touch/controller/BaseTouchController$TouchEventRunnablePoolItem; */
		 v1 = this.this$0;
		 /* invoke-direct {v0, v1}, Lorg/anddev/andengine/input/touch/controller/BaseTouchController$TouchEventRunnablePoolItem;-><init>(Lorg/anddev/andengine/input/touch/controller/BaseTouchController;)V */
	 } // .end method
	 protected org.anddev.andengine.util.pool.RunnablePoolItem onAllocatePoolItem ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.input.touch.controller.BaseTouchController$1 ) p0 ).onAllocatePoolItem ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/input/touch/controller/BaseTouchController$1;->onAllocatePoolItem()Lorg/anddev/andengine/input/touch/controller/BaseTouchController$TouchEventRunnablePoolItem;
	 } // .end method
