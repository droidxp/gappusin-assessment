class com.naef.jnlua.JavaModule$New implements com.naef.jnlua.NamedJavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/JavaModule; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "New" */
} // .end annotation
/* # direct methods */
private com.naef.jnlua.JavaModule$New ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.naef.jnlua.JavaModule$New ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/naef/jnlua/JavaModule$New;-><init>()V */
return;
} // .end method
/* # virtual methods */
public java.lang.String getName ( ) {
/* .locals 1 */
final String v0 = "new"; // const-string v0, "new"
} // .end method
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 6 */
int v5 = 1; // const/4 v5, 0x1
/* const-class v0, Ljava/lang/Class; */
v0 = (( com.naef.jnlua.LuaState ) p1 ).isJavaObject ( v5, v0 ); // invoke-virtual {p1, v5, v0}, Lcom/naef/jnlua/LuaState;->isJavaObject(ILjava/lang/Class;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* const-class v0, Ljava/lang/Class; */
	 (( com.naef.jnlua.LuaState ) p1 ).checkJavaObject ( v5, v0 ); // invoke-virtual {p1, v5, v0}, Lcom/naef/jnlua/LuaState;->checkJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
	 /* check-cast v0, Ljava/lang/Class; */
} // :goto_0
v1 = (( com.naef.jnlua.LuaState ) p1 ).getTop ( ); // invoke-virtual {p1}, Lcom/naef/jnlua/LuaState;->getTop()I
/* add-int/lit8 v2, v1, -0x1 */
/* packed-switch v2, :pswitch_data_0 */
/* new-array v3, v2, [I */
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
/* if-ge v1, v2, :cond_1 */
/* add-int/lit8 v4, v1, 0x2 */
v4 = (( com.naef.jnlua.LuaState ) p1 ).checkInteger ( v4 ); // invoke-virtual {p1, v4}, Lcom/naef/jnlua/LuaState;->checkInteger(I)I
/* aput v4, v3, v1 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
(( com.naef.jnlua.LuaState ) p1 ).checkString ( v5 ); // invoke-virtual {p1, v5}, Lcom/naef/jnlua/LuaState;->checkString(I)Ljava/lang/String;
com.naef.jnlua.JavaModule .access$1200 ( p1,v0 );
/* :pswitch_0 */
try { // :try_start_0
(( java.lang.Class ) v0 ).newInstance ( ); // invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/InstantiationException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_1 */
} // :goto_2
(( com.naef.jnlua.LuaState ) p1 ).pushJavaObject ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
/* :catch_0 */
/* move-exception v0 */
/* new-instance v1, Ljava/lang/RuntimeException; */
/* invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw v1 */
/* :catch_1 */
/* move-exception v0 */
/* new-instance v1, Ljava/lang/RuntimeException; */
/* invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw v1 */
/* :pswitch_1 */
int v1 = 2; // const/4 v1, 0x2
v1 = (( com.naef.jnlua.LuaState ) p1 ).checkInteger ( v1 ); // invoke-virtual {p1, v1}, Lcom/naef/jnlua/LuaState;->checkInteger(I)I
java.lang.reflect.Array .newInstance ( v0,v1 );
} // :cond_1
java.lang.reflect.Array .newInstance ( v0,v3 );
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
