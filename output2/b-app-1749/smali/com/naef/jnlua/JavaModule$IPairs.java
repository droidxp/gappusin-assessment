class com.naef.jnlua.JavaModule$IPairs implements com.naef.jnlua.NamedJavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/JavaModule; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "IPairs" */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Lcom/naef/jnlua/JavaModule$IPairs$ArrayNext;, */
/* Lcom/naef/jnlua/JavaModule$IPairs$ListNext; */
/* } */
} // .end annotation
/* # instance fields */
private final com.naef.jnlua.JavaFunction arrayNext;
private final com.naef.jnlua.JavaFunction listNext;
/* # direct methods */
private com.naef.jnlua.JavaModule$IPairs ( ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* new-instance v0, Lcom/naef/jnlua/JavaModule$IPairs$ListNext; */
/* invoke-direct {v0, v1}, Lcom/naef/jnlua/JavaModule$IPairs$ListNext;-><init>(Lcom/naef/jnlua/JavaModule$1;)V */
this.listNext = v0;
/* new-instance v0, Lcom/naef/jnlua/JavaModule$IPairs$ArrayNext; */
/* invoke-direct {v0, v1}, Lcom/naef/jnlua/JavaModule$IPairs$ArrayNext;-><init>(Lcom/naef/jnlua/JavaModule$1;)V */
this.arrayNext = v0;
return;
} // .end method
 com.naef.jnlua.JavaModule$IPairs ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/naef/jnlua/JavaModule$IPairs;-><init>()V */
return;
} // .end method
/* # virtual methods */
public java.lang.String getName ( ) {
/* .locals 1 */
final String v0 = "ipairs"; // const-string v0, "ipairs"
} // .end method
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 7 */
int v6 = 0; // const/4 v6, 0x0
int v5 = 1; // const/4 v5, 0x1
/* const-class v0, Ljava/util/List; */
v0 = (( com.naef.jnlua.LuaState ) p1 ).isJavaObject ( v5, v0 ); // invoke-virtual {p1, v5, v0}, Lcom/naef/jnlua/LuaState;->isJavaObject(ILjava/lang/Class;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* const-class v0, Ljava/util/List; */
(( com.naef.jnlua.LuaState ) p1 ).toJavaObject ( v5, v0 ); // invoke-virtual {p1, v5, v0}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
v1 = this.listNext;
(( com.naef.jnlua.LuaState ) p1 ).pushJavaFunction ( v1 ); // invoke-virtual {p1, v1}, Lcom/naef/jnlua/LuaState;->pushJavaFunction(Lcom/naef/jnlua/JavaFunction;)V
} // :goto_0
(( com.naef.jnlua.LuaState ) p1 ).pushJavaObject ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
(( com.naef.jnlua.LuaState ) p1 ).pushInteger ( v6 ); // invoke-virtual {p1, v6}, Lcom/naef/jnlua/LuaState;->pushInteger(I)V
int v0 = 3; // const/4 v0, 0x3
} // :cond_0
/* const-class v0, Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).checkJavaObject ( v5, v0 ); // invoke-virtual {p1, v5, v0}, Lcom/naef/jnlua/LuaState;->checkJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
v1 = (( java.lang.Class ) v1 ).isArray ( ); // invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z
final String v2 = "expected list or array, got %s"; // const-string v2, "expected list or array, got %s"
/* new-array v3, v5, [Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).typeName ( v5 ); // invoke-virtual {p1, v5}, Lcom/naef/jnlua/LuaState;->typeName(I)Ljava/lang/String;
/* aput-object v4, v3, v6 */
java.lang.String .format ( v2,v3 );
(( com.naef.jnlua.LuaState ) p1 ).checkArg ( v5, v1, v2 ); // invoke-virtual {p1, v5, v1, v2}, Lcom/naef/jnlua/LuaState;->checkArg(IZLjava/lang/String;)V
v1 = this.arrayNext;
(( com.naef.jnlua.LuaState ) p1 ).pushJavaFunction ( v1 ); // invoke-virtual {p1, v1}, Lcom/naef/jnlua/LuaState;->pushJavaFunction(Lcom/naef/jnlua/JavaFunction;)V
} // .end method
