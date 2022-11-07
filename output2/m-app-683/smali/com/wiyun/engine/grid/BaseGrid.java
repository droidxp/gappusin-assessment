public class com.wiyun.engine.grid.BaseGrid extends com.wiyun.engine.BaseWYObject {
	 /* .source "BaseGrid.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.grid.BaseGrid ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 16 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.grid.BaseGrid ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 /* .line 20 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.grid.BaseGrid from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 12 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/grid/BaseGrid; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/grid/BaseGrid;-><init>(I)V */
} // .end method
private native void nativeAfterDraw ( Integer p0 ) {
} // .end method
/* # virtual methods */
public native void addReuseCount ( Integer p0 ) {
} // .end method
public void afterDraw ( com.wiyun.engine.nodes.Node p0 ) {
/* .locals 1 */
/* .param p1, "target" # Lcom/wiyun/engine/nodes/Node; */
/* .prologue */
/* .line 37 */
v0 = (( com.wiyun.engine.nodes.Node ) p1 ).getPointer ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/nodes/Node;->getPointer()I
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/grid/BaseGrid;->nativeAfterDraw(I)V */
/* .line 38 */
return;
} // .end method
public native void beforeDraw ( ) {
} // .end method
public native void blit ( ) {
} // .end method
public native Integer getGridHeight ( ) {
} // .end method
public native Integer getGridWidth ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getStep ( ) {
/* .locals 2 */
/* .prologue */
/* .line 28 */
v0 = (( com.wiyun.engine.grid.BaseGrid ) p0 ).getStepWidth ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/grid/BaseGrid;->getStepWidth()I
/* int-to-float v0, v0 */
v1 = (( com.wiyun.engine.grid.BaseGrid ) p0 ).getStepHeight ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/grid/BaseGrid;->getStepHeight()I
/* int-to-float v1, v1 */
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public native Integer getStepHeight ( ) {
} // .end method
public native Integer getStepWidth ( ) {
} // .end method
public native Boolean isActive ( ) {
} // .end method
public native Boolean isReuseGrid ( ) {
} // .end method
public native void reuse ( ) {
} // .end method
public native void setActive ( Boolean p0 ) {
} // .end method
