public class com.wiyun.engine.actions.Spawn extends com.wiyun.engine.actions.IntervalAction {
	 /* # direct methods */
	 private com.wiyun.engine.actions.Spawn ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.Spawn ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/actions/Spawn;->nativeInit(Lcom/wiyun/engine/actions/FiniteTimeAction;Lcom/wiyun/engine/actions/FiniteTimeAction;)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.Spawn .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.Spawn from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/Spawn; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/Spawn;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.IntervalAction make ( com.wiyun.engine.actions.FiniteTimeAction p0, com.wiyun.engine.actions.FiniteTimeAction...p1 ) {
/* .locals 5 */
if ( p0 != null) { // if-eqz p0, :cond_2
	 /* array-length v2, p1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* move v1, v0 */
	 /* move-object v0, p0 */
} // :goto_0
/* if-lt v1, v2, :cond_0 */
} // :goto_1
/* check-cast v0, Lcom/wiyun/engine/actions/IntervalAction; */
} // :cond_0
/* aget-object v3, p1, v1 */
/* instance-of v4, v0, Lcom/wiyun/engine/actions/Spawn; */
if ( v4 != null) { // if-eqz v4, :cond_1
(( com.wiyun.engine.actions.FiniteTimeAction ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/FiniteTimeAction;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
} // :cond_1
/* new-instance p0, Lcom/wiyun/engine/actions/Spawn; */
/* invoke-direct {p0, v0, v3}, Lcom/wiyun/engine/actions/Spawn;-><init>(Lcom/wiyun/engine/actions/FiniteTimeAction;Lcom/wiyun/engine/actions/FiniteTimeAction;)V */
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
/* move-object v0, p0 */
} // :cond_2
/* move-object v0, p0 */
} // .end method
public static com.wiyun.engine.actions.Spawn make ( com.wiyun.engine.actions.FiniteTimeAction p0, com.wiyun.engine.actions.FiniteTimeAction p1 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/actions/Spawn; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/actions/Spawn;-><init>(Lcom/wiyun/engine/actions/FiniteTimeAction;Lcom/wiyun/engine/actions/FiniteTimeAction;)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.actions.FiniteTimeAction p0, com.wiyun.engine.actions.FiniteTimeAction p1 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/Spawn; */
v1 = (( com.wiyun.engine.actions.Spawn ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Spawn;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/Spawn;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.Spawn ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Spawn;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/Spawn; */
v1 = (( com.wiyun.engine.actions.Spawn ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Spawn;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/Spawn;-><init>(I)V */
} // .end method
