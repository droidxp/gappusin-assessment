class com.naef.jnlua.DefaultJavaReflector$Equal implements com.naef.jnlua.JavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/DefaultJavaReflector; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "Equal" */
} // .end annotation
/* # instance fields */
final com.naef.jnlua.DefaultJavaReflector this$0; //synthetic
/* # direct methods */
private com.naef.jnlua.DefaultJavaReflector$Equal ( ) {
/* .locals 0 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.naef.jnlua.DefaultJavaReflector$Equal ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0, p1}, Lcom/naef/jnlua/DefaultJavaReflector$Equal;-><init>(Lcom/naef/jnlua/DefaultJavaReflector;)V */
return;
} // .end method
/* # virtual methods */
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 4 */
int v1 = 1; // const/4 v1, 0x1
/* const-class v0, Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).toJavaObject ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
int v2 = 2; // const/4 v2, 0x2
/* const-class v3, Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).toJavaObject ( v2, v3 ); // invoke-virtual {p1, v2, v3}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
/* if-eq v0, v2, :cond_0 */
if ( v0 != null) { // if-eqz v0, :cond_1
	 v0 = 	 (( java.lang.Object ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_1
	 } // :cond_0
	 /* move v0, v1 */
} // :goto_0
(( com.naef.jnlua.LuaState ) p1 ).pushBoolean ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->pushBoolean(Z)V
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
