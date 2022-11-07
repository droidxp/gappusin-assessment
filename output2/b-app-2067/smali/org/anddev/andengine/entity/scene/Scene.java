public class org.anddev.andengine.entity.scene.Scene extends org.anddev.andengine.entity.Entity {
	 /* # static fields */
	 private static final Integer TOUCHAREAS_CAPACITY_DEFAULT;
	 /* # instance fields */
	 private org.anddev.andengine.entity.scene.background.IBackground mBackground;
	 private Boolean mBackgroundEnabled;
	 protected org.anddev.andengine.entity.scene.Scene mChildScene;
	 private Boolean mChildSceneModalDraw;
	 private Boolean mChildSceneModalTouch;
	 private Boolean mChildSceneModalUpdate;
	 private org.anddev.andengine.entity.scene.Scene$IOnAreaTouchListener mOnAreaTouchListener;
	 private Boolean mOnAreaTouchTraversalBackToFront;
	 private org.anddev.andengine.entity.scene.Scene$IOnSceneTouchListener mOnSceneTouchListener;
	 private Boolean mOnSceneTouchListenerBindingEnabled;
	 private final android.util.SparseArray mOnSceneTouchListenerBindings;
	 protected org.anddev.andengine.entity.scene.Scene mParentScene;
	 private final org.anddev.andengine.engine.handler.runnable.RunnableHandler mRunnableHandler;
	 private Float mSecondsElapsedTotal;
	 private Boolean mTouchAreaBindingEnabled;
	 private final android.util.SparseArray mTouchAreaBindings;
	 protected org.anddev.andengine.util.SmartList mTouchAreas;
	 /* # direct methods */
	 public org.anddev.andengine.entity.scene.Scene ( ) {
		 /* .locals 5 */
		 int v4 = 1; // const/4 v4, 0x1
		 int v3 = 0; // const/4 v3, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {p0}, Lorg/anddev/andengine/entity/Entity;-><init>()V */
		 /* new-instance v0, Lorg/anddev/andengine/util/SmartList; */
		 int v1 = 4; // const/4 v1, 0x4
		 /* invoke-direct {v0, v1}, Lorg/anddev/andengine/util/SmartList;-><init>(I)V */
		 this.mTouchAreas = v0;
		 /* new-instance v0, Lorg/anddev/andengine/engine/handler/runnable/RunnableHandler; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/engine/handler/runnable/RunnableHandler;-><init>()V */
		 this.mRunnableHandler = v0;
		 /* new-instance v0, Lorg/anddev/andengine/entity/scene/background/ColorBackground; */
		 /* invoke-direct {v0, v2, v2, v2}, Lorg/anddev/andengine/entity/scene/background/ColorBackground;-><init>(FFF)V */
		 this.mBackground = v0;
		 /* iput-boolean v4, p0, Lorg/anddev/andengine/entity/scene/Scene;->mBackgroundEnabled:Z */
		 /* iput-boolean v4, p0, Lorg/anddev/andengine/entity/scene/Scene;->mOnAreaTouchTraversalBackToFront:Z */
		 /* iput-boolean v3, p0, Lorg/anddev/andengine/entity/scene/Scene;->mTouchAreaBindingEnabled:Z */
		 /* new-instance v0, Landroid/util/SparseArray; */
		 /* invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V */
		 this.mTouchAreaBindings = v0;
		 /* iput-boolean v3, p0, Lorg/anddev/andengine/entity/scene/Scene;->mOnSceneTouchListenerBindingEnabled:Z */
		 /* new-instance v0, Landroid/util/SparseArray; */
		 /* invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V */
		 this.mOnSceneTouchListenerBindings = v0;
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.Scene ( ) {
		 /* .locals 5 */
		 int v4 = 1; // const/4 v4, 0x1
		 int v3 = 0; // const/4 v3, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {p0}, Lorg/anddev/andengine/entity/Entity;-><init>()V */
		 /* new-instance v0, Lorg/anddev/andengine/util/SmartList; */
		 int v1 = 4; // const/4 v1, 0x4
		 /* invoke-direct {v0, v1}, Lorg/anddev/andengine/util/SmartList;-><init>(I)V */
		 this.mTouchAreas = v0;
		 /* new-instance v0, Lorg/anddev/andengine/engine/handler/runnable/RunnableHandler; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/engine/handler/runnable/RunnableHandler;-><init>()V */
		 this.mRunnableHandler = v0;
		 /* new-instance v0, Lorg/anddev/andengine/entity/scene/background/ColorBackground; */
		 /* invoke-direct {v0, v2, v2, v2}, Lorg/anddev/andengine/entity/scene/background/ColorBackground;-><init>(FFF)V */
		 this.mBackground = v0;
		 /* iput-boolean v4, p0, Lorg/anddev/andengine/entity/scene/Scene;->mBackgroundEnabled:Z */
		 /* iput-boolean v4, p0, Lorg/anddev/andengine/entity/scene/Scene;->mOnAreaTouchTraversalBackToFront:Z */
		 /* iput-boolean v3, p0, Lorg/anddev/andengine/entity/scene/Scene;->mTouchAreaBindingEnabled:Z */
		 /* new-instance v0, Landroid/util/SparseArray; */
		 /* invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V */
		 this.mTouchAreaBindings = v0;
		 /* iput-boolean v3, p0, Lorg/anddev/andengine/entity/scene/Scene;->mOnSceneTouchListenerBindingEnabled:Z */
		 /* new-instance v0, Landroid/util/SparseArray; */
		 /* invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V */
		 this.mOnSceneTouchListenerBindings = v0;
		 /* move v0, v3 */
	 } // :goto_0
	 /* if-lt v0, p1, :cond_0 */
	 return;
} // :cond_0
/* new-instance v1, Lorg/anddev/andengine/entity/Entity; */
/* invoke-direct {v1}, Lorg/anddev/andengine/entity/Entity;-><init>()V */
(( org.anddev.andengine.entity.scene.Scene ) p0 ).attachChild ( v1 ); // invoke-virtual {p0, v1}, Lorg/anddev/andengine/entity/scene/Scene;->attachChild(Lorg/anddev/andengine/entity/IEntity;)V
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
private java.lang.Boolean onAreaTouchEvent ( org.anddev.andengine.input.touch.TouchEvent p0, Float p1, Float p2, org.anddev.andengine.entity.scene.Scene$ITouchArea p3 ) {
/* .locals 3 */
int v1 = 0; // const/4 v1, 0x0
/* aget v1, v0, v1 */
int v2 = 1; // const/4 v2, 0x1
v2 = /* aget v0, v0, v2 */
if ( v2 != null) { // if-eqz v2, :cond_0
	 v0 = java.lang.Boolean.TRUE;
} // :goto_0
} // :cond_0
v2 = this.mOnAreaTouchListener;
if ( v2 != null) { // if-eqz v2, :cond_1
v0 = v2 = this.mOnAreaTouchListener;
java.lang.Boolean .valueOf ( v0 );
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
private void setParentScene ( org.anddev.andengine.entity.scene.Scene p0 ) {
/* .locals 0 */
this.mParentScene = p1;
return;
} // .end method
/* # virtual methods */
public void back ( ) {
/* .locals 1 */
(( org.anddev.andengine.entity.scene.Scene ) p0 ).clearChildScene ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/scene/Scene;->clearChildScene()V
v0 = this.mParentScene;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mParentScene;
(( org.anddev.andengine.entity.scene.Scene ) v0 ).clearChildScene ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/scene/Scene;->clearChildScene()V
int v0 = 0; // const/4 v0, 0x0
this.mParentScene = v0;
} // :cond_0
return;
} // .end method
public void clearChildScene ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
this.mChildScene = v0;
return;
} // .end method
public void clearTouchAreas ( ) {
/* .locals 1 */
v0 = this.mTouchAreas;
(( org.anddev.andengine.util.SmartList ) v0 ).clear ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/util/SmartList;->clear()V
return;
} // .end method
public org.anddev.andengine.entity.scene.background.IBackground getBackground ( ) {
/* .locals 1 */
v0 = this.mBackground;
} // .end method
public org.anddev.andengine.entity.scene.Scene getChildScene ( ) {
/* .locals 1 */
v0 = this.mChildScene;
} // .end method
public org.anddev.andengine.entity.scene.Scene$IOnAreaTouchListener getOnAreaTouchListener ( ) {
/* .locals 1 */
v0 = this.mOnAreaTouchListener;
} // .end method
public org.anddev.andengine.entity.scene.Scene$IOnSceneTouchListener getOnSceneTouchListener ( ) {
/* .locals 1 */
v0 = this.mOnSceneTouchListener;
} // .end method
public Float getSecondsElapsedTotal ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/scene/Scene;->mSecondsElapsedTotal:F */
} // .end method
public java.util.ArrayList getTouchAreas ( ) {
/* .locals 1 */
v0 = this.mTouchAreas;
} // .end method
public Boolean hasChildScene ( ) {
/* .locals 1 */
v0 = this.mChildScene;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean hasOnAreaTouchListener ( ) {
/* .locals 1 */
v0 = this.mOnAreaTouchListener;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean hasOnSceneTouchListener ( ) {
/* .locals 1 */
v0 = this.mOnSceneTouchListener;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isBackgroundEnabled ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/scene/Scene;->mBackgroundEnabled:Z */
} // .end method
public Boolean isOnSceneTouchListenerBindingEnabled ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/scene/Scene;->mOnSceneTouchListenerBindingEnabled:Z */
} // .end method
public Boolean isTouchAreaBindingEnabled ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/scene/Scene;->mTouchAreaBindingEnabled:Z */
} // .end method
protected Boolean onChildSceneTouchEvent ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
/* .locals 1 */
v0 = this.mChildScene;
v0 = (( org.anddev.andengine.entity.scene.Scene ) v0 ).onSceneTouchEvent ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/entity/scene/Scene;->onSceneTouchEvent(Lorg/anddev/andengine/input/touch/TouchEvent;)Z
} // .end method
protected void onManagedDraw ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
/* .locals 2 */
v0 = this.mChildScene;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v1, p0, Lorg/anddev/andengine/entity/scene/Scene;->mChildSceneModalDraw:Z */
/* if-nez v1, :cond_2 */
} // :cond_0
/* iget-boolean v1, p0, Lorg/anddev/andengine/entity/scene/Scene;->mBackgroundEnabled:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
(( org.anddev.andengine.engine.camera.Camera ) p2 ).onApplySceneBackgroundMatrix ( p1 ); // invoke-virtual {p2, p1}, Lorg/anddev/andengine/engine/camera/Camera;->onApplySceneBackgroundMatrix(Ljavax/microedition/khronos/opengles/GL10;)V
org.anddev.andengine.opengl.util.GLHelper .setModelViewIdentityMatrix ( p1 );
v1 = this.mBackground;
} // :cond_1
(( org.anddev.andengine.engine.camera.Camera ) p2 ).onApplySceneMatrix ( p1 ); // invoke-virtual {p2, p1}, Lorg/anddev/andengine/engine/camera/Camera;->onApplySceneMatrix(Ljavax/microedition/khronos/opengles/GL10;)V
org.anddev.andengine.opengl.util.GLHelper .setModelViewIdentityMatrix ( p1 );
/* invoke-super {p0, p1, p2}, Lorg/anddev/andengine/entity/Entity;->onManagedDraw(Ljavax/microedition/khronos/opengles/GL10;Lorg/anddev/andengine/engine/camera/Camera;)V */
} // :cond_2
if ( v0 != null) { // if-eqz v0, :cond_3
(( org.anddev.andengine.entity.scene.Scene ) v0 ).onDraw ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lorg/anddev/andengine/entity/scene/Scene;->onDraw(Ljavax/microedition/khronos/opengles/GL10;Lorg/anddev/andengine/engine/camera/Camera;)V
} // :cond_3
return;
} // .end method
protected void onManagedUpdate ( Float p0 ) {
/* .locals 2 */
/* iget v0, p0, Lorg/anddev/andengine/entity/scene/Scene;->mSecondsElapsedTotal:F */
/* add-float/2addr v0, p1 */
/* iput v0, p0, Lorg/anddev/andengine/entity/scene/Scene;->mSecondsElapsedTotal:F */
v0 = this.mRunnableHandler;
(( org.anddev.andengine.engine.handler.runnable.RunnableHandler ) v0 ).onUpdate ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/handler/runnable/RunnableHandler;->onUpdate(F)V
v0 = this.mChildScene;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v1, p0, Lorg/anddev/andengine/entity/scene/Scene;->mChildSceneModalUpdate:Z */
/* if-nez v1, :cond_1 */
} // :cond_0
v1 = this.mBackground;
/* invoke-super {p0, p1}, Lorg/anddev/andengine/entity/Entity;->onManagedUpdate(F)V */
} // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_2
(( org.anddev.andengine.entity.scene.Scene ) v0 ).onUpdate ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/entity/scene/Scene;->onUpdate(F)V
} // :cond_2
return;
} // .end method
public Boolean onSceneTouchEvent ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
/* .locals 10 */
int v9 = 0; // const/4 v9, 0x0
int v8 = 1; // const/4 v8, 0x1
v1 = (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getAction()I
v2 = (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).isActionDown ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->isActionDown()Z
/* if-nez v2, :cond_1 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/scene/Scene;->mOnSceneTouchListenerBindingEnabled:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mOnSceneTouchListenerBindings;
v3 = (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getPointerID ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getPointerID()I
(( android.util.SparseArray ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/entity/scene/Scene$IOnSceneTouchListener; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* packed-switch v1, :pswitch_data_0 */
} // :goto_0
/* :pswitch_0 */
v0 = v0 = this.mOnSceneTouchListener;
java.lang.Boolean .valueOf ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* move v0, v8 */
} // :goto_1
/* :pswitch_1 */
v0 = this.mOnSceneTouchListenerBindings;
v3 = (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getPointerID ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getPointerID()I
(( android.util.SparseArray ) v0 ).remove ( v3 ); // invoke-virtual {v0, v3}, Landroid/util/SparseArray;->remove(I)V
} // :cond_0
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/scene/Scene;->mTouchAreaBindingEnabled:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v3 = this.mTouchAreaBindings;
v0 = (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getPointerID ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getPointerID()I
(( android.util.SparseArray ) v3 ).get ( v0 ); // invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/entity/scene/Scene$ITouchArea; */
if ( v0 != null) { // if-eqz v0, :cond_1
v4 = (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getX()F
v5 = (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getY()F
/* packed-switch v1, :pswitch_data_1 */
} // :goto_2
/* :pswitch_2 */
/* invoke-direct {p0, p1, v4, v5, v0}, Lorg/anddev/andengine/entity/scene/Scene;->onAreaTouchEvent(Lorg/anddev/andengine/input/touch/TouchEvent;FFLorg/anddev/andengine/entity/scene/Scene$ITouchArea;)Ljava/lang/Boolean; */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* move v0, v8 */
/* :pswitch_3 */
v1 = (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getPointerID ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getPointerID()I
(( android.util.SparseArray ) v3 ).remove ( v1 ); // invoke-virtual {v3, v1}, Landroid/util/SparseArray;->remove(I)V
} // :cond_1
v0 = this.mChildScene;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = (( org.anddev.andengine.entity.scene.Scene ) p0 ).onChildSceneTouchEvent ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/scene/Scene;->onChildSceneTouchEvent(Lorg/anddev/andengine/input/touch/TouchEvent;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* move v0, v8 */
} // :cond_2
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/scene/Scene;->mChildSceneModalTouch:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* move v0, v9 */
} // :cond_3
v1 = (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getX()F
v3 = (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getY()F
v4 = this.mTouchAreas;
if ( v4 != null) { // if-eqz v4, :cond_4
v5 = (( java.util.ArrayList ) v4 ).size ( ); // invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
/* if-lez v5, :cond_4 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/scene/Scene;->mOnAreaTouchTraversalBackToFront:Z */
if ( v0 != null) { // if-eqz v0, :cond_9
/* move v6, v9 */
} // :goto_3
/* if-lt v6, v5, :cond_6 */
} // :cond_4
v0 = this.mOnSceneTouchListener;
if ( v0 != null) { // if-eqz v0, :cond_d
v0 = v0 = this.mOnSceneTouchListener;
java.lang.Boolean .valueOf ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_c
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
if ( v0 != null) { // if-eqz v0, :cond_c
	 /* iget-boolean v0, p0, Lorg/anddev/andengine/entity/scene/Scene;->mOnSceneTouchListenerBindingEnabled:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_5
		 if ( v2 != null) { // if-eqz v2, :cond_5
			 v0 = this.mOnSceneTouchListenerBindings;
			 v1 = 			 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getPointerID ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getPointerID()I
			 v2 = this.mOnSceneTouchListener;
			 (( android.util.SparseArray ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
		 } // :cond_5
		 /* move v0, v8 */
		 /* goto/16 :goto_1 */
	 } // :cond_6
	 (( java.util.ArrayList ) v4 ).get ( v6 ); // invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 v7 = 	 /* check-cast v0, Lorg/anddev/andengine/entity/scene/Scene$ITouchArea; */
	 if ( v7 != null) { // if-eqz v7, :cond_8
		 /* invoke-direct {p0, p1, v1, v3, v0}, Lorg/anddev/andengine/entity/scene/Scene;->onAreaTouchEvent(Lorg/anddev/andengine/input/touch/TouchEvent;FFLorg/anddev/andengine/entity/scene/Scene$ITouchArea;)Ljava/lang/Boolean; */
		 if ( v7 != null) { // if-eqz v7, :cond_8
			 v7 = 			 (( java.lang.Boolean ) v7 ).booleanValue ( ); // invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z
			 if ( v7 != null) { // if-eqz v7, :cond_8
				 /* iget-boolean v1, p0, Lorg/anddev/andengine/entity/scene/Scene;->mTouchAreaBindingEnabled:Z */
				 if ( v1 != null) { // if-eqz v1, :cond_7
					 if ( v2 != null) { // if-eqz v2, :cond_7
						 v1 = this.mTouchAreaBindings;
						 v2 = 						 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getPointerID ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getPointerID()I
						 (( android.util.SparseArray ) v1 ).put ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
					 } // :cond_7
					 /* move v0, v8 */
					 /* goto/16 :goto_1 */
				 } // :cond_8
				 /* add-int/lit8 v0, v6, 0x1 */
				 /* move v6, v0 */
			 } // :cond_9
			 /* sub-int v0, v5, v8 */
			 /* move v5, v0 */
		 } // :goto_4
		 /* if-ltz v5, :cond_4 */
		 (( java.util.ArrayList ) v4 ).get ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 v6 = 		 /* check-cast v0, Lorg/anddev/andengine/entity/scene/Scene$ITouchArea; */
		 if ( v6 != null) { // if-eqz v6, :cond_b
			 /* invoke-direct {p0, p1, v1, v3, v0}, Lorg/anddev/andengine/entity/scene/Scene;->onAreaTouchEvent(Lorg/anddev/andengine/input/touch/TouchEvent;FFLorg/anddev/andengine/entity/scene/Scene$ITouchArea;)Ljava/lang/Boolean; */
			 if ( v6 != null) { // if-eqz v6, :cond_b
				 v6 = 				 (( java.lang.Boolean ) v6 ).booleanValue ( ); // invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z
				 if ( v6 != null) { // if-eqz v6, :cond_b
					 /* iget-boolean v1, p0, Lorg/anddev/andengine/entity/scene/Scene;->mTouchAreaBindingEnabled:Z */
					 if ( v1 != null) { // if-eqz v1, :cond_a
						 if ( v2 != null) { // if-eqz v2, :cond_a
							 v1 = this.mTouchAreaBindings;
							 v2 = 							 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getPointerID ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getPointerID()I
							 (( android.util.SparseArray ) v1 ).put ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
						 } // :cond_a
						 /* move v0, v8 */
						 /* goto/16 :goto_1 */
					 } // :cond_b
					 /* add-int/lit8 v0, v5, -0x1 */
					 /* move v5, v0 */
				 } // :cond_c
				 /* move v0, v9 */
				 /* goto/16 :goto_1 */
			 } // :cond_d
			 /* move v0, v9 */
			 /* goto/16 :goto_1 */
			 /* :pswitch_data_0 */
			 /* .packed-switch 0x1 */
			 /* :pswitch_1 */
			 /* :pswitch_0 */
			 /* :pswitch_1 */
		 } // .end packed-switch
		 /* :pswitch_data_1 */
		 /* .packed-switch 0x1 */
		 /* :pswitch_3 */
		 /* :pswitch_2 */
		 /* :pswitch_3 */
	 } // .end packed-switch
} // .end method
public void postRunnable ( java.lang.Runnable p0 ) {
	 /* .locals 1 */
	 v0 = this.mRunnableHandler;
	 (( org.anddev.andengine.engine.handler.runnable.RunnableHandler ) v0 ).postRunnable ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/handler/runnable/RunnableHandler;->postRunnable(Ljava/lang/Runnable;)V
	 return;
} // .end method
public void registerTouchArea ( org.anddev.andengine.entity.scene.Scene$ITouchArea p0 ) {
	 /* .locals 1 */
	 v0 = this.mTouchAreas;
	 (( org.anddev.andengine.util.SmartList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/util/SmartList;->add(Ljava/lang/Object;)Z
	 return;
} // .end method
public void reset ( ) {
	 /* .locals 0 */
	 /* invoke-super {p0}, Lorg/anddev/andengine/entity/Entity;->reset()V */
	 (( org.anddev.andengine.entity.scene.Scene ) p0 ).clearChildScene ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/scene/Scene;->clearChildScene()V
	 return;
} // .end method
public void setBackground ( org.anddev.andengine.entity.scene.background.IBackground p0 ) {
	 /* .locals 0 */
	 this.mBackground = p1;
	 return;
} // .end method
public void setBackgroundEnabled ( Boolean p0 ) {
	 /* .locals 0 */
	 /* iput-boolean p1, p0, Lorg/anddev/andengine/entity/scene/Scene;->mBackgroundEnabled:Z */
	 return;
} // .end method
public void setChildScene ( org.anddev.andengine.entity.scene.Scene p0 ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 (( org.anddev.andengine.entity.scene.Scene ) p0 ).setChildScene ( p1, v0, v0, v0 ); // invoke-virtual {p0, p1, v0, v0, v0}, Lorg/anddev/andengine/entity/scene/Scene;->setChildScene(Lorg/anddev/andengine/entity/scene/Scene;ZZZ)V
	 return;
} // .end method
public void setChildScene ( org.anddev.andengine.entity.scene.Scene p0, Boolean p1, Boolean p2, Boolean p3 ) {
	 /* .locals 0 */
	 this.mParentScene = p0;
	 this.mChildScene = p1;
	 /* iput-boolean p2, p0, Lorg/anddev/andengine/entity/scene/Scene;->mChildSceneModalDraw:Z */
	 /* iput-boolean p3, p0, Lorg/anddev/andengine/entity/scene/Scene;->mChildSceneModalUpdate:Z */
	 /* iput-boolean p4, p0, Lorg/anddev/andengine/entity/scene/Scene;->mChildSceneModalTouch:Z */
	 return;
} // .end method
public void setChildSceneModal ( org.anddev.andengine.entity.scene.Scene p0 ) {
	 /* .locals 1 */
	 int v0 = 1; // const/4 v0, 0x1
	 (( org.anddev.andengine.entity.scene.Scene ) p0 ).setChildScene ( p1, v0, v0, v0 ); // invoke-virtual {p0, p1, v0, v0, v0}, Lorg/anddev/andengine/entity/scene/Scene;->setChildScene(Lorg/anddev/andengine/entity/scene/Scene;ZZZ)V
	 return;
} // .end method
public void setOnAreaTouchListener ( org.anddev.andengine.entity.scene.Scene$IOnAreaTouchListener p0 ) {
	 /* .locals 0 */
	 this.mOnAreaTouchListener = p1;
	 return;
} // .end method
public void setOnAreaTouchTraversalBackToFront ( ) {
	 /* .locals 1 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput-boolean v0, p0, Lorg/anddev/andengine/entity/scene/Scene;->mOnAreaTouchTraversalBackToFront:Z */
	 return;
} // .end method
public void setOnAreaTouchTraversalFrontToBack ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput-boolean v0, p0, Lorg/anddev/andengine/entity/scene/Scene;->mOnAreaTouchTraversalBackToFront:Z */
	 return;
} // .end method
public void setOnSceneTouchListener ( org.anddev.andengine.entity.scene.Scene$IOnSceneTouchListener p0 ) {
	 /* .locals 0 */
	 this.mOnSceneTouchListener = p1;
	 return;
} // .end method
public void setOnSceneTouchListenerBindingEnabled ( Boolean p0 ) {
	 /* .locals 1 */
	 /* iget-boolean v0, p0, Lorg/anddev/andengine/entity/scene/Scene;->mOnSceneTouchListenerBindingEnabled:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* if-nez p1, :cond_0 */
		 v0 = this.mOnSceneTouchListenerBindings;
		 (( android.util.SparseArray ) v0 ).clear ( ); // invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V
	 } // :cond_0
	 /* iput-boolean p1, p0, Lorg/anddev/andengine/entity/scene/Scene;->mOnSceneTouchListenerBindingEnabled:Z */
	 return;
} // .end method
public void setParent ( org.anddev.andengine.entity.IEntity p0 ) {
	 /* .locals 0 */
	 return;
} // .end method
public void setTouchAreaBindingEnabled ( Boolean p0 ) {
	 /* .locals 1 */
	 /* iget-boolean v0, p0, Lorg/anddev/andengine/entity/scene/Scene;->mTouchAreaBindingEnabled:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* if-nez p1, :cond_0 */
		 v0 = this.mTouchAreaBindings;
		 (( android.util.SparseArray ) v0 ).clear ( ); // invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V
	 } // :cond_0
	 /* iput-boolean p1, p0, Lorg/anddev/andengine/entity/scene/Scene;->mTouchAreaBindingEnabled:Z */
	 return;
} // .end method
public Boolean unregisterTouchArea ( org.anddev.andengine.entity.scene.Scene$ITouchArea p0 ) {
	 /* .locals 1 */
	 v0 = this.mTouchAreas;
	 v0 = 	 (( org.anddev.andengine.util.SmartList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/util/SmartList;->remove(Ljava/lang/Object;)Z
} // .end method
public Boolean unregisterTouchAreas ( org.anddev.andengine.entity.scene.Scene$ITouchArea$ITouchAreaMatcher p0 ) {
	 /* .locals 1 */
	 v0 = this.mTouchAreas;
	 v0 = 	 (( org.anddev.andengine.util.SmartList ) v0 ).removeAll ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/util/SmartList;->removeAll(Lorg/anddev/andengine/util/IMatcher;)Z
} // .end method
