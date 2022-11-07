class com.naef.jnlua.LuaState$LuaValueProxyImpl implements com.naef.jnlua.LuaValueProxy {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/LuaState; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "LuaValueProxyImpl" */
} // .end annotation
/* # instance fields */
private Integer reference;
final com.naef.jnlua.LuaState this$0; //synthetic
/* # direct methods */
public com.naef.jnlua.LuaState$LuaValueProxyImpl ( ) {
/* .locals 2 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* iput p2, p0, Lcom/naef/jnlua/LuaState$LuaValueProxyImpl;->reference:I */
com.naef.jnlua.LuaState .access$400 ( p1 );
/* new-instance v1, Lcom/naef/jnlua/LuaState$LuaValueProxyRef; */
/* invoke-direct {v1, p0, p2}, Lcom/naef/jnlua/LuaState$LuaValueProxyRef;-><init>(Lcom/naef/jnlua/LuaState$LuaValueProxyImpl;I)V */
return;
} // .end method
/* # virtual methods */
public com.naef.jnlua.LuaState getLuaState ( ) {
/* .locals 1 */
v0 = this.this$0;
} // .end method
public void pushValue ( ) {
/* .locals 4 */
v1 = this.this$0;
/* monitor-enter v1 */
try { // :try_start_0
	 v0 = this.this$0;
	 /* const/16 v2, -0x2710 */
	 /* iget v3, p0, Lcom/naef/jnlua/LuaState$LuaValueProxyImpl;->reference:I */
	 (( com.naef.jnlua.LuaState ) v0 ).rawGet ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/naef/jnlua/LuaState;->rawGet(II)V
	 /* monitor-exit v1 */
	 return;
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit v1 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // .end method
