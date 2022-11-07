class com.ansca.corona.CoronaEnvironment$RuntimeEventHandler implements com.ansca.corona.CoronaRuntimeListener {
	 /* .source "CoronaEnvironment.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/CoronaEnvironment; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "RuntimeEventHandler" */
} // .end annotation
/* # direct methods */
private com.ansca.corona.CoronaEnvironment$RuntimeEventHandler ( ) {
/* .locals 0 */
/* .prologue */
/* .line 229 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.ansca.corona.CoronaEnvironment$RuntimeEventHandler ( ) { //synthethic
/* .locals 0 */
/* .param p1, "x0" # Lcom/ansca/corona/CoronaEnvironment$1; */
/* .prologue */
/* .line 229 */
/* invoke-direct {p0}, Lcom/ansca/corona/CoronaEnvironment$RuntimeEventHandler;-><init>()V */
return;
} // .end method
private java.util.ArrayList cloneListenerCollection ( ) {
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
/* .line 239 */
com.ansca.corona.CoronaEnvironment .access$100 ( );
/* monitor-enter v1 */
/* .line 240 */
try { // :try_start_0
com.ansca.corona.CoronaEnvironment .access$100 ( );
(( java.util.ArrayList ) v0 ).clone ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;
/* check-cast v0, Ljava/util/ArrayList; */
/* monitor-exit v1 */
/* .line 241 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
/* # virtual methods */
public void onExiting ( com.ansca.corona.CoronaRuntime p0 ) {
/* .locals 3 */
/* .param p1, "runtime" # Lcom/ansca/corona/CoronaRuntime; */
/* .prologue */
/* .line 297 */
/* invoke-direct {p0}, Lcom/ansca/corona/CoronaEnvironment$RuntimeEventHandler;->cloneListenerCollection()Ljava/util/ArrayList; */
(( java.util.ArrayList ) v2 ).iterator ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* .local v0, "i$":Ljava/util/Iterator; */
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v1, Lcom/ansca/corona/CoronaRuntimeListener; */
/* .line 298 */
/* .local v1, "listener":Lcom/ansca/corona/CoronaRuntimeListener; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 299 */
/* .line 302 */
} // .end local v1 # "listener":Lcom/ansca/corona/CoronaRuntimeListener;
} // :cond_1
return;
} // .end method
public void onLoaded ( com.ansca.corona.CoronaRuntime p0 ) {
/* .locals 3 */
/* .param p1, "runtime" # Lcom/ansca/corona/CoronaRuntime; */
/* .prologue */
/* .line 249 */
/* invoke-direct {p0}, Lcom/ansca/corona/CoronaEnvironment$RuntimeEventHandler;->cloneListenerCollection()Ljava/util/ArrayList; */
(( java.util.ArrayList ) v2 ).iterator ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* .local v0, "i$":Ljava/util/Iterator; */
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v1, Lcom/ansca/corona/CoronaRuntimeListener; */
/* .line 250 */
/* .local v1, "listener":Lcom/ansca/corona/CoronaRuntimeListener; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 251 */
/* .line 254 */
} // .end local v1 # "listener":Lcom/ansca/corona/CoronaRuntimeListener;
} // :cond_1
return;
} // .end method
public void onResumed ( com.ansca.corona.CoronaRuntime p0 ) {
/* .locals 3 */
/* .param p1, "runtime" # Lcom/ansca/corona/CoronaRuntime; */
/* .prologue */
/* .line 285 */
/* invoke-direct {p0}, Lcom/ansca/corona/CoronaEnvironment$RuntimeEventHandler;->cloneListenerCollection()Ljava/util/ArrayList; */
(( java.util.ArrayList ) v2 ).iterator ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* .local v0, "i$":Ljava/util/Iterator; */
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v1, Lcom/ansca/corona/CoronaRuntimeListener; */
/* .line 286 */
/* .local v1, "listener":Lcom/ansca/corona/CoronaRuntimeListener; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 287 */
/* .line 290 */
} // .end local v1 # "listener":Lcom/ansca/corona/CoronaRuntimeListener;
} // :cond_1
return;
} // .end method
public void onStarted ( com.ansca.corona.CoronaRuntime p0 ) {
/* .locals 3 */
/* .param p1, "runtime" # Lcom/ansca/corona/CoronaRuntime; */
/* .prologue */
/* .line 261 */
/* invoke-direct {p0}, Lcom/ansca/corona/CoronaEnvironment$RuntimeEventHandler;->cloneListenerCollection()Ljava/util/ArrayList; */
(( java.util.ArrayList ) v2 ).iterator ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* .local v0, "i$":Ljava/util/Iterator; */
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v1, Lcom/ansca/corona/CoronaRuntimeListener; */
/* .line 262 */
/* .local v1, "listener":Lcom/ansca/corona/CoronaRuntimeListener; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 263 */
/* .line 266 */
} // .end local v1 # "listener":Lcom/ansca/corona/CoronaRuntimeListener;
} // :cond_1
return;
} // .end method
public void onSuspended ( com.ansca.corona.CoronaRuntime p0 ) {
/* .locals 3 */
/* .param p1, "runtime" # Lcom/ansca/corona/CoronaRuntime; */
/* .prologue */
/* .line 273 */
/* invoke-direct {p0}, Lcom/ansca/corona/CoronaEnvironment$RuntimeEventHandler;->cloneListenerCollection()Ljava/util/ArrayList; */
(( java.util.ArrayList ) v2 ).iterator ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* .local v0, "i$":Ljava/util/Iterator; */
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v1, Lcom/ansca/corona/CoronaRuntimeListener; */
/* .line 274 */
/* .local v1, "listener":Lcom/ansca/corona/CoronaRuntimeListener; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 275 */
/* .line 278 */
} // .end local v1 # "listener":Lcom/ansca/corona/CoronaRuntimeListener;
} // :cond_1
return;
} // .end method
