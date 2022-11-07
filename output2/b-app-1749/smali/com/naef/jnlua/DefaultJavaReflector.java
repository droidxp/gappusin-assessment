public class com.naef.jnlua.DefaultJavaReflector implements com.naef.jnlua.JavaReflector {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/naef/jnlua/DefaultJavaReflector$1;, */
	 /* Lcom/naef/jnlua/DefaultJavaReflector$LuaCallSignature;, */
	 /* Lcom/naef/jnlua/DefaultJavaReflector$InvocableProxy;, */
	 /* Lcom/naef/jnlua/DefaultJavaReflector$InvocableConstructor;, */
	 /* Lcom/naef/jnlua/DefaultJavaReflector$InvocableMethod;, */
	 /* Lcom/naef/jnlua/DefaultJavaReflector$Invocable;, */
	 /* Lcom/naef/jnlua/DefaultJavaReflector$PropertyAccessor;, */
	 /* Lcom/naef/jnlua/DefaultJavaReflector$InvocableAccessor;, */
	 /* Lcom/naef/jnlua/DefaultJavaReflector$FieldAccessor;, */
	 /* Lcom/naef/jnlua/DefaultJavaReflector$Accessor;, */
	 /* Lcom/naef/jnlua/DefaultJavaReflector$ToString;, */
	 /* Lcom/naef/jnlua/DefaultJavaReflector$AccessorPairs;, */
	 /* Lcom/naef/jnlua/DefaultJavaReflector$LessThanOrEqual;, */
	 /* Lcom/naef/jnlua/DefaultJavaReflector$LessThan;, */
	 /* Lcom/naef/jnlua/DefaultJavaReflector$Equal;, */
	 /* Lcom/naef/jnlua/DefaultJavaReflector$Length;, */
	 /* Lcom/naef/jnlua/DefaultJavaReflector$NewIndex;, */
	 /* Lcom/naef/jnlua/DefaultJavaReflector$Index; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.Object EMPTY_ARGUMENTS;
private static final com.naef.jnlua.DefaultJavaReflector INSTANCE;
private static final java.lang.Object JAVA_FUNCTION_TYPE;
/* # instance fields */
private java.util.concurrent.locks.ReadWriteLock accessorLock;
private java.util.Map accessors;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/Class", */
/* "<*>;", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Lcom/naef/jnlua/DefaultJavaReflector$Accessor;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
private com.naef.jnlua.JavaFunction equal;
private com.naef.jnlua.JavaFunction index;
private java.util.concurrent.locks.ReadWriteLock invocableDispatchLock;
private java.util.Map invocableDispatches;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Lcom/naef/jnlua/DefaultJavaReflector$LuaCallSignature;", */
/* "Lcom/naef/jnlua/DefaultJavaReflector$Invocable;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private com.naef.jnlua.JavaFunction javaFields;
private com.naef.jnlua.JavaFunction javaMethods;
private com.naef.jnlua.JavaFunction javaProperties;
private com.naef.jnlua.JavaFunction length;
private com.naef.jnlua.JavaFunction lessThan;
private com.naef.jnlua.JavaFunction lessThanOrEqual;
private com.naef.jnlua.JavaFunction newIndex;
private com.naef.jnlua.JavaFunction toString;
/* # direct methods */
static com.naef.jnlua.DefaultJavaReflector ( ) {
/* .locals 1 */
/* new-instance v0, Lcom/naef/jnlua/DefaultJavaReflector; */
/* invoke-direct {v0}, Lcom/naef/jnlua/DefaultJavaReflector;-><init>()V */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Ljava/lang/Object; */
return;
} // .end method
private com.naef.jnlua.DefaultJavaReflector ( ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.accessors = v0;
/* new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock; */
/* invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V */
this.accessorLock = v0;
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.invocableDispatches = v0;
/* new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock; */
/* invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V */
this.invocableDispatchLock = v0;
/* new-instance v0, Lcom/naef/jnlua/DefaultJavaReflector$Index; */
/* invoke-direct {v0, p0, v1}, Lcom/naef/jnlua/DefaultJavaReflector$Index;-><init>(Lcom/naef/jnlua/DefaultJavaReflector;Lcom/naef/jnlua/DefaultJavaReflector$1;)V */
this.index = v0;
/* new-instance v0, Lcom/naef/jnlua/DefaultJavaReflector$NewIndex; */
/* invoke-direct {v0, p0, v1}, Lcom/naef/jnlua/DefaultJavaReflector$NewIndex;-><init>(Lcom/naef/jnlua/DefaultJavaReflector;Lcom/naef/jnlua/DefaultJavaReflector$1;)V */
this.newIndex = v0;
/* new-instance v0, Lcom/naef/jnlua/DefaultJavaReflector$Equal; */
/* invoke-direct {v0, p0, v1}, Lcom/naef/jnlua/DefaultJavaReflector$Equal;-><init>(Lcom/naef/jnlua/DefaultJavaReflector;Lcom/naef/jnlua/DefaultJavaReflector$1;)V */
this.equal = v0;
/* new-instance v0, Lcom/naef/jnlua/DefaultJavaReflector$Length; */
/* invoke-direct {v0, p0, v1}, Lcom/naef/jnlua/DefaultJavaReflector$Length;-><init>(Lcom/naef/jnlua/DefaultJavaReflector;Lcom/naef/jnlua/DefaultJavaReflector$1;)V */
this.length = v0;
/* new-instance v0, Lcom/naef/jnlua/DefaultJavaReflector$LessThan; */
/* invoke-direct {v0, p0, v1}, Lcom/naef/jnlua/DefaultJavaReflector$LessThan;-><init>(Lcom/naef/jnlua/DefaultJavaReflector;Lcom/naef/jnlua/DefaultJavaReflector$1;)V */
this.lessThan = v0;
/* new-instance v0, Lcom/naef/jnlua/DefaultJavaReflector$LessThanOrEqual; */
/* invoke-direct {v0, p0, v1}, Lcom/naef/jnlua/DefaultJavaReflector$LessThanOrEqual;-><init>(Lcom/naef/jnlua/DefaultJavaReflector;Lcom/naef/jnlua/DefaultJavaReflector$1;)V */
this.lessThanOrEqual = v0;
/* new-instance v0, Lcom/naef/jnlua/DefaultJavaReflector$ToString; */
/* invoke-direct {v0, p0, v1}, Lcom/naef/jnlua/DefaultJavaReflector$ToString;-><init>(Lcom/naef/jnlua/DefaultJavaReflector;Lcom/naef/jnlua/DefaultJavaReflector$1;)V */
this.toString = v0;
/* new-instance v0, Lcom/naef/jnlua/DefaultJavaReflector$AccessorPairs; */
/* const-class v1, Lcom/naef/jnlua/DefaultJavaReflector$FieldAccessor; */
/* invoke-direct {v0, p0, v1}, Lcom/naef/jnlua/DefaultJavaReflector$AccessorPairs;-><init>(Lcom/naef/jnlua/DefaultJavaReflector;Ljava/lang/Class;)V */
this.javaFields = v0;
/* new-instance v0, Lcom/naef/jnlua/DefaultJavaReflector$AccessorPairs; */
/* const-class v1, Lcom/naef/jnlua/DefaultJavaReflector$InvocableAccessor; */
/* invoke-direct {v0, p0, v1}, Lcom/naef/jnlua/DefaultJavaReflector$AccessorPairs;-><init>(Lcom/naef/jnlua/DefaultJavaReflector;Ljava/lang/Class;)V */
this.javaMethods = v0;
/* new-instance v0, Lcom/naef/jnlua/DefaultJavaReflector$AccessorPairs; */
/* const-class v1, Lcom/naef/jnlua/DefaultJavaReflector$PropertyAccessor; */
/* invoke-direct {v0, p0, v1}, Lcom/naef/jnlua/DefaultJavaReflector$AccessorPairs;-><init>(Lcom/naef/jnlua/DefaultJavaReflector;Ljava/lang/Class;)V */
this.javaProperties = v0;
return;
} // .end method
static java.util.concurrent.locks.ReadWriteLock access$1000 ( com.naef.jnlua.DefaultJavaReflector p0 ) { //synthethic
/* .locals 1 */
v0 = this.invocableDispatchLock;
} // .end method
static java.util.Map access$1100 ( com.naef.jnlua.DefaultJavaReflector p0 ) { //synthethic
/* .locals 1 */
v0 = this.invocableDispatches;
} // .end method
static java.lang.Object access$1200 ( ) { //synthethic
/* .locals 1 */
v0 = com.naef.jnlua.DefaultJavaReflector.JAVA_FUNCTION_TYPE;
} // .end method
static java.lang.Class access$700 ( com.naef.jnlua.DefaultJavaReflector p0, java.lang.Object p1 ) { //synthethic
/* .locals 1 */
/* invoke-direct {p0, p1}, Lcom/naef/jnlua/DefaultJavaReflector;->getObjectClass(Ljava/lang/Object;)Ljava/lang/Class; */
} // .end method
static java.util.Map access$800 ( com.naef.jnlua.DefaultJavaReflector p0, java.lang.Object p1 ) { //synthethic
/* .locals 1 */
/* invoke-direct {p0, p1}, Lcom/naef/jnlua/DefaultJavaReflector;->getObjectAccessors(Ljava/lang/Object;)Ljava/util/Map; */
} // .end method
private java.util.Map createClassAccessors ( java.lang.Class p0 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class", */
/* "<*>;)", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Lcom/naef/jnlua/DefaultJavaReflector$Accessor;", */
/* ">;" */
/* } */
} // .end annotation
int v1 = 0; // const/4 v1, 0x0
/* new-instance v5, Ljava/util/HashMap; */
/* invoke-direct {v5}, Ljava/util/HashMap;-><init>()V */
(( java.lang.Class ) p1 ).getFields ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;
/* move v0, v1 */
} // :goto_0
/* array-length v3, v2 */
/* if-ge v0, v3, :cond_0 */
/* aget-object v3, v2, v0 */
(( java.lang.reflect.Field ) v3 ).getName ( ); // invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
/* new-instance v4, Lcom/naef/jnlua/DefaultJavaReflector$FieldAccessor; */
/* aget-object v6, v2, v0 */
/* invoke-direct {v4, p0, v6}, Lcom/naef/jnlua/DefaultJavaReflector$FieldAccessor;-><init>(Lcom/naef/jnlua/DefaultJavaReflector;Ljava/lang/reflect/Field;)V */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
/* new-instance v6, Ljava/util/HashMap; */
/* invoke-direct {v6}, Ljava/util/HashMap;-><init>()V */
(( java.lang.Class ) p1 ).getMethods ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;
/* move v2, v1 */
} // :goto_1
/* array-length v0, v7 */
/* if-ge v2, v0, :cond_5 */
/* aget-object v0, v7, v2 */
v3 = (( java.lang.reflect.Method ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;
if ( v3 != null) { // if-eqz v3, :cond_2
} // :cond_1
} // :goto_2
/* add-int/lit8 v0, v2, 0x1 */
/* move v2, v0 */
} // :cond_2
(( java.lang.reflect.Method ) v0 ).getDeclaringClass ( ); // invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;
v3 = (( java.lang.Class ) v3 ).getModifiers ( ); // invoke-virtual {v3}, Ljava/lang/Class;->getModifiers()I
v3 = java.lang.reflect.Modifier .isPublic ( v3 );
/* if-nez v3, :cond_3 */
(( java.lang.reflect.Method ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;
(( java.lang.reflect.Method ) v0 ).getParameterTypes ( ); // invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;
/* invoke-direct {p0, p1, v3, v0}, Lcom/naef/jnlua/DefaultJavaReflector;->getInterfaceMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method; */
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_3
/* move-object v3, v0 */
(( java.lang.reflect.Method ) v3 ).getName ( ); // invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;
/* check-cast v0, Ljava/util/Map; */
/* if-nez v0, :cond_b */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
(( java.lang.reflect.Method ) v3 ).getName ( ); // invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;
/* move-object v4, v0 */
} // :goto_3
(( java.lang.reflect.Method ) v3 ).getParameterTypes ( ); // invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;
java.util.Arrays .asList ( v0 );
/* check-cast v0, Lcom/naef/jnlua/DefaultJavaReflector$Invocable; */
if ( v0 != null) { // if-eqz v0, :cond_4
(( java.lang.reflect.Method ) v3 ).getDeclaringClass ( ); // invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;
v0 = (( java.lang.Class ) v9 ).isAssignableFrom ( v0 ); // invoke-virtual {v9, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
/* if-nez v0, :cond_1 */
} // :cond_4
/* new-instance v0, Lcom/naef/jnlua/DefaultJavaReflector$InvocableMethod; */
/* invoke-direct {v0, v3}, Lcom/naef/jnlua/DefaultJavaReflector$InvocableMethod;-><init>(Ljava/lang/reflect/Method;)V */
} // :cond_5
v0 = } // :goto_4
if ( v0 != null) { // if-eqz v0, :cond_6
/* check-cast v0, Ljava/util/Map$Entry; */
/* new-instance v4, Lcom/naef/jnlua/DefaultJavaReflector$InvocableAccessor; */
/* check-cast v0, Ljava/util/Map; */
/* invoke-direct {v4, p0, p1, v0}, Lcom/naef/jnlua/DefaultJavaReflector$InvocableAccessor;-><init>(Lcom/naef/jnlua/DefaultJavaReflector;Ljava/lang/Class;Ljava/util/Collection;)V */
} // :cond_6
(( java.lang.Class ) p1 ).getConstructors ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;
/* new-instance v2, Ljava/util/ArrayList; */
/* array-length v3, v0 */
/* invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V */
} // :goto_5
/* array-length v3, v0 */
/* if-ge v1, v3, :cond_8 */
/* aget-object v3, v0, v1 */
(( java.lang.reflect.Constructor ) v3 ).getDeclaringClass ( ); // invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;
v3 = (( java.lang.Class ) v3 ).getModifiers ( ); // invoke-virtual {v3}, Ljava/lang/Class;->getModifiers()I
v3 = java.lang.reflect.Modifier .isPublic ( v3 );
/* if-nez v3, :cond_7 */
} // :goto_6
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_7
/* new-instance v3, Lcom/naef/jnlua/DefaultJavaReflector$InvocableConstructor; */
/* aget-object v4, v0, v1 */
/* invoke-direct {v3, v4}, Lcom/naef/jnlua/DefaultJavaReflector$InvocableConstructor;-><init>(Ljava/lang/reflect/Constructor;)V */
} // :cond_8
v0 = (( java.lang.Class ) p1 ).isInterface ( ); // invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z
if ( v0 != null) { // if-eqz v0, :cond_9
/* new-instance v0, Lcom/naef/jnlua/DefaultJavaReflector$InvocableProxy; */
/* invoke-direct {v0, p1}, Lcom/naef/jnlua/DefaultJavaReflector$InvocableProxy;-><init>(Ljava/lang/Class;)V */
v0 = } // :cond_9
/* if-nez v0, :cond_a */
final String v0 = "new"; // const-string v0, "new"
/* new-instance v1, Lcom/naef/jnlua/DefaultJavaReflector$InvocableAccessor; */
/* invoke-direct {v1, p0, p1, v2}, Lcom/naef/jnlua/DefaultJavaReflector$InvocableAccessor;-><init>(Lcom/naef/jnlua/DefaultJavaReflector;Ljava/lang/Class;Ljava/util/Collection;)V */
} // :cond_a
} // :cond_b
/* move-object v4, v0 */
/* goto/16 :goto_3 */
} // .end method
public static com.naef.jnlua.DefaultJavaReflector getInstance ( ) {
/* .locals 1 */
v0 = com.naef.jnlua.DefaultJavaReflector.INSTANCE;
} // .end method
private java.lang.reflect.Method getInterfaceMethod ( java.lang.Class p0, java.lang.String p1, java.lang.Class[] p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class", */
/* "<*>;", */
/* "Ljava/lang/String;", */
/* "[", */
/* "Ljava/lang/Class", */
/* "<*>;)", */
/* "Ljava/lang/reflect/Method;" */
/* } */
} // .end annotation
} // :cond_0
(( java.lang.Class ) p1 ).getInterfaces ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* array-length v1, v2 */
/* if-ge v0, v1, :cond_3 */
/* aget-object v1, v2, v0 */
v1 = (( java.lang.Class ) v1 ).getModifiers ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getModifiers()I
v1 = java.lang.reflect.Modifier .isPublic ( v1 );
/* if-nez v1, :cond_2 */
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_2
try { // :try_start_0
/* aget-object v1, v2, v0 */
(( java.lang.Class ) v1 ).getDeclaredMethod ( p2, p3 ); // invoke-virtual {v1, p2, p3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_1
/* :catch_0 */
/* move-exception v1 */
/* aget-object v1, v2, v0 */
/* invoke-direct {p0, v1, p2, p3}, Lcom/naef/jnlua/DefaultJavaReflector;->getInterfaceMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* move-object v0, v1 */
} // :cond_3
(( java.lang.Class ) p1 ).getSuperclass ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;
/* if-nez p1, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
private java.util.Map getObjectAccessors ( java.lang.Object p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Object;", */
/* ")", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Lcom/naef/jnlua/DefaultJavaReflector$Accessor;", */
/* ">;" */
/* } */
} // .end annotation
/* invoke-direct {p0, p1}, Lcom/naef/jnlua/DefaultJavaReflector;->getObjectClass(Ljava/lang/Object;)Ljava/lang/Class; */
v0 = this.accessorLock;
try { // :try_start_0
v0 = this.accessors;
/* check-cast v0, Ljava/util/Map; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = this.accessorLock;
} // :goto_0
} // :cond_0
v0 = this.accessorLock;
/* invoke-direct {p0, v1}, Lcom/naef/jnlua/DefaultJavaReflector;->createClassAccessors(Ljava/lang/Class;)Ljava/util/Map; */
v2 = this.accessorLock;
try { // :try_start_1
v2 = v2 = this.accessors;
/* if-nez v2, :cond_1 */
v2 = this.accessors;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
} // :goto_1
v1 = this.accessorLock;
/* :catchall_0 */
/* move-exception v0 */
v1 = this.accessorLock;
/* throw v0 */
} // :cond_1
try { // :try_start_2
v0 = this.accessors;
/* check-cast v0, Ljava/util/Map; */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* :catchall_1 */
/* move-exception v0 */
v1 = this.accessorLock;
/* throw v0 */
} // .end method
private java.lang.Class getObjectClass ( java.lang.Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Object;", */
/* ")", */
/* "Ljava/lang/Class", */
/* "<*>;" */
/* } */
} // .end annotation
/* instance-of v0, p1, Ljava/lang/Class; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast p1, Ljava/lang/Class; */
} // :goto_0
} // :cond_0
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
} // .end method
/* # virtual methods */
public com.naef.jnlua.JavaFunction getMetamethod ( com.naef.jnlua.JavaReflector$Metamethod p0 ) {
/* .locals 2 */
v0 = com.naef.jnlua.DefaultJavaReflector$1.$SwitchMap$com$naef$jnlua$JavaReflector$Metamethod;
v1 = (( com.naef.jnlua.JavaReflector$Metamethod ) p1 ).ordinal ( ); // invoke-virtual {p1}, Lcom/naef/jnlua/JavaReflector$Metamethod;->ordinal()I
/* aget v0, v0, v1 */
/* packed-switch v0, :pswitch_data_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* :pswitch_0 */
v0 = this.index;
/* :pswitch_1 */
v0 = this.newIndex;
/* :pswitch_2 */
v0 = this.equal;
/* :pswitch_3 */
v0 = this.length;
/* :pswitch_4 */
v0 = this.lessThan;
/* :pswitch_5 */
v0 = this.lessThanOrEqual;
/* :pswitch_6 */
v0 = this.toString;
/* :pswitch_7 */
v0 = this.javaFields;
/* :pswitch_8 */
v0 = this.javaMethods;
/* :pswitch_9 */
v0 = this.javaProperties;
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_5 */
/* :pswitch_6 */
/* :pswitch_7 */
/* :pswitch_8 */
/* :pswitch_9 */
} // .end packed-switch
} // .end method
