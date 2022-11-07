public class com.wiyun.engine.actions.Speed extends com.wiyun.engine.actions.Action {
	 /* .source "Speed.java" */
	 /* # instance fields */
	 protected com.wiyun.engine.actions.Action mOther;
	 protected Float mSpeed;
	 /* # direct methods */
	 protected com.wiyun.engine.actions.Speed ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 74 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/Action;-><init>(I)V */
		 /* .line 75 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.Speed ( ) {
		 /* .locals 0 */
		 /* .param p1, "action" # Lcom/wiyun/engine/actions/Action; */
		 /* .param p2, "speed" # F */
		 /* .prologue */
		 /* .line 65 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/Action;-><init>()V */
		 /* .line 66 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/actions/Speed;->nativeInit(Lcom/wiyun/engine/actions/Action;F)V */
		 /* .line 67 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.Speed .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.Speed from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 70 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/Speed; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/Speed;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.Speed make ( com.wiyun.engine.actions.Action p0, Float p1 ) {
/* .locals 1 */
/* .param p0, "action" # Lcom/wiyun/engine/actions/Action; */
/* .param p1, "speed" # F */
/* .prologue */
/* .line 56 */
/* new-instance v0, Lcom/wiyun/engine/actions/Speed; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/actions/Speed;-><init>(Lcom/wiyun/engine/actions/Action;F)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.actions.Action p0, Float p1 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.Action copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.Speed ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Speed;->copy()Lcom/wiyun/engine/actions/Speed;
} // .end method
public com.wiyun.engine.actions.Speed copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 81 */
/* new-instance v0, Lcom/wiyun/engine/actions/Speed; */
v1 = (( com.wiyun.engine.actions.Speed ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Speed;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/Speed;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.Speed ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Speed;->copy()Lcom/wiyun/engine/actions/Speed;
} // .end method
public native Float getSpeed ( ) {
} // .end method
public com.wiyun.engine.actions.Action reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 86 */
/* new-instance v0, Lcom/wiyun/engine/actions/Speed; */
v1 = (( com.wiyun.engine.actions.Speed ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Speed;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/Speed;-><init>(I)V */
} // .end method
public native void setSpeed ( Float p0 ) {
} // .end method
