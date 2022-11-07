class com.naef.jnlua.JavaModule$Pairs$MapNext implements com.naef.jnlua.JavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/JavaModule$Pairs; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "MapNext" */
} // .end annotation
/* # instance fields */
private java.util.Iterator iterator;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Iterator", */
/* "<", */
/* "Ljava/util/Map$Entry", */
/* "<", */
/* "Ljava/lang/Object;", */
/* "Ljava/lang/Object;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.naef.jnlua.JavaModule$Pairs$MapNext ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Iterator", */
/* "<", */
/* "Ljava/util/Map$Entry", */
/* "<", */
/* "Ljava/lang/Object;", */
/* "Ljava/lang/Object;", */
/* ">;>;)V" */
/* } */
} // .end annotation
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
this.iterator = p1;
return;
} // .end method
/* # virtual methods */
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 2 */
v0 = v0 = this.iterator;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.iterator;
/* check-cast v0, Ljava/util/Map$Entry; */
(( com.naef.jnlua.LuaState ) p1 ).pushJavaObject ( v1 ); // invoke-virtual {p1, v1}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
(( com.naef.jnlua.LuaState ) p1 ).pushJavaObject ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
int v0 = 2; // const/4 v0, 0x2
} // :goto_0
} // :cond_0
(( com.naef.jnlua.LuaState ) p1 ).pushNil ( ); // invoke-virtual {p1}, Lcom/naef/jnlua/LuaState;->pushNil()V
int v0 = 1; // const/4 v0, 0x1
} // .end method
