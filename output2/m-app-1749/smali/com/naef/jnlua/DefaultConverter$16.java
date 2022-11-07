class com.naef.jnlua.DefaultConverter$16 extends com.naef.jnlua.util.AbstractTableMap {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/naef/jnlua/DefaultConverter;->convertLuaValue(Lcom/naef/jnlua/LuaState;ILjava/lang/Class;)Ljava/lang/Object; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lcom/naef/jnlua/util/AbstractTableMap", */
/* "<", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
/* # instance fields */
final com.naef.jnlua.DefaultConverter this$0; //synthetic
final com.naef.jnlua.LuaValueProxy val$luaValueProxy; //synthetic
/* # direct methods */
 com.naef.jnlua.DefaultConverter$16 ( ) {
/* .locals 0 */
this.this$0 = p1;
this.val$luaValueProxy = p2;
/* invoke-direct {p0}, Lcom/naef/jnlua/util/AbstractTableMap;-><init>()V */
return;
} // .end method
/* # virtual methods */
protected java.lang.Object convertKey ( Integer p0 ) {
/* .locals 2 */
(( com.naef.jnlua.DefaultConverter$16 ) p0 ).getLuaState ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/DefaultConverter$16;->getLuaState()Lcom/naef/jnlua/LuaState;
/* const-class v1, Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) v0 ).toJavaObject ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
} // .end method
public com.naef.jnlua.LuaState getLuaState ( ) {
/* .locals 1 */
v0 = this.val$luaValueProxy;
} // .end method
public void pushValue ( ) {
/* .locals 1 */
v0 = this.val$luaValueProxy;
return;
} // .end method
