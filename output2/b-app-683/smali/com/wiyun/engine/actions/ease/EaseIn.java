public class com.wiyun.engine.actions.ease.EaseIn extends com.wiyun.engine.actions.ease.EaseRateAction {
	 /* .source "EaseIn.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.ease.EaseIn ( ) {
		 /* .locals 1 */
		 /* .param p1, "rate" # F */
		 /* .prologue */
		 /* .line 14 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/ease/EaseRateAction;-><init>()V */
		 /* .line 15 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0, p1}, Lcom/wiyun/engine/actions/ease/EaseIn;->nativeInit(Lcom/wiyun/engine/actions/IntervalAction;F)V */
		 /* .line 16 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.ease.EaseIn ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 35 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/ease/EaseRateAction;-><init>(I)V */
		 /* .line 36 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.ease.EaseIn ( ) {
		 /* .locals 0 */
		 /* .param p1, "action" # Lcom/wiyun/engine/actions/IntervalAction; */
		 /* .param p2, "rate" # F */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/ease/EaseRateAction;-><init>()V */
		 /* .line 19 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/actions/ease/EaseIn;->nativeInit(Lcom/wiyun/engine/actions/IntervalAction;F)V */
		 /* .line 20 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.ease.EaseIn .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.ease.EaseIn from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 31 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseIn; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ease/EaseIn;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.ease.EaseIn make ( Float p0 ) {
/* .locals 1 */
/* .param p0, "rate" # F */
/* .prologue */
/* .line 11 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseIn; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ease/EaseIn;-><init>(F)V */
} // .end method
public static com.wiyun.engine.actions.ease.EaseIn make ( com.wiyun.engine.actions.IntervalAction p0, Float p1 ) {
/* .locals 1 */
/* .param p0, "action" # Lcom/wiyun/engine/actions/IntervalAction; */
/* .param p1, "rate" # F */
/* .prologue */
/* .line 7 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseIn; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/actions/ease/EaseIn;-><init>(Lcom/wiyun/engine/actions/IntervalAction;F)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.actions.IntervalAction p0, Float p1 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.ease.EaseAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 40 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseIn; */
v1 = (( com.wiyun.engine.actions.ease.EaseIn ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseIn;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ease/EaseIn;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.ease.EaseIn ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseIn;->copy()Lcom/wiyun/engine/actions/ease/EaseAction;
} // .end method
public com.wiyun.engine.actions.ease.EaseAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 45 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseIn; */
v1 = (( com.wiyun.engine.actions.ease.EaseIn ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseIn;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ease/EaseIn;-><init>(I)V */
} // .end method
