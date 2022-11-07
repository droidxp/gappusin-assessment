public class com.wiyun.engine.chipmunk.RatchetJoint extends com.wiyun.engine.chipmunk.Constraint {
	 /* .source "RatchetJoint.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.chipmunk.RatchetJoint ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 17 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/chipmunk/Constraint;-><init>(I)V */
		 /* .line 18 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.chipmunk.RatchetJoint ( ) {
		 /* .locals 0 */
		 /* .param p1, "b1" # Lcom/wiyun/engine/chipmunk/Body; */
		 /* .param p2, "b2" # Lcom/wiyun/engine/chipmunk/Body; */
		 /* .param p3, "phase" # F */
		 /* .param p4, "ratchet" # F */
		 /* .prologue */
		 /* .line 8 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/chipmunk/Constraint;-><init>()V */
		 /* .line 9 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/chipmunk/RatchetJoint;->init(Lcom/wiyun/engine/chipmunk/Body;Lcom/wiyun/engine/chipmunk/Body;FF)V */
		 /* .line 10 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.chipmunk.Constraint from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.chipmunk.RatchetJoint .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.chipmunk.RatchetJoint from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 13 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/chipmunk/RatchetJoint; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/chipmunk/RatchetJoint;-><init>(I)V */
} // .end method
private native void init ( com.wiyun.engine.chipmunk.Body p0, com.wiyun.engine.chipmunk.Body p1, Float p2, Float p3 ) {
} // .end method
public static com.wiyun.engine.chipmunk.RatchetJoint make ( com.wiyun.engine.chipmunk.Body p0, com.wiyun.engine.chipmunk.Body p1, Float p2, Float p3 ) {
/* .locals 1 */
/* .param p0, "b1" # Lcom/wiyun/engine/chipmunk/Body; */
/* .param p1, "b2" # Lcom/wiyun/engine/chipmunk/Body; */
/* .param p2, "phase" # F */
/* .param p3, "ratchet" # F */
/* .prologue */
/* .line 5 */
/* new-instance v0, Lcom/wiyun/engine/chipmunk/RatchetJoint; */
/* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/chipmunk/RatchetJoint;-><init>(Lcom/wiyun/engine/chipmunk/Body;Lcom/wiyun/engine/chipmunk/Body;FF)V */
} // .end method
/* # virtual methods */
public native Float getAngle ( ) {
} // .end method
public native Float getPhase ( ) {
} // .end method
public native Float getRatchet ( ) {
} // .end method
public native void setAngle ( Float p0 ) {
} // .end method
public native void setPhase ( Float p0 ) {
} // .end method
public native void setRatchet ( Float p0 ) {
} // .end method
