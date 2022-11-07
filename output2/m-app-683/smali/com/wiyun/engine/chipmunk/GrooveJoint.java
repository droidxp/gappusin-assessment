public class com.wiyun.engine.chipmunk.GrooveJoint extends com.wiyun.engine.chipmunk.Constraint {
	 /* .source "GrooveJoint.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.chipmunk.GrooveJoint ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 24 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/chipmunk/Constraint;-><init>(I)V */
		 /* .line 25 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.chipmunk.GrooveJoint ( ) {
		 /* .locals 0 */
		 /* .param p1, "b1" # Lcom/wiyun/engine/chipmunk/Body; */
		 /* .param p2, "b2" # Lcom/wiyun/engine/chipmunk/Body; */
		 /* .param p3, "grooveAX" # F */
		 /* .param p4, "grooveAY" # F */
		 /* .param p5, "grooveBX" # F */
		 /* .param p6, "grooveBY" # F */
		 /* .param p7, "anchorX" # F */
		 /* .param p8, "anchorY" # F */
		 /* .prologue */
		 /* .line 13 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/chipmunk/Constraint;-><init>()V */
		 /* .line 14 */
		 /* invoke-direct/range {p0 ..p8}, Lcom/wiyun/engine/chipmunk/GrooveJoint;->init(Lcom/wiyun/engine/chipmunk/Body;Lcom/wiyun/engine/chipmunk/Body;FFFFFF)V */
		 /* .line 15 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.chipmunk.Constraint from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.chipmunk.GrooveJoint .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.chipmunk.GrooveJoint from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 20 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/chipmunk/GrooveJoint; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/chipmunk/GrooveJoint;-><init>(I)V */
} // .end method
private native void init ( com.wiyun.engine.chipmunk.Body p0, com.wiyun.engine.chipmunk.Body p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7 ) {
} // .end method
public static com.wiyun.engine.chipmunk.GrooveJoint make ( com.wiyun.engine.chipmunk.Body p0, com.wiyun.engine.chipmunk.Body p1, com.wiyun.engine.types.WYPoint p2, com.wiyun.engine.types.WYPoint p3, com.wiyun.engine.types.WYPoint p4 ) {
/* .locals 9 */
/* .param p0, "b1" # Lcom/wiyun/engine/chipmunk/Body; */
/* .param p1, "b2" # Lcom/wiyun/engine/chipmunk/Body; */
/* .param p2, "grooveA" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p3, "grooveB" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p4, "anchor" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 10 */
/* new-instance v0, Lcom/wiyun/engine/chipmunk/GrooveJoint; */
/* iget v3, p2, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v4, p2, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* iget v5, p3, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v6, p3, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* iget v7, p4, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v8, p4, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* invoke-direct/range {v0 ..v8}, Lcom/wiyun/engine/chipmunk/GrooveJoint;-><init>(Lcom/wiyun/engine/chipmunk/Body;Lcom/wiyun/engine/chipmunk/Body;FFFFFF)V */
} // .end method
/* # virtual methods */
public com.wiyun.engine.types.WYPoint getAnchor2 ( ) {
/* .locals 2 */
/* .prologue */
/* .line 47 */
v0 = (( com.wiyun.engine.chipmunk.GrooveJoint ) p0 ).getAnchor2X ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/GrooveJoint;->getAnchor2X()F
v1 = (( com.wiyun.engine.chipmunk.GrooveJoint ) p0 ).getAnchor2Y ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/GrooveJoint;->getAnchor2Y()F
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public native Float getAnchor2X ( ) {
} // .end method
public native Float getAnchor2Y ( ) {
} // .end method
public native void setAnchor2 ( Float p0, Float p1 ) {
} // .end method
public void setAnchor2 ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "p" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 56 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.chipmunk.GrooveJoint ) p0 ).setAnchor2 ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/chipmunk/GrooveJoint;->setAnchor2(FF)V
/* .line 57 */
return;
} // .end method
