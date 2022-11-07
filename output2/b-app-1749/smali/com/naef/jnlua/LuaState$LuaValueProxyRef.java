class com.naef.jnlua.LuaState$LuaValueProxyRef extends java.lang.ref.PhantomReference {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/LuaState; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "LuaValueProxyRef" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/ref/PhantomReference", */
/* "<", */
/* "Lcom/naef/jnlua/LuaState$LuaValueProxyImpl;", */
/* ">;" */
/* } */
} // .end annotation
/* # instance fields */
private Integer reference;
/* # direct methods */
public com.naef.jnlua.LuaState$LuaValueProxyRef ( ) {
/* .locals 1 */
(( com.naef.jnlua.LuaState$LuaValueProxyImpl ) p1 ).getLuaState ( ); // invoke-virtual {p1}, Lcom/naef/jnlua/LuaState$LuaValueProxyImpl;->getLuaState()Lcom/naef/jnlua/LuaState;
com.naef.jnlua.LuaState .access$300 ( v0 );
/* invoke-direct {p0, p1, v0}, Ljava/lang/ref/PhantomReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V */
/* iput p2, p0, Lcom/naef/jnlua/LuaState$LuaValueProxyRef;->reference:I */
return;
} // .end method
/* # virtual methods */
public Integer getReference ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/naef/jnlua/LuaState$LuaValueProxyRef;->reference:I */
} // .end method
