class com.naef.jnlua.DefaultJavaReflector$LessThanOrEqual implements com.naef.jnlua.JavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/DefaultJavaReflector; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "LessThanOrEqual" */
} // .end annotation
/* # instance fields */
final com.naef.jnlua.DefaultJavaReflector this$0; //synthetic
/* # direct methods */
private com.naef.jnlua.DefaultJavaReflector$LessThanOrEqual ( ) {
/* .locals 0 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.naef.jnlua.DefaultJavaReflector$LessThanOrEqual ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0, p1}, Lcom/naef/jnlua/DefaultJavaReflector$LessThanOrEqual;-><init>(Lcom/naef/jnlua/DefaultJavaReflector;)V */
return;
} // .end method
/* # virtual methods */
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 5 */
int v2 = 0; // const/4 v2, 0x0
int v1 = 1; // const/4 v1, 0x1
/* const-class v0, Ljava/lang/Comparable; */
v0 = (( com.naef.jnlua.LuaState ) p1 ).isJavaObject ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Lcom/naef/jnlua/LuaState;->isJavaObject(ILjava/lang/Class;)Z
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/naef/jnlua/LuaRuntimeException; */
final String v3 = "class %s does not implement Comparable"; // const-string v3, "class %s does not implement Comparable"
/* new-array v4, v1, [Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).typeName ( v1 ); // invoke-virtual {p1, v1}, Lcom/naef/jnlua/LuaState;->typeName(I)Ljava/lang/String;
/* aput-object v1, v4, v2 */
java.lang.String .format ( v3,v4 );
/* invoke-direct {v0, v1}, Lcom/naef/jnlua/LuaRuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
/* const-class v0, Ljava/lang/Comparable; */
(( com.naef.jnlua.LuaState ) p1 ).toJavaObject ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Comparable; */
int v3 = 2; // const/4 v3, 0x2
/* const-class v4, Ljava/lang/Object; */
v0 = (( com.naef.jnlua.LuaState ) p1 ).toJavaObject ( v3, v4 ); // invoke-virtual {p1, v3, v4}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
/* if-gtz v0, :cond_1 */
/* move v0, v1 */
} // :goto_0
(( com.naef.jnlua.LuaState ) p1 ).pushBoolean ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->pushBoolean(Z)V
} // :cond_1
/* move v0, v2 */
} // .end method
