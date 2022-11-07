class com.naef.jnlua.script.CompiledLuaScript extends javax.script.CompiledScript {
	 /* # instance fields */
	 private com.naef.jnlua.script.LuaScriptEngine engine;
	 private script;
	 /* # direct methods */
	 public com.naef.jnlua.script.CompiledLuaScript ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljavax/script/CompiledScript;-><init>()V */
		 this.engine = p1;
		 this.script = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object eval ( javax.script.ScriptContext p0 ) {
		 /* .locals 4 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljavax/script/ScriptException; */
		 /* } */
	 } // .end annotation
	 v0 = this.engine;
	 (( com.naef.jnlua.script.LuaScriptEngine ) v0 ).getLuaState ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/script/LuaScriptEngine;->getLuaState()Lcom/naef/jnlua/LuaState;
	 /* monitor-enter v1 */
	 try { // :try_start_0
		 v0 = this.engine;
		 /* new-instance v2, Ljava/io/ByteArrayInputStream; */
		 v3 = this.script;
		 /* invoke-direct {v2, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
		 (( com.naef.jnlua.script.LuaScriptEngine ) v0 ).loadChunk ( v2, p1 ); // invoke-virtual {v0, v2, p1}, Lcom/naef/jnlua/script/LuaScriptEngine;->loadChunk(Ljava/io/InputStream;Ljavax/script/ScriptContext;)V
		 v0 = this.engine;
		 (( com.naef.jnlua.script.LuaScriptEngine ) v0 ).callChunk ( p1 ); // invoke-virtual {v0, p1}, Lcom/naef/jnlua/script/LuaScriptEngine;->callChunk(Ljavax/script/ScriptContext;)Ljava/lang/Object;
		 /* monitor-exit v1 */
		 /* :catchall_0 */
		 /* move-exception v0 */
		 /* monitor-exit v1 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* throw v0 */
	 } // .end method
	 public javax.script.ScriptEngine getEngine ( ) {
		 /* .locals 1 */
		 v0 = this.engine;
	 } // .end method
