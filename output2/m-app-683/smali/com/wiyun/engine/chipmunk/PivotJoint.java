public class com.wiyun.engine.chipmunk.PivotJoint extends com.wiyun.engine.chipmunk.Constraint {
	 /* .source "PivotJoint.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.chipmunk.PivotJoint ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 81 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/chipmunk/Constraint;-><init>(I)V */
		 /* .line 82 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.chipmunk.PivotJoint ( ) {
		 /* .locals 0 */
		 /* .param p1, "b1" # Lcom/wiyun/engine/chipmunk/Body; */
		 /* .param p2, "b2" # Lcom/wiyun/engine/chipmunk/Body; */
		 /* .param p3, "pivotX" # F */
		 /* .param p4, "pivotY" # F */
		 /* .prologue */
		 /* .line 92 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/chipmunk/Constraint;-><init>()V */
		 /* .line 93 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/chipmunk/PivotJoint;->init(Lcom/wiyun/engine/chipmunk/Body;Lcom/wiyun/engine/chipmunk/Body;FF)V */
		 /* .line 94 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.chipmunk.PivotJoint ( ) {
		 /* .locals 0 */
		 /* .param p1, "b1" # Lcom/wiyun/engine/chipmunk/Body; */
		 /* .param p2, "b2" # Lcom/wiyun/engine/chipmunk/Body; */
		 /* .param p3, "anchor1X" # F */
		 /* .param p4, "anchor1Y" # F */
		 /* .param p5, "anchor2X" # F */
		 /* .param p6, "anchor2Y" # F */
		 /* .prologue */
		 /* .line 72 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/chipmunk/Constraint;-><init>()V */
		 /* .line 73 */
		 /* invoke-direct/range {p0 ..p6}, Lcom/wiyun/engine/chipmunk/PivotJoint;->init2(Lcom/wiyun/engine/chipmunk/Body;Lcom/wiyun/engine/chipmunk/Body;FFFF)V */
		 /* .line 74 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.chipmunk.Constraint from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.chipmunk.PivotJoint .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.chipmunk.PivotJoint from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 77 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/chipmunk/PivotJoint; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/chipmunk/PivotJoint;-><init>(I)V */
} // .end method
private native void init ( com.wiyun.engine.chipmunk.Body p0, com.wiyun.engine.chipmunk.Body p1, Float p2, Float p3 ) {
} // .end method
private native void init2 ( com.wiyun.engine.chipmunk.Body p0, com.wiyun.engine.chipmunk.Body p1, Float p2, Float p3, Float p4, Float p5 ) {
} // .end method
public static com.wiyun.engine.chipmunk.PivotJoint make ( com.wiyun.engine.chipmunk.Body p0, com.wiyun.engine.chipmunk.Body p1, Float p2, Float p3 ) {
/* .locals 1 */
/* .param p0, "b1" # Lcom/wiyun/engine/chipmunk/Body; */
/* .param p1, "b2" # Lcom/wiyun/engine/chipmunk/Body; */
/* .param p2, "pivotX" # F */
/* .param p3, "pivotY" # F */
/* .prologue */
/* .line 44 */
/* new-instance v0, Lcom/wiyun/engine/chipmunk/PivotJoint; */
/* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/chipmunk/PivotJoint;-><init>(Lcom/wiyun/engine/chipmunk/Body;Lcom/wiyun/engine/chipmunk/Body;FF)V */
} // .end method
public static com.wiyun.engine.chipmunk.PivotJoint make ( com.wiyun.engine.chipmunk.Body p0, com.wiyun.engine.chipmunk.Body p1, Float p2, Float p3, Float p4, Float p5 ) {
/* .locals 7 */
/* .param p0, "b1" # Lcom/wiyun/engine/chipmunk/Body; */
/* .param p1, "b2" # Lcom/wiyun/engine/chipmunk/Body; */
/* .param p2, "anchor1X" # F */
/* .param p3, "anchor1Y" # F */
/* .param p4, "anchor2X" # F */
/* .param p5, "anchor2Y" # F */
/* .prologue */
/* .line 59 */
/* new-instance v0, Lcom/wiyun/engine/chipmunk/PivotJoint; */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* move v6, p5 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/chipmunk/PivotJoint;-><init>(Lcom/wiyun/engine/chipmunk/Body;Lcom/wiyun/engine/chipmunk/Body;FFFF)V */
} // .end method
public static com.wiyun.engine.chipmunk.PivotJoint make ( com.wiyun.engine.chipmunk.Body p0, com.wiyun.engine.chipmunk.Body p1, com.wiyun.engine.types.WYPoint p2 ) {
/* .locals 3 */
/* .param p0, "b1" # Lcom/wiyun/engine/chipmunk/Body; */
/* .param p1, "b2" # Lcom/wiyun/engine/chipmunk/Body; */
/* .param p2, "pivot" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 31 */
/* new-instance v0, Lcom/wiyun/engine/chipmunk/PivotJoint; */
/* iget v1, p2, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v2, p2, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* invoke-direct {v0, p0, p1, v1, v2}, Lcom/wiyun/engine/chipmunk/PivotJoint;-><init>(Lcom/wiyun/engine/chipmunk/Body;Lcom/wiyun/engine/chipmunk/Body;FF)V */
} // .end method
public static com.wiyun.engine.chipmunk.PivotJoint make ( com.wiyun.engine.chipmunk.Body p0, com.wiyun.engine.chipmunk.Body p1, com.wiyun.engine.types.WYPoint p2, com.wiyun.engine.types.WYPoint p3 ) {
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
/* invoke-static/range {v0 ..v5}, Lcom/wiyun/engine/chipmunk/PivotJoint;->make(Lcom/wiyun/engine/chipmunk/Body;Lcom/wiyun/engine/chipmunk/Body;FFFF)Lcom/wiyun/engine/chipmunk/PivotJoint; */
} // .end method
/* # virtual methods */
public com.wiyun.engine.types.WYPoint getAnchor1 ( ) {
/* .locals 2 */
/* .prologue */
/* .line 138 */
v0 = (( com.wiyun.engine.chipmunk.PivotJoint ) p0 ).getAnchor1X ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/PivotJoint;->getAnchor1X()F
v1 = (( com.wiyun.engine.chipmunk.PivotJoint ) p0 ).getAnchor1Y ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/PivotJoint;->getAnchor1Y()F
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public native Float getAnchor1X ( ) {
} // .end method
public native Float getAnchor1Y ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getAnchor2 ( ) {
/* .locals 2 */
/* .prologue */
/* .line 161 */
v0 = (( com.wiyun.engine.chipmunk.PivotJoint ) p0 ).getAnchor2X ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/PivotJoint;->getAnchor2X()F
v1 = (( com.wiyun.engine.chipmunk.PivotJoint ) p0 ).getAnchor2Y ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/PivotJoint;->getAnchor2Y()F
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public native Float getAnchor2X ( ) {
} // .end method
public native Float getAnchor2Y ( ) {
} // .end method
public native void setAnchor1 ( Float p0, Float p1 ) {
} // .end method
public void setAnchor1 ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "p" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 170 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.chipmunk.PivotJoint ) p0 ).setAnchor1 ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/chipmunk/PivotJoint;->setAnchor1(FF)V
/* .line 171 */
return;
} // .end method
public native void setAnchor2 ( Float p0, Float p1 ) {
} // .end method
public void setAnchor2 ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "p" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 179 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.chipmunk.PivotJoint ) p0 ).setAnchor2 ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/chipmunk/PivotJoint;->setAnchor2(FF)V
/* .line 180 */
return;
} // .end method
