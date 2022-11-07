class com.naef.jnlua.JavaModule$ToTable implements com.naef.jnlua.NamedJavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/JavaModule; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "ToTable" */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Lcom/naef/jnlua/JavaModule$ToTable$LuaList;, */
/* Lcom/naef/jnlua/JavaModule$ToTable$LuaMap; */
/* } */
} // .end annotation
/* # direct methods */
private com.naef.jnlua.JavaModule$ToTable ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.naef.jnlua.JavaModule$ToTable ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/naef/jnlua/JavaModule$ToTable;-><init>()V */
return;
} // .end method
public static com.naef.jnlua.TypedJavaObject toTable ( java.util.List p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List", */
/* "<*>;)", */
/* "Lcom/naef/jnlua/TypedJavaObject;" */
/* } */
} // .end annotation
/* new-instance v0, Lcom/naef/jnlua/JavaModule$ToTable$LuaList; */
/* invoke-direct {v0, p0}, Lcom/naef/jnlua/JavaModule$ToTable$LuaList;-><init>(Ljava/util/List;)V */
} // .end method
public static com.naef.jnlua.TypedJavaObject toTable ( java.util.Map p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<**>;)", */
/* "Lcom/naef/jnlua/TypedJavaObject;" */
/* } */
} // .end annotation
/* new-instance v0, Lcom/naef/jnlua/JavaModule$ToTable$LuaMap; */
/* invoke-direct {v0, p0}, Lcom/naef/jnlua/JavaModule$ToTable$LuaMap;-><init>(Ljava/util/Map;)V */
} // .end method
/* # virtual methods */
public java.lang.String getName ( ) {
/* .locals 1 */
final String v0 = "totable"; // const-string v0, "totable"
} // .end method
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
int v3 = 1; // const/4 v3, 0x1
/* const-class v0, Ljava/util/Map; */
v0 = (( com.naef.jnlua.LuaState ) p1 ).isJavaObject ( v3, v0 ); // invoke-virtual {p1, v3, v0}, Lcom/naef/jnlua/LuaState;->isJavaObject(ILjava/lang/Class;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* const-class v0, Ljava/util/Map; */
(( com.naef.jnlua.LuaState ) p1 ).toJavaObject ( v3, v0 ); // invoke-virtual {p1, v3, v0}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
/* check-cast v0, Ljava/util/Map; */
/* new-instance v1, Lcom/naef/jnlua/JavaModule$ToTable$LuaMap; */
/* invoke-direct {v1, v0}, Lcom/naef/jnlua/JavaModule$ToTable$LuaMap;-><init>(Ljava/util/Map;)V */
(( com.naef.jnlua.LuaState ) p1 ).pushJavaObject ( v1 ); // invoke-virtual {p1, v1}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
} // :goto_0
} // :cond_0
/* const-class v0, Ljava/util/List; */
v0 = (( com.naef.jnlua.LuaState ) p1 ).isJavaObject ( v3, v0 ); // invoke-virtual {p1, v3, v0}, Lcom/naef/jnlua/LuaState;->isJavaObject(ILjava/lang/Class;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* const-class v0, Ljava/util/List; */
(( com.naef.jnlua.LuaState ) p1 ).toJavaObject ( v3, v0 ); // invoke-virtual {p1, v3, v0}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
/* check-cast v0, Ljava/util/List; */
/* new-instance v1, Lcom/naef/jnlua/JavaModule$ToTable$LuaList; */
/* invoke-direct {v1, v0}, Lcom/naef/jnlua/JavaModule$ToTable$LuaList;-><init>(Ljava/util/List;)V */
(( com.naef.jnlua.LuaState ) p1 ).pushJavaObject ( v1 ); // invoke-virtual {p1, v1}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
} // :cond_1
final String v0 = "expected map or list, got %s"; // const-string v0, "expected map or list, got %s"
/* new-array v1, v3, [Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).typeName ( v3 ); // invoke-virtual {p1, v3}, Lcom/naef/jnlua/LuaState;->typeName(I)Ljava/lang/String;
/* aput-object v2, v1, v4 */
java.lang.String .format ( v0,v1 );
(( com.naef.jnlua.LuaState ) p1 ).checkArg ( v3, v4, v0 ); // invoke-virtual {p1, v3, v4, v0}, Lcom/naef/jnlua/LuaState;->checkArg(IZLjava/lang/String;)V
} // .end method
