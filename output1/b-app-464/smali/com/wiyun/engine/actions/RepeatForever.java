public class com.wiyun.engine.actions.RepeatForever extends com.wiyun.engine.actions.Action {
	 /* # direct methods */
	 private com.wiyun.engine.actions.RepeatForever ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/Action;-><init>(I)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.RepeatForever ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/Action;-><init>()V */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/RepeatForever;->nativeInit(Lcom/wiyun/engine/actions/FiniteTimeAction;)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.RepeatForever .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.RepeatForever from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/RepeatForever; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/RepeatForever;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.RepeatForever make ( com.wiyun.engine.actions.FiniteTimeAction p0 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/actions/RepeatForever; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/RepeatForever;-><init>(Lcom/wiyun/engine/actions/FiniteTimeAction;)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.actions.FiniteTimeAction p0 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.Action copy ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/RepeatForever; */
v1 = (( com.wiyun.engine.actions.RepeatForever ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/RepeatForever;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/RepeatForever;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.RepeatForever ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/RepeatForever;->copy()Lcom/wiyun/engine/actions/Action;
} // .end method
public com.wiyun.engine.actions.Action reverse ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/RepeatForever; */
v1 = (( com.wiyun.engine.actions.RepeatForever ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/RepeatForever;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/RepeatForever;-><init>(I)V */
} // .end method
