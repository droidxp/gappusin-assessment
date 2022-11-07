public class com.wiyun.engine.nodes.Timer extends com.wiyun.engine.BaseWYObject {
	 /* .source "Timer.java" */
	 /* # direct methods */
	 public com.wiyun.engine.nodes.Timer ( ) {
		 /* .locals 0 */
		 /* .param p1, "selector" # Lcom/wiyun/engine/utils/TargetSelector; */
		 /* .param p2, "interval" # F */
		 /* .prologue */
		 /* .line 40 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 41 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/nodes/Timer;->nativeInit(Lcom/wiyun/engine/utils/TargetSelector;F)V */
		 /* .line 42 */
		 return;
	 } // .end method
	 public com.wiyun.engine.nodes.Timer ( ) {
		 /* .locals 0 */
		 /* .param p1, "selector" # Lcom/wiyun/engine/utils/TargetSelector; */
		 /* .param p2, "frame" # I */
		 /* .prologue */
		 /* .line 51 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 52 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/nodes/Timer;->nativeInit(Lcom/wiyun/engine/utils/TargetSelector;I)V */
		 /* .line 53 */
		 return;
	 } // .end method
	 public com.wiyun.engine.nodes.Timer ( ) {
		 /* .locals 1 */
		 /* .param p1, "target" # Ljava/lang/Object; */
		 /* .param p2, "selector" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 18 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, p2, v0}, Lcom/wiyun/engine/nodes/Timer;-><init>(Ljava/lang/Object;Ljava/lang/String;F)V */
		 /* .line 19 */
		 return;
	 } // .end method
	 public com.wiyun.engine.nodes.Timer ( ) {
		 /* .locals 4 */
		 /* .param p1, "target" # Ljava/lang/Object; */
		 /* .param p2, "selector" # Ljava/lang/String; */
		 /* .param p3, "interval" # F */
		 /* .prologue */
		 /* .line 30 */
		 /* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
		 int v1 = 1; // const/4 v1, 0x1
		 /* new-array v1, v1, [Ljava/lang/Object; */
		 int v2 = 0; // const/4 v2, 0x0
		 int v3 = 0; // const/4 v3, 0x0
		 java.lang.Float .valueOf ( v3 );
		 /* aput-object v3, v1, v2 */
		 /* invoke-direct {v0, p1, p2, v1}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
		 /* invoke-direct {p0, v0, p3}, Lcom/wiyun/engine/nodes/Timer;-><init>(Lcom/wiyun/engine/utils/TargetSelector;F)V */
		 /* .line 31 */
		 return;
	 } // .end method
	 private native void nativeInit ( com.wiyun.engine.utils.TargetSelector p0, Float p1 ) {
	 } // .end method
	 private native void nativeInit ( com.wiyun.engine.utils.TargetSelector p0, Integer p1 ) {
	 } // .end method
	 /* # virtual methods */
	 public native void fire ( Float p0 ) {
	 } // .end method
	 public native Integer getCurrentInvocationCount ( ) {
	 } // .end method
	 public native Integer getFrame ( ) {
	 } // .end method
	 public native Float getInterval ( ) {
	 } // .end method
	 public native Integer getMaxInvocation ( ) {
	 } // .end method
	 public native Boolean isOneShot ( ) {
	 } // .end method
	 public native void setFrame ( Integer p0 ) {
	 } // .end method
	 public native void setInterval ( Float p0 ) {
	 } // .end method
	 public native void setMaxInvocation ( Integer p0 ) {
	 } // .end method
	 public native void setOneShot ( Boolean p0 ) {
	 } // .end method
