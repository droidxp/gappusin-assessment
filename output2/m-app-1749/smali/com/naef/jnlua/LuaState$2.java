class com.naef.jnlua.LuaState$2 implements com.naef.jnlua.JavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/naef/jnlua/LuaState;-><init>(J)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.naef.jnlua.LuaState this$0; //synthetic
final com.naef.jnlua.JavaReflector$Metamethod val$metamethod; //synthetic
/* # direct methods */
 com.naef.jnlua.LuaState$2 ( ) {
/* .locals 0 */
this.this$0 = p1;
this.val$metamethod = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 3 */
v0 = this.this$0;
int v1 = 1; // const/4 v1, 0x1
(( com.naef.jnlua.LuaState ) p1 ).toJavaObjectRaw ( v1 ); // invoke-virtual {p1, v1}, Lcom/naef/jnlua/LuaState;->toJavaObjectRaw(I)Ljava/lang/Object;
v2 = this.val$metamethod;
(( com.naef.jnlua.LuaState ) v0 ).getMetamethod ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/naef/jnlua/LuaState;->getMetamethod(Ljava/lang/Object;Lcom/naef/jnlua/JavaReflector$Metamethod;)Lcom/naef/jnlua/JavaFunction;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = 	 v1 = this.this$0;
} // :cond_0
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
v1 = this.val$metamethod;
(( com.naef.jnlua.JavaReflector$Metamethod ) v1 ).getMetamethodName ( ); // invoke-virtual {v1}, Lcom/naef/jnlua/JavaReflector$Metamethod;->getMetamethodName()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
