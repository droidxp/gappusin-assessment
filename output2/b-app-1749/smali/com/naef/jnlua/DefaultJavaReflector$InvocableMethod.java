class com.naef.jnlua.DefaultJavaReflector$InvocableMethod implements com.naef.jnlua.DefaultJavaReflector$Invocable {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/DefaultJavaReflector; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "InvocableMethod" */
} // .end annotation
/* # instance fields */
private java.lang.reflect.Method method;
private java.lang.Class parameterTypes;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "[", */
/* "Ljava/lang/Class", */
/* "<*>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.naef.jnlua.DefaultJavaReflector$InvocableMethod ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
this.method = p1;
(( java.lang.reflect.Method ) p1 ).getParameterTypes ( ); // invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;
this.parameterTypes = v0;
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
v0 = this.method;
(( java.lang.reflect.Method ) v0 ).getDeclaringClass ( ); // invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;
} // .end method
public Integer getModifiers ( ) {
/* .locals 1 */
v0 = this.method;
v0 = (( java.lang.reflect.Method ) v0 ).getModifiers ( ); // invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I
} // .end method
public java.lang.String getName ( ) {
/* .locals 1 */
v0 = this.method;
(( java.lang.reflect.Method ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;
} // .end method
public Integer getParameterCount ( ) {
/* .locals 1 */
v0 = this.parameterTypes;
/* array-length v0, v0 */
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
v0 = this.method;
v0 = (( java.lang.reflect.Method ) v0 ).isVarArgs ( ); // invoke-virtual {v0}, Ljava/lang/reflect/Method;->isVarArgs()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.parameterTypes;
/* array-length v0, v0 */
/* add-int/lit8 v0, v0, -0x1 */
/* if-lt p1, v0, :cond_0 */
v0 = this.parameterTypes;
v1 = this.parameterTypes;
/* array-length v1, v1 */
/* add-int/lit8 v1, v1, -0x1 */
/* aget-object v0, v0, v1 */
(( java.lang.Class ) v0 ).getComponentType ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
} // :goto_0
} // :cond_0
v0 = this.parameterTypes;
/* aget-object v0, v0, p1 */
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
v0 = this.parameterTypes;
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
v0 = this.method;
(( java.lang.reflect.Method ) v0 ).getReturnType ( ); // invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;
} // .end method
public java.lang.String getWhat ( ) {
/* .locals 1 */
final String v0 = "method"; // const-string v0, "method"
} // .end method
public java.lang.Object invoke ( java.lang.Object p0, java.lang.Object...p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/IllegalAccessException;, */
/* Ljava/lang/IllegalArgumentException;, */
/* Ljava/lang/reflect/InvocationTargetException; */
/* } */
} // .end annotation
v0 = this.method;
(( java.lang.reflect.Method ) v0 ).invoke ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
public Boolean isRawReturn ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isVarArgs ( ) {
/* .locals 1 */
v0 = this.method;
v0 = (( java.lang.reflect.Method ) v0 ).isVarArgs ( ); // invoke-virtual {v0}, Ljava/lang/reflect/Method;->isVarArgs()Z
} // .end method
public java.lang.String toString ( ) {
/* .locals 1 */
v0 = this.method;
(( java.lang.reflect.Method ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/reflect/Method;->toString()Ljava/lang/String;
} // .end method
