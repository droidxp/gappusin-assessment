public class com.wiyun.engine.box2d.controllers.ControllerEdge extends com.wiyun.engine.BaseObject {
	 /* .source "ControllerEdge.java" */
	 /* # instance fields */
	 public Integer bodyPointer;
	 public Integer controllerPointer;
	 public Integer nextBodyEdgePointer;
	 public Integer nextControllerEdgePointer;
	 public Integer prevBodyEdgePoniter;
	 public Integer prevControllerEdgePointer;
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.controllers.ControllerEdge ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 13 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseObject;-><init>()V */
		 /* .line 14 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.controllers.ControllerEdge ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 17 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseObject;-><init>(I)V */
		 /* .line 18 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.controllers.ControllerEdge from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 10 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/controllers/ControllerEdge; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/controllers/ControllerEdge;-><init>(I)V */
} // .end method
