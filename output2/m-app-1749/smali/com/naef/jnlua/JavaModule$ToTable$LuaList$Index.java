class com.naef.jnlua.JavaModule$ToTable$LuaList$Index implements com.naef.jnlua.JavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/JavaModule$ToTable$LuaList; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "Index" */
} // .end annotation
/* # direct methods */
private com.naef.jnlua.JavaModule$ToTable$LuaList$Index ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.naef.jnlua.JavaModule$ToTable$LuaList$Index ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/naef/jnlua/JavaModule$ToTable$LuaList$Index;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 5 */
int v4 = 2; // const/4 v4, 0x2
int v2 = 1; // const/4 v2, 0x1
(( com.naef.jnlua.LuaState ) p1 ).toJavaObjectRaw ( v2 ); // invoke-virtual {p1, v2}, Lcom/naef/jnlua/LuaState;->toJavaObjectRaw(I)Ljava/lang/Object;
/* check-cast v0, Lcom/naef/jnlua/JavaModule$ToTable$LuaList; */
v1 = (( com.naef.jnlua.LuaState ) p1 ).isNumber ( v4 ); // invoke-virtual {p1, v4}, Lcom/naef/jnlua/LuaState;->isNumber(I)Z
/* if-nez v1, :cond_0 */
/* new-instance v0, Lcom/naef/jnlua/LuaRuntimeException; */
final String v1 = "attempt to read list with %s accessor"; // const-string v1, "attempt to read list with %s accessor"
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
(( com.naef.jnlua.LuaState ) p1 ).typeName ( v4 ); // invoke-virtual {p1, v4}, Lcom/naef/jnlua/LuaState;->typeName(I)Ljava/lang/String;
/* aput-object v4, v2, v3 */
java.lang.String .format ( v1,v2 );
/* invoke-direct {v0, v1}, Lcom/naef/jnlua/LuaRuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
v1 = (( com.naef.jnlua.LuaState ) p1 ).toInteger ( v4 ); // invoke-virtual {p1, v4}, Lcom/naef/jnlua/LuaState;->toInteger(I)I
(( com.naef.jnlua.JavaModule$ToTable$LuaList ) v0 ).getList ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/JavaModule$ToTable$LuaList;->getList()Ljava/util/List;
/* add-int/lit8 v1, v1, -0x1 */
(( com.naef.jnlua.LuaState ) p1 ).pushJavaObject ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
} // .end method
