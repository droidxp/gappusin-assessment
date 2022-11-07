public class com.ansca.corona.CoronaRuntime {
	 /* .source "CoronaRuntime.java" */
	 /* # static fields */
	 private static java.util.ArrayList sListeners;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList", */
	 /* "<", */
	 /* "Lcom/ansca/corona/CoronaRuntimeListener;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
private com.naef.jnlua.LuaState fLuaState;
private Boolean fWasDisposed;
/* # direct methods */
static com.ansca.corona.CoronaRuntime ( ) {
/* .locals 1 */
/* .prologue */
/* .line 7 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
return;
} // .end method
 com.ansca.corona.CoronaRuntime ( ) {
/* .locals 1 */
/* .prologue */
/* .line 21 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 22 */
int v0 = 0; // const/4 v0, 0x0
this.fLuaState = v0;
/* .line 23 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/ansca/corona/CoronaRuntime;->fWasDisposed:Z */
/* .line 24 */
return;
} // .end method
static void addListener ( com.ansca.corona.CoronaRuntimeListener p0 ) {
/* .locals 2 */
/* .param p0, "listener" # Lcom/ansca/corona/CoronaRuntimeListener; */
/* .prologue */
/* .line 227 */
v1 = com.ansca.corona.CoronaRuntime.sListeners;
/* monitor-enter v1 */
/* .line 229 */
/* if-nez p0, :cond_0 */
/* .line 230 */
try { // :try_start_0
	 /* monitor-exit v1 */
	 /* .line 241 */
} // :goto_0
return;
/* .line 234 */
} // :cond_0
v0 = com.ansca.corona.CoronaRuntime.sListeners;
v0 = (( java.util.ArrayList ) v0 ).indexOf ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I
/* if-ltz v0, :cond_1 */
/* .line 235 */
/* monitor-exit v1 */
/* .line 240 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
/* .line 239 */
} // :cond_1
try { // :try_start_1
v0 = com.ansca.corona.CoronaRuntime.sListeners;
(( java.util.ArrayList ) v0 ).add ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 240 */
/* monitor-exit v1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // .end method
private static java.util.ArrayList cloneListenerCollection ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/ansca/corona/CoronaRuntimeListener;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 102 */
v1 = com.ansca.corona.CoronaRuntime.sListeners;
/* monitor-enter v1 */
/* .line 103 */
try { // :try_start_0
v0 = com.ansca.corona.CoronaRuntime.sListeners;
(( java.util.ArrayList ) v0 ).clone ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;
/* check-cast v0, Ljava/util/ArrayList; */
/* monitor-exit v1 */
/* .line 104 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
private void onExiting ( ) {
/* .locals 3 */
/* .prologue */
/* .line 208 */
/* iget-boolean v2, p0, Lcom/ansca/corona/CoronaRuntime;->fWasDisposed:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 218 */
} // :cond_0
return;
/* .line 213 */
} // :cond_1
com.ansca.corona.CoronaRuntime .cloneListenerCollection ( );
(( java.util.ArrayList ) v2 ).iterator ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* .local v0, "i$":Ljava/util/Iterator; */
} // :cond_2
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast v1, Lcom/ansca/corona/CoronaRuntimeListener; */
/* .line 214 */
/* .local v1, "listener":Lcom/ansca/corona/CoronaRuntimeListener; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 215 */
} // .end method
static void removeListener ( com.ansca.corona.CoronaRuntimeListener p0 ) {
/* .locals 2 */
/* .param p0, "listener" # Lcom/ansca/corona/CoronaRuntimeListener; */
/* .prologue */
/* .line 250 */
v1 = com.ansca.corona.CoronaRuntime.sListeners;
/* monitor-enter v1 */
/* .line 252 */
/* if-nez p0, :cond_0 */
/* .line 253 */
try { // :try_start_0
/* monitor-exit v1 */
/* .line 259 */
} // :goto_0
return;
/* .line 257 */
} // :cond_0
v0 = com.ansca.corona.CoronaRuntime.sListeners;
(( java.util.ArrayList ) v0 ).remove ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
/* .line 258 */
/* monitor-exit v1 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
/* # virtual methods */
void dispose ( ) {
/* .locals 1 */
/* .prologue */
/* .line 34 */
/* iget-boolean v0, p0, Lcom/ansca/corona/CoronaRuntime;->fWasDisposed:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 50 */
} // :goto_0
return;
/* .line 39 */
} // :cond_0
/* invoke-direct {p0}, Lcom/ansca/corona/CoronaRuntime;->onExiting()V */
/* .line 42 */
v0 = this.fLuaState;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 44 */
v0 = this.fLuaState;
(( com.naef.jnlua.LuaState ) v0 ).close ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/LuaState;->close()V
/* .line 45 */
int v0 = 0; // const/4 v0, 0x0
this.fLuaState = v0;
/* .line 49 */
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/ansca/corona/CoronaRuntime;->fWasDisposed:Z */
} // .end method
public com.naef.jnlua.LuaState getLuaState ( ) {
/* .locals 1 */
/* .prologue */
/* .line 90 */
v0 = this.fLuaState;
} // .end method
public Boolean isRunning ( ) {
/* .locals 1 */
/* .prologue */
/* .line 76 */
/* iget-boolean v0, p0, Lcom/ansca/corona/CoronaRuntime;->fWasDisposed:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 77 */
int v0 = 0; // const/4 v0, 0x0
/* .line 79 */
} // :goto_0
} // :cond_0
v0 = com.ansca.corona.Controller .isRunning ( );
} // .end method
void onLoaded ( Long p0 ) {
/* .locals 4 */
/* .param p1, "luaStateMemoryAddress" # J */
/* .prologue */
/* .line 117 */
/* iget-boolean v2, p0, Lcom/ansca/corona/CoronaRuntime;->fWasDisposed:Z */
/* if-nez v2, :cond_0 */
/* const-wide/16 v2, 0x0 */
/* cmp-long v2, p1, v2 */
/* if-nez v2, :cond_1 */
/* .line 138 */
} // :cond_0
return;
/* .line 123 */
} // :cond_1
v2 = this.fLuaState;
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 125 */
v2 = this.fLuaState;
(( com.naef.jnlua.LuaState ) v2 ).close ( ); // invoke-virtual {v2}, Lcom/naef/jnlua/LuaState;->close()V
/* .line 126 */
int v2 = 0; // const/4 v2, 0x0
this.fLuaState = v2;
/* .line 130 */
} // :cond_2
/* new-instance v2, Lcom/naef/jnlua/LuaState; */
/* invoke-direct {v2, p1, p2}, Lcom/naef/jnlua/LuaState;-><init>(J)V */
this.fLuaState = v2;
/* .line 133 */
com.ansca.corona.CoronaRuntime .cloneListenerCollection ( );
(( java.util.ArrayList ) v2 ).iterator ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* .local v0, "i$":Ljava/util/Iterator; */
} // :cond_3
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast v1, Lcom/ansca/corona/CoronaRuntimeListener; */
/* .line 134 */
/* .local v1, "listener":Lcom/ansca/corona/CoronaRuntimeListener; */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 135 */
} // .end method
void onResumed ( ) {
/* .locals 3 */
/* .prologue */
/* .line 188 */
/* iget-boolean v2, p0, Lcom/ansca/corona/CoronaRuntime;->fWasDisposed:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 198 */
} // :cond_0
return;
/* .line 193 */
} // :cond_1
com.ansca.corona.CoronaRuntime .cloneListenerCollection ( );
(( java.util.ArrayList ) v2 ).iterator ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* .local v0, "i$":Ljava/util/Iterator; */
} // :cond_2
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast v1, Lcom/ansca/corona/CoronaRuntimeListener; */
/* .line 194 */
/* .local v1, "listener":Lcom/ansca/corona/CoronaRuntimeListener; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 195 */
} // .end method
void onStarted ( ) {
/* .locals 3 */
/* .prologue */
/* .line 148 */
/* iget-boolean v2, p0, Lcom/ansca/corona/CoronaRuntime;->fWasDisposed:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 158 */
} // :cond_0
return;
/* .line 153 */
} // :cond_1
com.ansca.corona.CoronaRuntime .cloneListenerCollection ( );
(( java.util.ArrayList ) v2 ).iterator ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* .local v0, "i$":Ljava/util/Iterator; */
} // :cond_2
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast v1, Lcom/ansca/corona/CoronaRuntimeListener; */
/* .line 154 */
/* .local v1, "listener":Lcom/ansca/corona/CoronaRuntimeListener; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 155 */
} // .end method
void onSuspended ( ) {
/* .locals 3 */
/* .prologue */
/* .line 168 */
/* iget-boolean v2, p0, Lcom/ansca/corona/CoronaRuntime;->fWasDisposed:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 178 */
} // :cond_0
return;
/* .line 173 */
} // :cond_1
com.ansca.corona.CoronaRuntime .cloneListenerCollection ( );
(( java.util.ArrayList ) v2 ).iterator ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* .local v0, "i$":Ljava/util/Iterator; */
} // :cond_2
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast v1, Lcom/ansca/corona/CoronaRuntimeListener; */
/* .line 174 */
/* .local v1, "listener":Lcom/ansca/corona/CoronaRuntimeListener; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 175 */
} // .end method
public Boolean wasDisposed ( ) {
/* .locals 1 */
/* .prologue */
/* .line 59 */
/* iget-boolean v0, p0, Lcom/ansca/corona/CoronaRuntime;->fWasDisposed:Z */
} // .end method
public Boolean wasNotDisposed ( ) {
/* .locals 1 */
/* .prologue */
/* .line 67 */
v0 = (( com.ansca.corona.CoronaRuntime ) p0 ).wasDisposed ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaRuntime;->wasDisposed()Z
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
