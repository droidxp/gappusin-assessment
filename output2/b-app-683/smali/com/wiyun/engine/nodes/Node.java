public class com.wiyun.engine.nodes.Node extends com.wiyun.engine.BaseWYObject implements com.wiyun.engine.events.IKeyHandler implements com.wiyun.engine.events.IMultiTouchHandler implements com.wiyun.engine.events.IAccelerometerHandler implements android.view.GestureDetector$OnGestureListener implements android.view.GestureDetector$OnDoubleTapListener {
	 /* .source "Node.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/wiyun/engine/nodes/Node$IBlendable;, */
	 /* Lcom/wiyun/engine/nodes/Node$IBlendableTextureOwner;, */
	 /* Lcom/wiyun/engine/nodes/Node$IColorable;, */
	 /* Lcom/wiyun/engine/nodes/Node$IColorableLabel;, */
	 /* Lcom/wiyun/engine/nodes/Node$IFrames;, */
	 /* Lcom/wiyun/engine/nodes/Node$ILabel;, */
	 /* Lcom/wiyun/engine/nodes/Node$IPositionListener;, */
	 /* Lcom/wiyun/engine/nodes/Node$IRGB;, */
	 /* Lcom/wiyun/engine/nodes/Node$ISizable;, */
	 /* Lcom/wiyun/engine/nodes/Node$ITextureOwner;, */
	 /* Lcom/wiyun/engine/nodes/Node$ITransparent; */
	 /* } */
} // .end annotation
/* # instance fields */
private Boolean mBackKeyTracking;
/* # direct methods */
protected com.wiyun.engine.nodes.Node ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 226 */
	 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
	 /* .line 227 */
	 (( com.wiyun.engine.nodes.Node ) p0 ).doNativeInit ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/nodes/Node;->doNativeInit()V
	 /* .line 228 */
	 return;
} // .end method
protected com.wiyun.engine.nodes.Node ( ) {
	 /* .locals 0 */
	 /* .param p1, "pointer" # I */
	 /* .prologue */
	 /* .line 235 */
	 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
	 /* .line 236 */
	 return;
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "pointer" # I */
	 /* .prologue */
	 /* .line 231 */
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
/* .param p1, "child" # Lcom/wiyun/engine/nodes/Node; */
/* .prologue */
/* .line 299 */
v0 = (( com.wiyun.engine.nodes.Node ) p1 ).getZOrder ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/nodes/Node;->getZOrder()I
v1 = (( com.wiyun.engine.nodes.Node ) p1 ).getTag ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/nodes/Node;->getTag()I
(( com.wiyun.engine.nodes.Node ) p0 ).addChild ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lcom/wiyun/engine/nodes/Node;->addChild(Lcom/wiyun/engine/nodes/Node;II)V
/* .line 300 */
return;
} // .end method
public void addChild ( com.wiyun.engine.nodes.Node p0, Integer p1 ) {
/* .locals 1 */
/* .param p1, "child" # Lcom/wiyun/engine/nodes/Node; */
/* .param p2, "z" # I */
/* .prologue */
/* .line 310 */
v0 = (( com.wiyun.engine.nodes.Node ) p1 ).getTag ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/nodes/Node;->getTag()I
(( com.wiyun.engine.nodes.Node ) p0 ).addChild ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lcom/wiyun/engine/nodes/Node;->addChild(Lcom/wiyun/engine/nodes/Node;II)V
/* .line 311 */
return;
} // .end method
public native void addChild ( com.wiyun.engine.nodes.Node p0, Integer p1, Integer p2 ) {
} // .end method
public com.wiyun.engine.nodes.Node autoRelease ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "includeChildren" # Z */
/* .prologue */
/* .line 258 */
/* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;->nativeAutoRelease(Z)V */
/* .line 259 */
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
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .prologue */
/* .line 336 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 337 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, p1, p2, v0}, Lcom/wiyun/engine/nodes/Node;->nativeConvertToNodeSpace(FFLcom/wiyun/engine/types/WYPoint;)V */
/* .line 338 */
} // .end method
public com.wiyun.engine.types.WYPoint convertToNodeSpaceAR ( Float p0, Float p1 ) {
/* .locals 1 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .prologue */
/* .line 354 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 355 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, p1, p2, v0}, Lcom/wiyun/engine/nodes/Node;->nativeConvertToNodeSpaceAR(FFLcom/wiyun/engine/types/WYPoint;)V */
/* .line 356 */
} // .end method
public com.wiyun.engine.types.WYPoint convertToWorldSpace ( Float p0, Float p1 ) {
/* .locals 1 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .prologue */
/* .line 394 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 395 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, p1, p2, v0}, Lcom/wiyun/engine/nodes/Node;->nativeConvertToWorldSpace(FFLcom/wiyun/engine/types/WYPoint;)V */
/* .line 396 */
} // .end method
public com.wiyun.engine.types.WYPoint convertToWorldSpaceAR ( Float p0, Float p1 ) {
/* .locals 1 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .prologue */
/* .line 407 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 408 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, p1, p2, v0}, Lcom/wiyun/engine/nodes/Node;->nativeConvertToWorldSpaceAR(FFLcom/wiyun/engine/types/WYPoint;)V */
/* .line 409 */
} // .end method
public com.wiyun.engine.types.WYPoint convertTouchToNodeSpace ( android.view.MotionEvent p0 ) {
/* .locals 5 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 367 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 368 */
/* .local v1, "p":Lcom/wiyun/engine/types/WYPoint; */
com.wiyun.engine.nodes.Director .getInstance ( );
v3 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
v4 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
(( com.wiyun.engine.nodes.Director ) v2 ).convertToGL ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/wiyun/engine/nodes/Director;->convertToGL(FF)Lcom/wiyun/engine/types/WYPoint;
/* .line 369 */
/* .local v0, "loc":Lcom/wiyun/engine/types/WYPoint; */
/* iget v2, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v3, v0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* invoke-direct {p0, v2, v3, v1}, Lcom/wiyun/engine/nodes/Node;->nativeConvertToNodeSpace(FFLcom/wiyun/engine/types/WYPoint;)V */
/* .line 370 */
} // .end method
public com.wiyun.engine.types.WYPoint convertTouchToNodeSpaceAR ( android.view.MotionEvent p0 ) {
/* .locals 5 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 380 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 381 */
/* .local v1, "p":Lcom/wiyun/engine/types/WYPoint; */
com.wiyun.engine.nodes.Director .getInstance ( );
v3 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
v4 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
(( com.wiyun.engine.nodes.Director ) v2 ).convertToGL ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/wiyun/engine/nodes/Director;->convertToGL(FF)Lcom/wiyun/engine/types/WYPoint;
/* .line 382 */
/* .local v0, "loc":Lcom/wiyun/engine/types/WYPoint; */
/* iget v2, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v3, v0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* invoke-direct {p0, v2, v3, v1}, Lcom/wiyun/engine/nodes/Node;->nativeConvertToNodeSpaceAR(FFLcom/wiyun/engine/types/WYPoint;)V */
/* .line 383 */
} // .end method
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 239 */
/* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;->nativeInit()V */
/* .line 240 */
return;
} // .end method
public native final void draw ( ) {
} // .end method
public native void enlargeNode ( Float p0, Float p1, Float p2, Float p3 ) {
} // .end method
public com.wiyun.engine.types.WYPoint getAbsolutePosition ( ) {
/* .locals 1 */
/* .prologue */
/* .line 271 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 272 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/Node;->nativeGetAbsolutePosition(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 273 */
} // .end method
public com.wiyun.engine.types.WYPoint getAcceleration ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1573 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 1574 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/Node;->nativeGetAcceleration(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 1575 */
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
/* .prologue */
/* .line 503 */
com.wiyun.engine.types.WYRect .makeZero ( );
/* .line 504 */
/* .local v0, "rect":Lcom/wiyun/engine/types/WYRect; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/Node;->nativeGetBoundingBox(Lcom/wiyun/engine/types/WYRect;)V */
/* .line 505 */
} // .end method
public com.wiyun.engine.types.WYRect getBoundingBoxRelativeToParent ( ) {
/* .locals 1 */
/* .prologue */
/* .line 521 */
com.wiyun.engine.types.WYRect .makeZero ( );
/* .line 522 */
/* .local v0, "rect":Lcom/wiyun/engine/types/WYRect; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/Node;->nativeGetBoundingBoxRelativeToParent(Lcom/wiyun/engine/types/WYRect;)V */
/* .line 523 */
} // .end method
public com.wiyun.engine.types.WYRect getBoundingBoxRelativeToWorld ( ) {
/* .locals 1 */
/* .prologue */
/* .line 535 */
com.wiyun.engine.types.WYRect .makeZero ( );
/* .line 536 */
/* .local v0, "rect":Lcom/wiyun/engine/types/WYRect; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/Node;->nativeGetBoundingBoxRelativeToWorld(Lcom/wiyun/engine/types/WYRect;)V */
/* .line 537 */
} // .end method
public com.wiyun.engine.opengl.Camera getCamera ( ) {
/* .locals 1 */
/* .prologue */
/* .line 546 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;->nativeGetCamera()I */
com.wiyun.engine.opengl.Camera .from ( v0 );
} // .end method
public com.wiyun.engine.nodes.Node getChild ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "tag" # I */
/* .prologue */
/* .line 558 */
v0 = (( com.wiyun.engine.nodes.Node ) p0 ).getChildPointer ( p1 ); // invoke-virtual {p0, p1}, Lcom/wiyun/engine/nodes/Node;->getChildPointer(I)I
/* .line 559 */
/* .local v0, "pointer":I */
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
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/wiyun/engine/nodes/Node;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 632 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 633 */
/* .local v0, "children":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/wiyun/engine/nodes/Node;>;" */
v3 = (( com.wiyun.engine.nodes.Node ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/nodes/Node;->getChildCount()I
/* new-array v2, v3, [I */
/* .line 634 */
/* .local v2, "pointers":[I */
/* invoke-direct {p0, v2}, Lcom/wiyun/engine/nodes/Node;->nativeGetChildren([I)V */
/* .line 635 */
/* array-length v4, v2 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-lt v3, v4, :cond_0 */
/* .line 637 */
/* .line 635 */
} // :cond_0
/* aget v1, v2, v3 */
/* .line 636 */
/* .local v1, "pointer":I */
/* new-instance v5, Lcom/wiyun/engine/nodes/Node; */
/* invoke-direct {v5, v1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
(( java.util.ArrayList ) v0 ).add ( v5 ); // invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 635 */
/* add-int/lit8 v3, v3, 0x1 */
} // .end method
public com.wiyun.engine.nodes.Node getChildren ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "tag" # I */
/* .prologue */
/* .line 576 */
(( com.wiyun.engine.nodes.Node ) p0 ).getChildrenPointer ( p1 ); // invoke-virtual {p0, p1}, Lcom/wiyun/engine/nodes/Node;->getChildrenPointer(I)[I
/* .line 577 */
/* .local v2, "p":[I */
/* if-nez v2, :cond_1 */
/* .line 578 */
int v1 = 0; // const/4 v1, 0x0
/* .line 584 */
} // :cond_0
/* .line 580 */
} // :cond_1
/* array-length v3, v2 */
/* new-array v1, v3, [Lcom/wiyun/engine/nodes/Node; */
/* .line 581 */
/* .local v1, "n":[Lcom/wiyun/engine/nodes/Node; */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* array-length v3, v2 */
/* if-ge v0, v3, :cond_0 */
/* .line 582 */
/* aget v3, v2, v0 */
com.wiyun.engine.nodes.Node .from ( v3 );
/* aput-object v3, v1, v0 */
/* .line 581 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public native getChildrenPointer ( Integer p0 ) {
} // .end method
public com.wiyun.engine.types.WYRect getClipRect ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1620 */
com.wiyun.engine.types.WYRect .makeZero ( );
/* .line 1621 */
/* .local v0, "r":Lcom/wiyun/engine/types/WYRect; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/Node;->nativeGetClipRect(Lcom/wiyun/engine/types/WYRect;)V */
/* .line 1622 */
} // .end method
public native Integer getDoubleTapPriority ( ) {
} // .end method
public com.wiyun.engine.nodes.Node getFirstChild ( ) {
/* .locals 2 */
/* .prologue */
/* .line 284 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;->nativeGetFirstChild()I */
/* .line 285 */
/* .local v0, "pointer":I */
/* if-lez v0, :cond_0 */
/* .line 286 */
/* new-instance v1, Lcom/wiyun/engine/nodes/Node; */
/* invoke-direct {v1, v0}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
/* .line 288 */
} // :goto_0
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // .end method
public native Integer getGesturePriority ( ) {
} // .end method
public com.wiyun.engine.grid.BaseGrid getGrid ( ) {
/* .locals 1 */
/* .prologue */
/* .line 650 */
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
/* .locals 3 */
/* .prologue */
/* .line 677 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;->nativeGetParent()I */
/* .line 678 */
/* .local v0, "pointer":I */
/* if-lez v0, :cond_0 */
/* new-instance v1, Lcom/wiyun/engine/nodes/Node; */
v2 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;->nativeGetParent()I */
/* invoke-direct {v1, v2}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
} // :goto_0
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // .end method
public native Float getPositionX ( ) {
} // .end method
public native Float getPositionY ( ) {
} // .end method
public native Float getRotation ( ) {
} // .end method
public Integer getRunningActionCount ( ) {
/* .locals 1 */
/* .prologue */
/* .line 813 */
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
/* .prologue */
/* .line 1546 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 1547 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/Node;->nativeGetVelocity(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 1548 */
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
/* .prologue */
/* .line 822 */
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
/* .prologue */
/* .line 1683 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean onDoubleTap ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .param p1, "e" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 1709 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean onDoubleTapEvent ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .param p1, "e" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 1713 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean onDown ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .param p1, "e" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 1687 */
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
/* .param p1, "e1" # Landroid/view/MotionEvent; */
/* .param p2, "e2" # Landroid/view/MotionEvent; */
/* .param p3, "velocityX" # F */
/* .param p4, "velocityY" # F */
/* .prologue */
/* .line 1691 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void onLongPress ( android.view.MotionEvent p0 ) {
/* .locals 0 */
/* .param p1, "e" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 1695 */
return;
} // .end method
public Boolean onScroll ( android.view.MotionEvent p0, android.view.MotionEvent p1, Float p2, Float p3 ) {
/* .locals 1 */
/* .param p1, "e1" # Landroid/view/MotionEvent; */
/* .param p2, "e2" # Landroid/view/MotionEvent; */
/* .param p3, "distanceX" # F */
/* .param p4, "distanceY" # F */
/* .prologue */
/* .line 1698 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void onShowPress ( android.view.MotionEvent p0 ) {
/* .locals 0 */
/* .param p1, "e" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 1702 */
return;
} // .end method
public Boolean onSingleTapConfirmed ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .param p1, "e" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 1717 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean onSingleTapUp ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .param p1, "e" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 1705 */
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
/* .param p1, "selector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
/* .line 919 */
int v0 = 0; // const/4 v0, 0x0
(( com.wiyun.engine.nodes.Node ) p0 ).schedule ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/wiyun/engine/nodes/Node;->schedule(Lcom/wiyun/engine/utils/TargetSelector;F)V
/* .line 920 */
return;
} // .end method
public native void schedule ( com.wiyun.engine.utils.TargetSelector p0, Float p1 ) {
} // .end method
public native void scheduleByFrame ( com.wiyun.engine.utils.TargetSelector p0, Integer p1 ) {
} // .end method
public void scheduleOnce ( com.wiyun.engine.utils.TargetSelector p0 ) {
/* .locals 1 */
/* .param p1, "selector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
/* .line 947 */
int v0 = 0; // const/4 v0, 0x0
(( com.wiyun.engine.nodes.Node ) p0 ).scheduleOnce ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/wiyun/engine/nodes/Node;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
/* .line 948 */
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
/* .param p1, "clip" # Lcom/wiyun/engine/types/WYRect; */
/* .prologue */
/* .line 1602 */
int v0 = 0; // const/4 v0, 0x0
(( com.wiyun.engine.nodes.Node ) p0 ).setClipRect ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/wiyun/engine/nodes/Node;->setClipRect(Lcom/wiyun/engine/types/WYRect;Z)V
/* .line 1603 */
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
/* .param p1, "p" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 1048 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.nodes.Node ) p0 ).setPosition ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/nodes/Node;->setPosition(FF)V
/* .line 1049 */
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
/* .param p1, "sx" # F */
/* .param p2, "sy" # F */
/* .prologue */
/* .line 1104 */
(( com.wiyun.engine.nodes.Node ) p0 ).setScaleX ( p1 ); // invoke-virtual {p0, p1}, Lcom/wiyun/engine/nodes/Node;->setScaleX(F)V
/* .line 1105 */
(( com.wiyun.engine.nodes.Node ) p0 ).setScaleY ( p2 ); // invoke-virtual {p0, p2}, Lcom/wiyun/engine/nodes/Node;->setScaleY(F)V
/* .line 1106 */
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
/* .prologue */
/* .line 1312 */
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
/* .param p1, "accelX" # F */
/* .param p2, "accelY" # F */
/* .param p3, "accelZ" # F */
/* .prologue */
/* .line 1652 */
return;
} // .end method
public Boolean wyKeyDown ( android.view.KeyEvent p0 ) {
/* .locals 2 */
/* .param p1, "event" # Landroid/view/KeyEvent; */
/* .prologue */
int v0 = 1; // const/4 v0, 0x1
/* .line 1655 */
v1 = (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
/* packed-switch v1, :pswitch_data_0 */
/* .line 1660 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* .line 1657 */
/* :pswitch_0 */
/* iput-boolean v0, p0, Lcom/wiyun/engine/nodes/Node;->mBackKeyTracking:Z */
/* .line 1655 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x4 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public Boolean wyKeyMultiple ( android.view.KeyEvent p0 ) {
/* .locals 1 */
/* .param p1, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 1679 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean wyKeyUp ( android.view.KeyEvent p0 ) {
/* .locals 2 */
/* .param p1, "event" # Landroid/view/KeyEvent; */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 1665 */
v1 = (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
/* packed-switch v1, :pswitch_data_0 */
/* .line 1674 */
} // :cond_0
} // :goto_0
/* .line 1667 */
/* :pswitch_0 */
/* iget-boolean v1, p0, Lcom/wiyun/engine/nodes/Node;->mBackKeyTracking:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 1668 */
/* iput-boolean v0, p0, Lcom/wiyun/engine/nodes/Node;->mBackKeyTracking:Z */
/* .line 1669 */
v0 = (( com.wiyun.engine.nodes.Node ) p0 ).onBackButton ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/nodes/Node;->onBackButton()Z
/* .line 1665 */
/* :pswitch_data_0 */
/* .packed-switch 0x4 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public Boolean wyTouchesBegan ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 1628 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean wyTouchesCancelled ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 1640 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean wyTouchesEnded ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 1636 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean wyTouchesMoved ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 1632 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean wyTouchesPointerBegan ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 1644 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean wyTouchesPointerEnded ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 1648 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
