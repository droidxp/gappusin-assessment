public class com.wiyun.engine.chipmunk.PinJoint extends com.wiyun.engine.chipmunk.Constraint {
	 /* .source "PinJoint.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.chipmunk.PinJoint ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 56 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/chipmunk/Constraint;-><init>(I)V */
		 /* .line 57 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.chipmunk.PinJoint ( ) {
		 /* .locals 0 */
		 /* .param p1, "b1" # Lcom/wiyun/engine/chipmunk/Body; */
		 /* .param p2, "b2" # Lcom/wiyun/engine/chipmunk/Body; */
		 /* .param p3, "anchor1X" # F */
		 /* .param p4, "anchor1Y" # F */
		 /* .param p5, "anchor2X" # F */
		 /* .param p6, "anchor2Y" # F */
		 /* .prologue */
		 /* .line 47 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/chipmunk/Constraint;-><init>()V */
		 /* .line 48 */
		 /* invoke-direct/range {p0 ..p6}, Lcom/wiyun/engine/chipmunk/PinJoint;->init(Lcom/wiyun/engine/chipmunk/Body;Lcom/wiyun/engine/chipmunk/Body;FFFF)V */
		 /* .line 49 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.chipmunk.Constraint from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.chipmunk.PinJoint .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.chipmunk.PinJoint from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 52 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/chipmunk/PinJoint; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/chipmunk/PinJoint;-><init>(I)V */
} // .end method
private native void init ( com.wiyun.engine.chipmunk.Body p0, com.wiyun.engine.chipmunk.Body p1, Float p2, Float p3, Float p4, Float p5 ) {
} // .end method
public static com.wiyun.engine.chipmunk.PinJoint make ( com.wiyun.engine.chipmunk.Body p0, com.wiyun.engine.chipmunk.Body p1, Float p2, Float p3, Float p4, Float p5 ) {
/* .locals 7 */
/* .param p0, "b1" # Lcom/wiyun/engine/chipmunk/Body; */
/* .param p1, "b2" # Lcom/wiyun/engine/chipmunk/Body; */
/* .param p2, "anchor1X" # F */
/* .param p3, "anchor1Y" # F */
/* .param p4, "anchor2X" # F */
/* .param p5, "anchor2Y" # F */
/* .prologue */
/* .line 34 */
/* new-instance v0, Lcom/wiyun/engine/chipmunk/PinJoint; */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* move v6, p5 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/chipmunk/PinJoint;-><init>(Lcom/wiyun/engine/chipmunk/Body;Lcom/wiyun/engine/chipmunk/Body;FFFF)V */
} // .end method
public static com.wiyun.engine.chipmunk.PinJoint make ( com.wiyun.engine.chipmunk.Body p0, com.wiyun.engine.chipmunk.Body p1, com.wiyun.engine.types.WYPoint p2, com.wiyun.engine.types.WYPoint p3 ) {
/* .locals 6 */
/* .param p0, "b1" # Lcom/wiyun/engine/chipmunk/Body; */
/* .param p1, "b2" # Lcom/wiyun/engine/chipmunk/Body; */
/* .param p2, "anchor1" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p3, "anchor2" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 19 */
/* iget v2, p2, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v3, p2, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* iget v4, p3, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v5, p3, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* move-object v0, p0 */
/* move-object v1, p1 */
/* invoke-static/range {v0 ..v5}, Lcom/wiyun/engine/chipmunk/PinJoint;->make(Lcom/wiyun/engine/chipmunk/Body;Lcom/wiyun/engine/chipmunk/Body;FFFF)Lcom/wiyun/engine/chipmunk/PinJoint; */
} // .end method
/* # virtual methods */
public com.wiyun.engine.types.WYPoint getAnchor1 ( ) {
/* .locals 2 */
/* .prologue */
/* .line 105 */
v0 = (( com.wiyun.engine.chipmunk.PinJoint ) p0 ).getAnchor1X ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/PinJoint;->getAnchor1X()F
v1 = (( com.wiyun.engine.chipmunk.PinJoint ) p0 ).getAnchor1Y ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/PinJoint;->getAnchor1Y()F
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public native Float getAnchor1X ( ) {
} // .end method
public native Float getAnchor1Y ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getAnchor2 ( ) {
/* .locals 2 */
/* .prologue */
/* .line 128 */
v0 = (( com.wiyun.engine.chipmunk.PinJoint ) p0 ).getAnchor2X ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/PinJoint;->getAnchor2X()F
v1 = (( com.wiyun.engine.chipmunk.PinJoint ) p0 ).getAnchor2Y ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/PinJoint;->getAnchor2Y()F
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public native Float getAnchor2X ( ) {
} // .end method
public native Float getAnchor2Y ( ) {
} // .end method
public native Float getDistance ( ) {
} // .end method
public native void setAnchor1 ( Float p0, Float p1 ) {
} // .end method
public void setAnchor1 ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "p" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 137 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.chipmunk.PinJoint ) p0 ).setAnchor1 ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/chipmunk/PinJoint;->setAnchor1(FF)V
/* .line 138 */
return;
} // .end method
public native void setAnchor2 ( Float p0, Float p1 ) {
} // .end method
public void setAnchor2 ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "p" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 146 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.chipmunk.PinJoint ) p0 ).setAnchor2 ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/chipmunk/PinJoint;->setAnchor2(FF)V
/* .line 147 */
return;
} // .end method
public native void setDistance ( Float p0 ) {
} // .end method
