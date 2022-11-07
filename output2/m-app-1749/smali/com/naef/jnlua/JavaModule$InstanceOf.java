class com.naef.jnlua.JavaModule$InstanceOf implements com.naef.jnlua.NamedJavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/JavaModule; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "InstanceOf" */
} // .end annotation
/* # direct methods */
private com.naef.jnlua.JavaModule$InstanceOf ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.naef.jnlua.JavaModule$InstanceOf ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/naef/jnlua/JavaModule$InstanceOf;-><init>()V */
return;
} // .end method
/* # virtual methods */
public java.lang.String getName ( ) {
/* .locals 1 */
final String v0 = "instanceof"; // const-string v0, "instanceof"
} // .end method
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
int v2 = 2; // const/4 v2, 0x2
/* const-class v0, Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).checkJavaObject ( v3, v0 ); // invoke-virtual {p1, v3, v0}, Lcom/naef/jnlua/LuaState;->checkJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
/* const-class v0, Ljava/lang/Class; */
v0 = (( com.naef.jnlua.LuaState ) p1 ).isJavaObject ( v2, v0 ); // invoke-virtual {p1, v2, v0}, Lcom/naef/jnlua/LuaState;->isJavaObject(ILjava/lang/Class;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* const-class v0, Ljava/lang/Class; */
	 (( com.naef.jnlua.LuaState ) p1 ).checkJavaObject ( v2, v0 ); // invoke-virtual {p1, v2, v0}, Lcom/naef/jnlua/LuaState;->checkJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
	 /* check-cast v0, Ljava/lang/Class; */
} // :goto_0
v0 = (( java.lang.Class ) v0 ).isInstance ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z
(( com.naef.jnlua.LuaState ) p1 ).pushBoolean ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->pushBoolean(Z)V
} // :cond_0
(( com.naef.jnlua.LuaState ) p1 ).checkString ( v2 ); // invoke-virtual {p1, v2}, Lcom/naef/jnlua/LuaState;->checkString(I)Ljava/lang/String;
com.naef.jnlua.JavaModule .access$1200 ( p1,v0 );
} // .end method
