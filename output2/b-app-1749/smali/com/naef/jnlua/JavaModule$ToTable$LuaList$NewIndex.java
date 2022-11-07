class com.naef.jnlua.JavaModule$ToTable$LuaList$NewIndex implements com.naef.jnlua.JavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/JavaModule$ToTable$LuaList; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "NewIndex" */
} // .end annotation
/* # direct methods */
private com.naef.jnlua.JavaModule$ToTable$LuaList$NewIndex ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.naef.jnlua.JavaModule$ToTable$LuaList$NewIndex ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/naef/jnlua/JavaModule$ToTable$LuaList$NewIndex;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 6 */
int v2 = 1; // const/4 v2, 0x1
int v5 = 0; // const/4 v5, 0x0
int v3 = 2; // const/4 v3, 0x2
(( com.naef.jnlua.LuaState ) p1 ).toJavaObjectRaw ( v2 ); // invoke-virtual {p1, v2}, Lcom/naef/jnlua/LuaState;->toJavaObjectRaw(I)Ljava/lang/Object;
/* check-cast v0, Lcom/naef/jnlua/JavaModule$ToTable$LuaList; */
v1 = (( com.naef.jnlua.LuaState ) p1 ).isNumber ( v3 ); // invoke-virtual {p1, v3}, Lcom/naef/jnlua/LuaState;->isNumber(I)Z
/* if-nez v1, :cond_0 */
/* new-instance v0, Lcom/naef/jnlua/LuaRuntimeException; */
final String v1 = "attempt to write list with %s accessor"; // const-string v1, "attempt to write list with %s accessor"
/* new-array v2, v2, [Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).typeName ( v3 ); // invoke-virtual {p1, v3}, Lcom/naef/jnlua/LuaState;->typeName(I)Ljava/lang/String;
/* aput-object v3, v2, v5 */
java.lang.String .format ( v1,v2 );
/* invoke-direct {v0, v1}, Lcom/naef/jnlua/LuaRuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
v1 = (( com.naef.jnlua.LuaState ) p1 ).toInteger ( v3 ); // invoke-virtual {p1, v3}, Lcom/naef/jnlua/LuaState;->toInteger(I)I
int v2 = 3; // const/4 v2, 0x3
/* const-class v3, Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).toJavaObject ( v2, v3 ); // invoke-virtual {p1, v2, v3}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
if ( v2 != null) { // if-eqz v2, :cond_2
v3 = (( com.naef.jnlua.JavaModule$ToTable$LuaList ) v0 ).getList ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/JavaModule$ToTable$LuaList;->getList()Ljava/util/List;
/* add-int/lit8 v4, v1, -0x1 */
/* if-eq v4, v3, :cond_1 */
(( com.naef.jnlua.JavaModule$ToTable$LuaList ) v0 ).getList ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/JavaModule$ToTable$LuaList;->getList()Ljava/util/List;
/* add-int/lit8 v1, v1, -0x1 */
} // :goto_0
} // :cond_1
(( com.naef.jnlua.JavaModule$ToTable$LuaList ) v0 ).getList ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/JavaModule$ToTable$LuaList;->getList()Ljava/util/List;
} // :cond_2
(( com.naef.jnlua.JavaModule$ToTable$LuaList ) v0 ).getList ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/JavaModule$ToTable$LuaList;->getList()Ljava/util/List;
/* add-int/lit8 v1, v1, -0x1 */
} // .end method
