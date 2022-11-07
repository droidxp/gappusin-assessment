class com.naef.jnlua.DefaultJavaReflector$InvocableConstructor implements com.naef.jnlua.DefaultJavaReflector$Invocable {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/DefaultJavaReflector; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "InvocableConstructor" */
} // .end annotation
/* # instance fields */
private java.lang.reflect.Constructor constructor;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/reflect/Constructor", */
/* "<*>;" */
/* } */
} // .end annotation
} // .end field
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
public com.naef.jnlua.DefaultJavaReflector$InvocableConstructor ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/reflect/Constructor", */
/* "<*>;)V" */
/* } */
} // .end annotation
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
this.constructor = p1;
(( java.lang.reflect.Constructor ) p1 ).getParameterTypes ( ); // invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;
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
v0 = this.constructor;
(( java.lang.reflect.Constructor ) v0 ).getDeclaringClass ( ); // invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;
} // .end method
public Integer getModifiers ( ) {
/* .locals 1 */
v0 = this.constructor;
v0 = (( java.lang.reflect.Constructor ) v0 ).getModifiers ( ); // invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getModifiers()I
/* or-int/lit8 v0, v0, 0x8 */
} // .end method
public java.lang.String getName ( ) {
/* .locals 1 */
final String v0 = "new"; // const-string v0, "new"
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
v0 = this.constructor;
v0 = (( java.lang.reflect.Constructor ) v0 ).isVarArgs ( ); // invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->isVarArgs()Z
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
v0 = this.constructor;
(( java.lang.reflect.Constructor ) v0 ).getDeclaringClass ( ); // invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;
} // .end method
public java.lang.String getWhat ( ) {
/* .locals 1 */
final String v0 = "constructor"; // const-string v0, "constructor"
} // .end method
public java.lang.Object invoke ( java.lang.Object p0, java.lang.Object...p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/InstantiationException;, */
/* Ljava/lang/IllegalAccessException;, */
/* Ljava/lang/IllegalArgumentException;, */
/* Ljava/lang/reflect/InvocationTargetException; */
/* } */
} // .end annotation
v0 = this.constructor;
(( java.lang.reflect.Constructor ) v0 ).newInstance ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
public Boolean isRawReturn ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isVarArgs ( ) {
/* .locals 1 */
v0 = this.constructor;
v0 = (( java.lang.reflect.Constructor ) v0 ).isVarArgs ( ); // invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->isVarArgs()Z
} // .end method
public java.lang.String toString ( ) {
/* .locals 1 */
v0 = this.constructor;
(( java.lang.reflect.Constructor ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->toString()Ljava/lang/String;
} // .end method
