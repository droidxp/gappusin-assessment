class com.naef.jnlua.JavaModule$IPairs$ArrayNext implements com.naef.jnlua.JavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/JavaModule$IPairs; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "ArrayNext" */
} // .end annotation
/* # direct methods */
private com.naef.jnlua.JavaModule$IPairs$ArrayNext ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.naef.jnlua.JavaModule$IPairs$ArrayNext ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/naef/jnlua/JavaModule$IPairs$ArrayNext;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 5 */
int v0 = 2; // const/4 v0, 0x2
int v1 = 1; // const/4 v1, 0x1
/* const-class v2, Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).checkJavaObject ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Lcom/naef/jnlua/LuaState;->checkJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
v3 = java.lang.reflect.Array .getLength ( v2 );
v4 = (( com.naef.jnlua.LuaState ) p1 ).checkInteger ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->checkInteger(I)I
/* add-int/lit8 v4, v4, 0x1 */
/* if-lt v4, v1, :cond_0 */
/* if-gt v4, v3, :cond_0 */
(( com.naef.jnlua.LuaState ) p1 ).pushInteger ( v4 ); // invoke-virtual {p1, v4}, Lcom/naef/jnlua/LuaState;->pushInteger(I)V
/* add-int/lit8 v1, v4, -0x1 */
java.lang.reflect.Array .get ( v2,v1 );
(( com.naef.jnlua.LuaState ) p1 ).pushJavaObject ( v1 ); // invoke-virtual {p1, v1}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
} // :goto_0
} // :cond_0
(( com.naef.jnlua.LuaState ) p1 ).pushNil ( ); // invoke-virtual {p1}, Lcom/naef/jnlua/LuaState;->pushNil()V
/* move v0, v1 */
} // .end method
