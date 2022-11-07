public class com.naef.jnlua.JavaModule {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/naef/jnlua/JavaModule$1;, */
	 /* Lcom/naef/jnlua/JavaModule$Properties;, */
	 /* Lcom/naef/jnlua/JavaModule$Methods;, */
	 /* Lcom/naef/jnlua/JavaModule$Fields;, */
	 /* Lcom/naef/jnlua/JavaModule$Elements;, */
	 /* Lcom/naef/jnlua/JavaModule$ToTable;, */
	 /* Lcom/naef/jnlua/JavaModule$IPairs;, */
	 /* Lcom/naef/jnlua/JavaModule$Pairs;, */
	 /* Lcom/naef/jnlua/JavaModule$Proxy;, */
	 /* Lcom/naef/jnlua/JavaModule$Cast;, */
	 /* Lcom/naef/jnlua/JavaModule$InstanceOf;, */
	 /* Lcom/naef/jnlua/JavaModule$New;, */
	 /* Lcom/naef/jnlua/JavaModule$Require; */
	 /* } */
} // .end annotation
/* # static fields */
private static final com.naef.jnlua.NamedJavaFunction EMPTY_MODULE;
private static final com.naef.jnlua.JavaModule INSTANCE;
private static final java.util.Map PRIMITIVE_TYPES;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Class", */
/* "<*>;>;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
private final com.naef.jnlua.NamedJavaFunction functions;
/* # direct methods */
static com.naef.jnlua.JavaModule ( ) {
/* .locals 3 */
/* new-instance v0, Lcom/naef/jnlua/JavaModule; */
/* invoke-direct {v0}, Lcom/naef/jnlua/JavaModule;-><init>()V */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
v0 = com.naef.jnlua.JavaModule.PRIMITIVE_TYPES;
final String v1 = "boolean"; // const-string v1, "boolean"
v2 = java.lang.Boolean.TYPE;
v0 = com.naef.jnlua.JavaModule.PRIMITIVE_TYPES;
final String v1 = "byte"; // const-string v1, "byte"
v2 = java.lang.Byte.TYPE;
v0 = com.naef.jnlua.JavaModule.PRIMITIVE_TYPES;
final String v1 = "char"; // const-string v1, "char"
v2 = java.lang.Character.TYPE;
v0 = com.naef.jnlua.JavaModule.PRIMITIVE_TYPES;
final String v1 = "double"; // const-string v1, "double"
v2 = java.lang.Double.TYPE;
v0 = com.naef.jnlua.JavaModule.PRIMITIVE_TYPES;
final String v1 = "float"; // const-string v1, "float"
v2 = java.lang.Float.TYPE;
v0 = com.naef.jnlua.JavaModule.PRIMITIVE_TYPES;
final String v1 = "int"; // const-string v1, "int"
v2 = java.lang.Integer.TYPE;
v0 = com.naef.jnlua.JavaModule.PRIMITIVE_TYPES;
final String v1 = "long"; // const-string v1, "long"
v2 = java.lang.Long.TYPE;
v0 = com.naef.jnlua.JavaModule.PRIMITIVE_TYPES;
final String v1 = "short"; // const-string v1, "short"
v2 = java.lang.Short.TYPE;
v0 = com.naef.jnlua.JavaModule.PRIMITIVE_TYPES;
final String v1 = "void"; // const-string v1, "void"
v2 = java.lang.Void.TYPE;
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Lcom/naef/jnlua/NamedJavaFunction; */
return;
} // .end method
private com.naef.jnlua.JavaModule ( ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* const/16 v0, 0xc */
/* new-array v0, v0, [Lcom/naef/jnlua/NamedJavaFunction; */
int v1 = 0; // const/4 v1, 0x0
/* new-instance v2, Lcom/naef/jnlua/JavaModule$Require; */
/* invoke-direct {v2, v3}, Lcom/naef/jnlua/JavaModule$Require;-><init>(Lcom/naef/jnlua/JavaModule$1;)V */
/* aput-object v2, v0, v1 */
int v1 = 1; // const/4 v1, 0x1
/* new-instance v2, Lcom/naef/jnlua/JavaModule$New; */
/* invoke-direct {v2, v3}, Lcom/naef/jnlua/JavaModule$New;-><init>(Lcom/naef/jnlua/JavaModule$1;)V */
/* aput-object v2, v0, v1 */
int v1 = 2; // const/4 v1, 0x2
/* new-instance v2, Lcom/naef/jnlua/JavaModule$InstanceOf; */
/* invoke-direct {v2, v3}, Lcom/naef/jnlua/JavaModule$InstanceOf;-><init>(Lcom/naef/jnlua/JavaModule$1;)V */
/* aput-object v2, v0, v1 */
int v1 = 3; // const/4 v1, 0x3
/* new-instance v2, Lcom/naef/jnlua/JavaModule$Cast; */
/* invoke-direct {v2, v3}, Lcom/naef/jnlua/JavaModule$Cast;-><init>(Lcom/naef/jnlua/JavaModule$1;)V */
/* aput-object v2, v0, v1 */
int v1 = 4; // const/4 v1, 0x4
/* new-instance v2, Lcom/naef/jnlua/JavaModule$Proxy; */
/* invoke-direct {v2, v3}, Lcom/naef/jnlua/JavaModule$Proxy;-><init>(Lcom/naef/jnlua/JavaModule$1;)V */
/* aput-object v2, v0, v1 */
int v1 = 5; // const/4 v1, 0x5
/* new-instance v2, Lcom/naef/jnlua/JavaModule$Pairs; */
/* invoke-direct {v2, v3}, Lcom/naef/jnlua/JavaModule$Pairs;-><init>(Lcom/naef/jnlua/JavaModule$1;)V */
/* aput-object v2, v0, v1 */
int v1 = 6; // const/4 v1, 0x6
/* new-instance v2, Lcom/naef/jnlua/JavaModule$IPairs; */
/* invoke-direct {v2, v3}, Lcom/naef/jnlua/JavaModule$IPairs;-><init>(Lcom/naef/jnlua/JavaModule$1;)V */
/* aput-object v2, v0, v1 */
int v1 = 7; // const/4 v1, 0x7
/* new-instance v2, Lcom/naef/jnlua/JavaModule$ToTable; */
/* invoke-direct {v2, v3}, Lcom/naef/jnlua/JavaModule$ToTable;-><init>(Lcom/naef/jnlua/JavaModule$1;)V */
/* aput-object v2, v0, v1 */
/* const/16 v1, 0x8 */
/* new-instance v2, Lcom/naef/jnlua/JavaModule$Elements; */
/* invoke-direct {v2, v3}, Lcom/naef/jnlua/JavaModule$Elements;-><init>(Lcom/naef/jnlua/JavaModule$1;)V */
/* aput-object v2, v0, v1 */
/* const/16 v1, 0x9 */
/* new-instance v2, Lcom/naef/jnlua/JavaModule$Fields; */
/* invoke-direct {v2, v3}, Lcom/naef/jnlua/JavaModule$Fields;-><init>(Lcom/naef/jnlua/JavaModule$1;)V */
/* aput-object v2, v0, v1 */
/* const/16 v1, 0xa */
/* new-instance v2, Lcom/naef/jnlua/JavaModule$Methods; */
/* invoke-direct {v2, v3}, Lcom/naef/jnlua/JavaModule$Methods;-><init>(Lcom/naef/jnlua/JavaModule$1;)V */
/* aput-object v2, v0, v1 */
/* const/16 v1, 0xb */
/* new-instance v2, Lcom/naef/jnlua/JavaModule$Properties; */
/* invoke-direct {v2, v3}, Lcom/naef/jnlua/JavaModule$Properties;-><init>(Lcom/naef/jnlua/JavaModule$1;)V */
/* aput-object v2, v0, v1 */
this.functions = v0;
return;
} // .end method
static java.lang.Class access$1200 ( com.naef.jnlua.LuaState p0, java.lang.String p1 ) { //synthethic
/* .locals 1 */
com.naef.jnlua.JavaModule .loadType ( p0,p1 );
} // .end method
static com.naef.jnlua.NamedJavaFunction access$1300 ( ) { //synthethic
/* .locals 1 */
v0 = com.naef.jnlua.JavaModule.EMPTY_MODULE;
} // .end method
public static com.naef.jnlua.JavaModule getInstance ( ) {
/* .locals 1 */
v0 = com.naef.jnlua.JavaModule.INSTANCE;
} // .end method
private static java.lang.Class loadType ( com.naef.jnlua.LuaState p0, java.lang.String p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/naef/jnlua/LuaState;", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/lang/Class", */
/* "<*>;" */
/* } */
} // .end annotation
v0 = com.naef.jnlua.JavaModule.PRIMITIVE_TYPES;
/* check-cast v0, Ljava/lang/Class; */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :goto_0
} // :cond_0
try { // :try_start_0
(( com.naef.jnlua.LuaState ) p0 ).getClassLoader ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/LuaState;->getClassLoader()Ljava/lang/ClassLoader;
(( java.lang.ClassLoader ) v0 ).loadClass ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* new-instance v1, Ljava/lang/RuntimeException; */
/* invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
/* # virtual methods */
public void open ( com.naef.jnlua.LuaState p0 ) {
/* .locals 2 */
/* monitor-enter p1 */
try { // :try_start_0
final String v0 = "java"; // const-string v0, "java"
v1 = this.functions;
(( com.naef.jnlua.LuaState ) p1 ).register ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lcom/naef/jnlua/LuaState;->register(Ljava/lang/String;[Lcom/naef/jnlua/NamedJavaFunction;)V
int v0 = 1; // const/4 v0, 0x1
(( com.naef.jnlua.LuaState ) p1 ).pop ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->pop(I)V
/* monitor-exit p1 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public com.naef.jnlua.TypedJavaObject toTable ( java.util.List p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List", */
/* "<*>;)", */
/* "Lcom/naef/jnlua/TypedJavaObject;" */
/* } */
} // .end annotation
com.naef.jnlua.JavaModule$ToTable .toTable ( p1 );
} // .end method
public com.naef.jnlua.TypedJavaObject toTable ( java.util.Map p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<**>;)", */
/* "Lcom/naef/jnlua/TypedJavaObject;" */
/* } */
} // .end annotation
com.naef.jnlua.JavaModule$ToTable .toTable ( p1 );
} // .end method
