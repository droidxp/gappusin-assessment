public class com.wiyun.engine.chipmunk.SimpleMotor extends com.wiyun.engine.chipmunk.Constraint {
	 /* .source "SimpleMotor.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.chipmunk.SimpleMotor ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 35 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/chipmunk/Constraint;-><init>(I)V */
		 /* .line 36 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.chipmunk.SimpleMotor ( ) {
		 /* .locals 0 */
		 /* .param p1, "b1" # Lcom/wiyun/engine/chipmunk/Body; */
		 /* .param p2, "b2" # Lcom/wiyun/engine/chipmunk/Body; */
		 /* .param p3, "rate" # F */
		 /* .prologue */
		 /* .line 26 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/chipmunk/Constraint;-><init>()V */
		 /* .line 27 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/chipmunk/SimpleMotor;->init(Lcom/wiyun/engine/chipmunk/Body;Lcom/wiyun/engine/chipmunk/Body;F)V */
		 /* .line 28 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.chipmunk.Constraint from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.chipmunk.SimpleMotor .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.chipmunk.SimpleMotor from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 31 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/chipmunk/SimpleMotor; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/chipmunk/SimpleMotor;-><init>(I)V */
} // .end method
private native void init ( com.wiyun.engine.chipmunk.Body p0, com.wiyun.engine.chipmunk.Body p1, Float p2 ) {
} // .end method
public static com.wiyun.engine.chipmunk.SimpleMotor make ( com.wiyun.engine.chipmunk.Body p0, com.wiyun.engine.chipmunk.Body p1, Float p2 ) {
/* .locals 1 */
/* .param p0, "b1" # Lcom/wiyun/engine/chipmunk/Body; */
/* .param p1, "b2" # Lcom/wiyun/engine/chipmunk/Body; */
/* .param p2, "rate" # F */
/* .prologue */
/* .line 16 */
/* new-instance v0, Lcom/wiyun/engine/chipmunk/SimpleMotor; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/chipmunk/SimpleMotor;-><init>(Lcom/wiyun/engine/chipmunk/Body;Lcom/wiyun/engine/chipmunk/Body;F)V */
} // .end method
/* # virtual methods */
public native Float getRate ( ) {
} // .end method
public native void setRate ( Float p0 ) {
} // .end method
