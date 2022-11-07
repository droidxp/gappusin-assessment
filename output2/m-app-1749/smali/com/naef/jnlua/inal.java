class inal implements com.naef.jnlua.DefaultConverter$LuaValueConverter {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/DefaultConverter; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = null */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Object;", */
/* "Lcom/naef/jnlua/DefaultConverter$LuaValueConverter", */
/* "<", */
/* "Ljava/lang/Short;", */
/* ">;" */
/* } */
} // .end annotation
/* # direct methods */
 inal ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public java.lang.Object convert ( com.naef.jnlua.LuaState p0, Integer p1 ) { //bridge//synthethic
/* .locals 1 */
(( com.naef.jnlua.DefaultConverter$3 ) p0 ).convert ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/naef/jnlua/DefaultConverter$3;->convert(Lcom/naef/jnlua/LuaState;I)Ljava/lang/Short;
} // .end method
public java.lang.Short convert ( com.naef.jnlua.LuaState p0, Integer p1 ) {
/* .locals 1 */
v0 = (( com.naef.jnlua.LuaState ) p1 ).toInteger ( p2 ); // invoke-virtual {p1, p2}, Lcom/naef/jnlua/LuaState;->toInteger(I)I
/* int-to-short v0, v0 */
java.lang.Short .valueOf ( v0 );
} // .end method
