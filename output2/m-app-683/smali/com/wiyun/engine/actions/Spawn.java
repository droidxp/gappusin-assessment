public class com.wiyun.engine.actions.Spawn extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "Spawn.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.Spawn ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 64 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 /* .line 65 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.Spawn ( ) {
		 /* .locals 0 */
		 /* .param p1, "one" # Lcom/wiyun/engine/actions/FiniteTimeAction; */
		 /* .param p2, "two" # Lcom/wiyun/engine/actions/FiniteTimeAction; */
		 /* .prologue */
		 /* .line 55 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 56 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/actions/Spawn;->nativeInit(Lcom/wiyun/engine/actions/FiniteTimeAction;Lcom/wiyun/engine/actions/FiniteTimeAction;)V */
		 /* .line 57 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.Spawn .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.Spawn from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 60 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/Spawn; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/Spawn;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.IntervalAction make ( com.wiyun.engine.actions.FiniteTimeAction p0, com.wiyun.engine.actions.FiniteTimeAction...p1 ) {
/* .locals 6 */
/* .param p0, "action1" # Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* .param p1, "params" # [Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* .prologue */
/* .line 26 */
/* move-object v1, p0 */
/* .line 28 */
/* .local v1, "prev":Lcom/wiyun/engine/actions/FiniteTimeAction; */
if ( p0 != null) { // if-eqz p0, :cond_0
	 /* .line 29 */
	 /* array-length v4, p1 */
	 int v3 = 0; // const/4 v3, 0x0
	 /* move-object v2, v1 */
} // .end local v1 # "prev":Lcom/wiyun/engine/actions/FiniteTimeAction;
/* .local v2, "prev":Lcom/wiyun/engine/actions/FiniteTimeAction; */
} // :goto_0
/* if-lt v3, v4, :cond_1 */
/* move-object v1, v2 */
/* .line 35 */
} // .end local v2 # "prev":Lcom/wiyun/engine/actions/FiniteTimeAction;
/* .restart local v1 # "prev":Lcom/wiyun/engine/actions/FiniteTimeAction; */
} // :cond_0
/* check-cast v1, Lcom/wiyun/engine/actions/IntervalAction; */
} // .end local v1 # "prev":Lcom/wiyun/engine/actions/FiniteTimeAction;
/* .line 29 */
/* .restart local v2 # "prev":Lcom/wiyun/engine/actions/FiniteTimeAction; */
} // :cond_1
/* aget-object v0, p1, v3 */
/* .line 30 */
/* .local v0, "now":Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* instance-of v5, v2, Lcom/wiyun/engine/actions/Spawn; */
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 31 */
(( com.wiyun.engine.actions.FiniteTimeAction ) v2 ).autoRelease ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/actions/FiniteTimeAction;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* .line 32 */
} // :cond_2
/* new-instance v1, Lcom/wiyun/engine/actions/Spawn; */
/* invoke-direct {v1, v2, v0}, Lcom/wiyun/engine/actions/Spawn;-><init>(Lcom/wiyun/engine/actions/FiniteTimeAction;Lcom/wiyun/engine/actions/FiniteTimeAction;)V */
/* .line 29 */
} // .end local v2 # "prev":Lcom/wiyun/engine/actions/FiniteTimeAction;
/* .restart local v1 # "prev":Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* add-int/lit8 v3, v3, 0x1 */
/* move-object v2, v1 */
} // .end local v1 # "prev":Lcom/wiyun/engine/actions/FiniteTimeAction;
/* .restart local v2 # "prev":Lcom/wiyun/engine/actions/FiniteTimeAction; */
} // .end method
public static com.wiyun.engine.actions.Spawn make ( com.wiyun.engine.actions.FiniteTimeAction p0, com.wiyun.engine.actions.FiniteTimeAction p1 ) {
/* .locals 1 */
/* .param p0, "one" # Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* .param p1, "two" # Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* .prologue */
/* .line 52 */
/* new-instance v0, Lcom/wiyun/engine/actions/Spawn; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/actions/Spawn;-><init>(Lcom/wiyun/engine/actions/FiniteTimeAction;Lcom/wiyun/engine/actions/FiniteTimeAction;)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.actions.FiniteTimeAction p0, com.wiyun.engine.actions.FiniteTimeAction p1 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 71 */
/* new-instance v0, Lcom/wiyun/engine/actions/Spawn; */
v1 = (( com.wiyun.engine.actions.Spawn ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Spawn;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/Spawn;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.Spawn ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Spawn;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 76 */
/* new-instance v0, Lcom/wiyun/engine/actions/Spawn; */
v1 = (( com.wiyun.engine.actions.Spawn ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Spawn;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/Spawn;-><init>(I)V */
} // .end method
