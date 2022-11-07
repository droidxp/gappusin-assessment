class com.naef.jnlua.JavaModule$Proxy implements com.naef.jnlua.NamedJavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/JavaModule; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "Proxy" */
} // .end annotation
/* # direct methods */
private com.naef.jnlua.JavaModule$Proxy ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.naef.jnlua.JavaModule$Proxy ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/naef/jnlua/JavaModule$Proxy;-><init>()V */
return;
} // .end method
/* # virtual methods */
public java.lang.String getName ( ) {
/* .locals 1 */
final String v0 = "proxy"; // const-string v0, "proxy"
} // .end method
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 6 */
int v2 = 0; // const/4 v2, 0x0
int v1 = 1; // const/4 v1, 0x1
v0 = com.naef.jnlua.LuaType.TABLE;
(( com.naef.jnlua.LuaState ) p1 ).checkType ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Lcom/naef/jnlua/LuaState;->checkType(ILcom/naef/jnlua/LuaType;)V
v0 = (( com.naef.jnlua.LuaState ) p1 ).getTop ( ); // invoke-virtual {p1}, Lcom/naef/jnlua/LuaState;->getTop()I
/* add-int/lit8 v3, v0, -0x1 */
int v4 = 2; // const/4 v4, 0x2
/* if-lez v3, :cond_0 */
/* move v0, v1 */
} // :goto_0
final String v5 = "no interface specified"; // const-string v5, "no interface specified"
(( com.naef.jnlua.LuaState ) p1 ).checkArg ( v4, v0, v5 ); // invoke-virtual {p1, v4, v0, v5}, Lcom/naef/jnlua/LuaState;->checkArg(IZLjava/lang/String;)V
/* new-array v4, v3, [Ljava/lang/Class; */
} // :goto_1
/* if-ge v2, v3, :cond_2 */
/* add-int/lit8 v0, v2, 0x2 */
/* const-class v5, Ljava/lang/Class; */
v0 = (( com.naef.jnlua.LuaState ) p1 ).isJavaObject ( v0, v5 ); // invoke-virtual {p1, v0, v5}, Lcom/naef/jnlua/LuaState;->isJavaObject(ILjava/lang/Class;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* add-int/lit8 v0, v2, 0x2 */
/* const-class v5, Ljava/lang/Class; */
(( com.naef.jnlua.LuaState ) p1 ).checkJavaObject ( v0, v5 ); // invoke-virtual {p1, v0, v5}, Lcom/naef/jnlua/LuaState;->checkJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Class; */
/* aput-object v0, v4, v2 */
} // :goto_2
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
/* move v0, v2 */
} // :cond_1
/* add-int/lit8 v0, v2, 0x2 */
(( com.naef.jnlua.LuaState ) p1 ).checkString ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->checkString(I)Ljava/lang/String;
com.naef.jnlua.JavaModule .access$1200 ( p1,v0 );
/* aput-object v0, v4, v2 */
} // :cond_2
(( com.naef.jnlua.LuaState ) p1 ).getProxy ( v1, v4 ); // invoke-virtual {p1, v1, v4}, Lcom/naef/jnlua/LuaState;->getProxy(I[Ljava/lang/Class;)Lcom/naef/jnlua/LuaValueProxy;
(( com.naef.jnlua.LuaState ) p1 ).pushJavaObjectRaw ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->pushJavaObjectRaw(Ljava/lang/Object;)V
} // .end method
