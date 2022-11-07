class com.naef.jnlua.JavaModule$Cast implements com.naef.jnlua.NamedJavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/JavaModule; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "Cast" */
} // .end annotation
/* # direct methods */
private com.naef.jnlua.JavaModule$Cast ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.naef.jnlua.JavaModule$Cast ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/naef/jnlua/JavaModule$Cast;-><init>()V */
return;
} // .end method
/* # virtual methods */
public java.lang.String getName ( ) {
/* .locals 1 */
final String v0 = "cast"; // const-string v0, "cast"
} // .end method
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
int v1 = 2; // const/4 v1, 0x2
/* const-class v0, Ljava/lang/Class; */
v0 = (( com.naef.jnlua.LuaState ) p1 ).isJavaObject ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Lcom/naef/jnlua/LuaState;->isJavaObject(ILjava/lang/Class;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* const-class v0, Ljava/lang/Class; */
	 (( com.naef.jnlua.LuaState ) p1 ).checkJavaObject ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Lcom/naef/jnlua/LuaState;->checkJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
	 /* check-cast v0, Ljava/lang/Class; */
} // :goto_0
(( com.naef.jnlua.LuaState ) p1 ).checkJavaObject ( v3, v0 ); // invoke-virtual {p1, v3, v0}, Lcom/naef/jnlua/LuaState;->checkJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
/* new-instance v2, Lcom/naef/jnlua/JavaModule$Cast$1; */
/* invoke-direct {v2, p0, v1, v0}, Lcom/naef/jnlua/JavaModule$Cast$1;-><init>(Lcom/naef/jnlua/JavaModule$Cast;Ljava/lang/Object;Ljava/lang/Class;)V */
(( com.naef.jnlua.LuaState ) p1 ).pushJavaObject ( v2 ); // invoke-virtual {p1, v2}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
} // :cond_0
(( com.naef.jnlua.LuaState ) p1 ).checkString ( v1 ); // invoke-virtual {p1, v1}, Lcom/naef/jnlua/LuaState;->checkString(I)Ljava/lang/String;
com.naef.jnlua.JavaModule .access$1200 ( p1,v0 );
} // .end method
