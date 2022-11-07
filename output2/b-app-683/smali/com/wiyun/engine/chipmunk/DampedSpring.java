public class com.wiyun.engine.chipmunk.DampedSpring extends com.wiyun.engine.chipmunk.Constraint {
	 /* .source "DampedSpring.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/wiyun/engine/chipmunk/DampedSpring$IForceUpdater; */
	 /* } */
} // .end annotation
/* # direct methods */
protected com.wiyun.engine.chipmunk.DampedSpring ( ) {
	 /* .locals 0 */
	 /* .param p1, "pointer" # I */
	 /* .prologue */
	 /* .line 32 */
	 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/chipmunk/Constraint;-><init>(I)V */
	 /* .line 33 */
	 return;
} // .end method
protected com.wiyun.engine.chipmunk.DampedSpring ( ) {
	 /* .locals 0 */
	 /* .param p1, "b1" # Lcom/wiyun/engine/chipmunk/Body; */
	 /* .param p2, "b2" # Lcom/wiyun/engine/chipmunk/Body; */
	 /* .param p3, "anchor1X" # F */
	 /* .param p4, "anchor1Y" # F */
	 /* .param p5, "anchor2X" # F */
	 /* .param p6, "anchor2Y" # F */
	 /* .param p7, "restLength" # F */
	 /* .param p8, "stiffness" # F */
	 /* .param p9, "damping" # F */
	 /* .prologue */
	 /* .line 35 */
	 /* invoke-direct {p0}, Lcom/wiyun/engine/chipmunk/Constraint;-><init>()V */
	 /* .line 36 */
	 /* invoke-direct/range {p0 ..p9}, Lcom/wiyun/engine/chipmunk/DampedSpring;->init(Lcom/wiyun/engine/chipmunk/Body;Lcom/wiyun/engine/chipmunk/Body;FFFFFFF)V */
	 /* .line 37 */
	 return;
} // .end method
public static com.wiyun.engine.chipmunk.Constraint from ( Integer p0 ) { //bridge//synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 1 */
	 com.wiyun.engine.chipmunk.DampedSpring .from ( p0 );
} // .end method
public static com.wiyun.engine.chipmunk.DampedSpring from ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "pointer" # I */
	 /* .prologue */
	 /* .line 28 */
	 /* if-nez p0, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/chipmunk/DampedSpring; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/chipmunk/DampedSpring;-><init>(I)V */
} // .end method
private native void init ( com.wiyun.engine.chipmunk.Body p0, com.wiyun.engine.chipmunk.Body p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7, Float p8 ) {
} // .end method
public static com.wiyun.engine.chipmunk.DampedSpring make ( com.wiyun.engine.chipmunk.Body p0, com.wiyun.engine.chipmunk.Body p1, com.wiyun.engine.types.WYPoint p2, com.wiyun.engine.types.WYPoint p3, Float p4, Float p5, Float p6 ) {
/* .locals 10 */
/* .param p0, "b1" # Lcom/wiyun/engine/chipmunk/Body; */
/* .param p1, "b2" # Lcom/wiyun/engine/chipmunk/Body; */
/* .param p2, "anchor1" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p3, "anchor2" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p4, "restLength" # F */
/* .param p5, "stiffness" # F */
/* .param p6, "damping" # F */
/* .prologue */
/* .line 24 */
/* new-instance v0, Lcom/wiyun/engine/chipmunk/DampedSpring; */
/* iget v3, p2, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v4, p2, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* iget v5, p3, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v6, p3, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move v7, p4 */
/* move v8, p5 */
/* move/from16 v9, p6 */
/* invoke-direct/range {v0 ..v9}, Lcom/wiyun/engine/chipmunk/DampedSpring;-><init>(Lcom/wiyun/engine/chipmunk/Body;Lcom/wiyun/engine/chipmunk/Body;FFFFFFF)V */
} // .end method
/* # virtual methods */
public com.wiyun.engine.types.WYPoint getAnchor1 ( ) {
/* .locals 2 */
/* .prologue */
/* .line 110 */
v0 = (( com.wiyun.engine.chipmunk.DampedSpring ) p0 ).getAnchor1X ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/DampedSpring;->getAnchor1X()F
v1 = (( com.wiyun.engine.chipmunk.DampedSpring ) p0 ).getAnchor1Y ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/DampedSpring;->getAnchor1Y()F
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public native Float getAnchor1X ( ) {
} // .end method
public native Float getAnchor1Y ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getAnchor2 ( ) {
/* .locals 2 */
/* .prologue */
/* .line 133 */
v0 = (( com.wiyun.engine.chipmunk.DampedSpring ) p0 ).getAnchor2X ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/DampedSpring;->getAnchor2X()F
v1 = (( com.wiyun.engine.chipmunk.DampedSpring ) p0 ).getAnchor2Y ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/DampedSpring;->getAnchor2Y()F
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public native Float getAnchor2X ( ) {
} // .end method
public native Float getAnchor2Y ( ) {
} // .end method
public native Float getDamping ( ) {
} // .end method
public native Float getRestLength ( ) {
} // .end method
public native Float getStiffness ( ) {
} // .end method
public native void setAnchor1 ( Float p0, Float p1 ) {
} // .end method
public void setAnchor1 ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "p" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 142 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.chipmunk.DampedSpring ) p0 ).setAnchor1 ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/chipmunk/DampedSpring;->setAnchor1(FF)V
/* .line 143 */
return;
} // .end method
public native void setAnchor2 ( Float p0, Float p1 ) {
} // .end method
public void setAnchor2 ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "p" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 151 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.chipmunk.DampedSpring ) p0 ).setAnchor2 ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/chipmunk/DampedSpring;->setAnchor2(FF)V
/* .line 152 */
return;
} // .end method
public native void setDamping ( Float p0 ) {
} // .end method
public native void setForceUpdater ( com.wiyun.engine.chipmunk.DampedSpring$IForceUpdater p0 ) {
} // .end method
public native void setRestLength ( Float p0 ) {
} // .end method
public native void setStiffness ( Float p0 ) {
} // .end method
