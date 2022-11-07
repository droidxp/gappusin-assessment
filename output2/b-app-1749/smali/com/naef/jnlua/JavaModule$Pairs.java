class com.naef.jnlua.JavaModule$Pairs implements com.naef.jnlua.NamedJavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/JavaModule; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "Pairs" */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Lcom/naef/jnlua/JavaModule$Pairs$NavigableMapNext;, */
/* Lcom/naef/jnlua/JavaModule$Pairs$MapNext; */
/* } */
} // .end annotation
/* # instance fields */
private final com.naef.jnlua.JavaFunction navigableMapNext;
/* # direct methods */
private com.naef.jnlua.JavaModule$Pairs ( ) {
/* .locals 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* new-instance v0, Lcom/naef/jnlua/JavaModule$Pairs$NavigableMapNext; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, v1}, Lcom/naef/jnlua/JavaModule$Pairs$NavigableMapNext;-><init>(Lcom/naef/jnlua/JavaModule$1;)V */
this.navigableMapNext = v0;
return;
} // .end method
 com.naef.jnlua.JavaModule$Pairs ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/naef/jnlua/JavaModule$Pairs;-><init>()V */
return;
} // .end method
/* # virtual methods */
public java.lang.String getName ( ) {
/* .locals 1 */
final String v0 = "pairs"; // const-string v0, "pairs"
} // .end method
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 7 */
int v3 = 0; // const/4 v3, 0x0
int v2 = 1; // const/4 v2, 0x1
/* const-class v0, Ljava/util/Map; */
(( com.naef.jnlua.LuaState ) p1 ).checkJavaObject ( v2, v0 ); // invoke-virtual {p1, v2, v0}, Lcom/naef/jnlua/LuaState;->checkJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
/* check-cast v0, Ljava/util/Map; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* move v1, v2 */
} // :goto_0
final String v4 = "expected map, got %s"; // const-string v4, "expected map, got %s"
/* new-array v5, v2, [Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).typeName ( v2 ); // invoke-virtual {p1, v2}, Lcom/naef/jnlua/LuaState;->typeName(I)Ljava/lang/String;
/* aput-object v6, v5, v3 */
java.lang.String .format ( v4,v5 );
(( com.naef.jnlua.LuaState ) p1 ).checkArg ( v2, v1, v3 ); // invoke-virtual {p1, v2, v1, v3}, Lcom/naef/jnlua/LuaState;->checkArg(IZLjava/lang/String;)V
/* instance-of v1, v0, Ljava/util/NavigableMap; */
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = this.navigableMapNext;
(( com.naef.jnlua.LuaState ) p1 ).pushJavaFunction ( v1 ); // invoke-virtual {p1, v1}, Lcom/naef/jnlua/LuaState;->pushJavaFunction(Lcom/naef/jnlua/JavaFunction;)V
} // :goto_1
(( com.naef.jnlua.LuaState ) p1 ).pushJavaObject ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
(( com.naef.jnlua.LuaState ) p1 ).pushNil ( ); // invoke-virtual {p1}, Lcom/naef/jnlua/LuaState;->pushNil()V
int v0 = 3; // const/4 v0, 0x3
} // :cond_0
/* move v1, v3 */
} // :cond_1
/* new-instance v1, Lcom/naef/jnlua/JavaModule$Pairs$MapNext; */
/* invoke-direct {v1, v2}, Lcom/naef/jnlua/JavaModule$Pairs$MapNext;-><init>(Ljava/util/Iterator;)V */
(( com.naef.jnlua.LuaState ) p1 ).pushJavaFunction ( v1 ); // invoke-virtual {p1, v1}, Lcom/naef/jnlua/LuaState;->pushJavaFunction(Lcom/naef/jnlua/JavaFunction;)V
} // .end method
