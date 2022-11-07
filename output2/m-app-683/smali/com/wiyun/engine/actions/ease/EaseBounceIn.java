public class com.wiyun.engine.actions.ease.EaseBounceIn extends com.wiyun.engine.actions.ease.EaseBounce {
	 /* .source "EaseBounceIn.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.ease.EaseBounceIn ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 14 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/ease/EaseBounce;-><init>()V */
		 /* .line 15 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/actions/ease/EaseBounceIn;->nativeInit(Lcom/wiyun/engine/actions/IntervalAction;)V */
		 /* .line 16 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.ease.EaseBounceIn ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 33 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/ease/EaseBounce;-><init>(I)V */
		 /* .line 34 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.ease.EaseBounceIn ( ) {
		 /* .locals 0 */
		 /* .param p1, "action" # Lcom/wiyun/engine/actions/IntervalAction; */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/ease/EaseBounce;-><init>()V */
		 /* .line 19 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/ease/EaseBounceIn;->nativeInit(Lcom/wiyun/engine/actions/IntervalAction;)V */
		 /* .line 20 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.ease.EaseBounceIn .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.ease.EaseBounceIn from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 29 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseBounceIn; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ease/EaseBounceIn;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.ease.EaseBounceIn make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 7 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseBounceIn; */
/* invoke-direct {v0}, Lcom/wiyun/engine/actions/ease/EaseBounceIn;-><init>()V */
} // .end method
public static com.wiyun.engine.actions.ease.EaseBounceIn make ( com.wiyun.engine.actions.IntervalAction p0 ) {
/* .locals 1 */
/* .param p0, "action" # Lcom/wiyun/engine/actions/IntervalAction; */
/* .prologue */
/* .line 11 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseBounceIn; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ease/EaseBounceIn;-><init>(Lcom/wiyun/engine/actions/IntervalAction;)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.actions.IntervalAction p0 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.ease.EaseAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 40 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseBounceIn; */
v1 = (( com.wiyun.engine.actions.ease.EaseBounceIn ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseBounceIn;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ease/EaseBounceIn;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.ease.EaseBounceIn ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseBounceIn;->copy()Lcom/wiyun/engine/actions/ease/EaseAction;
} // .end method
public com.wiyun.engine.actions.ease.EaseAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 45 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseBounceOut; */
v1 = (( com.wiyun.engine.actions.ease.EaseBounceIn ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseBounceIn;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ease/EaseBounceOut;-><init>(I)V */
} // .end method
