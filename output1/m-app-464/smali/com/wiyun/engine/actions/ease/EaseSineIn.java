public class com.wiyun.engine.actions.ease.EaseSineIn extends com.wiyun.engine.actions.ease.EaseAction {
	 /* # direct methods */
	 protected com.wiyun.engine.actions.ease.EaseSineIn ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/ease/EaseAction;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/actions/ease/EaseSineIn;->nativeInit(Lcom/wiyun/engine/actions/IntervalAction;)V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.ease.EaseSineIn ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/ease/EaseAction;-><init>(I)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.ease.EaseSineIn ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/ease/EaseAction;-><init>()V */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/ease/EaseSineIn;->nativeInit(Lcom/wiyun/engine/actions/IntervalAction;)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.ease.EaseSineIn .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.ease.EaseSineIn from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseSineIn; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ease/EaseSineIn;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.ease.EaseSineIn make ( ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseSineIn; */
/* invoke-direct {v0}, Lcom/wiyun/engine/actions/ease/EaseSineIn;-><init>()V */
} // .end method
public static com.wiyun.engine.actions.ease.EaseSineIn make ( com.wiyun.engine.actions.IntervalAction p0 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseSineIn; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ease/EaseSineIn;-><init>(Lcom/wiyun/engine/actions/IntervalAction;)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.actions.IntervalAction p0 ) {
} // .end method
/* # virtual methods */
public final com.wiyun.engine.actions.ease.EaseAction a ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseSineIn; */
v1 = (( com.wiyun.engine.actions.ease.EaseSineIn ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseSineIn;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ease/EaseSineIn;-><init>(I)V */
} // .end method
public final com.wiyun.engine.actions.ease.EaseAction b ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseSineOut; */
v1 = (( com.wiyun.engine.actions.ease.EaseSineIn ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseSineIn;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ease/EaseSineOut;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.ease.EaseSineIn ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseSineIn;->a()Lcom/wiyun/engine/actions/ease/EaseAction;
} // .end method
