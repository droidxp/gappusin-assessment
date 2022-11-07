public abstract class com.wiyun.engine.box2d.dynamics.joints.JointDef extends com.wiyun.engine.BaseObject {
	 /* .source "JointDef.java" */
	 /* # static fields */
	 public static final Integer TYPE_DISTANCE;
	 public static final Integer TYPE_FRICTION;
	 public static final Integer TYPE_GEAR;
	 public static final Integer TYPE_LINE;
	 public static final Integer TYPE_MOUSE;
	 public static final Integer TYPE_PRISMATIC;
	 public static final Integer TYPE_PULLEY;
	 public static final Integer TYPE_REVOLUTE;
	 public static final Integer TYPE_ROPE;
	 public static final Integer TYPE_UNKNOWN;
	 public static final Integer TYPE_WELD;
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.joints.JointDef ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseObject;-><init>()V */
		 /* .line 20 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.joints.JointDef ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseObject;-><init>(I)V */
		 /* .line 24 */
		 return;
	 } // .end method
	 private native Integer nativeGetBodyA ( ) {
	 } // .end method
	 private native Integer nativeGetBodyB ( ) {
	 } // .end method
	 /* # virtual methods */
	 public native void destroy ( ) {
	 } // .end method
	 public com.wiyun.engine.box2d.dynamics.Body getBodyA ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 72 */
		 v0 = 		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/JointDef;->nativeGetBodyA()I */
		 com.wiyun.engine.box2d.dynamics.Body .from ( v0 );
	 } // .end method
	 public com.wiyun.engine.box2d.dynamics.Body getBodyB ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 83 */
		 v0 = 		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/JointDef;->nativeGetBodyB()I */
		 com.wiyun.engine.box2d.dynamics.Body .from ( v0 );
	 } // .end method
	 public native Integer getType ( ) {
	 } // .end method
	 public native Boolean isCollideConnected ( ) {
	 } // .end method
	 public native void setBodyA ( com.wiyun.engine.box2d.dynamics.Body p0 ) {
	 } // .end method
	 public native void setBodyB ( com.wiyun.engine.box2d.dynamics.Body p0 ) {
	 } // .end method
	 public native void setCollideConnected ( Boolean p0 ) {
	 } // .end method
