class com.naef.jnlua.JavaModule$Require implements com.naef.jnlua.NamedJavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/JavaModule; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "Require" */
} // .end annotation
/* # direct methods */
private com.naef.jnlua.JavaModule$Require ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.naef.jnlua.JavaModule$Require ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/naef/jnlua/JavaModule$Require;-><init>()V */
return;
} // .end method
/* # virtual methods */
public java.lang.String getName ( ) {
/* .locals 1 */
final String v0 = "require"; // const-string v0, "require"
} // .end method
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 7 */
int v6 = 2; // const/4 v6, 0x2
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
(( com.naef.jnlua.LuaState ) p1 ).checkString ( v5 ); // invoke-virtual {p1, v5}, Lcom/naef/jnlua/LuaState;->checkString(I)Ljava/lang/String;
v1 = (( com.naef.jnlua.LuaState ) p1 ).checkBoolean ( v6, v4 ); // invoke-virtual {p1, v6, v4}, Lcom/naef/jnlua/LuaState;->checkBoolean(IZ)Z
com.naef.jnlua.JavaModule .access$1200 ( p1,v0 );
(( com.naef.jnlua.LuaState ) p1 ).pushJavaObject ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
if ( v1 != null) { // if-eqz v1, :cond_0
	 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
	 /* const/16 v3, 0x2e */
	 v3 = 	 (( java.lang.String ) v2 ).lastIndexOf ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(I)I
	 /* if-ltz v3, :cond_1 */
	 (( java.lang.String ) v2 ).substring ( v4, v3 ); // invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
	 /* add-int/lit8 v3, v3, 0x1 */
	 (( java.lang.String ) v2 ).substring ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;
	 com.naef.jnlua.JavaModule .access$1300 ( );
	 (( com.naef.jnlua.LuaState ) p1 ).register ( v4, v3 ); // invoke-virtual {p1, v4, v3}, Lcom/naef/jnlua/LuaState;->register(Ljava/lang/String;[Lcom/naef/jnlua/NamedJavaFunction;)V
	 (( com.naef.jnlua.LuaState ) p1 ).pushJavaObject ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
	 int v0 = -2; // const/4 v0, -0x2
	 (( com.naef.jnlua.LuaState ) p1 ).setField ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Lcom/naef/jnlua/LuaState;->setField(ILjava/lang/String;)V
	 (( com.naef.jnlua.LuaState ) p1 ).pop ( v5 ); // invoke-virtual {p1, v5}, Lcom/naef/jnlua/LuaState;->pop(I)V
} // :cond_0
} // :goto_0
(( com.naef.jnlua.LuaState ) p1 ).pushBoolean ( v1 ); // invoke-virtual {p1, v1}, Lcom/naef/jnlua/LuaState;->pushBoolean(Z)V
} // :cond_1
(( com.naef.jnlua.LuaState ) p1 ).pushJavaObject ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
(( com.naef.jnlua.LuaState ) p1 ).setGlobal ( v2 ); // invoke-virtual {p1, v2}, Lcom/naef/jnlua/LuaState;->setGlobal(Ljava/lang/String;)V
} // .end method
