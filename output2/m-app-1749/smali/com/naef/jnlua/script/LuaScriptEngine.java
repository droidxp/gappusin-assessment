class com.naef.jnlua.script.LuaScriptEngine extends javax.script.AbstractScriptEngine implements javax.script.Compilable implements javax.script.Invocable {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/naef/jnlua/script/LuaScriptEngine$ReaderInputStream; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String ERROR_WRITER;
private static final java.util.regex.Pattern LUA_ERROR_MESSAGE;
private static final java.lang.String READER;
private static final java.lang.String WRITER;
/* # instance fields */
private com.naef.jnlua.script.LuaScriptEngineFactory factory;
private com.naef.jnlua.LuaState luaState;
/* # direct methods */
static com.naef.jnlua.script.LuaScriptEngine ( ) {
	 /* .locals 1 */
	 final String v0 = "^(.+):(\\d+):"; // const-string v0, "^(.+):(\\d+):"
	 java.util.regex.Pattern .compile ( v0 );
	 return;
} // .end method
 com.naef.jnlua.script.LuaScriptEngine ( ) {
	 /* .locals 4 */
	 int v3 = 0; // const/4 v3, 0x0
	 /* invoke-direct {p0}, Ljavax/script/AbstractScriptEngine;-><init>()V */
	 this.factory = p1;
	 /* new-instance v0, Lcom/naef/jnlua/LuaState; */
	 /* invoke-direct {v0}, Lcom/naef/jnlua/LuaState;-><init>()V */
	 this.luaState = v0;
	 v0 = this.context;
	 (( com.naef.jnlua.script.LuaScriptEngine ) p0 ).createBindings ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/script/LuaScriptEngine;->createBindings()Ljavax/script/Bindings;
	 /* const/16 v2, 0x64 */
	 v0 = this.luaState;
	 (( com.naef.jnlua.LuaState ) v0 ).openLibs ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/LuaState;->openLibs()V
	 v0 = this.luaState;
	 final String v1 = "io.stdout:setvbuf(\"no\")"; // const-string v1, "io.stdout:setvbuf(\"no\")"
	 final String v2 = "setvbuf"; // const-string v2, "setvbuf"
	 (( com.naef.jnlua.LuaState ) v0 ).load ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/naef/jnlua/LuaState;->load(Ljava/lang/String;Ljava/lang/String;)V
	 v0 = this.luaState;
	 (( com.naef.jnlua.LuaState ) v0 ).call ( v3, v3 ); // invoke-virtual {v0, v3, v3}, Lcom/naef/jnlua/LuaState;->call(II)V
	 v0 = this.luaState;
	 final String v1 = "io.stderr:setvbuf(\"no\")"; // const-string v1, "io.stderr:setvbuf(\"no\")"
	 final String v2 = "setvbuf"; // const-string v2, "setvbuf"
	 (( com.naef.jnlua.LuaState ) v0 ).load ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/naef/jnlua/LuaState;->load(Ljava/lang/String;Ljava/lang/String;)V
	 v0 = this.luaState;
	 (( com.naef.jnlua.LuaState ) v0 ).call ( v3, v3 ); // invoke-virtual {v0, v3, v3}, Lcom/naef/jnlua/LuaState;->call(II)V
	 return;
} // .end method
private void applyBindings ( javax.script.Bindings p0 ) {
	 /* .locals 4 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* check-cast v0, Ljava/util/Map$Entry; */
	 v2 = this.luaState;
	 (( com.naef.jnlua.LuaState ) v2 ).pushJavaObject ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
	 /* check-cast v0, Ljava/lang/String; */
	 /* const/16 v2, 0x2e */
	 v2 = 	 (( java.lang.String ) v0 ).lastIndexOf ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(I)I
	 /* if-ltz v2, :cond_0 */
	 /* add-int/lit8 v2, v2, 0x1 */
	 (( java.lang.String ) v0 ).substring ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
} // :cond_0
v2 = this.luaState;
(( com.naef.jnlua.LuaState ) v2 ).setGlobal ( v0 ); // invoke-virtual {v2, v0}, Lcom/naef/jnlua/LuaState;->setGlobal(Ljava/lang/String;)V
} // :cond_1
return;
} // .end method
private java.lang.String getChunkName ( javax.script.ScriptContext p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
final String v0 = "javax.script.filename"; // const-string v0, "javax.script.filename"
if ( v0 != null) { // if-eqz v0, :cond_0
	 (( java.lang.Object ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
} // :goto_0
} // :cond_0
final String v0 = "null"; // const-string v0, "null"
} // .end method
private javax.script.ScriptException getScriptException ( com.naef.jnlua.LuaException p0 ) {
/* .locals 4 */
v0 = com.naef.jnlua.script.LuaScriptEngine.LUA_ERROR_MESSAGE;
(( com.naef.jnlua.LuaException ) p1 ).getMessage ( ); // invoke-virtual {p1}, Lcom/naef/jnlua/LuaException;->getMessage()Ljava/lang/String;
(( java.util.regex.Pattern ) v0 ).matcher ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v1 = (( java.util.regex.Matcher ) v0 ).find ( ); // invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v1 = 1; // const/4 v1, 0x1
(( java.util.regex.Matcher ) v0 ).group ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
int v2 = 2; // const/4 v2, 0x2
(( java.util.regex.Matcher ) v0 ).group ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
v2 = java.lang.Integer .parseInt ( v0 );
/* new-instance v0, Ljavax/script/ScriptException; */
(( com.naef.jnlua.LuaException ) p1 ).getMessage ( ); // invoke-virtual {p1}, Lcom/naef/jnlua/LuaException;->getMessage()Ljava/lang/String;
/* invoke-direct {v0, v3, v1, v2}, Ljavax/script/ScriptException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V */
} // :goto_0
} // :cond_0
/* new-instance v0, Ljavax/script/ScriptException; */
/* invoke-direct {v0, p1}, Ljavax/script/ScriptException;-><init>(Ljava/lang/Exception;)V */
} // .end method
/* # virtual methods */
java.lang.Object callChunk ( javax.script.ScriptContext p0 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljavax/script/ScriptException; */
/* } */
} // .end annotation
int v3 = 0; // const/4 v3, 0x0
if ( p1 != null) { // if-eqz p1, :cond_3
/* const/16 v1, 0xc8 */
try { // :try_start_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* invoke-direct {p0, v1}, Lcom/naef/jnlua/script/LuaScriptEngine;->applyBindings(Ljavax/script/Bindings;)V */
} // :cond_0
/* const/16 v1, 0x64 */
if ( v2 != null) { // if-eqz v2, :cond_1
/* instance-of v1, v2, Lcom/naef/jnlua/script/LuaBindings; */
if ( v1 != null) { // if-eqz v1, :cond_2
	 /* move-object v0, v2 */
	 /* check-cast v0, Lcom/naef/jnlua/script/LuaBindings; */
	 /* move-object v1, v0 */
	 (( com.naef.jnlua.script.LuaBindings ) v1 ).getScriptEngine ( ); // invoke-virtual {v1}, Lcom/naef/jnlua/script/LuaBindings;->getScriptEngine()Lcom/naef/jnlua/script/LuaScriptEngine;
	 /* if-ne v1, p0, :cond_2 */
} // :cond_1
} // :goto_0
final String v1 = "reader"; // const-string v1, "reader"
(( com.naef.jnlua.script.LuaScriptEngine ) p0 ).put ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lcom/naef/jnlua/script/LuaScriptEngine;->put(Ljava/lang/String;Ljava/lang/Object;)V
final String v1 = "writer"; // const-string v1, "writer"
(( com.naef.jnlua.script.LuaScriptEngine ) p0 ).put ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lcom/naef/jnlua/script/LuaScriptEngine;->put(Ljava/lang/String;Ljava/lang/Object;)V
final String v1 = "errorWriter"; // const-string v1, "errorWriter"
(( com.naef.jnlua.script.LuaScriptEngine ) p0 ).put ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lcom/naef/jnlua/script/LuaScriptEngine;->put(Ljava/lang/String;Ljava/lang/Object;)V
final String v1 = "javax.script.argv"; // const-string v1, "javax.script.argv"
/* check-cast v1, [Ljava/lang/Object; */
/* check-cast v1, [Ljava/lang/Object; */
/* move-object v2, v1 */
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_4
/* array-length v1, v2 */
} // :goto_2
/* if-ge v3, v1, :cond_5 */
v4 = this.luaState;
/* aget-object v5, v2, v3 */
(( com.naef.jnlua.LuaState ) v4 ).pushJavaObject ( v5 ); // invoke-virtual {v4, v5}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_2
/* invoke-direct {p0, v2}, Lcom/naef/jnlua/script/LuaScriptEngine;->applyBindings(Ljavax/script/Bindings;)V */
/* :try_end_0 */
/* .catch Lcom/naef/jnlua/LuaException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v1 */
/* invoke-direct {p0, v1}, Lcom/naef/jnlua/script/LuaScriptEngine;->getScriptException(Lcom/naef/jnlua/LuaException;)Ljavax/script/ScriptException; */
/* throw v1 */
} // :cond_3
int v1 = 0; // const/4 v1, 0x0
/* move-object v2, v1 */
} // :cond_4
/* move v1, v3 */
} // :cond_5
try { // :try_start_1
v2 = this.luaState;
int v3 = 1; // const/4 v3, 0x1
(( com.naef.jnlua.LuaState ) v2 ).call ( v1, v3 ); // invoke-virtual {v2, v1, v3}, Lcom/naef/jnlua/LuaState;->call(II)V
/* :try_end_1 */
/* .catch Lcom/naef/jnlua/LuaException; {:try_start_1 ..:try_end_1} :catch_0 */
try { // :try_start_2
v1 = this.luaState;
int v2 = 1; // const/4 v2, 0x1
/* const-class v3, Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) v1 ).toJavaObject ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
try { // :try_start_3
v2 = this.luaState;
int v3 = 1; // const/4 v3, 0x1
(( com.naef.jnlua.LuaState ) v2 ).pop ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->pop(I)V
/* :catchall_0 */
/* move-exception v1 */
v2 = this.luaState;
int v3 = 1; // const/4 v3, 0x1
(( com.naef.jnlua.LuaState ) v2 ).pop ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->pop(I)V
/* throw v1 */
/* :try_end_3 */
/* .catch Lcom/naef/jnlua/LuaException; {:try_start_3 ..:try_end_3} :catch_0 */
} // .end method
public javax.script.CompiledScript compile ( java.io.Reader p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljavax/script/ScriptException; */
/* } */
} // .end annotation
/* new-instance v0, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
v1 = this.luaState;
/* monitor-enter v1 */
int v2 = 0; // const/4 v2, 0x0
try { // :try_start_0
(( com.naef.jnlua.script.LuaScriptEngine ) p0 ).loadChunk ( p1, v2 ); // invoke-virtual {p0, p1, v2}, Lcom/naef/jnlua/script/LuaScriptEngine;->loadChunk(Ljava/io/Reader;Ljavax/script/ScriptContext;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
try { // :try_start_1
(( com.naef.jnlua.script.LuaScriptEngine ) p0 ).dumpChunk ( v0 ); // invoke-virtual {p0, v0}, Lcom/naef/jnlua/script/LuaScriptEngine;->dumpChunk(Ljava/io/OutputStream;)V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
try { // :try_start_2
v2 = this.luaState;
int v3 = 1; // const/4 v3, 0x1
(( com.naef.jnlua.LuaState ) v2 ).pop ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->pop(I)V
/* monitor-exit v1 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* new-instance v1, Lcom/naef/jnlua/script/CompiledLuaScript; */
(( java.io.ByteArrayOutputStream ) v0 ).toByteArray ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* invoke-direct {v1, p0, v0}, Lcom/naef/jnlua/script/CompiledLuaScript;-><init>(Lcom/naef/jnlua/script/LuaScriptEngine;[B)V */
/* :catchall_0 */
/* move-exception v0 */
try { // :try_start_3
v2 = this.luaState;
int v3 = 1; // const/4 v3, 0x1
(( com.naef.jnlua.LuaState ) v2 ).pop ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->pop(I)V
/* throw v0 */
/* :catchall_1 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* throw v0 */
} // .end method
public javax.script.CompiledScript compile ( java.lang.String p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljavax/script/ScriptException; */
/* } */
} // .end annotation
/* new-instance v0, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
v1 = this.luaState;
/* monitor-enter v1 */
int v2 = 0; // const/4 v2, 0x0
try { // :try_start_0
(( com.naef.jnlua.script.LuaScriptEngine ) p0 ).loadChunk ( p1, v2 ); // invoke-virtual {p0, p1, v2}, Lcom/naef/jnlua/script/LuaScriptEngine;->loadChunk(Ljava/lang/String;Ljavax/script/ScriptContext;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
try { // :try_start_1
	 (( com.naef.jnlua.script.LuaScriptEngine ) p0 ).dumpChunk ( v0 ); // invoke-virtual {p0, v0}, Lcom/naef/jnlua/script/LuaScriptEngine;->dumpChunk(Ljava/io/OutputStream;)V
	 /* :try_end_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 try { // :try_start_2
		 v2 = this.luaState;
		 int v3 = 1; // const/4 v3, 0x1
		 (( com.naef.jnlua.LuaState ) v2 ).pop ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->pop(I)V
		 /* monitor-exit v1 */
		 /* :try_end_2 */
		 /* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
		 /* new-instance v1, Lcom/naef/jnlua/script/CompiledLuaScript; */
		 (( java.io.ByteArrayOutputStream ) v0 ).toByteArray ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
		 /* invoke-direct {v1, p0, v0}, Lcom/naef/jnlua/script/CompiledLuaScript;-><init>(Lcom/naef/jnlua/script/LuaScriptEngine;[B)V */
		 /* :catchall_0 */
		 /* move-exception v0 */
		 try { // :try_start_3
			 v2 = this.luaState;
			 int v3 = 1; // const/4 v3, 0x1
			 (( com.naef.jnlua.LuaState ) v2 ).pop ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->pop(I)V
			 /* throw v0 */
			 /* :catchall_1 */
			 /* move-exception v0 */
			 /* monitor-exit v1 */
			 /* :try_end_3 */
			 /* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
			 /* throw v0 */
		 } // .end method
		 public javax.script.Bindings createBindings ( ) {
			 /* .locals 1 */
			 /* new-instance v0, Lcom/naef/jnlua/script/LuaBindings; */
			 /* invoke-direct {v0, p0}, Lcom/naef/jnlua/script/LuaBindings;-><init>(Lcom/naef/jnlua/script/LuaScriptEngine;)V */
		 } // .end method
		 void dumpChunk ( java.io.OutputStream p0 ) {
			 /* .locals 2 */
			 /* .annotation system Ldalvik/annotation/Throws; */
			 /* value = { */
			 /* Ljavax/script/ScriptException; */
			 /* } */
		 } // .end annotation
		 try { // :try_start_0
			 v0 = this.luaState;
			 (( com.naef.jnlua.LuaState ) v0 ).dump ( p1 ); // invoke-virtual {v0, p1}, Lcom/naef/jnlua/LuaState;->dump(Ljava/io/OutputStream;)V
			 /* :try_end_0 */
			 /* .catch Lcom/naef/jnlua/LuaException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
			 return;
			 /* :catch_0 */
			 /* move-exception v0 */
			 /* new-instance v1, Ljavax/script/ScriptException; */
			 /* invoke-direct {v1, v0}, Ljavax/script/ScriptException;-><init>(Ljava/lang/Exception;)V */
			 /* throw v1 */
			 /* :catch_1 */
			 /* move-exception v0 */
			 /* new-instance v1, Ljavax/script/ScriptException; */
			 /* invoke-direct {v1, v0}, Ljavax/script/ScriptException;-><init>(Ljava/lang/Exception;)V */
			 /* throw v1 */
		 } // .end method
		 public java.lang.Object eval ( java.io.Reader p0, javax.script.ScriptContext p1 ) {
			 /* .locals 2 */
			 /* .annotation system Ldalvik/annotation/Throws; */
			 /* value = { */
			 /* Ljavax/script/ScriptException; */
			 /* } */
		 } // .end annotation
		 v1 = this.luaState;
		 /* monitor-enter v1 */
		 try { // :try_start_0
			 (( com.naef.jnlua.script.LuaScriptEngine ) p0 ).loadChunk ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/naef/jnlua/script/LuaScriptEngine;->loadChunk(Ljava/io/Reader;Ljavax/script/ScriptContext;)V
			 (( com.naef.jnlua.script.LuaScriptEngine ) p0 ).callChunk ( p2 ); // invoke-virtual {p0, p2}, Lcom/naef/jnlua/script/LuaScriptEngine;->callChunk(Ljavax/script/ScriptContext;)Ljava/lang/Object;
			 /* monitor-exit v1 */
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit v1 */
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* throw v0 */
		 } // .end method
		 public java.lang.Object eval ( java.lang.String p0, javax.script.ScriptContext p1 ) {
			 /* .locals 2 */
			 /* .annotation system Ldalvik/annotation/Throws; */
			 /* value = { */
			 /* Ljavax/script/ScriptException; */
			 /* } */
		 } // .end annotation
		 v1 = this.luaState;
		 /* monitor-enter v1 */
		 try { // :try_start_0
			 (( com.naef.jnlua.script.LuaScriptEngine ) p0 ).loadChunk ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/naef/jnlua/script/LuaScriptEngine;->loadChunk(Ljava/lang/String;Ljavax/script/ScriptContext;)V
			 (( com.naef.jnlua.script.LuaScriptEngine ) p0 ).callChunk ( p2 ); // invoke-virtual {p0, p2}, Lcom/naef/jnlua/script/LuaScriptEngine;->callChunk(Ljavax/script/ScriptContext;)Ljava/lang/Object;
			 /* monitor-exit v1 */
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit v1 */
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* throw v0 */
		 } // .end method
		 public javax.script.ScriptEngineFactory getFactory ( ) {
			 /* .locals 1 */
			 v0 = this.factory;
		 } // .end method
		 public java.lang.Object getInterface ( java.lang.Class p0 ) {
			 /* .locals 4 */
			 /* .annotation system Ldalvik/annotation/Signature; */
			 /* value = { */
			 /* "<T:", */
			 /* "Ljava/lang/Object;", */
			 /* ">(", */
			 /* "Ljava/lang/Class", */
			 /* "<TT;>;)TT;" */
			 /* } */
		 } // .end annotation
		 v1 = this.luaState;
		 /* monitor-enter v1 */
		 try { // :try_start_0
			 v0 = this.luaState;
			 /* const/16 v2, -0x2712 */
			 (( com.naef.jnlua.LuaState ) v0 ).pushValue ( v2 ); // invoke-virtual {v0, v2}, Lcom/naef/jnlua/LuaState;->pushValue(I)V
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
			 try { // :try_start_1
				 v0 = this.luaState;
				 int v2 = -1; // const/4 v2, -0x1
				 (( com.naef.jnlua.LuaState ) v0 ).getProxy ( v2, p1 ); // invoke-virtual {v0, v2, p1}, Lcom/naef/jnlua/LuaState;->getProxy(ILjava/lang/Class;)Ljava/lang/Object;
				 /* :try_end_1 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
				 try { // :try_start_2
					 v2 = this.luaState;
					 int v3 = 1; // const/4 v3, 0x1
					 (( com.naef.jnlua.LuaState ) v2 ).pop ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->pop(I)V
					 /* monitor-exit v1 */
					 /* :catchall_0 */
					 /* move-exception v0 */
					 v2 = this.luaState;
					 int v3 = 1; // const/4 v3, 0x1
					 (( com.naef.jnlua.LuaState ) v2 ).pop ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->pop(I)V
					 /* throw v0 */
					 /* :catchall_1 */
					 /* move-exception v0 */
					 /* monitor-exit v1 */
					 /* :try_end_2 */
					 /* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
					 /* throw v0 */
				 } // .end method
				 public java.lang.Object getInterface ( java.lang.Object p0, java.lang.Class p1 ) {
					 /* .locals 4 */
					 /* .annotation system Ldalvik/annotation/Signature; */
					 /* value = { */
					 /* "<T:", */
					 /* "Ljava/lang/Object;", */
					 /* ">(", */
					 /* "Ljava/lang/Object;", */
					 /* "Ljava/lang/Class", */
					 /* "<TT;>;)TT;" */
					 /* } */
				 } // .end annotation
				 v1 = this.luaState;
				 /* monitor-enter v1 */
				 try { // :try_start_0
					 v0 = this.luaState;
					 (( com.naef.jnlua.LuaState ) v0 ).pushJavaObject ( p1 ); // invoke-virtual {v0, p1}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
					 /* :try_end_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
					 try { // :try_start_1
						 v0 = this.luaState;
						 int v2 = -1; // const/4 v2, -0x1
						 v0 = 						 (( com.naef.jnlua.LuaState ) v0 ).isTable ( v2 ); // invoke-virtual {v0, v2}, Lcom/naef/jnlua/LuaState;->isTable(I)Z
						 /* if-nez v0, :cond_0 */
						 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
						 final String v2 = "object is not a table"; // const-string v2, "object is not a table"
						 /* invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
						 /* throw v0 */
						 /* :try_end_1 */
						 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
						 /* :catchall_0 */
						 /* move-exception v0 */
						 try { // :try_start_2
							 v2 = this.luaState;
							 int v3 = 1; // const/4 v3, 0x1
							 (( com.naef.jnlua.LuaState ) v2 ).pop ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->pop(I)V
							 /* throw v0 */
							 /* :catchall_1 */
							 /* move-exception v0 */
							 /* monitor-exit v1 */
							 /* :try_end_2 */
							 /* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
							 /* throw v0 */
						 } // :cond_0
						 try { // :try_start_3
							 v0 = this.luaState;
							 int v2 = -1; // const/4 v2, -0x1
							 (( com.naef.jnlua.LuaState ) v0 ).getProxy ( v2, p2 ); // invoke-virtual {v0, v2, p2}, Lcom/naef/jnlua/LuaState;->getProxy(ILjava/lang/Class;)Ljava/lang/Object;
							 /* :try_end_3 */
							 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
							 try { // :try_start_4
								 v2 = this.luaState;
								 int v3 = 1; // const/4 v3, 0x1
								 (( com.naef.jnlua.LuaState ) v2 ).pop ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->pop(I)V
								 /* monitor-exit v1 */
								 /* :try_end_4 */
								 /* .catchall {:try_start_4 ..:try_end_4} :catchall_1 */
							 } // .end method
							 com.naef.jnlua.LuaState getLuaState ( ) {
								 /* .locals 1 */
								 v0 = this.luaState;
							 } // .end method
							 public java.lang.Object invokeFunction ( java.lang.String p0, java.lang.Object...p1 ) {
								 /* .locals 5 */
								 /* .annotation system Ldalvik/annotation/Throws; */
								 /* value = { */
								 /* Ljavax/script/ScriptException;, */
								 /* Ljava/lang/NoSuchMethodException; */
								 /* } */
							 } // .end annotation
							 int v0 = 0; // const/4 v0, 0x0
							 v1 = this.luaState;
							 /* monitor-enter v1 */
							 try { // :try_start_0
								 v2 = this.luaState;
								 (( com.naef.jnlua.LuaState ) v2 ).getGlobal ( p1 ); // invoke-virtual {v2, p1}, Lcom/naef/jnlua/LuaState;->getGlobal(Ljava/lang/String;)V
								 v2 = this.luaState;
								 int v3 = -1; // const/4 v3, -0x1
								 v2 = 								 (( com.naef.jnlua.LuaState ) v2 ).isFunction ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->isFunction(I)Z
								 /* if-nez v2, :cond_0 */
								 v0 = this.luaState;
								 int v2 = 1; // const/4 v2, 0x1
								 (( com.naef.jnlua.LuaState ) v0 ).pop ( v2 ); // invoke-virtual {v0, v2}, Lcom/naef/jnlua/LuaState;->pop(I)V
								 /* new-instance v0, Ljava/lang/NoSuchMethodException; */
								 final String v2 = "function \'%s\' is undefined"; // const-string v2, "function \'%s\' is undefined"
								 int v3 = 1; // const/4 v3, 0x1
								 /* new-array v3, v3, [Ljava/lang/Object; */
								 int v4 = 0; // const/4 v4, 0x0
								 /* aput-object p1, v3, v4 */
								 java.lang.String .format ( v2,v3 );
								 /* invoke-direct {v0, v2}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V */
								 /* throw v0 */
								 /* :catchall_0 */
								 /* move-exception v0 */
								 /* monitor-exit v1 */
								 /* :try_end_0 */
								 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
								 /* throw v0 */
							 } // :cond_0
						 } // :goto_0
						 try { // :try_start_1
							 /* array-length v2, p2 */
							 /* if-ge v0, v2, :cond_1 */
							 v2 = this.luaState;
							 /* aget-object v3, p2, v0 */
							 (( com.naef.jnlua.LuaState ) v2 ).pushJavaObject ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
							 /* add-int/lit8 v0, v0, 0x1 */
						 } // :cond_1
						 v0 = this.luaState;
						 /* array-length v2, p2 */
						 int v3 = 1; // const/4 v3, 0x1
						 (( com.naef.jnlua.LuaState ) v0 ).call ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/naef/jnlua/LuaState;->call(II)V
						 /* :try_end_1 */
						 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
						 try { // :try_start_2
							 v0 = this.luaState;
							 int v2 = -1; // const/4 v2, -0x1
							 /* const-class v3, Ljava/lang/Object; */
							 (( com.naef.jnlua.LuaState ) v0 ).toJavaObject ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
							 /* :try_end_2 */
							 /* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
							 try { // :try_start_3
								 v2 = this.luaState;
								 int v3 = 1; // const/4 v3, 0x1
								 (( com.naef.jnlua.LuaState ) v2 ).pop ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->pop(I)V
								 /* monitor-exit v1 */
								 /* :catchall_1 */
								 /* move-exception v0 */
								 v2 = this.luaState;
								 int v3 = 1; // const/4 v3, 0x1
								 (( com.naef.jnlua.LuaState ) v2 ).pop ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->pop(I)V
								 /* throw v0 */
								 /* :try_end_3 */
								 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
							 } // .end method
							 public java.lang.Object invokeMethod ( java.lang.Object p0, java.lang.String p1, java.lang.Object...p2 ) {
								 /* .locals 5 */
								 /* .annotation system Ldalvik/annotation/Throws; */
								 /* value = { */
								 /* Ljavax/script/ScriptException;, */
								 /* Ljava/lang/NoSuchMethodException; */
								 /* } */
							 } // .end annotation
							 int v0 = 0; // const/4 v0, 0x0
							 v1 = this.luaState;
							 /* monitor-enter v1 */
							 try { // :try_start_0
								 v2 = this.luaState;
								 (( com.naef.jnlua.LuaState ) v2 ).pushJavaObject ( p1 ); // invoke-virtual {v2, p1}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
								 /* :try_end_0 */
								 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
								 try { // :try_start_1
									 v2 = this.luaState;
									 int v3 = -1; // const/4 v3, -0x1
									 v2 = 									 (( com.naef.jnlua.LuaState ) v2 ).isTable ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->isTable(I)Z
									 /* if-nez v2, :cond_0 */
									 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
									 final String v2 = "object is not a table"; // const-string v2, "object is not a table"
									 /* invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
									 /* throw v0 */
									 /* :try_end_1 */
									 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
									 /* :catchall_0 */
									 /* move-exception v0 */
									 try { // :try_start_2
										 v2 = this.luaState;
										 int v3 = 1; // const/4 v3, 0x1
										 (( com.naef.jnlua.LuaState ) v2 ).pop ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->pop(I)V
										 /* throw v0 */
										 /* :catchall_1 */
										 /* move-exception v0 */
										 /* monitor-exit v1 */
										 /* :try_end_2 */
										 /* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
										 /* throw v0 */
									 } // :cond_0
									 try { // :try_start_3
										 v2 = this.luaState;
										 int v3 = -1; // const/4 v3, -0x1
										 (( com.naef.jnlua.LuaState ) v2 ).getField ( v3, p2 ); // invoke-virtual {v2, v3, p2}, Lcom/naef/jnlua/LuaState;->getField(ILjava/lang/String;)V
										 v2 = this.luaState;
										 int v3 = -1; // const/4 v3, -0x1
										 v2 = 										 (( com.naef.jnlua.LuaState ) v2 ).isFunction ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->isFunction(I)Z
										 /* if-nez v2, :cond_1 */
										 v0 = this.luaState;
										 int v2 = 1; // const/4 v2, 0x1
										 (( com.naef.jnlua.LuaState ) v0 ).pop ( v2 ); // invoke-virtual {v0, v2}, Lcom/naef/jnlua/LuaState;->pop(I)V
										 /* new-instance v0, Ljava/lang/NoSuchMethodException; */
										 final String v2 = "method \'%s\' is undefined"; // const-string v2, "method \'%s\' is undefined"
										 int v3 = 1; // const/4 v3, 0x1
										 /* new-array v3, v3, [Ljava/lang/Object; */
										 int v4 = 0; // const/4 v4, 0x0
										 /* aput-object p2, v3, v4 */
										 java.lang.String .format ( v2,v3 );
										 /* invoke-direct {v0, v2}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V */
										 /* throw v0 */
									 } // :cond_1
									 v2 = this.luaState;
									 int v3 = -2; // const/4 v3, -0x2
									 (( com.naef.jnlua.LuaState ) v2 ).pushValue ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->pushValue(I)V
								 } // :goto_0
								 /* array-length v2, p3 */
								 /* if-ge v0, v2, :cond_2 */
								 v2 = this.luaState;
								 /* aget-object v3, p3, v0 */
								 (( com.naef.jnlua.LuaState ) v2 ).pushJavaObject ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
								 /* add-int/lit8 v0, v0, 0x1 */
							 } // :cond_2
							 v0 = this.luaState;
							 /* array-length v2, p3 */
							 /* add-int/lit8 v2, v2, 0x1 */
							 int v3 = 1; // const/4 v3, 0x1
							 (( com.naef.jnlua.LuaState ) v0 ).call ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/naef/jnlua/LuaState;->call(II)V
							 /* :try_end_3 */
							 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
							 try { // :try_start_4
								 v0 = this.luaState;
								 int v2 = -1; // const/4 v2, -0x1
								 /* const-class v3, Ljava/lang/Object; */
								 (( com.naef.jnlua.LuaState ) v0 ).toJavaObject ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
								 /* :try_end_4 */
								 /* .catchall {:try_start_4 ..:try_end_4} :catchall_2 */
								 try { // :try_start_5
									 v2 = this.luaState;
									 int v3 = 1; // const/4 v3, 0x1
									 (( com.naef.jnlua.LuaState ) v2 ).pop ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->pop(I)V
									 /* :try_end_5 */
									 /* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
									 try { // :try_start_6
										 v2 = this.luaState;
										 int v3 = 1; // const/4 v3, 0x1
										 (( com.naef.jnlua.LuaState ) v2 ).pop ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->pop(I)V
										 /* monitor-exit v1 */
										 /* :try_end_6 */
										 /* .catchall {:try_start_6 ..:try_end_6} :catchall_1 */
										 /* :catchall_2 */
										 /* move-exception v0 */
										 try { // :try_start_7
											 v2 = this.luaState;
											 int v3 = 1; // const/4 v3, 0x1
											 (( com.naef.jnlua.LuaState ) v2 ).pop ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->pop(I)V
											 /* throw v0 */
											 /* :try_end_7 */
											 /* .catchall {:try_start_7 ..:try_end_7} :catchall_0 */
										 } // .end method
										 void loadChunk ( java.io.InputStream p0, javax.script.ScriptContext p1 ) {
											 /* .locals 2 */
											 /* .annotation system Ldalvik/annotation/Throws; */
											 /* value = { */
											 /* Ljavax/script/ScriptException; */
											 /* } */
										 } // .end annotation
										 try { // :try_start_0
											 v0 = this.luaState;
											 /* invoke-direct {p0, p2}, Lcom/naef/jnlua/script/LuaScriptEngine;->getChunkName(Ljavax/script/ScriptContext;)Ljava/lang/String; */
											 (( com.naef.jnlua.LuaState ) v0 ).load ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/naef/jnlua/LuaState;->load(Ljava/io/InputStream;Ljava/lang/String;)V
											 /* :try_end_0 */
											 /* .catch Lcom/naef/jnlua/LuaException; {:try_start_0 ..:try_end_0} :catch_0 */
											 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
											 return;
											 /* :catch_0 */
											 /* move-exception v0 */
											 /* invoke-direct {p0, v0}, Lcom/naef/jnlua/script/LuaScriptEngine;->getScriptException(Lcom/naef/jnlua/LuaException;)Ljavax/script/ScriptException; */
											 /* throw v0 */
											 /* :catch_1 */
											 /* move-exception v0 */
											 /* new-instance v1, Ljavax/script/ScriptException; */
											 /* invoke-direct {v1, v0}, Ljavax/script/ScriptException;-><init>(Ljava/lang/Exception;)V */
											 /* throw v1 */
										 } // .end method
										 void loadChunk ( java.io.Reader p0, javax.script.ScriptContext p1 ) {
											 /* .locals 1 */
											 /* .annotation system Ldalvik/annotation/Throws; */
											 /* value = { */
											 /* Ljavax/script/ScriptException; */
											 /* } */
										 } // .end annotation
										 /* new-instance v0, Lcom/naef/jnlua/script/LuaScriptEngine$ReaderInputStream; */
										 /* invoke-direct {v0, p1}, Lcom/naef/jnlua/script/LuaScriptEngine$ReaderInputStream;-><init>(Ljava/io/Reader;)V */
										 (( com.naef.jnlua.script.LuaScriptEngine ) p0 ).loadChunk ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Lcom/naef/jnlua/script/LuaScriptEngine;->loadChunk(Ljava/io/InputStream;Ljavax/script/ScriptContext;)V
										 return;
									 } // .end method
									 void loadChunk ( java.lang.String p0, javax.script.ScriptContext p1 ) {
										 /* .locals 2 */
										 /* .annotation system Ldalvik/annotation/Throws; */
										 /* value = { */
										 /* Ljavax/script/ScriptException; */
										 /* } */
									 } // .end annotation
									 try { // :try_start_0
										 v0 = this.luaState;
										 /* invoke-direct {p0, p2}, Lcom/naef/jnlua/script/LuaScriptEngine;->getChunkName(Ljavax/script/ScriptContext;)Ljava/lang/String; */
										 (( com.naef.jnlua.LuaState ) v0 ).load ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/naef/jnlua/LuaState;->load(Ljava/lang/String;Ljava/lang/String;)V
										 /* :try_end_0 */
										 /* .catch Lcom/naef/jnlua/LuaException; {:try_start_0 ..:try_end_0} :catch_0 */
										 return;
										 /* :catch_0 */
										 /* move-exception v0 */
										 /* invoke-direct {p0, v0}, Lcom/naef/jnlua/script/LuaScriptEngine;->getScriptException(Lcom/naef/jnlua/LuaException;)Ljavax/script/ScriptException; */
										 /* throw v0 */
									 } // .end method
