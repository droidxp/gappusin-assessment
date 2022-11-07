class com.naef.jnlua.LuaState$LuaInvocationHandler extends com.naef.jnlua.LuaState$LuaValueProxyImpl implements java.lang.reflect.InvocationHandler {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/LuaState; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "LuaInvocationHandler" */
} // .end annotation
/* # instance fields */
final com.naef.jnlua.LuaState this$0; //synthetic
/* # direct methods */
public com.naef.jnlua.LuaState$LuaInvocationHandler ( ) {
/* .locals 0 */
this.this$0 = p1;
/* invoke-direct {p0, p1, p2}, Lcom/naef/jnlua/LuaState$LuaValueProxyImpl;-><init>(Lcom/naef/jnlua/LuaState;I)V */
return;
} // .end method
/* # virtual methods */
public java.lang.Object invoke ( java.lang.Object p0, java.lang.reflect.Method p1, java.lang.Object[] p2 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Throwable; */
/* } */
} // .end annotation
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
(( java.lang.reflect.Method ) p2 ).getDeclaringClass ( ); // invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;
/* const-class v3, Lcom/naef/jnlua/LuaValueProxy; */
/* if-ne v0, v3, :cond_0 */
(( java.lang.reflect.Method ) p2 ).invoke ( p0, p3 ); // invoke-virtual {p2, p0, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
} // :goto_0
} // :cond_0
v4 = this.this$0;
/* monitor-enter v4 */
try { // :try_start_0
(( com.naef.jnlua.LuaState$LuaInvocationHandler ) p0 ).pushValue ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/LuaState$LuaInvocationHandler;->pushValue()V
v0 = this.this$0;
int v3 = -1; // const/4 v3, -0x1
(( java.lang.reflect.Method ) p2 ).getName ( ); // invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;
(( com.naef.jnlua.LuaState ) v0 ).getField ( v3, v5 ); // invoke-virtual {v0, v3, v5}, Lcom/naef/jnlua/LuaState;->getField(ILjava/lang/String;)V
v0 = this.this$0;
int v3 = -1; // const/4 v3, -0x1
v0 = (( com.naef.jnlua.LuaState ) v0 ).isFunction ( v3 ); // invoke-virtual {v0, v3}, Lcom/naef/jnlua/LuaState;->isFunction(I)Z
/* if-nez v0, :cond_1 */
v0 = this.this$0;
int v1 = 2; // const/4 v1, 0x2
(( com.naef.jnlua.LuaState ) v0 ).pop ( v1 ); // invoke-virtual {v0, v1}, Lcom/naef/jnlua/LuaState;->pop(I)V
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
(( java.lang.reflect.Method ) p2 ).getName ( ); // invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v4 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // :cond_1
try { // :try_start_1
v0 = this.this$0;
int v3 = -2; // const/4 v3, -0x2
(( com.naef.jnlua.LuaState ) v0 ).insert ( v3 ); // invoke-virtual {v0, v3}, Lcom/naef/jnlua/LuaState;->insert(I)V
if ( p3 != null) { // if-eqz p3, :cond_2
/* array-length v0, p3 */
} // :goto_1
/* move v3, v1 */
} // :goto_2
/* if-ge v3, v0, :cond_3 */
v5 = this.this$0;
/* aget-object v6, p3, v3 */
(( com.naef.jnlua.LuaState ) v5 ).pushJavaObject ( v6 ); // invoke-virtual {v5, v6}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_2
/* move v0, v1 */
} // :cond_3
(( java.lang.reflect.Method ) p2 ).getReturnType ( ); // invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;
v5 = java.lang.Void.TYPE;
/* if-eq v3, v5, :cond_4 */
/* move v1, v2 */
} // :cond_4
v3 = this.this$0;
/* add-int/lit8 v0, v0, 0x1 */
(( com.naef.jnlua.LuaState ) v3 ).call ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Lcom/naef/jnlua/LuaState;->call(II)V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* if-ne v1, v2, :cond_6 */
try { // :try_start_2
v0 = this.this$0;
int v3 = -1; // const/4 v3, -0x1
(( java.lang.reflect.Method ) p2 ).getReturnType ( ); // invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;
(( com.naef.jnlua.LuaState ) v0 ).toJavaObject ( v3, v5 ); // invoke-virtual {v0, v3, v5}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
} // :goto_3
/* if-ne v1, v2, :cond_5 */
try { // :try_start_3
v1 = this.this$0;
int v2 = 1; // const/4 v2, 0x1
(( com.naef.jnlua.LuaState ) v1 ).pop ( v2 ); // invoke-virtual {v1, v2}, Lcom/naef/jnlua/LuaState;->pop(I)V
} // :cond_5
/* monitor-exit v4 */
} // :cond_6
int v0 = 0; // const/4 v0, 0x0
/* :catchall_1 */
/* move-exception v0 */
/* if-ne v1, v2, :cond_7 */
v1 = this.this$0;
int v2 = 1; // const/4 v2, 0x1
(( com.naef.jnlua.LuaState ) v1 ).pop ( v2 ); // invoke-virtual {v1, v2}, Lcom/naef/jnlua/LuaState;->pop(I)V
} // :cond_7
/* throw v0 */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
} // .end method
