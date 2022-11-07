public class com.wiyun.engine.events.EventDispatcher extends com.wiyun.engine.BaseWYObject implements android.view.GestureDetector$OnDoubleTapListener implements android.view.GestureDetector$OnGestureListener {
	 /* # interfaces */
	 /* # static fields */
	 private static com.wiyun.engine.events.EventDispatcher sInstance;
	 /* # direct methods */
	 protected com.wiyun.engine.events.EventDispatcher ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/events/EventDispatcher;->nativeInit()V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.events.EventDispatcher getInstance ( ) {
		 /* .locals 3 */
		 /* const-class v1, Lcom/wiyun/engine/events/EventDispatcher; */
		 /* monitor-enter v1 */
		 try { // :try_start_0
			 v0 = com.wiyun.engine.events.EventDispatcher.sInstance;
			 /* if-nez v0, :cond_0 */
			 /* new-instance v0, Lcom/wiyun/engine/events/EventDispatcher; */
			 /* invoke-direct {v0}, Lcom/wiyun/engine/events/EventDispatcher;-><init>()V */
		 } // :goto_0
		 v0 = com.wiyun.engine.events.EventDispatcher.sInstance;
		 /* monitor-exit v1 */
	 } // :cond_0
	 v0 = com.wiyun.engine.events.EventDispatcher.sInstance;
	 v2 = 	 com.wiyun.engine.events.EventDispatcher .nativeGetInstance ( );
	 (( com.wiyun.engine.events.EventDispatcher ) v0 ).setPointer ( v2 ); // invoke-virtual {v0, v2}, Lcom/wiyun/engine/events/EventDispatcher;->setPointer(I)V
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit v1 */
	 /* throw v0 */
} // .end method
private static native Integer nativeGetInstance ( ) {
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
public void addAccelHandler ( com.wiyun.engine.events.IAccelerometerHandler p0 ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 (( com.wiyun.engine.events.EventDispatcher ) p0 ).addAccelHandler ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/wiyun/engine/events/EventDispatcher;->addAccelHandler(Lcom/wiyun/engine/events/IAccelerometerHandler;I)V
	 return;
} // .end method
public native void addAccelHandler ( com.wiyun.engine.events.IAccelerometerHandler p0, Integer p1 ) {
} // .end method
public void addDoubleTapHandler ( android.view.GestureDetector$OnDoubleTapListener p0 ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 (( com.wiyun.engine.events.EventDispatcher ) p0 ).addDoubleTapHandler ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/wiyun/engine/events/EventDispatcher;->addDoubleTapHandler(Landroid/view/GestureDetector$OnDoubleTapListener;I)V
	 return;
} // .end method
public native void addDoubleTapHandler ( android.view.GestureDetector$OnDoubleTapListener p0, Integer p1 ) {
} // .end method
public void addGestureHandler ( android.view.GestureDetector$OnGestureListener p0 ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 (( com.wiyun.engine.events.EventDispatcher ) p0 ).addGestureHandler ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/wiyun/engine/events/EventDispatcher;->addGestureHandler(Landroid/view/GestureDetector$OnGestureListener;I)V
	 return;
} // .end method
public native void addGestureHandler ( android.view.GestureDetector$OnGestureListener p0, Integer p1 ) {
} // .end method
public void addKeyHandler ( com.wiyun.engine.events.IKeyHandler p0 ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 (( com.wiyun.engine.events.EventDispatcher ) p0 ).addKeyHandler ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/wiyun/engine/events/EventDispatcher;->addKeyHandler(Lcom/wiyun/engine/events/IKeyHandler;I)V
	 return;
} // .end method
public native void addKeyHandler ( com.wiyun.engine.events.IKeyHandler p0, Integer p1 ) {
} // .end method
public void addTouchHandler ( com.wiyun.engine.events.ITouchHandler p0 ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 (( com.wiyun.engine.events.EventDispatcher ) p0 ).addTouchHandler ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/wiyun/engine/events/EventDispatcher;->addTouchHandler(Lcom/wiyun/engine/events/ITouchHandler;I)V
	 return;
} // .end method
public native void addTouchHandler ( com.wiyun.engine.events.ITouchHandler p0, Integer p1 ) {
} // .end method
public native Boolean getDispatchEvents ( ) {
} // .end method
public native Boolean keyDown ( android.view.KeyEvent p0 ) {
} // .end method
public native Boolean keyMultiple ( android.view.KeyEvent p0 ) {
} // .end method
public native Boolean keyUp ( android.view.KeyEvent p0 ) {
} // .end method
public native Boolean onDoubleTap ( android.view.MotionEvent p0 ) {
} // .end method
public native Boolean onDoubleTapEvent ( android.view.MotionEvent p0 ) {
} // .end method
public native Boolean onDown ( android.view.MotionEvent p0 ) {
} // .end method
public native Boolean onFling ( android.view.MotionEvent p0, android.view.MotionEvent p1, Float p2, Float p3 ) {
} // .end method
public native void onLongPress ( android.view.MotionEvent p0 ) {
} // .end method
public native Boolean onScroll ( android.view.MotionEvent p0, android.view.MotionEvent p1, Float p2, Float p3 ) {
} // .end method
public native void onShowPress ( android.view.MotionEvent p0 ) {
} // .end method
public native Boolean onSingleTapConfirmed ( android.view.MotionEvent p0 ) {
} // .end method
public native Boolean onSingleTapUp ( android.view.MotionEvent p0 ) {
} // .end method
public native void removeAccelHandler ( com.wiyun.engine.events.IAccelerometerHandler p0 ) {
} // .end method
public native void removeAllHandlers ( ) {
} // .end method
public native void removeDoubleTapHandler ( android.view.GestureDetector$OnDoubleTapListener p0 ) {
} // .end method
public native void removeGestureHandler ( android.view.GestureDetector$OnGestureListener p0 ) {
} // .end method
public native void removeKeyHandler ( com.wiyun.engine.events.IKeyHandler p0 ) {
} // .end method
public native void removeTouchHandler ( com.wiyun.engine.events.ITouchHandler p0 ) {
} // .end method
public native void setAccelerometerPriority ( com.wiyun.engine.events.IAccelerometerHandler p0, Integer p1 ) {
} // .end method
public native void setDispatchEvents ( Boolean p0 ) {
} // .end method
public native void setDoubleTapPriority ( android.view.GestureDetector$OnDoubleTapListener p0, Integer p1 ) {
} // .end method
public native void setGesturePriority ( android.view.GestureDetector$OnGestureListener p0, Integer p1 ) {
} // .end method
public native void setKeyPriority ( com.wiyun.engine.events.IKeyHandler p0, Integer p1 ) {
} // .end method
public native void setTouchPriority ( com.wiyun.engine.events.ITouchHandler p0, Integer p1 ) {
} // .end method
public native Boolean touchesBegan ( android.view.MotionEvent p0 ) {
} // .end method
public native Boolean touchesCancelled ( android.view.MotionEvent p0 ) {
} // .end method
public native Boolean touchesEnded ( android.view.MotionEvent p0 ) {
} // .end method
public native Boolean touchesMoved ( android.view.MotionEvent p0 ) {
} // .end method
public native Boolean touchesPointerBegan ( android.view.MotionEvent p0 ) {
} // .end method
public native Boolean touchesPointerEnded ( android.view.MotionEvent p0 ) {
} // .end method
