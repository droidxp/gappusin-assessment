public class com.wiyun.engine.actions.ease.EaseBounceOut extends com.wiyun.engine.actions.ease.EaseBounce {
	 /* .source "EaseBounceOut.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.ease.EaseBounceOut ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 14 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/ease/EaseBounce;-><init>()V */
		 /* .line 15 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/actions/ease/EaseBounceOut;->nativeInit(Lcom/wiyun/engine/actions/IntervalAction;)V */
		 /* .line 16 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.ease.EaseBounceOut ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 33 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/ease/EaseBounce;-><init>(I)V */
		 /* .line 34 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.ease.EaseBounceOut ( ) {
		 /* .locals 0 */
		 /* .param p1, "action" # Lcom/wiyun/engine/actions/IntervalAction; */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/ease/EaseBounce;-><init>()V */
		 /* .line 19 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/ease/EaseBounceOut;->nativeInit(Lcom/wiyun/engine/actions/IntervalAction;)V */
		 /* .line 20 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.ease.EaseBounceOut .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.ease.EaseBounceOut from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 29 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseBounceOut; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ease/EaseBounceOut;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.ease.EaseBounceOut make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 11 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseBounceOut; */
/* invoke-direct {v0}, Lcom/wiyun/engine/actions/ease/EaseBounceOut;-><init>()V */
} // .end method
public static com.wiyun.engine.actions.ease.EaseBounceOut make ( com.wiyun.engine.actions.IntervalAction p0 ) {
/* .locals 1 */
/* .param p0, "action" # Lcom/wiyun/engine/actions/IntervalAction; */
/* .prologue */
/* .line 7 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseBounceOut; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ease/EaseBounceOut;-><init>(Lcom/wiyun/engine/actions/IntervalAction;)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.actions.IntervalAction p0 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.ease.EaseAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 40 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseBounceOut; */
v1 = (( com.wiyun.engine.actions.ease.EaseBounceOut ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseBounceOut;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ease/EaseBounceOut;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.ease.EaseBounceOut ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseBounceOut;->copy()Lcom/wiyun/engine/actions/ease/EaseAction;
} // .end method
public com.wiyun.engine.actions.ease.EaseAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 45 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseBounceIn; */
v1 = (( com.wiyun.engine.actions.ease.EaseBounceOut ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseBounceOut;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ease/EaseBounceIn;-><init>(I)V */
} // .end method
