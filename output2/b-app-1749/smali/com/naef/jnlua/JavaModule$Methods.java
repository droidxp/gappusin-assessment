class com.naef.jnlua.JavaModule$Methods implements com.naef.jnlua.NamedJavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/JavaModule; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "Methods" */
} // .end annotation
/* # direct methods */
private com.naef.jnlua.JavaModule$Methods ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.naef.jnlua.JavaModule$Methods ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/naef/jnlua/JavaModule$Methods;-><init>()V */
return;
} // .end method
/* # virtual methods */
public java.lang.String getName ( ) {
/* .locals 1 */
final String v0 = "methods"; // const-string v0, "methods"
} // .end method
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 6 */
int v5 = 1; // const/4 v5, 0x1
v0 = (( com.naef.jnlua.LuaState ) p1 ).isJavaObjectRaw ( v5 ); // invoke-virtual {p1, v5}, Lcom/naef/jnlua/LuaState;->isJavaObjectRaw(I)Z
final String v1 = "expected Java object, got %s"; // const-string v1, "expected Java object, got %s"
/* new-array v2, v5, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
(( com.naef.jnlua.LuaState ) p1 ).typeName ( v5 ); // invoke-virtual {p1, v5}, Lcom/naef/jnlua/LuaState;->typeName(I)Ljava/lang/String;
/* aput-object v4, v2, v3 */
java.lang.String .format ( v1,v2 );
(( com.naef.jnlua.LuaState ) p1 ).checkArg ( v5, v0, v1 ); // invoke-virtual {p1, v5, v0, v1}, Lcom/naef/jnlua/LuaState;->checkArg(IZLjava/lang/String;)V
(( com.naef.jnlua.LuaState ) p1 ).toJavaObjectRaw ( v5 ); // invoke-virtual {p1, v5}, Lcom/naef/jnlua/LuaState;->toJavaObjectRaw(I)Ljava/lang/Object;
v1 = com.naef.jnlua.JavaReflector$Metamethod.JAVAMETHODS;
v0 = (( com.naef.jnlua.LuaState ) p1 ).getMetamethod ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lcom/naef/jnlua/LuaState;->getMetamethod(Ljava/lang/Object;Lcom/naef/jnlua/JavaReflector$Metamethod;)Lcom/naef/jnlua/JavaFunction;
} // .end method
