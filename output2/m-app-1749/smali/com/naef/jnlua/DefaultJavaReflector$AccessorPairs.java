class com.naef.jnlua.DefaultJavaReflector$AccessorPairs implements com.naef.jnlua.JavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/DefaultJavaReflector; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "AccessorPairs" */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Lcom/naef/jnlua/DefaultJavaReflector$AccessorPairs$AccessorNext; */
/* } */
} // .end annotation
/* # instance fields */
private java.lang.Class accessorClass;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Class", */
/* "<*>;" */
/* } */
} // .end annotation
} // .end field
final com.naef.jnlua.DefaultJavaReflector this$0; //synthetic
/* # direct methods */
public com.naef.jnlua.DefaultJavaReflector$AccessorPairs ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class", */
/* "<*>;)V" */
/* } */
} // .end annotation
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
this.accessorClass = p2;
return;
} // .end method
static java.lang.Class access$900 ( com.naef.jnlua.DefaultJavaReflector$AccessorPairs p0 ) { //synthethic
/* .locals 1 */
v0 = this.accessorClass;
} // .end method
/* # virtual methods */
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 5 */
int v0 = 1; // const/4 v0, 0x1
/* const-class v1, Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).toJavaObject ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
v2 = this.this$0;
com.naef.jnlua.DefaultJavaReflector .access$700 ( v2,v1 );
v3 = this.this$0;
com.naef.jnlua.DefaultJavaReflector .access$800 ( v3,v1 );
/* new-instance v4, Lcom/naef/jnlua/DefaultJavaReflector$AccessorPairs$AccessorNext; */
/* if-ne v2, v1, :cond_0 */
} // :goto_0
/* invoke-direct {v4, p0, v3, v0}, Lcom/naef/jnlua/DefaultJavaReflector$AccessorPairs$AccessorNext;-><init>(Lcom/naef/jnlua/DefaultJavaReflector$AccessorPairs;Ljava/util/Iterator;Z)V */
(( com.naef.jnlua.LuaState ) p1 ).pushJavaObject ( v4 ); // invoke-virtual {p1, v4}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
(( com.naef.jnlua.LuaState ) p1 ).pushJavaObject ( v1 ); // invoke-virtual {p1, v1}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
(( com.naef.jnlua.LuaState ) p1 ).pushNil ( ); // invoke-virtual {p1}, Lcom/naef/jnlua/LuaState;->pushNil()V
int v0 = 3; // const/4 v0, 0x3
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
