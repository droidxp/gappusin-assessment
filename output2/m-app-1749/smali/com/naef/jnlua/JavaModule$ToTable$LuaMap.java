class com.naef.jnlua.JavaModule$ToTable$LuaMap implements com.naef.jnlua.JavaReflector implements com.naef.jnlua.TypedJavaObject {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/JavaModule$ToTable; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "LuaMap" */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Lcom/naef/jnlua/JavaModule$ToTable$LuaMap$NewIndex;, */
/* Lcom/naef/jnlua/JavaModule$ToTable$LuaMap$Index; */
/* } */
} // .end annotation
/* # static fields */
private static final com.naef.jnlua.JavaFunction INDEX;
private static final com.naef.jnlua.JavaFunction NEW_INDEX;
/* # instance fields */
private java.util.Map map;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/Object;", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
static com.naef.jnlua.JavaModule$ToTable$LuaMap ( ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
/* new-instance v0, Lcom/naef/jnlua/JavaModule$ToTable$LuaMap$Index; */
/* invoke-direct {v0, v1}, Lcom/naef/jnlua/JavaModule$ToTable$LuaMap$Index;-><init>(Lcom/naef/jnlua/JavaModule$1;)V */
/* new-instance v0, Lcom/naef/jnlua/JavaModule$ToTable$LuaMap$NewIndex; */
/* invoke-direct {v0, v1}, Lcom/naef/jnlua/JavaModule$ToTable$LuaMap$NewIndex;-><init>(Lcom/naef/jnlua/JavaModule$1;)V */
return;
} // .end method
public com.naef.jnlua.JavaModule$ToTable$LuaMap ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/Object;", */
/* "Ljava/lang/Object;", */
/* ">;)V" */
/* } */
} // .end annotation
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
this.map = p1;
return;
} // .end method
/* # virtual methods */
public java.util.Map getMap ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/Object;", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
v0 = this.map;
} // .end method
public com.naef.jnlua.JavaFunction getMetamethod ( com.naef.jnlua.JavaReflector$Metamethod p0 ) {
/* .locals 2 */
v0 = com.naef.jnlua.JavaModule$1.$SwitchMap$com$naef$jnlua$JavaReflector$Metamethod;
v1 = (( com.naef.jnlua.JavaReflector$Metamethod ) p1 ).ordinal ( ); // invoke-virtual {p1}, Lcom/naef/jnlua/JavaReflector$Metamethod;->ordinal()I
/* aget v0, v0, v1 */
/* packed-switch v0, :pswitch_data_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* :pswitch_0 */
v0 = com.naef.jnlua.JavaModule$ToTable$LuaMap.INDEX;
/* :pswitch_1 */
v0 = com.naef.jnlua.JavaModule$ToTable$LuaMap.NEW_INDEX;
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public java.lang.Object getObject ( ) {
/* .locals 1 */
v0 = this.map;
} // .end method
public java.lang.Class getType ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class", */
/* "<*>;" */
/* } */
} // .end annotation
/* const-class v0, Ljava/util/Map; */
} // .end method
public Boolean isStrong ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
