public class com.wiyun.engine.transitions.RadialCWTransition extends com.wiyun.engine.transitions.RadialCCWTransition {
	 /* .source "RadialCWTransition.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.transitions.RadialCWTransition ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
		 /* .prologue */
		 /* .line 20 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/transitions/RadialCCWTransition;-><init>()V */
		 /* .line 21 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/transitions/RadialCWTransition;->nativeInit(FLcom/wiyun/engine/nodes/Scene;)V */
		 /* .line 22 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.transitions.RadialCWTransition ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 35 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/transitions/RadialCCWTransition;-><init>(I)V */
		 /* .line 36 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.transitions.RadialCCWTransition from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.transitions.RadialCWTransition .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.transitions.RadialCWTransition from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 31 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/transitions/RadialCWTransition; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/transitions/RadialCWTransition;-><init>(I)V */
} // .end method
public static com.wiyun.engine.transitions.RadialCCWTransition make ( Float p0, com.wiyun.engine.nodes.Scene p1 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.transitions.RadialCWTransition .make ( p0,p1 );
} // .end method
public static com.wiyun.engine.transitions.RadialCWTransition make ( Float p0, com.wiyun.engine.nodes.Scene p1 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
/* .prologue */
/* .line 17 */
/* new-instance v0, Lcom/wiyun/engine/transitions/RadialCWTransition; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/transitions/RadialCWTransition;-><init>(FLcom/wiyun/engine/nodes/Scene;)V */
} // .end method
private native void nativeInit ( Float p0, com.wiyun.engine.nodes.Scene p1 ) {
} // .end method
