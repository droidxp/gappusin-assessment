class com.naef.jnlua.JavaModule$ToTable$LuaList$Length implements com.naef.jnlua.JavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/JavaModule$ToTable$LuaList; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "Length" */
} // .end annotation
/* # direct methods */
private com.naef.jnlua.JavaModule$ToTable$LuaList$Length ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.naef.jnlua.JavaModule$ToTable$LuaList$Length ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/naef/jnlua/JavaModule$ToTable$LuaList$Length;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 2 */
int v1 = 1; // const/4 v1, 0x1
(( com.naef.jnlua.LuaState ) p1 ).toJavaObjectRaw ( v1 ); // invoke-virtual {p1, v1}, Lcom/naef/jnlua/LuaState;->toJavaObjectRaw(I)Ljava/lang/Object;
/* check-cast v0, Lcom/naef/jnlua/JavaModule$ToTable$LuaList; */
v0 = (( com.naef.jnlua.JavaModule$ToTable$LuaList ) v0 ).getList ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/JavaModule$ToTable$LuaList;->getList()Ljava/util/List;
(( com.naef.jnlua.LuaState ) p1 ).pushInteger ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->pushInteger(I)V
} // .end method
