public class com.wiyun.engine.actions.ease.EaseElasticIn extends com.wiyun.engine.actions.ease.EaseElastic {
	 /* # direct methods */
	 private com.wiyun.engine.actions.ease.EaseElasticIn ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/actions/ease/EaseElastic;-><init>(B)V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0, p1}, Lcom/wiyun/engine/actions/ease/EaseElasticIn;->nativeInit(Lcom/wiyun/engine/actions/IntervalAction;F)V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.ease.EaseElasticIn ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/ease/EaseElastic;-><init>()V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.ease.EaseElasticIn ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/actions/ease/EaseElastic;-><init>(B)V */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/actions/ease/EaseElasticIn;->nativeInit(Lcom/wiyun/engine/actions/IntervalAction;F)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.ease.EaseElasticIn .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.ease.EaseElasticIn from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseElasticIn; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ease/EaseElasticIn;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.ease.EaseElasticIn make ( Float p0 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseElasticIn; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ease/EaseElasticIn;-><init>(F)V */
} // .end method
public static com.wiyun.engine.actions.ease.EaseElasticIn make ( com.wiyun.engine.actions.IntervalAction p0 ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseElasticIn; */
/* const v1, 0x3e99999a # 0.3f */
/* invoke-direct {v0, p0, v1}, Lcom/wiyun/engine/actions/ease/EaseElasticIn;-><init>(Lcom/wiyun/engine/actions/IntervalAction;F)V */
} // .end method
public static com.wiyun.engine.actions.ease.EaseElasticIn make ( com.wiyun.engine.actions.IntervalAction p0, Float p1 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseElasticIn; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/actions/ease/EaseElasticIn;-><init>(Lcom/wiyun/engine/actions/IntervalAction;F)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.actions.IntervalAction p0, Float p1 ) {
} // .end method
/* # virtual methods */
public final com.wiyun.engine.actions.ease.EaseAction a ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseElasticIn; */
v1 = (( com.wiyun.engine.actions.ease.EaseElasticIn ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseElasticIn;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ease/EaseElasticIn;-><init>(I)V */
} // .end method
public final com.wiyun.engine.actions.ease.EaseAction b ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseElasticOut; */
v1 = (( com.wiyun.engine.actions.ease.EaseElasticIn ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseElasticIn;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ease/EaseElasticOut;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.ease.EaseElasticIn ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseElasticIn;->a()Lcom/wiyun/engine/actions/ease/EaseAction;
} // .end method
