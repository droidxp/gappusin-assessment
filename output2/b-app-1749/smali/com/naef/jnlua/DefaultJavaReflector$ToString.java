class com.naef.jnlua.DefaultJavaReflector$ToString implements com.naef.jnlua.JavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/DefaultJavaReflector; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "ToString" */
} // .end annotation
/* # instance fields */
final com.naef.jnlua.DefaultJavaReflector this$0; //synthetic
/* # direct methods */
private com.naef.jnlua.DefaultJavaReflector$ToString ( ) {
/* .locals 0 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.naef.jnlua.DefaultJavaReflector$ToString ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0, p1}, Lcom/naef/jnlua/DefaultJavaReflector$ToString;-><init>(Lcom/naef/jnlua/DefaultJavaReflector;)V */
return;
} // .end method
/* # virtual methods */
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 2 */
int v1 = 1; // const/4 v1, 0x1
/* const-class v0, Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).toJavaObject ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
if ( v0 != null) { // if-eqz v0, :cond_0
	 (( java.lang.Object ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
} // :goto_0
(( com.naef.jnlua.LuaState ) p1 ).pushString ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->pushString(Ljava/lang/String;)V
} // :cond_0
final String v0 = "null"; // const-string v0, "null"
} // .end method
