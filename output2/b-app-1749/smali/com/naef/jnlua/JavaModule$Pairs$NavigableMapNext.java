class com.naef.jnlua.JavaModule$Pairs$NavigableMapNext implements com.naef.jnlua.JavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/JavaModule$Pairs; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "NavigableMapNext" */
} // .end annotation
/* # direct methods */
private com.naef.jnlua.JavaModule$Pairs$NavigableMapNext ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.naef.jnlua.JavaModule$Pairs$NavigableMapNext ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/naef/jnlua/JavaModule$Pairs$NavigableMapNext;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 4 */
int v1 = 2; // const/4 v1, 0x2
int v2 = 1; // const/4 v2, 0x1
/* const-class v0, Ljava/util/NavigableMap; */
(( com.naef.jnlua.LuaState ) p1 ).checkJavaObject ( v2, v0 ); // invoke-virtual {p1, v2, v0}, Lcom/naef/jnlua/LuaState;->checkJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
/* check-cast v0, Ljava/util/NavigableMap; */
/* const-class v3, Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).checkJavaObject ( v1, v3 ); // invoke-virtual {p1, v1, v3}, Lcom/naef/jnlua/LuaState;->checkJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
if ( v3 != null) { // if-eqz v3, :cond_0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
	 (( com.naef.jnlua.LuaState ) p1 ).pushJavaObject ( v2 ); // invoke-virtual {p1, v2}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
	 (( com.naef.jnlua.LuaState ) p1 ).pushJavaObject ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
	 /* move v0, v1 */
} // :goto_1
} // :cond_0
} // :cond_1
(( com.naef.jnlua.LuaState ) p1 ).pushNil ( ); // invoke-virtual {p1}, Lcom/naef/jnlua/LuaState;->pushNil()V
/* move v0, v2 */
} // .end method
