class com.naef.jnlua.DefaultJavaReflector$Length implements com.naef.jnlua.JavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/DefaultJavaReflector; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "Length" */
} // .end annotation
/* # instance fields */
final com.naef.jnlua.DefaultJavaReflector this$0; //synthetic
/* # direct methods */
private com.naef.jnlua.DefaultJavaReflector$Length ( ) {
/* .locals 0 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.naef.jnlua.DefaultJavaReflector$Length ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0, p1}, Lcom/naef/jnlua/DefaultJavaReflector$Length;-><init>(Lcom/naef/jnlua/DefaultJavaReflector;)V */
return;
} // .end method
/* # virtual methods */
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 3 */
int v2 = 1; // const/4 v2, 0x1
/* const-class v0, Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).toJavaObject ( v2, v0 ); // invoke-virtual {p1, v2, v0}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
v1 = (( java.lang.Class ) v1 ).isArray ( ); // invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z
if ( v1 != null) { // if-eqz v1, :cond_0
	 v0 = 	 java.lang.reflect.Array .getLength ( v0 );
	 (( com.naef.jnlua.LuaState ) p1 ).pushInteger ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->pushInteger(I)V
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
(( com.naef.jnlua.LuaState ) p1 ).pushInteger ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->pushInteger(I)V
} // .end method
