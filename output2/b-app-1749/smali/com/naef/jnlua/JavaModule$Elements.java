class com.naef.jnlua.JavaModule$Elements implements com.naef.jnlua.NamedJavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/JavaModule; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "Elements" */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Lcom/naef/jnlua/JavaModule$Elements$ElementIterator; */
/* } */
} // .end annotation
/* # direct methods */
private com.naef.jnlua.JavaModule$Elements ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.naef.jnlua.JavaModule$Elements ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/naef/jnlua/JavaModule$Elements;-><init>()V */
return;
} // .end method
/* # virtual methods */
public java.lang.String getName ( ) {
/* .locals 1 */
final String v0 = "elements"; // const-string v0, "elements"
} // .end method
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
/* const-class v1, Ljava/lang/Iterable; */
(( com.naef.jnlua.LuaState ) p1 ).checkJavaObject ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lcom/naef/jnlua/LuaState;->checkJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Iterable; */
/* new-instance v1, Lcom/naef/jnlua/JavaModule$Elements$ElementIterator; */
/* invoke-direct {v1, v2}, Lcom/naef/jnlua/JavaModule$Elements$ElementIterator;-><init>(Ljava/util/Iterator;)V */
(( com.naef.jnlua.LuaState ) p1 ).pushJavaObject ( v1 ); // invoke-virtual {p1, v1}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
(( com.naef.jnlua.LuaState ) p1 ).pushJavaObject ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
(( com.naef.jnlua.LuaState ) p1 ).pushNil ( ); // invoke-virtual {p1}, Lcom/naef/jnlua/LuaState;->pushNil()V
int v0 = 3; // const/4 v0, 0x3
} // .end method
