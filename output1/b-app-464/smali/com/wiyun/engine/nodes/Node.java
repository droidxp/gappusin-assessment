public class com.wiyun.engine.nodes.Node extends com.wiyun.engine.BaseWYObject implements android.view.GestureDetector$OnDoubleTapListener implements android.view.GestureDetector$OnGestureListener implements com.wiyun.engine.events.IAccelerometerHandler implements com.wiyun.engine.events.IKeyHandler implements com.wiyun.engine.events.IMultiTouchHandler {
	 /* # interfaces */
	 /* # instance fields */
	 private Boolean mBackKeyTracking;
	 /* # direct methods */
	 public com.wiyun.engine.nodes.Node ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 (( com.wiyun.engine.nodes.Node ) p0 ).doNativeInit ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/nodes/Node;->doNativeInit()V
		 return;
	 } // .end method
	 public com.wiyun.engine.nodes.Node ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Node from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/Node; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
} // .end method
private native void nativeAutoRelease ( Boolean p0 ) {
} // .end method
private native void nativeConvertToNodeSpace ( Float p0, Float p1, com.wiyun.engine.types.WYPoint p2 ) {
} // .end method
private native void nativeConvertToNodeSpaceAR ( Float p0, Float p1, com.wiyun.engine.types.WYPoint p2 ) {
} // .end method
private native void nativeConvertToWorldSpace ( Float p0, Float p1, com.wiyun.engine.types.WYPoint p2 ) {
} // .end method
private native void nativeConvertToWorldSpaceAR ( Float p0, Float p1, com.wiyun.engine.types.WYPoint p2 ) {
} // .end method
private native void nativeGetAbsolutePosition ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetAcceleration ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetBoundingBox ( com.wiyun.engine.types.WYRect p0 ) {
} // .end method
private native void nativeGetBoundingBoxRelativeToParent ( com.wiyun.engine.types.WYRect p0 ) {
} // .end method
private native void nativeGetBoundingBoxRelativeToWorld ( com.wiyun.engine.types.WYRect p0 ) {
} // .end method
private native Integer nativeGetCamera ( ) {
} // .end method
private native void nativeGetChildren ( Integer[] p0 ) {
} // .end method
private native void nativeGetClipRect ( com.wiyun.engine.types.WYRect p0 ) {
} // .end method
private native Integer nativeGetFirstChild ( ) {
} // .end method
private native Integer nativeGetGrid ( ) {
} // .end method
private native Integer nativeGetParent ( ) {
} // .end method
private native void nativeGetVelocity ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
public void addChild ( com.wiyun.engine.nodes.Node p0 ) {
/* .locals 2 */
v0 = (( com.wiyun.engine.nodes.Node ) p1 ).getZOrder ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/nodes/Node;->getZOrder()I
v1 = (( com.wiyun.engine.nodes.Node ) p1 ).getTag ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/nodes/Node;->getTag()I
(( com.wiyun.engine.nodes.Node ) p0 ).addChild ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lcom/wiyun/engine/nodes/Node;->addChild(Lcom/wiyun/engine/nodes/Node;II)V
return;
} // .end method
public void addChild ( com.wiyun.engine.nodes.Node p0, Integer p1 ) {
/* .locals 1 */
v0 = (( com.wiyun.engine.nodes.Node ) p1 ).getTag ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/nodes/Node;->getTag()I
(( com.wiyun.engine.nodes.Node ) p0 ).addChild ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lcom/wiyun/engine/nodes/Node;->addChild(Lcom/wiyun/engine/nodes/Node;II)V
return;
} // .end method
public native void addChild ( com.wiyun.engine.nodes.Node p0, Integer p1, Integer p2 ) {
} // .end method
public com.wiyun.engine.nodes.Node autoRelease ( Boolean p0 ) {
/* .locals 0 */
/* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;->nativeAutoRelease(Z)V */
} // .end method
public native void bringToBack ( com.wiyun.engine.nodes.Node p0 ) {
} // .end method
public native void bringToFront ( com.wiyun.engine.nodes.Node p0 ) {
} // .end method
public native void cleanup ( ) {
} // .end method
public native void clearClipRect ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint convertToNodeSpace ( Float p0, Float p1 ) {
/* .locals 1 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* invoke-direct {p0, p1, p2, v0}, Lcom/wiyun/engine/nodes/Node;->nativeConvertToNodeSpace(FFLcom/wiyun/engine/types/WYPoint;)V */
} // .end method
public com.wiyun.engine.types.WYPoint convertToNodeSpaceAR ( Float p0, Float p1 ) {
/* .locals 1 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* invoke-direct {p0, p1, p2, v0}, Lcom/wiyun/engine/nodes/Node;->nativeConvertToNodeSpaceAR(FFLcom/wiyun/engine/types/WYPoint;)V */
} // .end method
public com.wiyun.engine.types.WYPoint convertToWorldSpace ( Float p0, Float p1 ) {
/* .locals 1 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* invoke-direct {p0, p1, p2, v0}, Lcom/wiyun/engine/nodes/Node;->nativeConvertToWorldSpace(FFLcom/wiyun/engine/types/WYPoint;)V */
} // .end method
public com.wiyun.engine.types.WYPoint convertToWorldSpaceAR ( Float p0, Float p1 ) {
/* .locals 1 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* invoke-direct {p0, p1, p2, v0}, Lcom/wiyun/engine/nodes/Node;->nativeConvertToWorldSpaceAR(FFLcom/wiyun/engine/types/WYPoint;)V */
} // .end method
public com.wiyun.engine.types.WYPoint convertTouchToNodeSpace ( android.view.MotionEvent p0 ) {
/* .locals 4 */
com.wiyun.engine.types.WYPoint .makeZero ( );
com.wiyun.engine.nodes.Director .getInstance ( );
v2 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
v3 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
(( com.wiyun.engine.nodes.Director ) v1 ).convertToGL ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/wiyun/engine/nodes/Director;->convertToGL(FF)Lcom/wiyun/engine/types/WYPoint;
/* iget v2, v1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, v1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* invoke-direct {p0, v2, v1, v0}, Lcom/wiyun/engine/nodes/Node;->nativeConvertToNodeSpace(FFLcom/wiyun/engine/types/WYPoint;)V */
} // .end method
public com.wiyun.engine.types.WYPoint convertTouchToNodeSpaceAR ( android.view.MotionEvent p0 ) {
/* .locals 4 */
com.wiyun.engine.types.WYPoint .makeZero ( );
com.wiyun.engine.nodes.Director .getInstance ( );
v2 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
v3 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
(( com.wiyun.engine.nodes.Director ) v1 ).convertToGL ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/wiyun/engine/nodes/Director;->convertToGL(FF)Lcom/wiyun/engine/types/WYPoint;
/* iget v2, v1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, v1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* invoke-direct {p0, v2, v1, v0}, Lcom/wiyun/engine/nodes/Node;->nativeConvertToNodeSpaceAR(FFLcom/wiyun/engine/types/WYPoint;)V */
} // .end method
protected void doNativeInit ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;->nativeInit()V */
return;
} // .end method
public native final void draw ( ) {
} // .end method
public native void enlargeNode ( Float p0, Float p1, Float p2, Float p3 ) {
} // .end method
public com.wiyun.engine.types.WYPoint getAbsolutePosition ( ) {
/* .locals 1 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/Node;->nativeGetAbsolutePosition(Lcom/wiyun/engine/types/WYPoint;)V */
} // .end method
public com.wiyun.engine.types.WYPoint getAcceleration ( ) {
/* .locals 1 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/Node;->nativeGetAcceleration(Lcom/wiyun/engine/types/WYPoint;)V */
} // .end method
public native Float getAccelerationX ( ) {
} // .end method
public native Float getAccelerationY ( ) {
} // .end method
public native Integer getAccelerometerPriority ( ) {
} // .end method
public native Integer getActionPointer ( Integer p0 ) {
} // .end method
public native Float getAnchorPointX ( ) {
} // .end method
public native Float getAnchorPointY ( ) {
} // .end method
public native Float getAnchorX ( ) {
} // .end method
public native Float getAnchorY ( ) {
} // .end method
public com.wiyun.engine.types.WYRect getBoundingBox ( ) {
/* .locals 1 */
com.wiyun.engine.types.WYRect .makeZero ( );
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/Node;->nativeGetBoundingBox(Lcom/wiyun/engine/types/WYRect;)V */
} // .end method
public com.wiyun.engine.types.WYRect getBoundingBoxRelativeToParent ( ) {
/* .locals 1 */
com.wiyun.engine.types.WYRect .makeZero ( );
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/Node;->nativeGetBoundingBoxRelativeToParent(Lcom/wiyun/engine/types/WYRect;)V */
} // .end method
public com.wiyun.engine.types.WYRect getBoundingBoxRelativeToWorld ( ) {
/* .locals 1 */
com.wiyun.engine.types.WYRect .makeZero ( );
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/Node;->nativeGetBoundingBoxRelativeToWorld(Lcom/wiyun/engine/types/WYRect;)V */
} // .end method
public com.wiyun.engine.opengl.Camera getCamera ( ) {
/* .locals 1 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;->nativeGetCamera()I */
com.wiyun.engine.opengl.Camera .from ( v0 );
} // .end method
public com.wiyun.engine.nodes.Node getChild ( Integer p0 ) {
/* .locals 1 */
v0 = (( com.wiyun.engine.nodes.Node ) p0 ).getChildPointer ( p1 ); // invoke-virtual {p0, p1}, Lcom/wiyun/engine/nodes/Node;->getChildPointer(I)I
com.wiyun.engine.nodes.Node .from ( v0 );
} // .end method
public native Integer getChildCount ( ) {
} // .end method
public native Integer getChildPointer ( Integer p0 ) {
} // .end method
public native Integer getChildPointerAt ( Integer p0 ) {
} // .end method
public java.util.ArrayList getChildren ( ) {
/* .locals 6 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
v0 = (( com.wiyun.engine.nodes.Node ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/nodes/Node;->getChildCount()I
/* new-array v2, v0, [I */
/* invoke-direct {p0, v2}, Lcom/wiyun/engine/nodes/Node;->nativeGetChildren([I)V */
/* array-length v3, v2 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-lt v0, v3, :cond_0 */
} // :cond_0
/* aget v4, v2, v0 */
/* new-instance v5, Lcom/wiyun/engine/nodes/Node; */
/* invoke-direct {v5, v4}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
(( java.util.ArrayList ) v1 ).add ( v5 ); // invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public com.wiyun.engine.nodes.Node getChildren ( Integer p0 ) {
/* .locals 4 */
(( com.wiyun.engine.nodes.Node ) p0 ).getChildrenPointer ( p1 ); // invoke-virtual {p0, p1}, Lcom/wiyun/engine/nodes/Node;->getChildrenPointer(I)[I
/* if-nez v2, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
/* array-length v0, v2 */
/* new-array v1, v0, [Lcom/wiyun/engine/nodes/Node; */
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
/* array-length v3, v2 */
/* if-lt v0, v3, :cond_1 */
/* move-object v0, v1 */
} // :cond_1
/* aget v3, v2, v0 */
com.wiyun.engine.nodes.Node .from ( v3 );
/* aput-object v3, v1, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public native getChildrenPointer ( Integer p0 ) {
} // .end method
public com.wiyun.engine.types.WYRect getClipRect ( ) {
/* .locals 1 */
com.wiyun.engine.types.WYRect .makeZero ( );
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/Node;->nativeGetClipRect(Lcom/wiyun/engine/types/WYRect;)V */
} // .end method
public native Integer getDoubleTapPriority ( ) {
} // .end method
public com.wiyun.engine.nodes.Node getFirstChild ( ) {
/* .locals 2 */
v1 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;->nativeGetFirstChild()I */
/* if-lez v1, :cond_0 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Node; */
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public native Integer getGesturePriority ( ) {
} // .end method
public com.wiyun.engine.grid.BaseGrid getGrid ( ) {
/* .locals 1 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;->nativeGetGrid()I */
com.wiyun.engine.grid.BaseGrid .from ( v0 );
} // .end method
public native Float getHeight ( ) {
} // .end method
public native Integer getKeyPriority ( ) {
} // .end method
public native Float getOriginX ( ) {
} // .end method
public native Float getOriginY ( ) {
} // .end method
public com.wiyun.engine.nodes.Node getParent ( ) {
/* .locals 2 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;->nativeGetParent()I */
/* if-lez v0, :cond_0 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Node; */
v1 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;->nativeGetParent()I */
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public native Float getPositionX ( ) {
} // .end method
public native Float getPositionY ( ) {
} // .end method
public native Float getRotation ( ) {
} // .end method
public Integer getRunningActionCount ( ) {
/* .locals 1 */
com.wiyun.engine.nodes.ActionManager .getInstance ( );
v0 = (( com.wiyun.engine.nodes.ActionManager ) v0 ).getRunningActionCount ( p0 ); // invoke-virtual {v0, p0}, Lcom/wiyun/engine/nodes/ActionManager;->getRunningActionCount(Lcom/wiyun/engine/nodes/Node;)I
} // .end method
public native Float getScale ( ) {
} // .end method
public native Float getScaleX ( ) {
} // .end method
public native Float getScaleY ( ) {
} // .end method
public native Float getSkewX ( ) {
} // .end method
public native Float getSkewY ( ) {
} // .end method
public native Integer getTag ( ) {
} // .end method
public native Integer getTouchPriority ( ) {
} // .end method
public native java.lang.Object getUserData ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getVelocity ( ) {
/* .locals 1 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/Node;->nativeGetVelocity(Lcom/wiyun/engine/types/WYPoint;)V */
} // .end method
public native Float getVelocityX ( ) {
} // .end method
public native Float getVelocityY ( ) {
} // .end method
public native Float getVertexZ ( ) {
} // .end method
public native Float getWidth ( ) {
} // .end method
public native Integer getZOrder ( ) {
} // .end method
public Boolean hasRunningAction ( ) {
/* .locals 1 */
v0 = (( com.wiyun.engine.nodes.Node ) p0 ).getRunningActionCount ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/nodes/Node;->getRunningActionCount()I
/* if-lez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public native Boolean hitTest ( Float p0, Float p1 ) {
} // .end method
public native final Boolean isAccelerometerEnabled ( ) {
} // .end method
public native Boolean isAncestor ( com.wiyun.engine.nodes.Node p0 ) {
} // .end method
public native final Boolean isDoubleTapEnabled ( ) {
} // .end method
public native Boolean isEnabled ( ) {
} // .end method
public native Boolean isFocused ( ) {
} // .end method
public native final Boolean isGestureEnabled ( ) {
} // .end method
public native final Boolean isKeyEnabled ( ) {
} // .end method
public native Boolean isMultiTouchClickable ( ) {
} // .end method
public native Boolean isNoDraw ( ) {
} // .end method
public native Boolean isRelativeToAnchor ( ) {
} // .end method
public native Boolean isRunning ( ) {
} // .end method
public native Boolean isSelected ( ) {
} // .end method
public native final Boolean isTouchEnabled ( ) {
} // .end method
public native Boolean isVisible ( ) {
} // .end method
public native void moveAnchorTo ( Float p0, Float p1 ) {
} // .end method
protected Boolean onBackButton ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean onDoubleTap ( android.view.MotionEvent p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean onDoubleTapEvent ( android.view.MotionEvent p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean onDown ( android.view.MotionEvent p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public native final void onEnter ( ) {
} // .end method
public native final void onEnterTransitionDidFinish ( ) {
} // .end method
public native final void onExit ( ) {
} // .end method
public Boolean onFling ( android.view.MotionEvent p0, android.view.MotionEvent p1, Float p2, Float p3 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void onLongPress ( android.view.MotionEvent p0 ) {
/* .locals 0 */
return;
} // .end method
public Boolean onScroll ( android.view.MotionEvent p0, android.view.MotionEvent p1, Float p2, Float p3 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void onShowPress ( android.view.MotionEvent p0 ) {
/* .locals 0 */
return;
} // .end method
public Boolean onSingleTapConfirmed ( android.view.MotionEvent p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean onSingleTapUp ( android.view.MotionEvent p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public native void pauseAction ( Integer p0 ) {
} // .end method
public native void pauseAllActions ( ) {
} // .end method
public native void pauseAllActions ( Boolean p0 ) {
} // .end method
public native void pauseAllTimers ( ) {
} // .end method
public native void pauseAllTimers ( Boolean p0 ) {
} // .end method
public native void removeAllChildren ( Boolean p0 ) {
} // .end method
public native void removeChild ( Integer p0, Boolean p1 ) {
} // .end method
public native void removeChild ( com.wiyun.engine.nodes.Node p0, Boolean p1 ) {
} // .end method
public native void removeChildren ( Integer p0, Boolean p1 ) {
} // .end method
public native void reorderChild ( com.wiyun.engine.nodes.Node p0, Integer p1 ) {
} // .end method
public native void resumeAction ( Integer p0 ) {
} // .end method
public native void resumeAllActions ( ) {
} // .end method
public native void resumeAllActions ( Boolean p0 ) {
} // .end method
public native void resumeAllTimers ( ) {
} // .end method
public native void resumeAllTimers ( Boolean p0 ) {
} // .end method
public native void runAction ( com.wiyun.engine.actions.Action p0 ) {
} // .end method
public native void scale ( Float p0 ) {
} // .end method
public void schedule ( com.wiyun.engine.utils.TargetSelector p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
(( com.wiyun.engine.nodes.Node ) p0 ).schedule ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/wiyun/engine/nodes/Node;->schedule(Lcom/wiyun/engine/utils/TargetSelector;F)V
return;
} // .end method
public native void schedule ( com.wiyun.engine.utils.TargetSelector p0, Float p1 ) {
} // .end method
public native void scheduleByFrame ( com.wiyun.engine.utils.TargetSelector p0, Integer p1 ) {
} // .end method
public void scheduleOnce ( com.wiyun.engine.utils.TargetSelector p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
(( com.wiyun.engine.nodes.Node ) p0 ).scheduleOnce ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/wiyun/engine/nodes/Node;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
return;
} // .end method
public native void scheduleOnce ( com.wiyun.engine.utils.TargetSelector p0, Float p1 ) {
} // .end method
public native void scheduleOnceByFrame ( com.wiyun.engine.utils.TargetSelector p0, Integer p1 ) {
} // .end method
public native void setAcceleration ( Float p0, Float p1 ) {
} // .end method
public native void setAccelerationX ( Float p0 ) {
} // .end method
public native void setAccelerationY ( Float p0 ) {
} // .end method
public native final void setAccelerometerEnabled ( Boolean p0 ) {
} // .end method
public native void setAccelerometerPriority ( Integer p0 ) {
} // .end method
public native void setAnchor ( Float p0, Float p1 ) {
} // .end method
public native void setAnchorX ( Float p0 ) {
} // .end method
public native void setAnchorY ( Float p0 ) {
} // .end method
public void setClipRect ( com.wiyun.engine.types.WYRect p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
(( com.wiyun.engine.nodes.Node ) p0 ).setClipRect ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/wiyun/engine/nodes/Node;->setClipRect(Lcom/wiyun/engine/types/WYRect;Z)V
return;
} // .end method
public native void setClipRect ( com.wiyun.engine.types.WYRect p0, Boolean p1 ) {
} // .end method
public native void setContentSize ( Float p0, Float p1 ) {
} // .end method
public native final void setDoubleTapEnabled ( Boolean p0 ) {
} // .end method
public native void setDoubleTapPriority ( Integer p0 ) {
} // .end method
public native void setEnabled ( Boolean p0 ) {
} // .end method
public native void setFocused ( Boolean p0 ) {
} // .end method
public native final void setGestureEnabled ( Boolean p0 ) {
} // .end method
public native void setGesturePriority ( Integer p0 ) {
} // .end method
public native void setGrid ( com.wiyun.engine.grid.BaseGrid p0 ) {
} // .end method
public native void setInterceptTouch ( Boolean p0 ) {
} // .end method
public native final void setJavaVirtualMethods ( com.wiyun.engine.nodes.INodeVirtualMethods p0 ) {
} // .end method
public native final void setKeyEnabled ( Boolean p0 ) {
} // .end method
public native void setKeyPriority ( Integer p0 ) {
} // .end method
public native void setMultiTouchClickable ( Boolean p0 ) {
} // .end method
public native void setNoDraw ( Boolean p0 ) {
} // .end method
protected native void setParent ( com.wiyun.engine.nodes.Node p0 ) {
} // .end method
public native void setPosition ( Float p0, Float p1 ) {
} // .end method
public void setPosition ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.nodes.Node ) p0 ).setPosition ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/nodes/Node;->setPosition(FF)V
return;
} // .end method
public native void setPositionListener ( com.wiyun.engine.nodes.Node$IPositionListener p0 ) {
} // .end method
public native void setRelativeAnchorPoint ( Boolean p0 ) {
} // .end method
public native void setRotation ( Float p0 ) {
} // .end method
public native void setScale ( Float p0 ) {
} // .end method
public void setScale ( Float p0, Float p1 ) {
/* .locals 0 */
(( com.wiyun.engine.nodes.Node ) p0 ).setScaleX ( p1 ); // invoke-virtual {p0, p1}, Lcom/wiyun/engine/nodes/Node;->setScaleX(F)V
(( com.wiyun.engine.nodes.Node ) p0 ).setScaleY ( p2 ); // invoke-virtual {p0, p2}, Lcom/wiyun/engine/nodes/Node;->setScaleY(F)V
return;
} // .end method
public native void setScaleX ( Float p0 ) {
} // .end method
public native void setScaleY ( Float p0 ) {
} // .end method
public native void setSelected ( Boolean p0 ) {
} // .end method
public native void setSkewX ( Float p0 ) {
} // .end method
public native void setSkewY ( Float p0 ) {
} // .end method
public native void setTag ( Integer p0 ) {
} // .end method
public native final void setTouchEnabled ( Boolean p0 ) {
} // .end method
public native void setTouchPriority ( Integer p0 ) {
} // .end method
public native void setTransformDirty ( ) {
} // .end method
public native void setUserData ( java.lang.Object p0 ) {
} // .end method
public native void setVelocity ( Float p0, Float p1 ) {
} // .end method
public native void setVelocityX ( Float p0 ) {
} // .end method
public native void setVelocityY ( Float p0 ) {
} // .end method
public native void setVertexZ ( Float p0 ) {
} // .end method
public native void setVisible ( Boolean p0 ) {
} // .end method
public native void setZOrder ( Integer p0 ) {
} // .end method
public native void sizeToFit ( ) {
} // .end method
public native final void stopAction ( Integer p0 ) {
} // .end method
public native final void stopAction ( com.wiyun.engine.actions.Action p0 ) {
} // .end method
public native final void stopAllActions ( ) {
} // .end method
public native void stopAllActions ( Boolean p0 ) {
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "<instance of "; // const-string v1, "<instance of "
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = "| Tag = "; // const-string v1, "| Tag = "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = (( com.wiyun.engine.nodes.Node ) p0 ).getTag ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/nodes/Node;->getTag()I
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ">"; // const-string v1, ">"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public native final void transform ( ) {
} // .end method
public native final void transformAncestors ( ) {
} // .end method
public native void translate ( Float p0, Float p1 ) {
} // .end method
public native void translateChildren ( Float p0, Float p1 ) {
} // .end method
public native void unschedule ( com.wiyun.engine.utils.TargetSelector p0 ) {
} // .end method
public native final void visit ( ) {
} // .end method
public void wyAccelerometerChanged ( Float p0, Float p1, Float p2 ) {
/* .locals 0 */
return;
} // .end method
public Boolean wyKeyDown ( android.view.KeyEvent p0 ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
v1 = (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
/* packed-switch v1, :pswitch_data_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* :pswitch_0 */
/* iput-boolean v0, p0, Lcom/wiyun/engine/nodes/Node;->mBackKeyTracking:Z */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x4 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public Boolean wyKeyMultiple ( android.view.KeyEvent p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean wyKeyUp ( android.view.KeyEvent p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
v1 = (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
/* packed-switch v1, :pswitch_data_0 */
} // :cond_0
} // :goto_0
/* :pswitch_0 */
/* iget-boolean v1, p0, Lcom/wiyun/engine/nodes/Node;->mBackKeyTracking:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* iput-boolean v0, p0, Lcom/wiyun/engine/nodes/Node;->mBackKeyTracking:Z */
v0 = (( com.wiyun.engine.nodes.Node ) p0 ).onBackButton ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/nodes/Node;->onBackButton()Z
/* :pswitch_data_0 */
/* .packed-switch 0x4 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public Boolean wyTouchesBegan ( android.view.MotionEvent p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean wyTouchesCancelled ( android.view.MotionEvent p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean wyTouchesEnded ( android.view.MotionEvent p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean wyTouchesMoved ( android.view.MotionEvent p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean wyTouchesPointerBegan ( android.view.MotionEvent p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean wyTouchesPointerEnded ( android.view.MotionEvent p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
