class com.naef.jnlua.DefaultJavaReflector$InvocableProxy implements com.naef.jnlua.DefaultJavaReflector$Invocable {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/DefaultJavaReflector; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "InvocableProxy" */
} // .end annotation
/* # static fields */
private static final java.lang.Class PARAMETER_TYPES;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "[", */
/* "Ljava/lang/Class", */
/* "<*>;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
private java.lang.Class interfaze;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Class", */
/* "<*>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
static com.naef.jnlua.DefaultJavaReflector$InvocableProxy ( ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljava/lang/Class; */
int v1 = 0; // const/4 v1, 0x0
/* const-class v2, Lcom/naef/jnlua/LuaValueProxy; */
/* aput-object v2, v0, v1 */
return;
} // .end method
public com.naef.jnlua.DefaultJavaReflector$InvocableProxy ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class", */
/* "<*>;)V" */
/* } */
} // .end annotation
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
this.interfaze = p1;
return;
} // .end method
/* # virtual methods */
public java.lang.Class getDeclaringClass ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class", */
/* "<*>;" */
/* } */
} // .end annotation
v0 = this.interfaze;
} // .end method
public Integer getModifiers ( ) {
/* .locals 1 */
v0 = this.interfaze;
v0 = (( java.lang.Class ) v0 ).getModifiers ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I
/* or-int/lit8 v0, v0, 0x8 */
} // .end method
public java.lang.String getName ( ) {
/* .locals 1 */
final String v0 = "new"; // const-string v0, "new"
} // .end method
public Integer getParameterCount ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public java.lang.Class getParameterType ( Integer p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I)", */
/* "Ljava/lang/Class", */
/* "<*>;" */
/* } */
} // .end annotation
v0 = com.naef.jnlua.DefaultJavaReflector$InvocableProxy.PARAMETER_TYPES;
int v1 = 0; // const/4 v1, 0x0
/* aget-object v0, v0, v1 */
} // .end method
public java.lang.Class getParameterTypes ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()[", */
/* "Ljava/lang/Class", */
/* "<*>;" */
/* } */
} // .end annotation
v0 = com.naef.jnlua.DefaultJavaReflector$InvocableProxy.PARAMETER_TYPES;
} // .end method
public java.lang.Class getReturnType ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class", */
/* "<*>;" */
/* } */
} // .end annotation
v0 = this.interfaze;
} // .end method
public java.lang.String getWhat ( ) {
/* .locals 1 */
final String v0 = "proxy"; // const-string v0, "proxy"
} // .end method
public java.lang.Object invoke ( java.lang.Object p0, java.lang.Object...p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/InstantiationException;, */
/* Ljava/lang/IllegalAccessException;, */
/* Ljava/lang/IllegalArgumentException;, */
/* Ljava/lang/reflect/InvocationTargetException; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* aget-object v0, p2, v0 */
/* check-cast v0, Lcom/naef/jnlua/LuaValueProxy; */
int v2 = -1; // const/4 v2, -0x1
v3 = this.interfaze;
(( com.naef.jnlua.LuaState ) v1 ).getProxy ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/naef/jnlua/LuaState;->getProxy(ILjava/lang/Class;)Ljava/lang/Object;
int v2 = 1; // const/4 v2, 0x1
(( com.naef.jnlua.LuaState ) v0 ).pop ( v2 ); // invoke-virtual {v0, v2}, Lcom/naef/jnlua/LuaState;->pop(I)V
} // .end method
public Boolean isRawReturn ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean isVarArgs ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.String toString ( ) {
/* .locals 1 */
v0 = this.interfaze;
(( java.lang.Class ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Class;->toString()Ljava/lang/String;
} // .end method
