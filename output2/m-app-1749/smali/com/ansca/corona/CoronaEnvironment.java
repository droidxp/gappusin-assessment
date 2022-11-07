public class com.ansca.corona.CoronaEnvironment {
	 /* .source "CoronaEnvironment.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/ansca/corona/CoronaEnvironment$1;, */
	 /* Lcom/ansca/corona/CoronaEnvironment$RuntimeEventHandler; */
	 /* } */
} // .end annotation
/* # static fields */
private static android.content.Context sApplicationContext;
private static com.ansca.corona.CoronaActivity sCoronaActivity;
private static com.naef.jnlua.JavaFunction sLuaErrorHandlerFunction;
private static java.util.ArrayList sRuntimeListeners;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/ansca/corona/CoronaRuntimeListener;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
static com.ansca.corona.CoronaEnvironment ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 14 */
/* .line 20 */
/* .line 23 */
/* .line 26 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 35 */
/* new-instance v0, Lcom/ansca/corona/CoronaEnvironment$RuntimeEventHandler; */
/* invoke-direct {v0, v1}, Lcom/ansca/corona/CoronaEnvironment$RuntimeEventHandler;-><init>(Lcom/ansca/corona/CoronaEnvironment$1;)V */
com.ansca.corona.CoronaRuntime .addListener ( v0 );
/* .line 36 */
return;
} // .end method
private com.ansca.corona.CoronaEnvironment ( ) {
/* .locals 0 */
/* .prologue */
/* .line 30 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 31 */
return;
} // .end method
static java.util.ArrayList access$100 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 12 */
v0 = com.ansca.corona.CoronaEnvironment.sRuntimeListeners;
} // .end method
public static void addRuntimeListener ( com.ansca.corona.CoronaRuntimeListener p0 ) {
/* .locals 2 */
/* .param p0, "listener" # Lcom/ansca/corona/CoronaRuntimeListener; */
/* .prologue */
/* .line 194 */
v1 = com.ansca.corona.CoronaEnvironment.sRuntimeListeners;
/* monitor-enter v1 */
/* .line 196 */
/* if-nez p0, :cond_0 */
/* .line 197 */
try { // :try_start_0
/* monitor-exit v1 */
/* .line 208 */
} // :goto_0
return;
/* .line 201 */
} // :cond_0
v0 = com.ansca.corona.CoronaEnvironment.sRuntimeListeners;
v0 = (( java.util.ArrayList ) v0 ).indexOf ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I
/* if-ltz v0, :cond_1 */
/* .line 202 */
/* monitor-exit v1 */
/* .line 207 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
/* .line 206 */
} // :cond_1
try { // :try_start_1
v0 = com.ansca.corona.CoronaEnvironment.sRuntimeListeners;
(( java.util.ArrayList ) v0 ).add ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 207 */
/* monitor-exit v1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // .end method
public static android.content.Context getApplicationContext ( ) {
/* .locals 1 */
/* .prologue */
/* .line 91 */
v0 = com.ansca.corona.CoronaEnvironment.sApplicationContext;
} // .end method
public static com.ansca.corona.CoronaActivity getCoronaActivity ( ) {
/* .locals 1 */
/* .prologue */
/* .line 82 */
v0 = com.ansca.corona.CoronaEnvironment.sCoronaActivity;
} // .end method
public static com.naef.jnlua.JavaFunction getLuaErrorHandler ( ) {
/* .locals 1 */
/* .prologue */
/* .line 103 */
v0 = com.ansca.corona.CoronaEnvironment.sLuaErrorHandlerFunction;
} // .end method
static Integer invokeLuaErrorHandler ( Long p0 ) {
/* .locals 8 */
/* .param p0, "luaStateMemoryAddress" # J */
/* .prologue */
int v5 = 1; // const/4 v5, 0x1
/* .line 142 */
/* const-wide/16 v6, 0x0 */
/* cmp-long v6, p0, v6 */
/* if-nez v6, :cond_1 */
/* .line 185 */
} // :cond_0
} // :goto_0
/* .line 148 */
} // :cond_1
v1 = com.ansca.corona.CoronaEnvironment.sLuaErrorHandlerFunction;
/* .line 151 */
/* .local v1, "luaErrorHandlerFunction":Lcom/naef/jnlua/JavaFunction; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 157 */
int v2 = 0; // const/4 v2, 0x0
/* .line 158 */
/* .local v2, "luaState":Lcom/naef/jnlua/LuaState; */
com.ansca.corona.Controller .getRuntime ( );
/* .line 159 */
/* .local v4, "runtime":Lcom/ansca/corona/CoronaRuntime; */
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 160 */
(( com.ansca.corona.CoronaRuntime ) v4 ).getLuaState ( ); // invoke-virtual {v4}, Lcom/ansca/corona/CoronaRuntime;->getLuaState()Lcom/naef/jnlua/LuaState;
/* .line 161 */
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 164 */
try { // :try_start_0
(( java.lang.Object ) v2 ).getClass ( ); // invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
final String v6 = "luaState"; // const-string v6, "luaState"
(( java.lang.Class ) v5 ).getDeclaredField ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 165 */
/* .local v3, "luaStateMemoryAddressfield":Ljava/lang/reflect/Field; */
int v5 = 1; // const/4 v5, 0x1
(( java.lang.reflect.Field ) v3 ).setAccessible ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/reflect/Field;->setAccessible(Z)V
/* .line 166 */
(( java.lang.reflect.Field ) v3 ).getLong ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* move-result-wide v5 */
/* cmp-long v5, v5, p0 */
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 169 */
int v2 = 0; // const/4 v2, 0x0
/* .line 180 */
} // .end local v3 # "luaStateMemoryAddressfield":Ljava/lang/reflect/Field;
} // :cond_2
} // :goto_1
/* if-nez v2, :cond_3 */
/* .line 181 */
/* new-instance v2, Lcom/naef/jnlua/LuaState; */
} // .end local v2 # "luaState":Lcom/naef/jnlua/LuaState;
/* invoke-direct {v2, p0, p1}, Lcom/naef/jnlua/LuaState;-><init>(J)V */
/* .line 185 */
/* .restart local v2 # "luaState":Lcom/naef/jnlua/LuaState; */
v5 = } // :cond_3
/* .line 172 */
/* :catch_0 */
/* move-exception v0 */
/* .line 174 */
/* .local v0, "ex":Ljava/lang/Exception; */
int v2 = 0; // const/4 v2, 0x0
} // .end method
public static void removeRuntimeListener ( com.ansca.corona.CoronaRuntimeListener p0 ) {
/* .locals 2 */
/* .param p0, "listener" # Lcom/ansca/corona/CoronaRuntimeListener; */
/* .prologue */
/* .line 216 */
v1 = com.ansca.corona.CoronaEnvironment.sRuntimeListeners;
/* monitor-enter v1 */
/* .line 218 */
/* if-nez p0, :cond_0 */
/* .line 219 */
try { // :try_start_0
/* monitor-exit v1 */
/* .line 225 */
} // :goto_0
return;
/* .line 223 */
} // :cond_0
v0 = com.ansca.corona.CoronaEnvironment.sRuntimeListeners;
(( java.util.ArrayList ) v0 ).remove ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
/* .line 224 */
/* monitor-exit v1 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
static void setCoronaActivity ( com.ansca.corona.CoronaActivity p0 ) {
/* .locals 1 */
/* .param p0, "activity" # Lcom/ansca/corona/CoronaActivity; */
/* .prologue */
/* .line 68 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 69 */
(( com.ansca.corona.CoronaActivity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaActivity;->getApplicationContext()Landroid/content/Context;
/* .line 73 */
} // :cond_0
/* .line 74 */
return;
} // .end method
public static void setLuaErrorHandler ( com.naef.jnlua.JavaFunction p0 ) {
/* .locals 1 */
/* .param p0, "handler" # Lcom/naef/jnlua/JavaFunction; */
/* .prologue */
/* .line 115 */
v0 = com.ansca.corona.CoronaEnvironment.sLuaErrorHandlerFunction;
/* if-ne p0, v0, :cond_0 */
/* .line 129 */
} // :goto_0
return;
/* .line 120 */
} // :cond_0
/* .line 123 */
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 124 */
com.ansca.corona.JavaToNativeShim .useJavaLuaErrorHandler ( );
/* .line 127 */
} // :cond_1
com.ansca.corona.JavaToNativeShim .useDefaultLuaErrorHandler ( );
} // .end method
public static void showCoronaActivity ( android.content.Context p0 ) {
/* .locals 2 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 45 */
/* if-nez p0, :cond_0 */
/* .line 59 */
} // :goto_0
return;
/* .line 50 */
} // :cond_0
(( android.content.Context ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
/* .line 53 */
/* new-instance v0, Landroid/content/Intent; */
/* const-class v1, Lcom/ansca/corona/CoronaActivity; */
/* invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 54 */
/* .local v0, "intent":Landroid/content/Intent; */
/* instance-of v1, p0, Landroid/app/Activity; */
/* if-nez v1, :cond_1 */
/* .line 55 */
/* const/high16 v1, 0x10000000 */
(( android.content.Intent ) v0 ).addFlags ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
/* .line 57 */
} // :cond_1
/* const/high16 v1, 0x20000 */
(( android.content.Intent ) v0 ).addFlags ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
/* .line 58 */
(( android.content.Context ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
} // .end method
