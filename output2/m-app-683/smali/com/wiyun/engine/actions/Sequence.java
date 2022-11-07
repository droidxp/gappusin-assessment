public class com.wiyun.engine.actions.Sequence extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "Sequence.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.Sequence ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 49 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 /* .line 50 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.Sequence ( ) {
		 /* .locals 0 */
		 /* .param p1, "one" # Lcom/wiyun/engine/actions/FiniteTimeAction; */
		 /* .param p2, "two" # Lcom/wiyun/engine/actions/FiniteTimeAction; */
		 /* .prologue */
		 /* .line 40 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 41 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/actions/Sequence;->nativeInit(Lcom/wiyun/engine/actions/FiniteTimeAction;Lcom/wiyun/engine/actions/FiniteTimeAction;)V */
		 /* .line 42 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.Sequence .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.Sequence from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 45 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/Sequence; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/Sequence;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.Sequence make ( com.wiyun.engine.actions.FiniteTimeAction p0, com.wiyun.engine.actions.FiniteTimeAction...p1 ) {
/* .locals 6 */
/* .param p0, "action1" # Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* .param p1, "actions" # [Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* .prologue */
/* .line 30 */
/* move-object v1, p0 */
/* .line 31 */
/* .local v1, "prev":Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* array-length v4, p1 */
int v3 = 0; // const/4 v3, 0x0
/* move-object v2, v1 */
} // .end local v1 # "prev":Lcom/wiyun/engine/actions/FiniteTimeAction;
/* .local v2, "prev":Lcom/wiyun/engine/actions/FiniteTimeAction; */
} // :goto_0
/* if-lt v3, v4, :cond_0 */
/* .line 37 */
/* check-cast v2, Lcom/wiyun/engine/actions/Sequence; */
} // .end local v2 # "prev":Lcom/wiyun/engine/actions/FiniteTimeAction;
/* .line 31 */
/* .restart local v2 # "prev":Lcom/wiyun/engine/actions/FiniteTimeAction; */
} // :cond_0
/* aget-object v0, p1, v3 */
/* .line 33 */
/* .local v0, "now":Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* instance-of v5, v2, Lcom/wiyun/engine/actions/Sequence; */
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 34 */
(( com.wiyun.engine.actions.FiniteTimeAction ) v2 ).autoRelease ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/actions/FiniteTimeAction;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* .line 35 */
} // :cond_1
/* new-instance v1, Lcom/wiyun/engine/actions/Sequence; */
/* invoke-direct {v1, v2, v0}, Lcom/wiyun/engine/actions/Sequence;-><init>(Lcom/wiyun/engine/actions/FiniteTimeAction;Lcom/wiyun/engine/actions/FiniteTimeAction;)V */
/* .line 31 */
} // .end local v2 # "prev":Lcom/wiyun/engine/actions/FiniteTimeAction;
/* .restart local v1 # "prev":Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* add-int/lit8 v3, v3, 0x1 */
/* move-object v2, v1 */
} // .end local v1 # "prev":Lcom/wiyun/engine/actions/FiniteTimeAction;
/* .restart local v2 # "prev":Lcom/wiyun/engine/actions/FiniteTimeAction; */
} // .end method
private native void nativeInit ( com.wiyun.engine.actions.FiniteTimeAction p0, com.wiyun.engine.actions.FiniteTimeAction p1 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 56 */
/* new-instance v0, Lcom/wiyun/engine/actions/Sequence; */
v1 = (( com.wiyun.engine.actions.Sequence ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Sequence;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/Sequence;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.Sequence ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Sequence;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 61 */
/* new-instance v0, Lcom/wiyun/engine/actions/Sequence; */
v1 = (( com.wiyun.engine.actions.Sequence ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Sequence;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/Sequence;-><init>(I)V */
} // .end method
