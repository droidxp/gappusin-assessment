public class com.wiyun.engine.actions.ease.EaseElasticInOut extends com.wiyun.engine.actions.ease.EaseElastic {
	 /* .source "EaseElasticInOut.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.ease.EaseElasticInOut ( ) {
		 /* .locals 1 */
		 /* .param p1, "period" # F */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/ease/EaseElastic;-><init>()V */
		 /* .line 19 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0, p1}, Lcom/wiyun/engine/actions/ease/EaseElasticInOut;->nativeInit(Lcom/wiyun/engine/actions/IntervalAction;F)V */
		 /* .line 20 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.ease.EaseElasticInOut ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 37 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/ease/EaseElastic;-><init>(I)V */
		 /* .line 38 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.ease.EaseElasticInOut ( ) {
		 /* .locals 0 */
		 /* .param p1, "action" # Lcom/wiyun/engine/actions/IntervalAction; */
		 /* .param p2, "period" # F */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/ease/EaseElastic;-><init>()V */
		 /* .line 23 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/actions/ease/EaseElasticInOut;->nativeInit(Lcom/wiyun/engine/actions/IntervalAction;F)V */
		 /* .line 24 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.ease.EaseElasticInOut .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.ease.EaseElasticInOut from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 33 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseElasticInOut; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ease/EaseElasticInOut;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.ease.EaseElasticInOut make ( Float p0 ) {
/* .locals 1 */
/* .param p0, "period" # F */
/* .prologue */
/* .line 15 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseElasticInOut; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ease/EaseElasticInOut;-><init>(F)V */
} // .end method
public static com.wiyun.engine.actions.ease.EaseElasticInOut make ( com.wiyun.engine.actions.IntervalAction p0 ) {
/* .locals 2 */
/* .param p0, "action" # Lcom/wiyun/engine/actions/IntervalAction; */
/* .prologue */
/* .line 7 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseElasticInOut; */
/* const v1, 0x3e99999a # 0.3f */
/* invoke-direct {v0, p0, v1}, Lcom/wiyun/engine/actions/ease/EaseElasticInOut;-><init>(Lcom/wiyun/engine/actions/IntervalAction;F)V */
} // .end method
public static com.wiyun.engine.actions.ease.EaseElasticInOut make ( com.wiyun.engine.actions.IntervalAction p0, Float p1 ) {
/* .locals 1 */
/* .param p0, "action" # Lcom/wiyun/engine/actions/IntervalAction; */
/* .param p1, "period" # F */
/* .prologue */
/* .line 11 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseElasticInOut; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/actions/ease/EaseElasticInOut;-><init>(Lcom/wiyun/engine/actions/IntervalAction;F)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.actions.IntervalAction p0, Float p1 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.ease.EaseAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 44 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseElasticInOut; */
v1 = (( com.wiyun.engine.actions.ease.EaseElasticInOut ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseElasticInOut;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ease/EaseElasticInOut;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.ease.EaseElasticInOut ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseElasticInOut;->copy()Lcom/wiyun/engine/actions/ease/EaseAction;
} // .end method
public com.wiyun.engine.actions.ease.EaseAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 49 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseElasticInOut; */
v1 = (( com.wiyun.engine.actions.ease.EaseElasticInOut ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseElasticInOut;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ease/EaseElasticInOut;-><init>(I)V */
} // .end method
