public class com.wiyun.engine.box2d.collision.MassData {
	 /* .source "MassData.java" */
	 /* # instance fields */
	 public Float I;
	 public com.wiyun.engine.types.WYPoint center;
	 public Float mass;
	 /* # direct methods */
	 public com.wiyun.engine.box2d.collision.MassData ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 8 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 17 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 this.center = v0;
		 /* .line 8 */
		 return;
	 } // .end method
