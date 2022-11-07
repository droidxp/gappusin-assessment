class com.naef.jnlua.JavaModule$ToTable$LuaMap$NewIndex implements com.naef.jnlua.JavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/JavaModule$ToTable$LuaMap; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "NewIndex" */
} // .end annotation
/* # direct methods */
private com.naef.jnlua.JavaModule$ToTable$LuaMap$NewIndex ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.naef.jnlua.JavaModule$ToTable$LuaMap$NewIndex ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/naef/jnlua/JavaModule$ToTable$LuaMap$NewIndex;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 5 */
int v3 = 2; // const/4 v3, 0x2
int v2 = 1; // const/4 v2, 0x1
int v4 = 0; // const/4 v4, 0x0
(( com.naef.jnlua.LuaState ) p1 ).toJavaObjectRaw ( v2 ); // invoke-virtual {p1, v2}, Lcom/naef/jnlua/LuaState;->toJavaObjectRaw(I)Ljava/lang/Object;
/* check-cast v0, Lcom/naef/jnlua/JavaModule$ToTable$LuaMap; */
/* const-class v1, Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).toJavaObject ( v3, v1 ); // invoke-virtual {p1, v3, v1}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
/* if-nez v1, :cond_0 */
/* new-instance v0, Lcom/naef/jnlua/LuaRuntimeException; */
final String v1 = "attempt to write map with %s accessor"; // const-string v1, "attempt to write map with %s accessor"
/* new-array v2, v2, [Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).typeName ( v3 ); // invoke-virtual {p1, v3}, Lcom/naef/jnlua/LuaState;->typeName(I)Ljava/lang/String;
/* aput-object v3, v2, v4 */
java.lang.String .format ( v1,v2 );
/* invoke-direct {v0, v1}, Lcom/naef/jnlua/LuaRuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
int v2 = 3; // const/4 v2, 0x3
/* const-class v3, Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).toJavaObject ( v2, v3 ); // invoke-virtual {p1, v2, v3}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
if ( v2 != null) { // if-eqz v2, :cond_1
(( com.naef.jnlua.JavaModule$ToTable$LuaMap ) v0 ).getMap ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/JavaModule$ToTable$LuaMap;->getMap()Ljava/util/Map;
} // :goto_0
} // :cond_1
(( com.naef.jnlua.JavaModule$ToTable$LuaMap ) v0 ).getMap ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/JavaModule$ToTable$LuaMap;->getMap()Ljava/util/Map;
} // .end method
