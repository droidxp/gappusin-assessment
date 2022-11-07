public class com.wiyun.engine.actions.CallFunc extends com.wiyun.engine.actions.InstantAction {
	 /* .source "CallFunc.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.CallFunc ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 64 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/InstantAction;-><init>(I)V */
		 /* .line 65 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.CallFunc ( ) {
		 /* .locals 0 */
		 /* .param p1, "selector" # Lcom/wiyun/engine/utils/TargetSelector; */
		 /* .prologue */
		 /* .line 53 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/InstantAction;-><init>()V */
		 /* .line 54 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/CallFunc;->nativeInit(Lcom/wiyun/engine/utils/TargetSelector;)V */
		 /* .line 55 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.CallFunc .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.CallFunc from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 60 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/CallFunc; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/CallFunc;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.CallFunc make ( com.wiyun.engine.utils.TargetSelector p0 ) {
/* .locals 1 */
/* .param p0, "selector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
/* .line 50 */
/* new-instance v0, Lcom/wiyun/engine/actions/CallFunc; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/CallFunc;-><init>(Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.actions.CallFunc make ( java.lang.Object p0, java.lang.String p1 ) {
/* .locals 3 */
/* .param p0, "target" # Ljava/lang/Object; */
/* .param p1, "selector" # Ljava/lang/String; */
/* .prologue */
/* .line 32 */
/* new-instance v0, Lcom/wiyun/engine/actions/CallFunc; */
/* new-instance v1, Lcom/wiyun/engine/utils/TargetSelector; */
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v1, p0, p1, v2}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/CallFunc;-><init>(Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.utils.TargetSelector p0 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.CallFunc copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 69 */
/* new-instance v0, Lcom/wiyun/engine/actions/CallFunc; */
v1 = (( com.wiyun.engine.actions.CallFunc ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/CallFunc;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/CallFunc;-><init>(I)V */
} // .end method
public com.wiyun.engine.actions.InstantAction copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.CallFunc ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/CallFunc;->copy()Lcom/wiyun/engine/actions/CallFunc;
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.CallFunc ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/CallFunc;->copy()Lcom/wiyun/engine/actions/CallFunc;
} // .end method
public com.wiyun.engine.actions.InstantAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 81 */
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
final String v1 = "CallFunc doesn\'t have reverse action"; // const-string v1, "CallFunc doesn\'t have reverse action"
/* invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
