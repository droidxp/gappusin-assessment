public class com.wiyun.engine.chipmunk.DampedRotarySpring extends com.wiyun.engine.chipmunk.Constraint {
	 /* .source "DampedRotarySpring.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/wiyun/engine/chipmunk/DampedRotarySpring$ITorqueUpdater; */
	 /* } */
} // .end annotation
/* # direct methods */
protected com.wiyun.engine.chipmunk.DampedRotarySpring ( ) {
	 /* .locals 0 */
	 /* .param p1, "pointer" # I */
	 /* .prologue */
	 /* .line 31 */
	 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/chipmunk/Constraint;-><init>(I)V */
	 /* .line 32 */
	 return;
} // .end method
protected com.wiyun.engine.chipmunk.DampedRotarySpring ( ) {
	 /* .locals 0 */
	 /* .param p1, "b1" # Lcom/wiyun/engine/chipmunk/Body; */
	 /* .param p2, "b2" # Lcom/wiyun/engine/chipmunk/Body; */
	 /* .param p3, "restAngle" # F */
	 /* .param p4, "stiffness" # F */
	 /* .param p5, "damping" # F */
	 /* .prologue */
	 /* .line 34 */
	 /* invoke-direct {p0}, Lcom/wiyun/engine/chipmunk/Constraint;-><init>()V */
	 /* .line 35 */
	 /* invoke-direct/range {p0 ..p5}, Lcom/wiyun/engine/chipmunk/DampedRotarySpring;->init(Lcom/wiyun/engine/chipmunk/Body;Lcom/wiyun/engine/chipmunk/Body;FFF)V */
	 /* .line 36 */
	 return;
} // .end method
public static com.wiyun.engine.chipmunk.Constraint from ( Integer p0 ) { //bridge//synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 1 */
	 com.wiyun.engine.chipmunk.DampedRotarySpring .from ( p0 );
} // .end method
public static com.wiyun.engine.chipmunk.DampedRotarySpring from ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "pointer" # I */
	 /* .prologue */
	 /* .line 27 */
	 /* if-nez p0, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/chipmunk/DampedRotarySpring; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/chipmunk/DampedRotarySpring;-><init>(I)V */
} // .end method
private native void init ( com.wiyun.engine.chipmunk.Body p0, com.wiyun.engine.chipmunk.Body p1, Float p2, Float p3, Float p4 ) {
} // .end method
public static com.wiyun.engine.chipmunk.DampedRotarySpring make ( com.wiyun.engine.chipmunk.Body p0, com.wiyun.engine.chipmunk.Body p1, Float p2, Float p3, Float p4 ) {
/* .locals 6 */
/* .param p0, "b1" # Lcom/wiyun/engine/chipmunk/Body; */
/* .param p1, "b2" # Lcom/wiyun/engine/chipmunk/Body; */
/* .param p2, "restAngle" # F */
/* .param p3, "stiffness" # F */
/* .param p4, "damping" # F */
/* .prologue */
/* .line 23 */
/* new-instance v0, Lcom/wiyun/engine/chipmunk/DampedRotarySpring; */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/chipmunk/DampedRotarySpring;-><init>(Lcom/wiyun/engine/chipmunk/Body;Lcom/wiyun/engine/chipmunk/Body;FFF)V */
} // .end method
/* # virtual methods */
public native Float getDamping ( ) {
} // .end method
public native Float getRestAngle ( ) {
} // .end method
public native Float getStiffness ( ) {
} // .end method
public native void setDamping ( Float p0 ) {
} // .end method
public native void setRestAngle ( Float p0 ) {
} // .end method
public native void setStiffness ( Float p0 ) {
} // .end method
public native void setTorqueUpdater ( com.wiyun.engine.chipmunk.DampedRotarySpring$ITorqueUpdater p0 ) {
} // .end method
