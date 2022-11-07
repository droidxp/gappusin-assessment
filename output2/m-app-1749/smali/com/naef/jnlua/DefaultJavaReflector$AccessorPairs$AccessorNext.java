class com.naef.jnlua.DefaultJavaReflector$AccessorPairs$AccessorNext implements com.naef.jnlua.JavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/DefaultJavaReflector$AccessorPairs; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "AccessorNext" */
} // .end annotation
/* # instance fields */
private Boolean isStatic;
private java.util.Iterator iterator;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Iterator", */
/* "<", */
/* "Ljava/util/Map$Entry", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Lcom/naef/jnlua/DefaultJavaReflector$Accessor;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
final com.naef.jnlua.DefaultJavaReflector$AccessorPairs this$1; //synthetic
/* # direct methods */
public com.naef.jnlua.DefaultJavaReflector$AccessorPairs$AccessorNext ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Iterator", */
/* "<", */
/* "Ljava/util/Map$Entry", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Lcom/naef/jnlua/DefaultJavaReflector$Accessor;", */
/* ">;>;Z)V" */
/* } */
} // .end annotation
this.this$1 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
this.iterator = p2;
/* iput-boolean p3, p0, Lcom/naef/jnlua/DefaultJavaReflector$AccessorPairs$AccessorNext;->isStatic:Z */
return;
} // .end method
/* # virtual methods */
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 4 */
} // :cond_0
} // :goto_0
v0 = v0 = this.iterator;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.iterator;
/* check-cast v0, Ljava/util/Map$Entry; */
/* check-cast v1, Lcom/naef/jnlua/DefaultJavaReflector$Accessor; */
(( java.lang.Object ) v1 ).getClass ( ); // invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
v3 = this.this$1;
com.naef.jnlua.DefaultJavaReflector$AccessorPairs .access$900 ( v3 );
/* if-ne v2, v3, :cond_0 */
/* iget-boolean v2, p0, Lcom/naef/jnlua/DefaultJavaReflector$AccessorPairs$AccessorNext;->isStatic:Z */
v2 = if ( v2 != null) { // if-eqz v2, :cond_2
if ( v2 != null) { // if-eqz v2, :cond_0
} // :cond_1
/* check-cast v0, Ljava/lang/String; */
(( com.naef.jnlua.LuaState ) p1 ).pushString ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->pushString(Ljava/lang/String;)V
int v0 = 1; // const/4 v0, 0x1
/* const-class v2, Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).toJavaObject ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
int v0 = 2; // const/4 v0, 0x2
} // :goto_1
v2 = } // :cond_2
/* if-nez v2, :cond_1 */
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // .end method
