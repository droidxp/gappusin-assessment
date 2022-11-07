public class com.naef.jnlua.LuaState {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/naef/jnlua/LuaState$3;, */
	 /* Lcom/naef/jnlua/LuaState$LuaInvocationHandler;, */
	 /* Lcom/naef/jnlua/LuaState$LuaValueProxyImpl;, */
	 /* Lcom/naef/jnlua/LuaState$LuaValueProxyRef;, */
	 /* Lcom/naef/jnlua/LuaState$GcAction;, */
	 /* Lcom/naef/jnlua/LuaState$Library; */
	 /* } */
} // .end annotation
/* # static fields */
private static final Integer APIVERSION;
public static final Integer ENVIRONINDEX;
public static final Integer GLOBALSINDEX;
public static final java.lang.String LUA_VERSION;
public static final Integer MULTRET;
public static final Integer REGISTRYINDEX;
public static final java.lang.String VERSION;
public static final Integer YIELD;
/* # instance fields */
private java.lang.ClassLoader classLoader;
private com.naef.jnlua.Converter converter;
private java.lang.Object finalizeGuardian;
private com.naef.jnlua.JavaReflector javaReflector;
private Long luaState;
private Long luaThread;
private Boolean ownState;
private java.lang.ref.ReferenceQueue proxyQueue;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/ref/ReferenceQueue", */
/* "<", */
/* "Lcom/naef/jnlua/LuaState$LuaValueProxyImpl;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private java.util.Set proxySet;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set", */
/* "<", */
/* "Lcom/naef/jnlua/LuaState$LuaValueProxyRef;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
static com.naef.jnlua.LuaState ( ) {
/* .locals 1 */
com.naef.jnlua.NativeSupport .getInstance ( );
(( com.naef.jnlua.NativeSupport ) v0 ).getLoader ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/NativeSupport;->getLoader()Lcom/naef/jnlua/NativeSupport$Loader;
com.naef.jnlua.LuaState .lua_version ( );
return;
} // .end method
public com.naef.jnlua.LuaState ( ) {
/* .locals 2 */
/* const-wide/16 v0, 0x0 */
/* invoke-direct {p0, v0, v1}, Lcom/naef/jnlua/LuaState;-><init>(J)V */
return;
} // .end method
public com.naef.jnlua.LuaState ( ) {
/* .locals 5 */
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
this.proxySet = v0;
/* new-instance v0, Ljava/lang/ref/ReferenceQueue; */
/* invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V */
this.proxyQueue = v0;
/* const-wide/16 v3, 0x0 */
/* cmp-long v0, p1, v3 */
/* if-nez v0, :cond_0 */
/* move v0, v1 */
} // :goto_0
/* iput-boolean v0, p0, Lcom/naef/jnlua/LuaState;->ownState:Z */
int v0 = 2; // const/4 v0, 0x2
/* invoke-direct {p0, v0, p1, p2}, Lcom/naef/jnlua/LuaState;->lua_newstate(IJ)V */
/* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
/* new-instance v0, Lcom/naef/jnlua/LuaState$1; */
/* invoke-direct {v0, p0}, Lcom/naef/jnlua/LuaState$1;-><init>(Lcom/naef/jnlua/LuaState;)V */
this.finalizeGuardian = v0;
} // :goto_1
com.naef.jnlua.JavaReflector$Metamethod .values ( );
/* array-length v0, v0 */
/* if-ge v2, v0, :cond_1 */
com.naef.jnlua.JavaReflector$Metamethod .values ( );
/* aget-object v0, v0, v2 */
/* new-instance v3, Lcom/naef/jnlua/LuaState$2; */
/* invoke-direct {v3, p0, v0}, Lcom/naef/jnlua/LuaState$2;-><init>(Lcom/naef/jnlua/LuaState;Lcom/naef/jnlua/JavaReflector$Metamethod;)V */
/* invoke-direct {p0, v3}, Lcom/naef/jnlua/LuaState;->lua_pushjavafunction(Lcom/naef/jnlua/JavaFunction;)V */
int v3 = -2; // const/4 v3, -0x2
(( com.naef.jnlua.JavaReflector$Metamethod ) v0 ).getMetamethodName ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/JavaReflector$Metamethod;->getMetamethodName()Ljava/lang/String;
/* invoke-direct {p0, v3, v0}, Lcom/naef/jnlua/LuaState;->lua_setfield(ILjava/lang/String;)V */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
/* move v0, v2 */
} // :cond_1
/* invoke-direct {p0, v1}, Lcom/naef/jnlua/LuaState;->lua_pop(I)V */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v0 ).getContextClassLoader ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;
this.classLoader = v0;
com.naef.jnlua.DefaultJavaReflector .getInstance ( );
this.javaReflector = v0;
com.naef.jnlua.DefaultConverter .getInstance ( );
this.converter = v0;
return;
} // .end method
static void access$000 ( com.naef.jnlua.LuaState p0 ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->closeInternal()V */
return;
} // .end method
static void access$200 ( com.naef.jnlua.LuaState p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_openlib(I)V */
return;
} // .end method
static java.lang.ref.ReferenceQueue access$300 ( com.naef.jnlua.LuaState p0 ) { //synthethic
/* .locals 1 */
v0 = this.proxyQueue;
} // .end method
static java.util.Set access$400 ( com.naef.jnlua.LuaState p0 ) { //synthethic
/* .locals 1 */
v0 = this.proxySet;
} // .end method
private void check ( ) {
/* .locals 2 */
v0 = /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->isOpenInternal()Z */
/* if-nez v0, :cond_0 */
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Lua state is closed"; // const-string v1, "Lua state is closed"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
} // :goto_0
v0 = this.proxyQueue;
(( java.lang.ref.ReferenceQueue ) v0 ).poll ( ); // invoke-virtual {v0}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;
/* check-cast v0, Lcom/naef/jnlua/LuaState$LuaValueProxyRef; */
if ( v0 != null) { // if-eqz v0, :cond_1
v1 = this.proxySet;
/* const/16 v1, -0x2710 */
v0 = (( com.naef.jnlua.LuaState$LuaValueProxyRef ) v0 ).getReference ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/LuaState$LuaValueProxyRef;->getReference()I
/* invoke-direct {p0, v1, v0}, Lcom/naef/jnlua/LuaState;->lua_unref(II)V */
} // :cond_1
return;
} // .end method
private void closeInternal ( ) {
/* .locals 2 */
v0 = /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->isOpenInternal()Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lcom/naef/jnlua/LuaState;->ownState:Z */
/* invoke-direct {p0, v0}, Lcom/naef/jnlua/LuaState;->lua_close(Z)V */
v0 = /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->isOpenInternal()Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "cannot close"; // const-string v1, "cannot close"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
return;
} // .end method
private com.naef.jnlua.LuaRuntimeException getArgException ( Integer p0, java.lang.String p1 ) {
/* .locals 7 */
int v6 = 2; // const/4 v6, 0x2
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
/* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
/* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->lua_funcname()Ljava/lang/String; */
v0 = /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_narg(I)I */
/* if-lez v0, :cond_0 */
final String v2 = "argument #%d"; // const-string v2, "argument #%d"
/* new-array v3, v5, [Ljava/lang/Object; */
java.lang.Integer .valueOf ( v0 );
/* aput-object v0, v3, v4 */
java.lang.String .format ( v2,v3 );
} // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
final String v2 = "bad %s to \'%s\' (%s)"; // const-string v2, "bad %s to \'%s\' (%s)"
int v3 = 3; // const/4 v3, 0x3
/* new-array v3, v3, [Ljava/lang/Object; */
/* aput-object v0, v3, v4 */
/* aput-object v1, v3, v5 */
/* aput-object p2, v3, v6 */
java.lang.String .format ( v2,v3 );
} // :goto_1
/* new-instance v1, Lcom/naef/jnlua/LuaRuntimeException; */
/* invoke-direct {v1, v0}, Lcom/naef/jnlua/LuaRuntimeException;-><init>(Ljava/lang/String;)V */
} // :cond_0
final String v0 = "self argument"; // const-string v0, "self argument"
} // :cond_1
final String v1 = "bad %s (%s)"; // const-string v1, "bad %s (%s)"
/* new-array v2, v6, [Ljava/lang/Object; */
/* aput-object v0, v2, v4 */
/* aput-object p2, v2, v5 */
java.lang.String .format ( v1,v2 );
} // .end method
private com.naef.jnlua.LuaRuntimeException getArgTypeException ( Integer p0, com.naef.jnlua.LuaType p1 ) {
/* .locals 4 */
final String v0 = "expected %s, got %s"; // const-string v0, "expected %s, got %s"
int v1 = 2; // const/4 v1, 0x2
/* new-array v1, v1, [Ljava/lang/Object; */
int v2 = 0; // const/4 v2, 0x0
(( com.naef.jnlua.LuaType ) p2 ).toString ( ); // invoke-virtual {p2}, Lcom/naef/jnlua/LuaType;->toString()Ljava/lang/String;
(( java.lang.String ) v3 ).toLowerCase ( ); // invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
/* aput-object v3, v1, v2 */
int v2 = 1; // const/4 v2, 0x1
(( com.naef.jnlua.LuaState ) p0 ).type ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->type(I)Lcom/naef/jnlua/LuaType;
(( com.naef.jnlua.LuaType ) v3 ).toString ( ); // invoke-virtual {v3}, Lcom/naef/jnlua/LuaType;->toString()Ljava/lang/String;
(( java.lang.String ) v3 ).toLowerCase ( ); // invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
/* aput-object v3, v1, v2 */
java.lang.String .format ( v0,v1 );
/* invoke-direct {p0, p1, v0}, Lcom/naef/jnlua/LuaState;->getArgException(ILjava/lang/String;)Lcom/naef/jnlua/LuaRuntimeException; */
} // .end method
private Boolean isOpenInternal ( ) {
/* .locals 4 */
/* iget-wide v0, p0, Lcom/naef/jnlua/LuaState;->luaState:J */
/* const-wide/16 v2, 0x0 */
/* cmp-long v0, v0, v2 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
private native void lua_close ( Boolean p0 ) {
} // .end method
private native void lua_concat ( Integer p0 ) {
} // .end method
private native void lua_createtable ( Integer p0, Integer p1 ) {
} // .end method
private native void lua_dump ( java.io.OutputStream p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
} // .end method
private native Integer lua_equal ( Integer p0, Integer p1 ) {
} // .end method
private native java.lang.String lua_findtable ( Integer p0, java.lang.String p1, Integer p2 ) {
} // .end method
private native java.lang.String lua_funcname ( ) {
} // .end method
private native Integer lua_gc ( Integer p0, Integer p1 ) {
} // .end method
private native void lua_getfenv ( Integer p0 ) {
} // .end method
private native void lua_getfield ( Integer p0, java.lang.String p1 ) {
} // .end method
private native void lua_getglobal ( java.lang.String p0 ) {
} // .end method
private native Integer lua_getmetafield ( Integer p0, java.lang.String p1 ) {
} // .end method
private native Integer lua_getmetatable ( Integer p0 ) {
} // .end method
private native void lua_gettable ( Integer p0 ) {
} // .end method
private native Integer lua_gettop ( ) {
} // .end method
private native void lua_insert ( Integer p0 ) {
} // .end method
private native Integer lua_isboolean ( Integer p0 ) {
} // .end method
private native Integer lua_iscfunction ( Integer p0 ) {
} // .end method
private native Integer lua_isfunction ( Integer p0 ) {
} // .end method
private native Integer lua_isjavafunction ( Integer p0 ) {
} // .end method
private native Integer lua_isjavaobject ( Integer p0 ) {
} // .end method
private native Integer lua_isnil ( Integer p0 ) {
} // .end method
private native Integer lua_isnone ( Integer p0 ) {
} // .end method
private native Integer lua_isnoneornil ( Integer p0 ) {
} // .end method
private native Integer lua_isnumber ( Integer p0 ) {
} // .end method
private native Integer lua_isstring ( Integer p0 ) {
} // .end method
private native Integer lua_istable ( Integer p0 ) {
} // .end method
private native Integer lua_isthread ( Integer p0 ) {
} // .end method
private native Integer lua_lessthan ( Integer p0, Integer p1 ) {
} // .end method
private native void lua_load ( java.io.InputStream p0, java.lang.String p1 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
} // .end method
private native Integer lua_narg ( Integer p0 ) {
} // .end method
private native void lua_newstate ( Integer p0, Long p1 ) {
} // .end method
private native void lua_newtable ( ) {
} // .end method
private native void lua_newthread ( ) {
} // .end method
private native Integer lua_next ( Integer p0 ) {
} // .end method
private native Integer lua_objlen ( Integer p0 ) {
} // .end method
private native void lua_openlib ( Integer p0 ) {
} // .end method
private native void lua_pcall ( Integer p0, Integer p1 ) {
} // .end method
private native void lua_pop ( Integer p0 ) {
} // .end method
private native void lua_pushboolean ( Integer p0 ) {
} // .end method
private native void lua_pushinteger ( Integer p0 ) {
} // .end method
private native void lua_pushjavafunction ( com.naef.jnlua.JavaFunction p0 ) {
} // .end method
private native void lua_pushjavaobject ( java.lang.Object p0 ) {
} // .end method
private native void lua_pushnil ( ) {
} // .end method
private native void lua_pushnumber ( Double p0 ) {
} // .end method
private native void lua_pushstring ( java.lang.String p0 ) {
} // .end method
private native void lua_pushvalue ( Integer p0 ) {
} // .end method
private native Integer lua_rawequal ( Integer p0, Integer p1 ) {
} // .end method
private native void lua_rawget ( Integer p0 ) {
} // .end method
private native void lua_rawgeti ( Integer p0, Integer p1 ) {
} // .end method
private native void lua_rawset ( Integer p0 ) {
} // .end method
private native void lua_rawseti ( Integer p0, Integer p1 ) {
} // .end method
private native Integer lua_ref ( Integer p0 ) {
} // .end method
private native void lua_remove ( Integer p0 ) {
} // .end method
private native void lua_replace ( Integer p0 ) {
} // .end method
private native Integer lua_resume ( Integer p0, Integer p1 ) {
} // .end method
private native Integer lua_setfenv ( Integer p0 ) {
} // .end method
private native void lua_setfield ( Integer p0, java.lang.String p1 ) {
} // .end method
private native void lua_setglobal ( java.lang.String p0 ) {
} // .end method
private native Integer lua_setmetatable ( Integer p0 ) {
} // .end method
private native void lua_settable ( Integer p0 ) {
} // .end method
private native void lua_settop ( Integer p0 ) {
} // .end method
private native Integer lua_status ( Integer p0 ) {
} // .end method
private native void lua_tablemove ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
} // .end method
private native Integer lua_tablesize ( Integer p0 ) {
} // .end method
private native Integer lua_toboolean ( Integer p0 ) {
} // .end method
private native Integer lua_tointeger ( Integer p0 ) {
} // .end method
private native com.naef.jnlua.JavaFunction lua_tojavafunction ( Integer p0 ) {
} // .end method
private native java.lang.Object lua_tojavaobject ( Integer p0 ) {
} // .end method
private native Double lua_tonumber ( Integer p0 ) {
} // .end method
private native Long lua_topointer ( Integer p0 ) {
} // .end method
private native java.lang.String lua_tostring ( Integer p0 ) {
} // .end method
private native Integer lua_type ( Integer p0 ) {
} // .end method
private native void lua_unref ( Integer p0, Integer p1 ) {
} // .end method
private static native java.lang.String lua_version ( ) {
} // .end method
private native Integer lua_yield ( Integer p0 ) {
} // .end method
/* # virtual methods */
public synchronized void call ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
/* invoke-direct {p0, p1, p2}, Lcom/naef/jnlua/LuaState;->lua_pcall(II)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void checkArg ( Integer p0, Boolean p1, java.lang.String p2 ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* monitor-exit p0 */
return;
} // :cond_0
try { // :try_start_1
/* invoke-direct {p0, p1, p3}, Lcom/naef/jnlua/LuaState;->getArgException(ILjava/lang/String;)Lcom/naef/jnlua/LuaRuntimeException; */
/* throw v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized Boolean checkBoolean ( Integer p0 ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
v0 = (( com.naef.jnlua.LuaState ) p0 ).isBoolean ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->isBoolean(I)Z
/* if-nez v0, :cond_0 */
v0 = com.naef.jnlua.LuaType.BOOLEAN;
/* invoke-direct {p0, p1, v0}, Lcom/naef/jnlua/LuaState;->getArgTypeException(ILcom/naef/jnlua/LuaType;)Lcom/naef/jnlua/LuaRuntimeException; */
/* throw v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_0
try { // :try_start_1
(( com.naef.jnlua.LuaState ) p0 ).toBoolean ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->toBoolean(I)Z
/* :try_end_1 */
v0 = /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* monitor-exit p0 */
} // .end method
public synchronized Boolean checkBoolean ( Integer p0, Boolean p1 ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
(( com.naef.jnlua.LuaState ) p0 ).isNoneOrNil ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->isNoneOrNil(I)Z
/* :try_end_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :goto_0
/* monitor-exit p0 */
} // :cond_0
try { // :try_start_1
(( com.naef.jnlua.LuaState ) p0 ).checkBoolean ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->checkBoolean(I)Z
/* :try_end_1 */
p2 = /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized Integer checkInteger ( Integer p0 ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
v0 = (( com.naef.jnlua.LuaState ) p0 ).isNumber ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->isNumber(I)Z
/* if-nez v0, :cond_0 */
v0 = com.naef.jnlua.LuaType.NUMBER;
/* invoke-direct {p0, p1, v0}, Lcom/naef/jnlua/LuaState;->getArgTypeException(ILcom/naef/jnlua/LuaType;)Lcom/naef/jnlua/LuaRuntimeException; */
/* throw v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_0
try { // :try_start_1
(( com.naef.jnlua.LuaState ) p0 ).toInteger ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->toInteger(I)I
/* :try_end_1 */
v0 = /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* monitor-exit p0 */
} // .end method
public synchronized Integer checkInteger ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
(( com.naef.jnlua.LuaState ) p0 ).isNoneOrNil ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->isNoneOrNil(I)Z
/* :try_end_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :goto_0
/* monitor-exit p0 */
} // :cond_0
try { // :try_start_1
(( com.naef.jnlua.LuaState ) p0 ).checkInteger ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->checkInteger(I)I
/* :try_end_1 */
p2 = /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized java.lang.Object checkJavaObject ( Integer p0, java.lang.Class p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(I", */
/* "Ljava/lang/Class", */
/* "<TT;>;)TT;" */
/* } */
} // .end annotation
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
v0 = (( com.naef.jnlua.LuaState ) p0 ).isJavaObject ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/naef/jnlua/LuaState;->isJavaObject(ILjava/lang/Class;)Z
/* if-nez v0, :cond_0 */
final String v0 = "exptected %s, got %s"; // const-string v0, "exptected %s, got %s"
int v1 = 2; // const/4 v1, 0x2
/* new-array v1, v1, [Ljava/lang/Object; */
int v2 = 0; // const/4 v2, 0x0
(( java.lang.Class ) p2 ).getCanonicalName ( ); // invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
/* aput-object v3, v1, v2 */
int v2 = 1; // const/4 v2, 0x1
(( com.naef.jnlua.LuaState ) p0 ).typeName ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->typeName(I)Ljava/lang/String;
/* aput-object v3, v1, v2 */
java.lang.String .format ( v0,v1 );
/* invoke-direct {p0, p1, v0}, Lcom/naef/jnlua/LuaState;->getArgException(ILjava/lang/String;)Lcom/naef/jnlua/LuaRuntimeException; */
/* throw v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_0
try { // :try_start_1
(( com.naef.jnlua.LuaState ) p0 ).toJavaObject ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* monitor-exit p0 */
} // .end method
public synchronized java.lang.Object checkJavaObject ( Integer p0, java.lang.Class p1, java.lang.Object p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(I", */
/* "Ljava/lang/Class", */
/* "<TT;>;TT;)TT;" */
/* } */
} // .end annotation
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
(( com.naef.jnlua.LuaState ) p0 ).isNoneOrNil ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->isNoneOrNil(I)Z
/* :try_end_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :goto_0
/* monitor-exit p0 */
} // :cond_0
try { // :try_start_1
(( com.naef.jnlua.LuaState ) p0 ).checkJavaObject ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/naef/jnlua/LuaState;->checkJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized Double checkNumber ( Integer p0 ) {
/* .locals 2 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
v0 = (( com.naef.jnlua.LuaState ) p0 ).isNumber ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->isNumber(I)Z
/* if-nez v0, :cond_0 */
v0 = com.naef.jnlua.LuaType.NUMBER;
/* invoke-direct {p0, p1, v0}, Lcom/naef/jnlua/LuaState;->getArgTypeException(ILcom/naef/jnlua/LuaType;)Lcom/naef/jnlua/LuaRuntimeException; */
/* throw v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_0
try { // :try_start_1
(( com.naef.jnlua.LuaState ) p0 ).toNumber ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->toNumber(I)D
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* move-result-wide v0 */
/* monitor-exit p0 */
/* return-wide v0 */
} // .end method
public synchronized Double checkNumber ( Integer p0, Double p1 ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
(( com.naef.jnlua.LuaState ) p0 ).isNoneOrNil ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->isNoneOrNil(I)Z
/* :try_end_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :goto_0
/* monitor-exit p0 */
/* return-wide p2 */
} // :cond_0
try { // :try_start_1
(( com.naef.jnlua.LuaState ) p0 ).checkNumber ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->checkNumber(I)D
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* move-result-wide p2 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized java.lang.String checkOption ( Integer p0, java.lang.String[] p1 ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
(( com.naef.jnlua.LuaState ) p0 ).checkString ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->checkString(I)Ljava/lang/String;
} // :goto_0
/* array-length v2, p2 */
/* if-ge v0, v2, :cond_1 */
/* aget-object v2, p2, v0 */
(( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* :try_end_0 */
v2 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v2 != null) { // if-eqz v2, :cond_0
/* monitor-exit p0 */
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
try { // :try_start_1
final String v0 = "expected one of %s, got %s"; // const-string v0, "expected one of %s, got %s"
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
java.util.Arrays .asList ( p2 );
/* aput-object v4, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
/* aput-object v1, v2, v3 */
java.lang.String .format ( v0,v2 );
/* invoke-direct {p0, p1, v0}, Lcom/naef/jnlua/LuaState;->getArgException(ILjava/lang/String;)Lcom/naef/jnlua/LuaRuntimeException; */
/* throw v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized java.lang.String checkOption ( Integer p0, java.lang.String[] p1, java.lang.String p2 ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
(( com.naef.jnlua.LuaState ) p0 ).isNoneOrNil ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->isNoneOrNil(I)Z
/* :try_end_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :goto_0
/* monitor-exit p0 */
} // :cond_0
try { // :try_start_1
(( com.naef.jnlua.LuaState ) p0 ).checkOption ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/naef/jnlua/LuaState;->checkOption(I[Ljava/lang/String;)Ljava/lang/String;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized java.lang.String checkString ( Integer p0 ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
v0 = (( com.naef.jnlua.LuaState ) p0 ).isString ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->isString(I)Z
/* if-nez v0, :cond_0 */
v0 = com.naef.jnlua.LuaType.STRING;
/* invoke-direct {p0, p1, v0}, Lcom/naef/jnlua/LuaState;->getArgTypeException(ILcom/naef/jnlua/LuaType;)Lcom/naef/jnlua/LuaRuntimeException; */
/* throw v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_0
try { // :try_start_1
(( com.naef.jnlua.LuaState ) p0 ).toString ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->toString(I)Ljava/lang/String;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* monitor-exit p0 */
} // .end method
public synchronized java.lang.String checkString ( Integer p0, java.lang.String p1 ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
(( com.naef.jnlua.LuaState ) p0 ).isNoneOrNil ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->isNoneOrNil(I)Z
/* :try_end_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :goto_0
/* monitor-exit p0 */
} // :cond_0
try { // :try_start_1
(( com.naef.jnlua.LuaState ) p0 ).checkString ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->checkString(I)Ljava/lang/String;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void checkType ( Integer p0, com.naef.jnlua.LuaType p1 ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
(( com.naef.jnlua.LuaState ) p0 ).type ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->type(I)Lcom/naef/jnlua/LuaType;
/* if-eq v0, p2, :cond_0 */
/* invoke-direct {p0, p1, p2}, Lcom/naef/jnlua/LuaState;->getArgTypeException(ILcom/naef/jnlua/LuaType;)Lcom/naef/jnlua/LuaRuntimeException; */
/* throw v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_0
/* monitor-exit p0 */
return;
} // .end method
public synchronized void close ( ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->closeInternal()V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void concat ( Integer p0 ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
/* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_concat(I)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void dump ( java.io.OutputStream p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
/* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_dump(Ljava/io/OutputStream;)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized Boolean equal ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
	 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
	 /* invoke-direct {p0, p1, p2}, Lcom/naef/jnlua/LuaState;->lua_equal(II)I */
	 /* :try_end_0 */
	 v0 = 	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
	 /* monitor-exit p0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized Integer gc ( com.naef.jnlua.LuaState$GcAction p0, Integer p1 ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
	 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
	 v0 = 	 (( com.naef.jnlua.LuaState$GcAction ) p1 ).ordinal ( ); // invoke-virtual {p1}, Lcom/naef/jnlua/LuaState$GcAction;->ordinal()I
	 /* invoke-direct {p0, v0, p2}, Lcom/naef/jnlua/LuaState;->lua_gc(II)I */
	 /* :try_end_0 */
	 v0 = 	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* monitor-exit p0 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
public synchronized java.lang.ClassLoader getClassLoader ( ) {
	 /* .locals 1 */
	 /* monitor-enter p0 */
	 try { // :try_start_0
		 v0 = this.classLoader;
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* monitor-exit p0 */
		 /* :catchall_0 */
		 /* move-exception v0 */
		 /* monitor-exit p0 */
		 /* throw v0 */
	 } // .end method
	 public synchronized com.naef.jnlua.Converter getConverter ( ) {
		 /* .locals 1 */
		 /* monitor-enter p0 */
		 try { // :try_start_0
			 v0 = this.converter;
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* monitor-exit p0 */
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit p0 */
			 /* throw v0 */
		 } // .end method
		 public synchronized void getFEnv ( Integer p0 ) {
			 /* .locals 1 */
			 /* monitor-enter p0 */
			 try { // :try_start_0
				 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
				 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_getfenv(I)V */
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* monitor-exit p0 */
				 return;
				 /* :catchall_0 */
				 /* move-exception v0 */
				 /* monitor-exit p0 */
				 /* throw v0 */
			 } // .end method
			 public synchronized void getField ( Integer p0, java.lang.String p1 ) {
				 /* .locals 1 */
				 /* monitor-enter p0 */
				 try { // :try_start_0
					 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
					 /* invoke-direct {p0, p1, p2}, Lcom/naef/jnlua/LuaState;->lua_getfield(ILjava/lang/String;)V */
					 /* :try_end_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
					 /* monitor-exit p0 */
					 return;
					 /* :catchall_0 */
					 /* move-exception v0 */
					 /* monitor-exit p0 */
					 /* throw v0 */
				 } // .end method
				 public synchronized void getGlobal ( java.lang.String p0 ) {
					 /* .locals 1 */
					 /* monitor-enter p0 */
					 try { // :try_start_0
						 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
						 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_getglobal(Ljava/lang/String;)V */
						 /* :try_end_0 */
						 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
						 /* monitor-exit p0 */
						 return;
						 /* :catchall_0 */
						 /* move-exception v0 */
						 /* monitor-exit p0 */
						 /* throw v0 */
					 } // .end method
					 public synchronized com.naef.jnlua.JavaReflector getJavaReflector ( ) {
						 /* .locals 1 */
						 /* monitor-enter p0 */
						 try { // :try_start_0
							 v0 = this.javaReflector;
							 /* :try_end_0 */
							 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
							 /* monitor-exit p0 */
							 /* :catchall_0 */
							 /* move-exception v0 */
							 /* monitor-exit p0 */
							 /* throw v0 */
						 } // .end method
						 public synchronized Boolean getMetafield ( Integer p0, java.lang.String p1 ) {
							 /* .locals 1 */
							 /* monitor-enter p0 */
							 try { // :try_start_0
								 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
								 /* invoke-direct {p0, p1, p2}, Lcom/naef/jnlua/LuaState;->lua_getmetafield(ILjava/lang/String;)I */
								 /* :try_end_0 */
								 v0 = 								 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
								 if ( v0 != null) { // if-eqz v0, :cond_0
									 int v0 = 1; // const/4 v0, 0x1
								 } // :goto_0
								 /* monitor-exit p0 */
							 } // :cond_0
							 int v0 = 0; // const/4 v0, 0x0
							 /* :catchall_0 */
							 /* move-exception v0 */
							 /* monitor-exit p0 */
							 /* throw v0 */
						 } // .end method
						 public synchronized com.naef.jnlua.JavaFunction getMetamethod ( java.lang.Object p0, com.naef.jnlua.JavaReflector$Metamethod p1 ) {
							 /* .locals 1 */
							 /* monitor-enter p0 */
							 if ( p1 != null) { // if-eqz p1, :cond_0
								 try { // :try_start_0
									 /* instance-of v0, p1, Lcom/naef/jnlua/JavaReflector; */
									 if ( v0 != null) { // if-eqz v0, :cond_0
										 /* check-cast p1, Lcom/naef/jnlua/JavaReflector; */
										 /* :try_end_0 */
										 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
										 if ( v0 != null) { // if-eqz v0, :cond_0
										 } // :goto_0
										 /* monitor-exit p0 */
									 } // :cond_0
									 try { // :try_start_1
										 v0 = this.javaReflector;
										 /* :try_end_1 */
										 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
										 /* :catchall_0 */
										 /* move-exception v0 */
										 /* monitor-exit p0 */
										 /* throw v0 */
									 } // .end method
									 public synchronized Boolean getMetatable ( Integer p0 ) {
										 /* .locals 1 */
										 /* monitor-enter p0 */
										 try { // :try_start_0
											 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
											 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_getmetatable(I)I */
											 /* :try_end_0 */
											 v0 = 											 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
											 if ( v0 != null) { // if-eqz v0, :cond_0
												 int v0 = 1; // const/4 v0, 0x1
											 } // :goto_0
											 /* monitor-exit p0 */
										 } // :cond_0
										 int v0 = 0; // const/4 v0, 0x0
										 /* :catchall_0 */
										 /* move-exception v0 */
										 /* monitor-exit p0 */
										 /* throw v0 */
									 } // .end method
									 public synchronized com.naef.jnlua.LuaValueProxy getProxy ( Integer p0 ) {
										 /* .locals 2 */
										 /* monitor-enter p0 */
										 try { // :try_start_0
											 (( com.naef.jnlua.LuaState ) p0 ).pushValue ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->pushValue(I)V
											 /* new-instance v0, Lcom/naef/jnlua/LuaState$LuaValueProxyImpl; */
											 /* const/16 v1, -0x2710 */
											 v1 = 											 (( com.naef.jnlua.LuaState ) p0 ).ref ( v1 ); // invoke-virtual {p0, v1}, Lcom/naef/jnlua/LuaState;->ref(I)I
											 /* invoke-direct {v0, p0, v1}, Lcom/naef/jnlua/LuaState$LuaValueProxyImpl;-><init>(Lcom/naef/jnlua/LuaState;I)V */
											 /* :try_end_0 */
											 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
											 /* monitor-exit p0 */
											 /* :catchall_0 */
											 /* move-exception v0 */
											 /* monitor-exit p0 */
											 /* throw v0 */
										 } // .end method
										 public synchronized com.naef.jnlua.LuaValueProxy getProxy ( Integer p0, java.lang.Class[] p1 ) {
											 /* .locals 5 */
											 /* .annotation system Ldalvik/annotation/Signature; */
											 /* value = { */
											 /* "(I[", */
											 /* "Ljava/lang/Class", */
											 /* "<*>;)", */
											 /* "Lcom/naef/jnlua/LuaValueProxy;" */
											 /* } */
										 } // .end annotation
										 /* monitor-enter p0 */
										 try { // :try_start_0
											 (( com.naef.jnlua.LuaState ) p0 ).pushValue ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->pushValue(I)V
											 v0 = 											 (( com.naef.jnlua.LuaState ) p0 ).isTable ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->isTable(I)Z
											 /* if-nez v0, :cond_0 */
											 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
											 final String v1 = "index %d is not a table"; // const-string v1, "index %d is not a table"
											 int v2 = 1; // const/4 v2, 0x1
											 /* new-array v2, v2, [Ljava/lang/Object; */
											 int v3 = 0; // const/4 v3, 0x0
											 java.lang.Integer .valueOf ( p1 );
											 /* aput-object v4, v2, v3 */
											 java.lang.String .format ( v1,v2 );
											 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
											 /* throw v0 */
											 /* :try_end_0 */
											 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
											 /* :catchall_0 */
											 /* move-exception v0 */
											 /* monitor-exit p0 */
											 /* throw v0 */
										 } // :cond_0
										 try { // :try_start_1
											 /* array-length v0, p2 */
											 /* add-int/lit8 v0, v0, 0x1 */
											 /* new-array v0, v0, [Ljava/lang/Class; */
											 int v1 = 0; // const/4 v1, 0x0
											 int v2 = 0; // const/4 v2, 0x0
											 /* array-length v3, p2 */
											 java.lang.System .arraycopy ( p2,v1,v0,v2,v3 );
											 /* array-length v1, v0 */
											 /* add-int/lit8 v1, v1, -0x1 */
											 /* const-class v2, Lcom/naef/jnlua/LuaValueProxy; */
											 /* aput-object v2, v0, v1 */
											 /* const/16 v1, -0x2710 */
											 (( com.naef.jnlua.LuaState ) p0 ).ref ( v1 ); // invoke-virtual {p0, v1}, Lcom/naef/jnlua/LuaState;->ref(I)I
											 /* :try_end_1 */
											 v1 = 											 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
											 try { // :try_start_2
												 v2 = this.classLoader;
												 /* new-instance v3, Lcom/naef/jnlua/LuaState$LuaInvocationHandler; */
												 /* invoke-direct {v3, p0, v1}, Lcom/naef/jnlua/LuaState$LuaInvocationHandler;-><init>(Lcom/naef/jnlua/LuaState;I)V */
												 java.lang.reflect.Proxy .newProxyInstance ( v2,v0,v3 );
												 int v1 = -1; // const/4 v1, -0x1
												 /* check-cast v0, Lcom/naef/jnlua/LuaValueProxy; */
												 /* :try_end_2 */
												 /* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
												 /* monitor-exit p0 */
												 /* :catchall_1 */
												 /* move-exception v0 */
												 /* if-ltz v1, :cond_1 */
												 /* const/16 v2, -0x2710 */
												 try { // :try_start_3
													 (( com.naef.jnlua.LuaState ) p0 ).unref ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Lcom/naef/jnlua/LuaState;->unref(II)V
												 } // :cond_1
												 /* throw v0 */
												 /* :try_end_3 */
												 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
											 } // .end method
											 public synchronized java.lang.Object getProxy ( Integer p0, java.lang.Class p1 ) {
												 /* .locals 2 */
												 /* .annotation system Ldalvik/annotation/Signature; */
												 /* value = { */
												 /* "<T:", */
												 /* "Ljava/lang/Object;", */
												 /* ">(I", */
												 /* "Ljava/lang/Class", */
												 /* "<TT;>;)TT;" */
												 /* } */
											 } // .end annotation
											 /* monitor-enter p0 */
											 int v0 = 1; // const/4 v0, 0x1
											 try { // :try_start_0
												 /* new-array v0, v0, [Ljava/lang/Class; */
												 int v1 = 0; // const/4 v1, 0x0
												 /* aput-object p2, v0, v1 */
												 (( com.naef.jnlua.LuaState ) p0 ).getProxy ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/naef/jnlua/LuaState;->getProxy(I[Ljava/lang/Class;)Lcom/naef/jnlua/LuaValueProxy;
												 /* :try_end_0 */
												 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
												 /* monitor-exit p0 */
												 /* :catchall_0 */
												 /* move-exception v0 */
												 /* monitor-exit p0 */
												 /* throw v0 */
											 } // .end method
											 public synchronized void getTable ( Integer p0 ) {
												 /* .locals 1 */
												 /* monitor-enter p0 */
												 try { // :try_start_0
													 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
													 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_gettable(I)V */
													 /* :try_end_0 */
													 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
													 /* monitor-exit p0 */
													 return;
													 /* :catchall_0 */
													 /* move-exception v0 */
													 /* monitor-exit p0 */
													 /* throw v0 */
												 } // .end method
												 public synchronized Integer getTop ( ) {
													 /* .locals 1 */
													 /* monitor-enter p0 */
													 try { // :try_start_0
														 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
														 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->lua_gettop()I */
														 /* :try_end_0 */
														 v0 = 														 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
														 /* monitor-exit p0 */
														 /* :catchall_0 */
														 /* move-exception v0 */
														 /* monitor-exit p0 */
														 /* throw v0 */
													 } // .end method
													 public synchronized void insert ( Integer p0 ) {
														 /* .locals 1 */
														 /* monitor-enter p0 */
														 try { // :try_start_0
															 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
															 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_insert(I)V */
															 /* :try_end_0 */
															 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
															 /* monitor-exit p0 */
															 return;
															 /* :catchall_0 */
															 /* move-exception v0 */
															 /* monitor-exit p0 */
															 /* throw v0 */
														 } // .end method
														 public synchronized Boolean isBoolean ( Integer p0 ) {
															 /* .locals 1 */
															 /* monitor-enter p0 */
															 try { // :try_start_0
																 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_isboolean(I)I */
																 /* :try_end_0 */
																 v0 = 																 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																 if ( v0 != null) { // if-eqz v0, :cond_0
																	 int v0 = 1; // const/4 v0, 0x1
																 } // :goto_0
																 /* monitor-exit p0 */
															 } // :cond_0
															 int v0 = 0; // const/4 v0, 0x0
															 /* :catchall_0 */
															 /* move-exception v0 */
															 /* monitor-exit p0 */
															 /* throw v0 */
														 } // .end method
														 public synchronized Boolean isCFunction ( Integer p0 ) {
															 /* .locals 1 */
															 /* monitor-enter p0 */
															 try { // :try_start_0
																 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_iscfunction(I)I */
																 /* :try_end_0 */
																 v0 = 																 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																 if ( v0 != null) { // if-eqz v0, :cond_0
																	 int v0 = 1; // const/4 v0, 0x1
																 } // :goto_0
																 /* monitor-exit p0 */
															 } // :cond_0
															 int v0 = 0; // const/4 v0, 0x0
															 /* :catchall_0 */
															 /* move-exception v0 */
															 /* monitor-exit p0 */
															 /* throw v0 */
														 } // .end method
														 public synchronized Boolean isFunction ( Integer p0 ) {
															 /* .locals 1 */
															 /* monitor-enter p0 */
															 try { // :try_start_0
																 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_isfunction(I)I */
																 /* :try_end_0 */
																 v0 = 																 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																 if ( v0 != null) { // if-eqz v0, :cond_0
																	 int v0 = 1; // const/4 v0, 0x1
																 } // :goto_0
																 /* monitor-exit p0 */
															 } // :cond_0
															 int v0 = 0; // const/4 v0, 0x0
															 /* :catchall_0 */
															 /* move-exception v0 */
															 /* monitor-exit p0 */
															 /* throw v0 */
														 } // .end method
														 public synchronized Boolean isJavaFunction ( Integer p0 ) {
															 /* .locals 1 */
															 /* monitor-enter p0 */
															 try { // :try_start_0
																 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_isjavafunction(I)I */
																 /* :try_end_0 */
																 v0 = 																 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																 if ( v0 != null) { // if-eqz v0, :cond_0
																	 int v0 = 1; // const/4 v0, 0x1
																 } // :goto_0
																 /* monitor-exit p0 */
															 } // :cond_0
															 int v0 = 0; // const/4 v0, 0x0
															 /* :catchall_0 */
															 /* move-exception v0 */
															 /* monitor-exit p0 */
															 /* throw v0 */
														 } // .end method
														 public synchronized Boolean isJavaObject ( Integer p0, java.lang.Class p1 ) {
															 /* .locals 2 */
															 /* .annotation system Ldalvik/annotation/Signature; */
															 /* value = { */
															 /* "(I", */
															 /* "Ljava/lang/Class", */
															 /* "<*>;)Z" */
															 /* } */
														 } // .end annotation
														 /* monitor-enter p0 */
														 try { // :try_start_0
															 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
															 v0 = this.converter;
															 /* :try_end_0 */
															 v0 = 															 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
															 /* const v1, 0x7fffffff */
															 /* if-eq v0, v1, :cond_0 */
															 int v0 = 1; // const/4 v0, 0x1
														 } // :goto_0
														 /* monitor-exit p0 */
													 } // :cond_0
													 int v0 = 0; // const/4 v0, 0x0
													 /* :catchall_0 */
													 /* move-exception v0 */
													 /* monitor-exit p0 */
													 /* throw v0 */
												 } // .end method
												 public synchronized Boolean isJavaObjectRaw ( Integer p0 ) {
													 /* .locals 1 */
													 /* monitor-enter p0 */
													 try { // :try_start_0
														 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
														 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_isjavaobject(I)I */
														 /* :try_end_0 */
														 v0 = 														 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
														 if ( v0 != null) { // if-eqz v0, :cond_0
															 int v0 = 1; // const/4 v0, 0x1
														 } // :goto_0
														 /* monitor-exit p0 */
													 } // :cond_0
													 int v0 = 0; // const/4 v0, 0x0
													 /* :catchall_0 */
													 /* move-exception v0 */
													 /* monitor-exit p0 */
													 /* throw v0 */
												 } // .end method
												 public synchronized Boolean isNil ( Integer p0 ) {
													 /* .locals 1 */
													 /* monitor-enter p0 */
													 try { // :try_start_0
														 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
														 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_isnil(I)I */
														 /* :try_end_0 */
														 v0 = 														 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
														 if ( v0 != null) { // if-eqz v0, :cond_0
															 int v0 = 1; // const/4 v0, 0x1
														 } // :goto_0
														 /* monitor-exit p0 */
													 } // :cond_0
													 int v0 = 0; // const/4 v0, 0x0
													 /* :catchall_0 */
													 /* move-exception v0 */
													 /* monitor-exit p0 */
													 /* throw v0 */
												 } // .end method
												 public synchronized Boolean isNone ( Integer p0 ) {
													 /* .locals 1 */
													 /* monitor-enter p0 */
													 try { // :try_start_0
														 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
														 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_isnone(I)I */
														 /* :try_end_0 */
														 v0 = 														 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
														 if ( v0 != null) { // if-eqz v0, :cond_0
															 int v0 = 1; // const/4 v0, 0x1
														 } // :goto_0
														 /* monitor-exit p0 */
													 } // :cond_0
													 int v0 = 0; // const/4 v0, 0x0
													 /* :catchall_0 */
													 /* move-exception v0 */
													 /* monitor-exit p0 */
													 /* throw v0 */
												 } // .end method
												 public synchronized Boolean isNoneOrNil ( Integer p0 ) {
													 /* .locals 1 */
													 /* monitor-enter p0 */
													 try { // :try_start_0
														 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
														 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_isnoneornil(I)I */
														 /* :try_end_0 */
														 v0 = 														 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
														 if ( v0 != null) { // if-eqz v0, :cond_0
															 int v0 = 1; // const/4 v0, 0x1
														 } // :goto_0
														 /* monitor-exit p0 */
													 } // :cond_0
													 int v0 = 0; // const/4 v0, 0x0
													 /* :catchall_0 */
													 /* move-exception v0 */
													 /* monitor-exit p0 */
													 /* throw v0 */
												 } // .end method
												 public synchronized Boolean isNumber ( Integer p0 ) {
													 /* .locals 1 */
													 /* monitor-enter p0 */
													 try { // :try_start_0
														 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
														 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_isnumber(I)I */
														 /* :try_end_0 */
														 v0 = 														 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
														 if ( v0 != null) { // if-eqz v0, :cond_0
															 int v0 = 1; // const/4 v0, 0x1
														 } // :goto_0
														 /* monitor-exit p0 */
													 } // :cond_0
													 int v0 = 0; // const/4 v0, 0x0
													 /* :catchall_0 */
													 /* move-exception v0 */
													 /* monitor-exit p0 */
													 /* throw v0 */
												 } // .end method
												 public synchronized final Boolean isOpen ( ) {
													 /* .locals 1 */
													 /* monitor-enter p0 */
													 try { // :try_start_0
														 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->isOpenInternal()Z */
														 /* :try_end_0 */
														 v0 = 														 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
														 /* monitor-exit p0 */
														 /* :catchall_0 */
														 /* move-exception v0 */
														 /* monitor-exit p0 */
														 /* throw v0 */
													 } // .end method
													 public synchronized Boolean isString ( Integer p0 ) {
														 /* .locals 1 */
														 /* monitor-enter p0 */
														 try { // :try_start_0
															 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
															 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_isstring(I)I */
															 /* :try_end_0 */
															 v0 = 															 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
															 if ( v0 != null) { // if-eqz v0, :cond_0
																 int v0 = 1; // const/4 v0, 0x1
															 } // :goto_0
															 /* monitor-exit p0 */
														 } // :cond_0
														 int v0 = 0; // const/4 v0, 0x0
														 /* :catchall_0 */
														 /* move-exception v0 */
														 /* monitor-exit p0 */
														 /* throw v0 */
													 } // .end method
													 public synchronized Boolean isTable ( Integer p0 ) {
														 /* .locals 1 */
														 /* monitor-enter p0 */
														 try { // :try_start_0
															 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
															 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_istable(I)I */
															 /* :try_end_0 */
															 v0 = 															 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
															 if ( v0 != null) { // if-eqz v0, :cond_0
																 int v0 = 1; // const/4 v0, 0x1
															 } // :goto_0
															 /* monitor-exit p0 */
														 } // :cond_0
														 int v0 = 0; // const/4 v0, 0x0
														 /* :catchall_0 */
														 /* move-exception v0 */
														 /* monitor-exit p0 */
														 /* throw v0 */
													 } // .end method
													 public synchronized Boolean isThread ( Integer p0 ) {
														 /* .locals 1 */
														 /* monitor-enter p0 */
														 try { // :try_start_0
															 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
															 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_isthread(I)I */
															 /* :try_end_0 */
															 v0 = 															 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
															 if ( v0 != null) { // if-eqz v0, :cond_0
																 int v0 = 1; // const/4 v0, 0x1
															 } // :goto_0
															 /* monitor-exit p0 */
														 } // :cond_0
														 int v0 = 0; // const/4 v0, 0x0
														 /* :catchall_0 */
														 /* move-exception v0 */
														 /* monitor-exit p0 */
														 /* throw v0 */
													 } // .end method
													 public synchronized Integer length ( Integer p0 ) {
														 /* .locals 1 */
														 /* monitor-enter p0 */
														 try { // :try_start_0
															 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
															 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_objlen(I)I */
															 /* :try_end_0 */
															 v0 = 															 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
															 /* monitor-exit p0 */
															 /* :catchall_0 */
															 /* move-exception v0 */
															 /* monitor-exit p0 */
															 /* throw v0 */
														 } // .end method
														 public synchronized Boolean lessThan ( Integer p0, Integer p1 ) {
															 /* .locals 1 */
															 /* .annotation system Ldalvik/annotation/Throws; */
															 /* value = { */
															 /* Lcom/naef/jnlua/LuaMemoryAllocationException;, */
															 /* Lcom/naef/jnlua/LuaRuntimeException; */
															 /* } */
														 } // .end annotation
														 /* monitor-enter p0 */
														 try { // :try_start_0
															 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
															 /* invoke-direct {p0, p1, p2}, Lcom/naef/jnlua/LuaState;->lua_lessthan(II)I */
															 /* :try_end_0 */
															 v0 = 															 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
															 if ( v0 != null) { // if-eqz v0, :cond_0
																 int v0 = 1; // const/4 v0, 0x1
															 } // :goto_0
															 /* monitor-exit p0 */
														 } // :cond_0
														 int v0 = 0; // const/4 v0, 0x0
														 /* :catchall_0 */
														 /* move-exception v0 */
														 /* monitor-exit p0 */
														 /* throw v0 */
													 } // .end method
													 public synchronized void load ( java.io.InputStream p0, java.lang.String p1 ) {
														 /* .locals 2 */
														 /* .annotation system Ldalvik/annotation/Throws; */
														 /* value = { */
														 /* Ljava/io/IOException; */
														 /* } */
													 } // .end annotation
													 /* monitor-enter p0 */
													 /* if-nez p2, :cond_0 */
													 try { // :try_start_0
														 /* new-instance v0, Ljava/lang/NullPointerException; */
														 /* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
														 /* throw v0 */
														 /* :try_end_0 */
														 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
														 /* :catchall_0 */
														 /* move-exception v0 */
														 /* monitor-exit p0 */
														 /* throw v0 */
													 } // :cond_0
													 try { // :try_start_1
														 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
														 /* new-instance v0, Ljava/lang/StringBuilder; */
														 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
														 final String v1 = "="; // const-string v1, "="
														 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
														 (( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
														 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
														 /* invoke-direct {p0, p1, v0}, Lcom/naef/jnlua/LuaState;->lua_load(Ljava/io/InputStream;Ljava/lang/String;)V */
														 /* :try_end_1 */
														 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
														 /* monitor-exit p0 */
														 return;
													 } // .end method
													 public synchronized void load ( java.lang.String p0, java.lang.String p1 ) {
														 /* .locals 2 */
														 /* monitor-enter p0 */
														 try { // :try_start_0
															 /* new-instance v0, Ljava/io/ByteArrayInputStream; */
															 final String v1 = "UTF-8"; // const-string v1, "UTF-8"
															 (( java.lang.String ) p1 ).getBytes ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
															 /* invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
															 (( com.naef.jnlua.LuaState ) p0 ).load ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Lcom/naef/jnlua/LuaState;->load(Ljava/io/InputStream;Ljava/lang/String;)V
															 /* :try_end_0 */
															 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
															 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
															 /* monitor-exit p0 */
															 return;
															 /* :catch_0 */
															 /* move-exception v0 */
															 try { // :try_start_1
																 /* new-instance v1, Lcom/naef/jnlua/LuaMemoryAllocationException; */
																 (( java.io.IOException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
																 /* invoke-direct {v1, v0}, Lcom/naef/jnlua/LuaMemoryAllocationException;-><init>(Ljava/lang/String;)V */
																 /* throw v1 */
																 /* :try_end_1 */
																 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
																 /* :catchall_0 */
																 /* move-exception v0 */
																 /* monitor-exit p0 */
																 /* throw v0 */
															 } // .end method
															 public synchronized void newTable ( ) {
																 /* .locals 1 */
																 /* monitor-enter p0 */
																 try { // :try_start_0
																	 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																	 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->lua_newtable()V */
																	 /* :try_end_0 */
																	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																	 /* monitor-exit p0 */
																	 return;
																	 /* :catchall_0 */
																	 /* move-exception v0 */
																	 /* monitor-exit p0 */
																	 /* throw v0 */
																 } // .end method
																 public synchronized void newTable ( Integer p0, Integer p1 ) {
																	 /* .locals 1 */
																	 /* monitor-enter p0 */
																	 try { // :try_start_0
																		 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																		 /* invoke-direct {p0, p1, p2}, Lcom/naef/jnlua/LuaState;->lua_createtable(II)V */
																		 /* :try_end_0 */
																		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																		 /* monitor-exit p0 */
																		 return;
																		 /* :catchall_0 */
																		 /* move-exception v0 */
																		 /* monitor-exit p0 */
																		 /* throw v0 */
																	 } // .end method
																	 public synchronized void newThread ( ) {
																		 /* .locals 1 */
																		 /* monitor-enter p0 */
																		 try { // :try_start_0
																			 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																			 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->lua_newthread()V */
																			 /* :try_end_0 */
																			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																			 /* monitor-exit p0 */
																			 return;
																			 /* :catchall_0 */
																			 /* move-exception v0 */
																			 /* monitor-exit p0 */
																			 /* throw v0 */
																		 } // .end method
																		 public synchronized Boolean next ( Integer p0 ) {
																			 /* .locals 1 */
																			 /* monitor-enter p0 */
																			 try { // :try_start_0
																				 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																				 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_next(I)I */
																				 /* :try_end_0 */
																				 v0 = 																				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																				 if ( v0 != null) { // if-eqz v0, :cond_0
																					 int v0 = 1; // const/4 v0, 0x1
																				 } // :goto_0
																				 /* monitor-exit p0 */
																			 } // :cond_0
																			 int v0 = 0; // const/4 v0, 0x0
																			 /* :catchall_0 */
																			 /* move-exception v0 */
																			 /* monitor-exit p0 */
																			 /* throw v0 */
																		 } // .end method
																		 public synchronized void openLib ( com.naef.jnlua.LuaState$Library p0 ) {
																			 /* .locals 1 */
																			 /* monitor-enter p0 */
																			 try { // :try_start_0
																				 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																				 (( com.naef.jnlua.LuaState$Library ) p1 ).open ( p0 ); // invoke-virtual {p1, p0}, Lcom/naef/jnlua/LuaState$Library;->open(Lcom/naef/jnlua/LuaState;)V
																				 /* :try_end_0 */
																				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																				 /* monitor-exit p0 */
																				 return;
																				 /* :catchall_0 */
																				 /* move-exception v0 */
																				 /* monitor-exit p0 */
																				 /* throw v0 */
																			 } // .end method
																			 public synchronized void openLibs ( ) {
																				 /* .locals 4 */
																				 /* monitor-enter p0 */
																				 try { // :try_start_0
																					 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																					 com.naef.jnlua.LuaState$Library .values ( );
																					 /* array-length v2, v1 */
																					 int v0 = 0; // const/4 v0, 0x0
																				 } // :goto_0
																				 /* if-ge v0, v2, :cond_0 */
																				 /* aget-object v3, v1, v0 */
																				 (( com.naef.jnlua.LuaState$Library ) v3 ).open ( p0 ); // invoke-virtual {v3, p0}, Lcom/naef/jnlua/LuaState$Library;->open(Lcom/naef/jnlua/LuaState;)V
																				 /* :try_end_0 */
																				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																				 /* add-int/lit8 v0, v0, 0x1 */
																			 } // :cond_0
																			 /* monitor-exit p0 */
																			 return;
																			 /* :catchall_0 */
																			 /* move-exception v0 */
																			 /* monitor-exit p0 */
																			 /* throw v0 */
																		 } // .end method
																		 public synchronized void pop ( Integer p0 ) {
																			 /* .locals 1 */
																			 /* monitor-enter p0 */
																			 try { // :try_start_0
																				 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																				 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_pop(I)V */
																				 /* :try_end_0 */
																				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																				 /* monitor-exit p0 */
																				 return;
																				 /* :catchall_0 */
																				 /* move-exception v0 */
																				 /* monitor-exit p0 */
																				 /* throw v0 */
																			 } // .end method
																			 public synchronized void pushBoolean ( Boolean p0 ) {
																				 /* .locals 1 */
																				 /* monitor-enter p0 */
																				 try { // :try_start_0
																					 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																					 if ( p1 != null) { // if-eqz p1, :cond_0
																						 int v0 = 1; // const/4 v0, 0x1
																					 } // :goto_0
																					 /* invoke-direct {p0, v0}, Lcom/naef/jnlua/LuaState;->lua_pushboolean(I)V */
																					 /* :try_end_0 */
																					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																					 /* monitor-exit p0 */
																					 return;
																				 } // :cond_0
																				 int v0 = 0; // const/4 v0, 0x0
																				 /* :catchall_0 */
																				 /* move-exception v0 */
																				 /* monitor-exit p0 */
																				 /* throw v0 */
																			 } // .end method
																			 public synchronized void pushInteger ( Integer p0 ) {
																				 /* .locals 1 */
																				 /* monitor-enter p0 */
																				 try { // :try_start_0
																					 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																					 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_pushinteger(I)V */
																					 /* :try_end_0 */
																					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																					 /* monitor-exit p0 */
																					 return;
																					 /* :catchall_0 */
																					 /* move-exception v0 */
																					 /* monitor-exit p0 */
																					 /* throw v0 */
																				 } // .end method
																				 public synchronized void pushJavaFunction ( com.naef.jnlua.JavaFunction p0 ) {
																					 /* .locals 1 */
																					 /* monitor-enter p0 */
																					 try { // :try_start_0
																						 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																						 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_pushjavafunction(Lcom/naef/jnlua/JavaFunction;)V */
																						 /* :try_end_0 */
																						 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																						 /* monitor-exit p0 */
																						 return;
																						 /* :catchall_0 */
																						 /* move-exception v0 */
																						 /* monitor-exit p0 */
																						 /* throw v0 */
																					 } // .end method
																					 public synchronized void pushJavaObject ( java.lang.Object p0 ) {
																						 /* .locals 1 */
																						 /* monitor-enter p0 */
																						 try { // :try_start_0
																							 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																							 (( com.naef.jnlua.LuaState ) p0 ).getConverter ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/LuaState;->getConverter()Lcom/naef/jnlua/Converter;
																							 /* :try_end_0 */
																							 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																							 /* monitor-exit p0 */
																							 return;
																							 /* :catchall_0 */
																							 /* move-exception v0 */
																							 /* monitor-exit p0 */
																							 /* throw v0 */
																						 } // .end method
																						 public synchronized void pushJavaObjectRaw ( java.lang.Object p0 ) {
																							 /* .locals 1 */
																							 /* monitor-enter p0 */
																							 try { // :try_start_0
																								 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																								 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_pushjavaobject(Ljava/lang/Object;)V */
																								 /* :try_end_0 */
																								 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																								 /* monitor-exit p0 */
																								 return;
																								 /* :catchall_0 */
																								 /* move-exception v0 */
																								 /* monitor-exit p0 */
																								 /* throw v0 */
																							 } // .end method
																							 public synchronized void pushNil ( ) {
																								 /* .locals 1 */
																								 /* monitor-enter p0 */
																								 try { // :try_start_0
																									 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																									 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->lua_pushnil()V */
																									 /* :try_end_0 */
																									 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																									 /* monitor-exit p0 */
																									 return;
																									 /* :catchall_0 */
																									 /* move-exception v0 */
																									 /* monitor-exit p0 */
																									 /* throw v0 */
																								 } // .end method
																								 public synchronized void pushNumber ( Double p0 ) {
																									 /* .locals 1 */
																									 /* monitor-enter p0 */
																									 try { // :try_start_0
																										 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																										 /* invoke-direct {p0, p1, p2}, Lcom/naef/jnlua/LuaState;->lua_pushnumber(D)V */
																										 /* :try_end_0 */
																										 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																										 /* monitor-exit p0 */
																										 return;
																										 /* :catchall_0 */
																										 /* move-exception v0 */
																										 /* monitor-exit p0 */
																										 /* throw v0 */
																									 } // .end method
																									 public synchronized void pushString ( java.lang.String p0 ) {
																										 /* .locals 1 */
																										 /* monitor-enter p0 */
																										 try { // :try_start_0
																											 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																											 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_pushstring(Ljava/lang/String;)V */
																											 /* :try_end_0 */
																											 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																											 /* monitor-exit p0 */
																											 return;
																											 /* :catchall_0 */
																											 /* move-exception v0 */
																											 /* monitor-exit p0 */
																											 /* throw v0 */
																										 } // .end method
																										 public synchronized void pushValue ( Integer p0 ) {
																											 /* .locals 1 */
																											 /* monitor-enter p0 */
																											 try { // :try_start_0
																												 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																												 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_pushvalue(I)V */
																												 /* :try_end_0 */
																												 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																												 /* monitor-exit p0 */
																												 return;
																												 /* :catchall_0 */
																												 /* move-exception v0 */
																												 /* monitor-exit p0 */
																												 /* throw v0 */
																											 } // .end method
																											 public synchronized Boolean rawEqual ( Integer p0, Integer p1 ) {
																												 /* .locals 1 */
																												 /* monitor-enter p0 */
																												 try { // :try_start_0
																													 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																													 /* invoke-direct {p0, p1, p2}, Lcom/naef/jnlua/LuaState;->lua_rawequal(II)I */
																													 /* :try_end_0 */
																													 v0 = 																													 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																													 if ( v0 != null) { // if-eqz v0, :cond_0
																														 int v0 = 1; // const/4 v0, 0x1
																													 } // :goto_0
																													 /* monitor-exit p0 */
																												 } // :cond_0
																												 int v0 = 0; // const/4 v0, 0x0
																												 /* :catchall_0 */
																												 /* move-exception v0 */
																												 /* monitor-exit p0 */
																												 /* throw v0 */
																											 } // .end method
																											 public synchronized void rawGet ( Integer p0 ) {
																												 /* .locals 1 */
																												 /* monitor-enter p0 */
																												 try { // :try_start_0
																													 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																													 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_rawget(I)V */
																													 /* :try_end_0 */
																													 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																													 /* monitor-exit p0 */
																													 return;
																													 /* :catchall_0 */
																													 /* move-exception v0 */
																													 /* monitor-exit p0 */
																													 /* throw v0 */
																												 } // .end method
																												 public synchronized void rawGet ( Integer p0, Integer p1 ) {
																													 /* .locals 1 */
																													 /* monitor-enter p0 */
																													 try { // :try_start_0
																														 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																														 /* invoke-direct {p0, p1, p2}, Lcom/naef/jnlua/LuaState;->lua_rawgeti(II)V */
																														 /* :try_end_0 */
																														 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																														 /* monitor-exit p0 */
																														 return;
																														 /* :catchall_0 */
																														 /* move-exception v0 */
																														 /* monitor-exit p0 */
																														 /* throw v0 */
																													 } // .end method
																													 public synchronized void rawSet ( Integer p0 ) {
																														 /* .locals 1 */
																														 /* monitor-enter p0 */
																														 try { // :try_start_0
																															 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																															 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_rawset(I)V */
																															 /* :try_end_0 */
																															 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																															 /* monitor-exit p0 */
																															 return;
																															 /* :catchall_0 */
																															 /* move-exception v0 */
																															 /* monitor-exit p0 */
																															 /* throw v0 */
																														 } // .end method
																														 public synchronized void rawSet ( Integer p0, Integer p1 ) {
																															 /* .locals 1 */
																															 /* monitor-enter p0 */
																															 try { // :try_start_0
																																 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																 /* invoke-direct {p0, p1, p2}, Lcom/naef/jnlua/LuaState;->lua_rawseti(II)V */
																																 /* :try_end_0 */
																																 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																 /* monitor-exit p0 */
																																 return;
																																 /* :catchall_0 */
																																 /* move-exception v0 */
																																 /* monitor-exit p0 */
																																 /* throw v0 */
																															 } // .end method
																															 public synchronized Integer ref ( Integer p0 ) {
																																 /* .locals 1 */
																																 /* monitor-enter p0 */
																																 try { // :try_start_0
																																	 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																	 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_ref(I)I */
																																	 /* :try_end_0 */
																																	 v0 = 																																	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																	 /* monitor-exit p0 */
																																	 /* :catchall_0 */
																																	 /* move-exception v0 */
																																	 /* monitor-exit p0 */
																																	 /* throw v0 */
																																 } // .end method
																																 public synchronized void register ( com.naef.jnlua.NamedJavaFunction p0 ) {
																																	 /* .locals 2 */
																																	 /* monitor-enter p0 */
																																	 try { // :try_start_0
																																		 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																		 /* if-nez v0, :cond_0 */
																																		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
																																		 final String v1 = "Anonymous function"; // const-string v1, "Anonymous function"
																																		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
																																		 /* throw v0 */
																																		 /* :try_end_0 */
																																		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																		 /* :catchall_0 */
																																		 /* move-exception v0 */
																																		 /* monitor-exit p0 */
																																		 /* throw v0 */
																																	 } // :cond_0
																																	 try { // :try_start_1
																																		 (( com.naef.jnlua.LuaState ) p0 ).pushJavaFunction ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->pushJavaFunction(Lcom/naef/jnlua/JavaFunction;)V
																																		 (( com.naef.jnlua.LuaState ) p0 ).setGlobal ( v0 ); // invoke-virtual {p0, v0}, Lcom/naef/jnlua/LuaState;->setGlobal(Ljava/lang/String;)V
																																		 /* :try_end_1 */
																																		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
																																		 /* monitor-exit p0 */
																																		 return;
																																	 } // .end method
																																	 public synchronized void register ( java.lang.String p0, com.naef.jnlua.NamedJavaFunction[] p1 ) {
																																		 /* .locals 5 */
																																		 int v0 = 0; // const/4 v0, 0x0
																																		 /* monitor-enter p0 */
																																		 try { // :try_start_0
																																			 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																			 /* const/16 v1, -0x2710 */
																																			 final String v2 = "_LOADED"; // const-string v2, "_LOADED"
																																			 int v3 = 1; // const/4 v3, 0x1
																																			 /* invoke-direct {p0, v1, v2, v3}, Lcom/naef/jnlua/LuaState;->lua_findtable(ILjava/lang/String;I)Ljava/lang/String; */
																																			 int v1 = -1; // const/4 v1, -0x1
																																			 (( com.naef.jnlua.LuaState ) p0 ).getField ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Lcom/naef/jnlua/LuaState;->getField(ILjava/lang/String;)V
																																			 int v1 = -1; // const/4 v1, -0x1
																																			 v1 = 																																			 (( com.naef.jnlua.LuaState ) p0 ).isTable ( v1 ); // invoke-virtual {p0, v1}, Lcom/naef/jnlua/LuaState;->isTable(I)Z
																																			 /* if-nez v1, :cond_1 */
																																			 int v1 = 1; // const/4 v1, 0x1
																																			 (( com.naef.jnlua.LuaState ) p0 ).pop ( v1 ); // invoke-virtual {p0, v1}, Lcom/naef/jnlua/LuaState;->pop(I)V
																																			 /* const/16 v1, -0x2712 */
																																			 /* array-length v2, p2 */
																																			 /* invoke-direct {p0, v1, p1, v2}, Lcom/naef/jnlua/LuaState;->lua_findtable(ILjava/lang/String;I)Ljava/lang/String; */
																																			 if ( v1 != null) { // if-eqz v1, :cond_0
																																				 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
																																				 final String v2 = "naming conflict for module name \'%s\' at \'%s\'"; // const-string v2, "naming conflict for module name \'%s\' at \'%s\'"
																																				 int v3 = 2; // const/4 v3, 0x2
																																				 /* new-array v3, v3, [Ljava/lang/Object; */
																																				 int v4 = 0; // const/4 v4, 0x0
																																				 /* aput-object p1, v3, v4 */
																																				 int v4 = 1; // const/4 v4, 0x1
																																				 /* aput-object v1, v3, v4 */
																																				 java.lang.String .format ( v2,v3 );
																																				 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
																																				 /* throw v0 */
																																				 /* :try_end_0 */
																																				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																				 /* :catchall_0 */
																																				 /* move-exception v0 */
																																				 /* monitor-exit p0 */
																																				 /* throw v0 */
																																			 } // :cond_0
																																			 int v1 = -1; // const/4 v1, -0x1
																																			 try { // :try_start_1
																																				 (( com.naef.jnlua.LuaState ) p0 ).pushValue ( v1 ); // invoke-virtual {p0, v1}, Lcom/naef/jnlua/LuaState;->pushValue(I)V
																																				 int v1 = -3; // const/4 v1, -0x3
																																				 (( com.naef.jnlua.LuaState ) p0 ).setField ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Lcom/naef/jnlua/LuaState;->setField(ILjava/lang/String;)V
																																			 } // :cond_1
																																			 int v1 = -2; // const/4 v1, -0x2
																																			 (( com.naef.jnlua.LuaState ) p0 ).remove ( v1 ); // invoke-virtual {p0, v1}, Lcom/naef/jnlua/LuaState;->remove(I)V
																																		 } // :goto_0
																																		 /* array-length v1, p2 */
																																		 /* if-ge v0, v1, :cond_3 */
																																		 /* aget-object v1, p2, v0 */
																																		 /* if-nez v1, :cond_2 */
																																		 /* new-instance v1, Ljava/lang/IllegalArgumentException; */
																																		 final String v2 = "anonymous function at index %d"; // const-string v2, "anonymous function at index %d"
																																		 int v3 = 1; // const/4 v3, 0x1
																																		 /* new-array v3, v3, [Ljava/lang/Object; */
																																		 int v4 = 0; // const/4 v4, 0x0
																																		 java.lang.Integer .valueOf ( v0 );
																																		 /* aput-object v0, v3, v4 */
																																		 java.lang.String .format ( v2,v3 );
																																		 /* invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
																																		 /* throw v1 */
																																	 } // :cond_2
																																	 /* aget-object v2, p2, v0 */
																																	 (( com.naef.jnlua.LuaState ) p0 ).pushJavaFunction ( v2 ); // invoke-virtual {p0, v2}, Lcom/naef/jnlua/LuaState;->pushJavaFunction(Lcom/naef/jnlua/JavaFunction;)V
																																	 int v2 = -2; // const/4 v2, -0x2
																																	 (( com.naef.jnlua.LuaState ) p0 ).setField ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Lcom/naef/jnlua/LuaState;->setField(ILjava/lang/String;)V
																																	 /* :try_end_1 */
																																	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
																																	 /* add-int/lit8 v0, v0, 0x1 */
																																 } // :cond_3
																																 /* monitor-exit p0 */
																																 return;
																															 } // .end method
																															 public synchronized void remove ( Integer p0 ) {
																																 /* .locals 1 */
																																 /* monitor-enter p0 */
																																 try { // :try_start_0
																																	 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																	 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_remove(I)V */
																																	 /* :try_end_0 */
																																	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																	 /* monitor-exit p0 */
																																	 return;
																																	 /* :catchall_0 */
																																	 /* move-exception v0 */
																																	 /* monitor-exit p0 */
																																	 /* throw v0 */
																																 } // .end method
																																 public synchronized void replace ( Integer p0 ) {
																																	 /* .locals 1 */
																																	 /* monitor-enter p0 */
																																	 try { // :try_start_0
																																		 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																		 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_replace(I)V */
																																		 /* :try_end_0 */
																																		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																		 /* monitor-exit p0 */
																																		 return;
																																		 /* :catchall_0 */
																																		 /* move-exception v0 */
																																		 /* monitor-exit p0 */
																																		 /* throw v0 */
																																	 } // .end method
																																	 public synchronized Integer resume ( Integer p0, Integer p1 ) {
																																		 /* .locals 1 */
																																		 /* monitor-enter p0 */
																																		 try { // :try_start_0
																																			 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																			 /* invoke-direct {p0, p1, p2}, Lcom/naef/jnlua/LuaState;->lua_resume(II)I */
																																			 /* :try_end_0 */
																																			 v0 = 																																			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																			 /* monitor-exit p0 */
																																			 /* :catchall_0 */
																																			 /* move-exception v0 */
																																			 /* monitor-exit p0 */
																																			 /* throw v0 */
																																		 } // .end method
																																		 public synchronized void setClassLoader ( java.lang.ClassLoader p0 ) {
																																			 /* .locals 1 */
																																			 /* monitor-enter p0 */
																																			 /* if-nez p1, :cond_0 */
																																			 try { // :try_start_0
																																				 /* new-instance v0, Ljava/lang/NullPointerException; */
																																				 /* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
																																				 /* throw v0 */
																																				 /* :try_end_0 */
																																				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																				 /* :catchall_0 */
																																				 /* move-exception v0 */
																																				 /* monitor-exit p0 */
																																				 /* throw v0 */
																																			 } // :cond_0
																																			 try { // :try_start_1
																																				 this.classLoader = p1;
																																				 /* :try_end_1 */
																																				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
																																				 /* monitor-exit p0 */
																																				 return;
																																			 } // .end method
																																			 public synchronized void setConverter ( com.naef.jnlua.Converter p0 ) {
																																				 /* .locals 1 */
																																				 /* monitor-enter p0 */
																																				 /* if-nez p1, :cond_0 */
																																				 try { // :try_start_0
																																					 /* new-instance v0, Ljava/lang/NullPointerException; */
																																					 /* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
																																					 /* throw v0 */
																																					 /* :try_end_0 */
																																					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																					 /* :catchall_0 */
																																					 /* move-exception v0 */
																																					 /* monitor-exit p0 */
																																					 /* throw v0 */
																																				 } // :cond_0
																																				 try { // :try_start_1
																																					 this.converter = p1;
																																					 /* :try_end_1 */
																																					 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
																																					 /* monitor-exit p0 */
																																					 return;
																																				 } // .end method
																																				 public synchronized Boolean setFEnv ( Integer p0 ) {
																																					 /* .locals 1 */
																																					 /* monitor-enter p0 */
																																					 try { // :try_start_0
																																						 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																						 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_setfenv(I)I */
																																						 /* :try_end_0 */
																																						 v0 = 																																						 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																						 if ( v0 != null) { // if-eqz v0, :cond_0
																																							 int v0 = 1; // const/4 v0, 0x1
																																						 } // :goto_0
																																						 /* monitor-exit p0 */
																																					 } // :cond_0
																																					 int v0 = 0; // const/4 v0, 0x0
																																					 /* :catchall_0 */
																																					 /* move-exception v0 */
																																					 /* monitor-exit p0 */
																																					 /* throw v0 */
																																				 } // .end method
																																				 public synchronized void setField ( Integer p0, java.lang.String p1 ) {
																																					 /* .locals 1 */
																																					 /* monitor-enter p0 */
																																					 try { // :try_start_0
																																						 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																						 /* invoke-direct {p0, p1, p2}, Lcom/naef/jnlua/LuaState;->lua_setfield(ILjava/lang/String;)V */
																																						 /* :try_end_0 */
																																						 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																						 /* monitor-exit p0 */
																																						 return;
																																						 /* :catchall_0 */
																																						 /* move-exception v0 */
																																						 /* monitor-exit p0 */
																																						 /* throw v0 */
																																					 } // .end method
																																					 public synchronized void setGlobal ( java.lang.String p0 ) {
																																						 /* .locals 1 */
																																						 /* .annotation system Ldalvik/annotation/Throws; */
																																						 /* value = { */
																																						 /* Lcom/naef/jnlua/LuaMemoryAllocationException;, */
																																						 /* Lcom/naef/jnlua/LuaRuntimeException; */
																																						 /* } */
																																					 } // .end annotation
																																					 /* monitor-enter p0 */
																																					 try { // :try_start_0
																																						 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																						 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_setglobal(Ljava/lang/String;)V */
																																						 /* :try_end_0 */
																																						 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																						 /* monitor-exit p0 */
																																						 return;
																																						 /* :catchall_0 */
																																						 /* move-exception v0 */
																																						 /* monitor-exit p0 */
																																						 /* throw v0 */
																																					 } // .end method
																																					 public synchronized void setJavaReflector ( com.naef.jnlua.JavaReflector p0 ) {
																																						 /* .locals 1 */
																																						 /* monitor-enter p0 */
																																						 /* if-nez p1, :cond_0 */
																																						 try { // :try_start_0
																																							 /* new-instance v0, Ljava/lang/NullPointerException; */
																																							 /* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
																																							 /* throw v0 */
																																							 /* :try_end_0 */
																																							 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																							 /* :catchall_0 */
																																							 /* move-exception v0 */
																																							 /* monitor-exit p0 */
																																							 /* throw v0 */
																																						 } // :cond_0
																																						 try { // :try_start_1
																																							 this.javaReflector = p1;
																																							 /* :try_end_1 */
																																							 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
																																							 /* monitor-exit p0 */
																																							 return;
																																						 } // .end method
																																						 public synchronized Boolean setMetatable ( Integer p0 ) {
																																							 /* .locals 1 */
																																							 /* monitor-enter p0 */
																																							 try { // :try_start_0
																																								 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																								 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_setmetatable(I)I */
																																								 /* :try_end_0 */
																																								 v0 = 																																								 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																								 if ( v0 != null) { // if-eqz v0, :cond_0
																																									 int v0 = 1; // const/4 v0, 0x1
																																								 } // :goto_0
																																								 /* monitor-exit p0 */
																																							 } // :cond_0
																																							 int v0 = 0; // const/4 v0, 0x0
																																							 /* :catchall_0 */
																																							 /* move-exception v0 */
																																							 /* monitor-exit p0 */
																																							 /* throw v0 */
																																						 } // .end method
																																						 public synchronized void setTable ( Integer p0 ) {
																																							 /* .locals 1 */
																																							 /* monitor-enter p0 */
																																							 try { // :try_start_0
																																								 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																								 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_settable(I)V */
																																								 /* :try_end_0 */
																																								 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																								 /* monitor-exit p0 */
																																								 return;
																																								 /* :catchall_0 */
																																								 /* move-exception v0 */
																																								 /* monitor-exit p0 */
																																								 /* throw v0 */
																																							 } // .end method
																																							 public synchronized void setTop ( Integer p0 ) {
																																								 /* .locals 1 */
																																								 /* monitor-enter p0 */
																																								 try { // :try_start_0
																																									 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																									 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_settop(I)V */
																																									 /* :try_end_0 */
																																									 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																									 /* monitor-exit p0 */
																																									 return;
																																									 /* :catchall_0 */
																																									 /* move-exception v0 */
																																									 /* monitor-exit p0 */
																																									 /* throw v0 */
																																								 } // .end method
																																								 public synchronized Integer status ( Integer p0 ) {
																																									 /* .locals 1 */
																																									 /* monitor-enter p0 */
																																									 try { // :try_start_0
																																										 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																										 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_status(I)I */
																																										 /* :try_end_0 */
																																										 v0 = 																																										 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																										 /* monitor-exit p0 */
																																										 /* :catchall_0 */
																																										 /* move-exception v0 */
																																										 /* monitor-exit p0 */
																																										 /* throw v0 */
																																									 } // .end method
																																									 public synchronized void tableMove ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
																																										 /* .locals 1 */
																																										 /* monitor-enter p0 */
																																										 try { // :try_start_0
																																											 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																											 /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/naef/jnlua/LuaState;->lua_tablemove(IIII)V */
																																											 /* :try_end_0 */
																																											 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																											 /* monitor-exit p0 */
																																											 return;
																																											 /* :catchall_0 */
																																											 /* move-exception v0 */
																																											 /* monitor-exit p0 */
																																											 /* throw v0 */
																																										 } // .end method
																																										 public synchronized Integer tableSize ( Integer p0 ) {
																																											 /* .locals 1 */
																																											 /* monitor-enter p0 */
																																											 try { // :try_start_0
																																												 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																												 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_tablesize(I)I */
																																												 /* :try_end_0 */
																																												 v0 = 																																												 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																												 /* monitor-exit p0 */
																																												 /* :catchall_0 */
																																												 /* move-exception v0 */
																																												 /* monitor-exit p0 */
																																												 /* throw v0 */
																																											 } // .end method
																																											 public synchronized Boolean toBoolean ( Integer p0 ) {
																																												 /* .locals 1 */
																																												 /* monitor-enter p0 */
																																												 try { // :try_start_0
																																													 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																													 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_toboolean(I)I */
																																													 /* :try_end_0 */
																																													 v0 = 																																													 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																													 if ( v0 != null) { // if-eqz v0, :cond_0
																																														 int v0 = 1; // const/4 v0, 0x1
																																													 } // :goto_0
																																													 /* monitor-exit p0 */
																																												 } // :cond_0
																																												 int v0 = 0; // const/4 v0, 0x0
																																												 /* :catchall_0 */
																																												 /* move-exception v0 */
																																												 /* monitor-exit p0 */
																																												 /* throw v0 */
																																											 } // .end method
																																											 public synchronized Integer toInteger ( Integer p0 ) {
																																												 /* .locals 1 */
																																												 /* monitor-enter p0 */
																																												 try { // :try_start_0
																																													 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																													 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_tointeger(I)I */
																																													 /* :try_end_0 */
																																													 v0 = 																																													 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																													 /* monitor-exit p0 */
																																													 /* :catchall_0 */
																																													 /* move-exception v0 */
																																													 /* monitor-exit p0 */
																																													 /* throw v0 */
																																												 } // .end method
																																												 public synchronized com.naef.jnlua.JavaFunction toJavaFunction ( Integer p0 ) {
																																													 /* .locals 1 */
																																													 /* monitor-enter p0 */
																																													 try { // :try_start_0
																																														 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																														 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_tojavafunction(I)Lcom/naef/jnlua/JavaFunction; */
																																														 /* :try_end_0 */
																																														 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																														 /* monitor-exit p0 */
																																														 /* :catchall_0 */
																																														 /* move-exception v0 */
																																														 /* monitor-exit p0 */
																																														 /* throw v0 */
																																													 } // .end method
																																													 public synchronized java.lang.Object toJavaObject ( Integer p0, java.lang.Class p1 ) {
																																														 /* .locals 1 */
																																														 /* .annotation system Ldalvik/annotation/Signature; */
																																														 /* value = { */
																																														 /* "<T:", */
																																														 /* "Ljava/lang/Object;", */
																																														 /* ">(I", */
																																														 /* "Ljava/lang/Class", */
																																														 /* "<TT;>;)TT;" */
																																														 /* } */
																																													 } // .end annotation
																																													 /* monitor-enter p0 */
																																													 try { // :try_start_0
																																														 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																														 v0 = this.converter;
																																														 /* :try_end_0 */
																																														 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																														 /* monitor-exit p0 */
																																														 /* :catchall_0 */
																																														 /* move-exception v0 */
																																														 /* monitor-exit p0 */
																																														 /* throw v0 */
																																													 } // .end method
																																													 public synchronized java.lang.Object toJavaObjectRaw ( Integer p0 ) {
																																														 /* .locals 1 */
																																														 /* monitor-enter p0 */
																																														 try { // :try_start_0
																																															 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																															 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_tojavaobject(I)Ljava/lang/Object; */
																																															 /* :try_end_0 */
																																															 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																															 /* monitor-exit p0 */
																																															 /* :catchall_0 */
																																															 /* move-exception v0 */
																																															 /* monitor-exit p0 */
																																															 /* throw v0 */
																																														 } // .end method
																																														 public synchronized Double toNumber ( Integer p0 ) {
																																															 /* .locals 2 */
																																															 /* monitor-enter p0 */
																																															 try { // :try_start_0
																																																 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																																 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_tonumber(I)D */
																																																 /* :try_end_0 */
																																																 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																																 /* move-result-wide v0 */
																																																 /* monitor-exit p0 */
																																																 /* return-wide v0 */
																																																 /* :catchall_0 */
																																																 /* move-exception v0 */
																																																 /* monitor-exit p0 */
																																																 /* throw v0 */
																																															 } // .end method
																																															 public synchronized Long toPointer ( Integer p0 ) {
																																																 /* .locals 2 */
																																																 /* monitor-enter p0 */
																																																 try { // :try_start_0
																																																	 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																																	 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_topointer(I)J */
																																																	 /* :try_end_0 */
																																																	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																																	 /* move-result-wide v0 */
																																																	 /* monitor-exit p0 */
																																																	 /* return-wide v0 */
																																																	 /* :catchall_0 */
																																																	 /* move-exception v0 */
																																																	 /* monitor-exit p0 */
																																																	 /* throw v0 */
																																																 } // .end method
																																																 public synchronized java.lang.String toString ( Integer p0 ) {
																																																	 /* .locals 1 */
																																																	 /* monitor-enter p0 */
																																																	 try { // :try_start_0
																																																		 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																																		 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_tostring(I)Ljava/lang/String; */
																																																		 /* :try_end_0 */
																																																		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																																		 /* monitor-exit p0 */
																																																		 /* :catchall_0 */
																																																		 /* move-exception v0 */
																																																		 /* monitor-exit p0 */
																																																		 /* throw v0 */
																																																	 } // .end method
																																																	 public synchronized com.naef.jnlua.LuaType type ( Integer p0 ) {
																																																		 /* .locals 2 */
																																																		 /* monitor-enter p0 */
																																																		 try { // :try_start_0
																																																			 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																																			 v0 = 																																																			 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_type(I)I */
																																																			 /* if-ltz v0, :cond_0 */
																																																			 com.naef.jnlua.LuaType .values ( );
																																																			 /* aget-object v0, v1, v0 */
																																																			 /* :try_end_0 */
																																																			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																																		 } // :goto_0
																																																		 /* monitor-exit p0 */
																																																	 } // :cond_0
																																																	 int v0 = 0; // const/4 v0, 0x0
																																																	 /* :catchall_0 */
																																																	 /* move-exception v0 */
																																																	 /* monitor-exit p0 */
																																																	 /* throw v0 */
																																																 } // .end method
																																																 public synchronized java.lang.String typeName ( Integer p0 ) {
																																																	 /* .locals 3 */
																																																	 /* monitor-enter p0 */
																																																	 try { // :try_start_0
																																																		 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																																		 (( com.naef.jnlua.LuaState ) p0 ).type ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->type(I)Lcom/naef/jnlua/LuaType;
																																																		 /* if-nez v0, :cond_0 */
																																																		 final String v0 = "no value"; // const-string v0, "no value"
																																																		 /* :try_end_0 */
																																																		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																																	 } // :goto_0
																																																	 /* monitor-exit p0 */
																																																 } // :cond_0
																																																 try { // :try_start_1
																																																	 v1 = com.naef.jnlua.LuaState$3.$SwitchMap$com$naef$jnlua$LuaType;
																																																	 v2 = 																																																	 (( com.naef.jnlua.LuaType ) v0 ).ordinal ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/LuaType;->ordinal()I
																																																	 /* aget v1, v1, v2 */
																																																	 /* packed-switch v1, :pswitch_data_0 */
																																																 } // :cond_1
																																																 (( com.naef.jnlua.LuaType ) v0 ).displayText ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/LuaType;->displayText()Ljava/lang/String;
																																																 /* :pswitch_0 */
																																																 v1 = 																																																 (( com.naef.jnlua.LuaState ) p0 ).isJavaObjectRaw ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->isJavaObjectRaw(I)Z
																																																 if ( v1 != null) { // if-eqz v1, :cond_1
																																																	 (( com.naef.jnlua.LuaState ) p0 ).toJavaObjectRaw ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/LuaState;->toJavaObjectRaw(I)Ljava/lang/Object;
																																																	 /* instance-of v1, v0, Ljava/lang/Class; */
																																																	 if ( v1 != null) { // if-eqz v1, :cond_2
																																																		 /* check-cast v0, Ljava/lang/Class; */
																																																	 } // :goto_1
																																																	 (( java.lang.Class ) v0 ).getCanonicalName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
																																																 } // :cond_2
																																																 (( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
																																																 /* :try_end_1 */
																																																 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
																																																 /* :catchall_0 */
																																																 /* move-exception v0 */
																																																 /* monitor-exit p0 */
																																																 /* throw v0 */
																																																 /* nop */
																																																 /* :pswitch_data_0 */
																																																 /* .packed-switch 0x1 */
																																																 /* :pswitch_0 */
																																															 } // .end packed-switch
																																														 } // .end method
																																														 public synchronized void unref ( Integer p0, Integer p1 ) {
																																															 /* .locals 1 */
																																															 /* monitor-enter p0 */
																																															 try { // :try_start_0
																																																 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																																 /* invoke-direct {p0, p1, p2}, Lcom/naef/jnlua/LuaState;->lua_unref(II)V */
																																																 /* :try_end_0 */
																																																 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																																 /* monitor-exit p0 */
																																																 return;
																																																 /* :catchall_0 */
																																																 /* move-exception v0 */
																																																 /* monitor-exit p0 */
																																																 /* throw v0 */
																																															 } // .end method
																																															 public synchronized Integer yield ( Integer p0 ) {
																																																 /* .locals 1 */
																																																 /* monitor-enter p0 */
																																																 try { // :try_start_0
																																																	 /* invoke-direct {p0}, Lcom/naef/jnlua/LuaState;->check()V */
																																																	 /* invoke-direct {p0, p1}, Lcom/naef/jnlua/LuaState;->lua_yield(I)I */
																																																	 /* :try_end_0 */
																																																	 v0 = 																																																	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																																	 /* monitor-exit p0 */
																																																	 /* :catchall_0 */
																																																	 /* move-exception v0 */
																																																	 /* monitor-exit p0 */
																																																	 /* throw v0 */
																																																 } // .end method
